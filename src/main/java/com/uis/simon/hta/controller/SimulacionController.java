

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
import com.uis.simon.hta.service.ICorrerModeloService;

@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/simulacion")
public class SimulacionController {
	
	
	@Autowired
	ICorrerModeloService modelo;
	

	@PostMapping("/simulaPaciente")
	public ResponseEntity<?> SimulacionPaciente(@Valid @RequestBody NuevaSimulacionPaciente nuevaSimulacion){
		List<ResultadoModelo> a = modelo.simulaPaciente(nuevaSimulacion);
		return new ResponseEntity<>(a, HttpStatus.OK);
			
	}
	
	@PostMapping("/simulaEnfermero")
	public ResponseEntity<?> SimulaEnfermero(@Valid @RequestBody NuevaSimulacionEnfermero nuevaSimulacion){
		List<ResultadoModelo> b = modelo.simulaEnfermero(nuevaSimulacion);
		return new ResponseEntity<>(b, HttpStatus.OK);
				
	}
	
}
