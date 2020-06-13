package com.uis.simon.hta.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simon.hta.dto.NuevaSimulacion;
import com.uis.simon.hta.entity.Simulacion;
import com.uis.simon.hta.service.IContadorService;
//import com.uis.simon.hta.service.ISectorPresionService;

@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/presion")
public class SectorPresionController {
	
	//@Autowired 
	//private ISectorPresionService sectorPresion;
	
	@Autowired 
	private IContadorService contador;
	
	@PostMapping("/contador")
	public void contador(@Valid @RequestBody NuevaSimulacion nuevaSimulacion){
		Simulacion dato = new Simulacion();
		dato.setEdad(nuevaSimulacion.getEdad());		
				for (int i = nuevaSimulacion.getEdad(); i<60; i++ ){
					 
				contador.edad(dato);
				
				}     
	}
	}
		
