package com.uis.simon.hta.service;

import java.util.List;

import com.uis.simon.hta.dto.Enfermeros;
import com.uis.simon.hta.dto.Pacientes;
import com.uis.simon.hta.entity.Visita;

public interface IVisitaService {
	
	public List<Visita> findAll();
	
	public void saveVisita(Visita visita);
		
	List<Pacientes> findAllPacientesByEnfermero(Long enfermero);
	
	List<Enfermeros> findAllEnfermerosByPaciento(Long paciente);
	
	List<Visita> findAllVisitasByPaciente(Long paciente);
	
    List<Visita> findAllVisitasByEnfermero(Long enfermero);
	
}