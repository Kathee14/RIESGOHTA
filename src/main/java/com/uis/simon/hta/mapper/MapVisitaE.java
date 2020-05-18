package com.uis.simon.hta.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.uis.simon.hta.dto.ListaVisitasE;
import com.uis.simon.hta.entity.Visita;

public class MapVisitaE {
	
	public static List<ListaVisitasE> convertirLista(Collection<Visita> visitaDb){
		List<ListaVisitasE> listaVisitas = new ArrayList<>();
		for (Visita visita: visitaDb) {
			listaVisitas.add(new ListaVisitasE(visita));
		}
		
		return listaVisitas;
	}
	

}
