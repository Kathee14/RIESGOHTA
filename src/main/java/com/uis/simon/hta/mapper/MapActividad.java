package com.uis.simon.hta.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.uis.simon.hta.dto.ListaActividades;
import com.uis.simon.hta.entity.Actividad;

@Component("mapActividad")
public class MapActividad {
	
	public static List<ListaActividades> convertirLista(List<Actividad> actividades){
		List<ListaActividades> listaActividades = new ArrayList<>();
		for (Actividad actividad: actividades) {
			listaActividades.add(new ListaActividades(actividad));
		}
		
		return listaActividades;
	}

}
