package com.uis.simon.hta.mapper;

import java.util.ArrayList;
import java.util.List;

import com.uis.simon.hta.dto.ListaVisitas;
import com.uis.simon.hta.entity.Visita;

public class MapVisita {
	
	public static List<ListaVisitas> convertirLista(List<Visita> visitas){
		List<ListaVisitas> listaVisitas = new ArrayList<>();
		for (Visita visita: visitas) {
			listaVisitas.add(new ListaVisitas(visita));
		}
		
		return listaVisitas;
	}
	

}
