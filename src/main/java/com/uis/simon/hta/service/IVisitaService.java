package com.uis.simon.hta.service;

import java.util.Collection;
import java.util.List;

import com.uis.simon.hta.entity.Visita;

public interface IVisitaService {
	
	public List<Visita> findAll();
	
	public void saveVisita(Visita visita);
	
	Collection<Visita> findAllVisitasByEnfermero(Long enfermero);
	
	Collection<Visita> findAllVisitasByPaciente(Long paciente);

}
