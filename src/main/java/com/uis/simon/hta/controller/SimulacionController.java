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
import com.uis.simon.hta.entity.Enfermero;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.entity.Simulacion;
import com.uis.simon.hta.service.ICorrerModeloService;
import com.uis.simon.hta.service.IEnfermeroService;
import com.uis.simon.hta.service.IPacienteService;
import com.uis.simon.hta.service.ISimulacionService;

@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/simulacion")
public class SimulacionController {
	
	
	@Autowired
	ICorrerModeloService modelo;
	
	@Autowired
	private IEnfermeroService enfermeroService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private ISimulacionService simulacionService;
	

	@PostMapping("/simulaPaciente")
	public ResponseEntity<?> addSimulacionPaciente(@Valid @RequestBody NuevaSimulacionPaciente nuevaSimulacion){
		List<ResultadoModelo> a = modelo.simulaPaciente(nuevaSimulacion);
		Paciente paciente = pacienteService.findByCc(nuevaSimulacion.getPaciente());
		if (paciente != null) {
			Simulacion simulacion = new Simulacion();
				simulacion.setPaciente(paciente);
				simulacion.setAltura(nuevaSimulacion.getAltura());
			    simulacion.setPeso(nuevaSimulacion.getPeso());
				simulacion.setEdad(nuevaSimulacion.getEdad());
				simulacion.setSbp(nuevaSimulacion.getSbp());
				simulacion.setDbp(nuevaSimulacion.getDbp());
				simulacion.setHerencia(nuevaSimulacion.getHerencia());
				simulacion.setFumar(nuevaSimulacion.getFumar());
				simulacion.setCalorias(nuevaSimulacion.getCalorias());
				simulacionService.save(simulacion);	
			return new ResponseEntity<>(a, HttpStatus.OK);
	} else {
		return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}
	
	
	@PostMapping("/simulaEnfermero")
	public ResponseEntity<?>  simulaEnfermero(@RequestBody NuevaSimulacionEnfermero nuevaSimulacion){
		List<ResultadoModelo> a = modelo.simulaEnfermero(nuevaSimulacion);
		return new ResponseEntity<>(a,HttpStatus.OK);
				
	}
	
	@PostMapping("/addSimulaEnfermero")
	public ResponseEntity<?>  addSimulacionEnfermero(@RequestBody NuevaSimulacionEnfermero nuevaSimulacion){
		List<ResultadoModelo> a = modelo.simulaEnfermero(nuevaSimulacion);
		Enfermero enfermero = enfermeroService.findByCc(nuevaSimulacion.getPaciente());
		Paciente paciente = pacienteService.findByCc(nuevaSimulacion.getPaciente());
		return new ResponseEntity<>(HttpStatus.OK);
				
	}
		
		
}
