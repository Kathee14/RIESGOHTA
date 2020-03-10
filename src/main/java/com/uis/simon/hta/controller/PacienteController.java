package com.uis.simon.hta.controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simon.hta.dto.NuevoPaciente;
import com.uis.simon.hta.entity.Enfermero;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.mapper.MapPaciente;
import com.uis.simon.hta.dto.JwtUser;
import com.uis.simon.hta.dto.Login;
import com.uis.simon.hta.dto.ModificarPaciente;
import com.uis.simon.hta.security.JwtGenerator;
import com.uis.simon.hta.service.IEnfermeroService;
import com.uis.simon.hta.service.IPacienteService;

@CrossOrigin
@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	private IEnfermeroService enfermeroService;
	
	@Autowired
	private IPacienteService pacienteService;
	

	@Autowired
	private JwtGenerator jwtGenerator;

	@GetMapping("/listau")
	@ResponseStatus(HttpStatus.OK)
	public List<Paciente> getUsuarios(){
		return pacienteService.findAll();
	}
	
	@PostMapping("/findUsuario")
	public ResponseEntity<?> findUsuario(@RequestBody NuevoPaciente nuevoPaciente){
		Paciente pacienteDb = pacienteService.findPaciente(nuevoPaciente);
		if(pacienteDb!=null) {
			List<Paciente> pacientes = new ArrayList<>();
			pacientes.add(pacienteDb);
			List<ModificarPaciente> modificarPacientes = new ArrayList<>();
			modificarPacientes = MapPaciente.convertirLista(pacientes);
			return new ResponseEntity<>(modificarPacientes, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		}


	@PostMapping("/registrar")
	public ResponseEntity<?> addUsuario(@Valid @RequestBody NuevoPaciente nuevoPaciente,BindingResult bindingResult){
		if(bindingResult.hasErrors())
            return new ResponseEntity<String>("Campos vacíos o email invalido", HttpStatus.BAD_REQUEST);
		Paciente paciente = new Paciente(nuevoPaciente.getNombre(),nuevoPaciente.getApellido(), nuevoPaciente.getTipo_doc(),
								nuevoPaciente.getCc(),nuevoPaciente.getFec_nac(), nuevoPaciente.getCiudad(),nuevoPaciente.getDireccion(),
								nuevoPaciente.getBarrio(),nuevoPaciente.getPassword(),nuevoPaciente.getSexo(),
										nuevoPaciente.getEmail(),nuevoPaciente.getCelular());
		if(pacienteService.findUsuario(paciente) == null) {
			pacienteService.save(paciente);
			Paciente pacienteDb = pacienteService.checkUsuarioLogin(paciente);
			JwtUser jwtUser = new JwtUser();
			jwtUser.setCc(pacienteDb.getCc());
			jwtUser.setPassword(pacienteDb.getPassword());
			return new ResponseEntity<>((Collections.singletonMap("jwtToken", jwtGenerator.generate(jwtUser))),HttpStatus.CREATED);
			
		} else {
			
			return new ResponseEntity<String>("El usuario con ese documento ya existe", HttpStatus.CONFLICT);
		}
}
	
	@PutMapping("/update/{cc}")
	public ResponseEntity<?> updateUsuario(@PathVariable(value="cc")String cc,@RequestBody Paciente paciente){
		Paciente pacienteDb = null;
		pacienteDb = pacienteService.findByCc(cc);
			if (pacienteDb != null) {
				pacienteDb.setNombre(paciente.getNombre());
				pacienteDb.setApellido(paciente.getApellido());
				pacienteDb.setTipo_doc(paciente.getTipo_doc());
				pacienteDb.setCc(paciente.getCc());
				pacienteDb.setFec_nac(paciente.getFec_nac());
				pacienteDb.setCiudad(paciente.getCiudad());
				pacienteDb.setDireccion(paciente.getDireccion());
				pacienteDb.setBarrio(paciente.getBarrio());
				pacienteDb.setSexo(paciente.getSexo());
				pacienteDb.setEmail(paciente.getEmail());
				pacienteDb.setCelular(paciente.getCelular());	
				pacienteService.updateUsuario(pacienteDb);
				return new ResponseEntity<>(pacienteDb, HttpStatus.OK);
			} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
}

	@PostMapping("/login")
	public ResponseEntity<?> loginPaciente(@Valid @RequestBody Login login,BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity<String>("Campos vacíos", HttpStatus.BAD_REQUEST);
        
        Paciente pacienteDb = null;
        Enfermero enfermeroDb = null;
		final String PACIENTE = "PACIENTE";
		final String ENFERMERO = "ENFERMERO";
		
		

		if(PACIENTE.equals(login.getRole())){
			pacienteDb = pacienteService.checkUsuarioLogin(login);			
			
		} else if(ENFERMERO.equals(login.getRole())){
		    enfermeroDb = enfermeroService.checkUsuarioLogin(login);
        }

		if(enfermeroDb != null)  {
			JwtUser jwtUser = new JwtUser();
			jwtUser.setCc(enfermeroDb.getCc());
			jwtUser.setPassword(enfermeroDb.getPassword());
			return new ResponseEntity<>((Collections.singletonMap("jwtToken", jwtGenerator.generate(jwtUser))),HttpStatus.OK);
        } else if(pacienteDb != null){
		JwtUser jwtUser = new JwtUser();
			jwtUser.setCc(pacienteDb.getCc());
			jwtUser.setPassword(pacienteDb.getPassword());
			return new ResponseEntity<>((Collections.singletonMap("jwtToken", jwtGenerator.generate(jwtUser))),HttpStatus.OK);
        } else{
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

}