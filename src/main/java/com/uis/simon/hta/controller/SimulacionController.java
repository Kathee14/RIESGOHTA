package com.uis.simon.hta.controller;

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

import com.uis.simon.hta.dto.NuevaSimulacion;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.entity.Simulacion;
import com.uis.simon.hta.service.IPacienteService;
import com.uis.simon.hta.service.ISimulacionService;

@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/simulacion")
public class SimulacionController {
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private ISimulacionService simulacionService;
	

	@PostMapping("/guardar")
	public ResponseEntity<?> addSimulación(@Valid @RequestBody NuevaSimulacion nuevaSimulacion){
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
			return new ResponseEntity<>(HttpStatus.OK);
	} else {
		return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}
		
}
