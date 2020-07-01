package com.uis.simon.hta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simon.hta.entity.Enfermero;
import com.uis.simon.hta.service.IEnfermeroService;


@CrossOrigin
@RestController
@RequestMapping("/enfermero")
public class EnfermeroController {
	
	@Autowired
	private IEnfermeroService enfermeroService;
	
	@GetMapping("/lista")
	@ResponseStatus(HttpStatus.OK)
	public List<Enfermero> getEnfermeros(){
		return enfermeroService.findAll();
	}
	
	@PostMapping("/encontrarEnfermero")
	public ResponseEntity<?> findEnfermero(@RequestBody Enfermero enfermero){
	Enfermero enfermeroDb = enfermeroService.findEnfermero(enfermero);
	if (enfermeroDb!=null) {
		return new ResponseEntity<> (enfermeroDb, HttpStatus.OK);
	} else {
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
	
	}