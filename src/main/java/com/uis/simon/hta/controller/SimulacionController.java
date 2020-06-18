package com.uis.simon.hta.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simon.hta.dto.NuevaSimulacionEnfermero;
import com.uis.simon.hta.dto.NuevaSimulacionPaciente;
import com.uis.simon.hta.dto.ResultadoModelo;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.entity.Simulacion;
import com.uis.simon.hta.service.ICorrerModeloService;
import com.uis.simon.hta.service.IPacienteService;
import com.uis.simon.hta.service.ISimulacionService;

@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/simulacion")
public class SimulacionController {
	
	
	@Autowired
	ICorrerModeloService modelo;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private ISimulacionService simulacionService;
	

	@PostMapping("/simulaPaciente")
	public ResponseEntity<?> SimulacionPaciente(@Valid @RequestBody NuevaSimulacionPaciente nuevaSimulacion){
		List<ResultadoModelo> a = modelo.simulaPaciente(nuevaSimulacion);
		Paciente paciente = pacienteService.findByCc(nuevaSimulacion.getPaciente());
		if (paciente != null) {
			Simulacion s = new Simulacion();
			s.setPaciente(paciente);
			s.setAltura(nuevaSimulacion.getAltura());
			s.setEdad(nuevaSimulacion.getEdad());
			s.setPeso(nuevaSimulacion.getPeso());
			s.setSbp(nuevaSimulacion.getSbp());
			s.setDbp(nuevaSimulacion.getDbp());
			s.setHerencia(nuevaSimulacion.getHerencia());
			s.setFumar(nuevaSimulacion.getFumar());
			s.setCalorias(nuevaSimulacion.getCalorias());
			simulacionService.save(s);		
			return new ResponseEntity<>(a, HttpStatus.OK);
	} return new ResponseEntity<>(HttpStatus.BAD_REQUEST); 
	
	}
	
	@PostMapping("/simulaEnfermero")
	public ResponseEntity<?>  simulaEnfermero(@RequestBody NuevaSimulacionEnfermero nuevaSimulacion){
		List<ResultadoModelo> a = modelo.simulaEnfermero(nuevaSimulacion);
		return new ResponseEntity<>(a,HttpStatus.OK);
				
	}
	
}
