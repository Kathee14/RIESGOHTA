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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
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
			return new ResponseEntity<>((Collections.singletonMap("jwtToken", jwtGenerator.generate(jwtUser))),HttpStatus.CREATED);
			
		} else {
			
			return new ResponseEntity<String>("El usuario con ese documento ya existe", HttpStatus.CONFLICT);
		}
	}
	
	@GetMapping(path = {"/{id}"})
    public Paciente listarId(@PathVariable("id")Long id){
        return pacienteService.findById(id);
    }
	
	@GetMapping(path = {"/buscarxcc/{cc}"})
    public Paciente listarCc(@PathVariable("cc")String cc){
        return pacienteService.findByCc(cc);
    }
	

	@PutMapping(path = {"/{id}"})
	public ResponseEntity<?> updateUsuario(@PathVariable(value="id")Long id,@RequestBody ModificarPaciente modificarPaciente){
		Paciente paciente = pacienteService.findById(id);
		Paciente verificar = pacienteService.findByCc(modificarPaciente.getCc());
		if(verificar != null && verificar.getId() == id) {
				paciente.setNombre(modificarPaciente.getNombre());
				paciente.setApellido(modificarPaciente.getApellido());
				paciente.setTipo_doc(modificarPaciente.getTipo_doc());
				paciente.setCc(modificarPaciente.getCc());
				paciente.setFec_nac(modificarPaciente.getFec_nac());
				paciente.setCiudad(modificarPaciente.getCiudad());
				paciente.setDireccion(modificarPaciente.getDireccion());
				paciente.setBarrio(modificarPaciente.getBarrio());
				paciente.setPassword(modificarPaciente.getPassword());
				paciente.setEmail(modificarPaciente.getEmail());
				paciente.setCelular(modificarPaciente.getCelular());
				paciente.setCreateAt(modificarPaciente.getCreateAt());
				pacienteService.update(paciente);
				return new ResponseEntity<>(paciente, HttpStatus.OK);
	} else {
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
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
			jwtUser.setId(enfermeroDb.getId());
			jwtUser.setNombre(enfermeroDb.getNombre());
			jwtUser.setApellido(enfermeroDb.getApellido());
			jwtUser.setCc(enfermeroDb.getCc());
			jwtUser.setRole(ENFERMERO);
			jwtUser.setToken(Collections.singletonMap("jwtToken",jwtGenerator.generate(jwtUser)));
			return new ResponseEntity<>(jwtUser,HttpStatus.OK);
        } else if(pacienteDb != null){
		    JwtUser jwtUser = new JwtUser();
		    jwtUser.setId(pacienteDb.getId());
			jwtUser.setNombre(pacienteDb.getNombre());
			jwtUser.setApellido(pacienteDb.getApellido());
			jwtUser.setCc(pacienteDb.getCc());
			jwtUser.setRole(PACIENTE);
			jwtUser.setToken(Collections.singletonMap("jwtToken",jwtGenerator.generate(jwtUser)));
			return new ResponseEntity<>(jwtUser,HttpStatus.OK);
        } else{
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

	@DeleteMapping(path = {"/{cc}"})
    public ResponseEntity<?> deletePaciente (@PathVariable(value="cc")String cc){
        pacienteService.delete(cc);
        return new ResponseEntity<Void>(HttpStatus.MOVED_PERMANENTLY);
    }

	
}