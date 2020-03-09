package com.uis.simon.hta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simon.hta.dto.ListaAlimentos;
import com.uis.simon.hta.entity.Alimento;
import com.uis.simon.hta.mapper.MapAlimento;
import com.uis.simon.hta.service.IAlimentoService;

@RestController
@RequestMapping("/user/alimento")
public class AlimentoController {
	
	@Autowired
	IAlimentoService alimentoService;
	
	
	 @GetMapping("/lista")
	 public ResponseEntity<?> getLista(){
		 List<Alimento> lista = alimentoService.findAll();	 
		 List<ListaAlimentos> listaA = new ArrayList<>();
		 listaA = MapAlimento.convertirLista(lista);
         return new ResponseEntity<>(listaA, HttpStatus.OK);
   }
	
}
