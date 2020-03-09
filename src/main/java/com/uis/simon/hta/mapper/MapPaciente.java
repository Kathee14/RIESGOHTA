package com.uis.simon.hta.mapper;

import java.util.ArrayList;
import java.util.List;

import com.uis.simon.hta.dto.ModificarPaciente;
import com.uis.simon.hta.entity.Paciente;



public class MapPaciente {

	public static List<ModificarPaciente> convertirLista(List<Paciente> pacientes){
		List<ModificarPaciente> modificarPacientes = new ArrayList<>();
		for (Paciente paciente: pacientes) {
			modificarPacientes.add(new ModificarPaciente(paciente));
		}
		
		return modificarPacientes;
	}
	
}
