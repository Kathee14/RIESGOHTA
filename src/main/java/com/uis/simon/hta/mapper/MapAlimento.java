package com.uis.simon.hta.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.uis.simon.hta.dto.ListaAlimentos;
import com.uis.simon.hta.entity.Alimento;

@Component("mapAlimento")
public class MapAlimento {
	
	public static List<ListaAlimentos> convertirLista(List<Alimento> alimentos){
		List<ListaAlimentos> listaAlimentos = new ArrayList<>();
		for (Alimento alimento: alimentos) {
			listaAlimentos.add(new ListaAlimentos(alimento));
		}
		
		return listaAlimentos;
	}
	

}
