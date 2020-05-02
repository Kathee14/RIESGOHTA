package com.uis.simon.hta.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simon.hta.entity.Enfermero;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.entity.Visita;
import com.uis.simon.hta.service.IEnfermeroService;
import com.uis.simon.hta.service.IPacienteService;

@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/visita")

public class VisitaController {
	
	@Autowired
	private IEnfermeroService enfermeroService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@PostMapping("/listar_visita")
	public ResponseEntity<?> listarVisita(@RequestBody Enfermero enfermero){
		Enfermero enfermeroDb = enfermeroService.findByCc(enfermero.getCc());
		if(enfermeroDb != null) {
			Collection<Paciente> listaPacientes = enfermeroDb.getPaciente();
			if(listaPacientes != null) {
				return new ResponseEntity<>(listaPacientes, HttpStatus.OK);
			}
			
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/save_visita")
	public ResponseEntity<?> saveVisita(@RequestBody Visita visita){
		Enfermero enfermeroDb = enfermeroService.findByCc(visita.getEnfermero().getCc());
		if(enfermeroDb != null) {
			Paciente pacienteDb =pacienteService.findByCc(visita.getPaciente().getCc());
			enfermeroDb.addVisita(pacienteDb);
			enfermeroService.save(enfermeroDb);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	

}
