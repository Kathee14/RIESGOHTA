package com.uis.simon.hta.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.uis.simon.hta.dto.ListaVisitasP;
import com.uis.simon.hta.entity.Visita;

public class MapVisitaP {
	
	public static List<ListaVisitasP> convertirLista(Collection<Visita> visitaDb){
		List<ListaVisitasP> listaVisitas = new ArrayList<>();
		for (Visita visita: visitaDb) {
			listaVisitas.add(new ListaVisitasP(visita));
		}
		
		return listaVisitas;
	}

}
