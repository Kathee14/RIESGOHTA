package com.uis.simon.hta.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simon.hta.dto.ListaActividades;
import com.uis.simon.hta.entity.Actividad;
import com.uis.simon.hta.mapper.MapActividad;
import com.uis.simon.hta.service.IActividadService;

@CrossOrigin
@RestController
@RequestMapping("/user/actividad")
public class ActividadController {
	
	@Autowired
	IActividadService actividadService;
	
	@GetMapping("/lista")
    public ResponseEntity<?> getLista(){
		List<Actividad> lista = actividadService.findAll();	 
		 List<ListaActividades> listaA = new ArrayList<>();
		 listaA = MapActividad.convertirLista(lista);
        return new ResponseEntity<>(listaA, HttpStatus.OK);
    }



}
