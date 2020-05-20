package com.uis.simon.hta.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simon.hta.dto.ListaVisitasE;
import com.uis.simon.hta.dto.ListaVisitasP;
import com.uis.simon.hta.dto.NuevaVisita;
import com.uis.simon.hta.entity.Enfermero;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.entity.Visita;
import com.uis.simon.hta.mapper.MapVisitaE;
import com.uis.simon.hta.mapper.MapVisitaP;
import com.uis.simon.hta.service.IEnfermeroService;
import com.uis.simon.hta.service.IPacienteService;
import com.uis.simon.hta.service.IVisitaService;

@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/visita")

public class VisitaController {
	
	@Autowired
	private IEnfermeroService enfermeroService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IVisitaService visitaService;
	
	@GetMapping("/listaV")
	@ResponseStatus(HttpStatus.OK)
	public List<Visita> getVisitas(){
		return visitaService.findAll();
	}
	
	@GetMapping("/listaporenfermero/{id}")
	public ResponseEntity<?> listaVisitaEnfermero(@PathVariable(name = "id")Long enfermero){
	 Collection<Visita> visitaDb =  visitaService.findAllVisitasByEnfermero(enfermero);
		 if(visitaDb != null) {
			 	List<ListaVisitasE> listaVisitas = new ArrayList<>();
				listaVisitas = MapVisitaE.convertirLista(visitaDb);
		      return new ResponseEntity<>(listaVisitas, HttpStatus.OK);
	   } else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	 }
	
	@GetMapping("/listaporpaciente/{id}")
	public ResponseEntity<?> listaVisitaPaciente(@PathVariable(name = "id")Long paciente){
	 Collection<Visita> visitaDb =  visitaService.findAllVisitasByPaciente(paciente);
		 if(visitaDb != null) {
			 	List<ListaVisitasP> listaVisitas = new ArrayList<>();
				listaVisitas = MapVisitaP.convertirLista(visitaDb);
		      return new ResponseEntity<>(listaVisitas, HttpStatus.OK);
	   } else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	 }
	
	
	@PostMapping("/guardarVisita")
	public ResponseEntity<?> saveVisita(@RequestBody NuevaVisita nuevaVisita){
	Enfermero enfermero = enfermeroService.findByCc(nuevaVisita.getEnfermero());
		Paciente paciente = pacienteService.findByCc(nuevaVisita.getPaciente());
		if (paciente != null) {
		Visita visita = new Visita();
		visita.setEnfermero(enfermero);
		visita.setPaciente(paciente);
		visita.setComentarios(nuevaVisita.getComentarios());
		visita.setObservaciones(nuevaVisita.getObservaciones());
		visitaService.saveVisita(visita);	
		NuevaVisita newVisita = new NuevaVisita(visita.getEnfermero().getCc(),visita.getPaciente().getCc(),visita.getObservaciones(), visita.getComentarios(),visita.getCreateAt());
			return new ResponseEntity<>(newVisita,HttpStatus.CREATED);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	

}
