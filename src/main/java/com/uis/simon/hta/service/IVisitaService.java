package com.uis.simon.hta.service;

import java.util.List;

import com.uis.simon.hta.entity.Enfermero;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.entity.Visita;

public interface IVisitaService {
	
	public List<Visita> findAll();
	
	public void saveVisita(Visita visita);
	
	public Visita findVisitaByPaciente(Paciente paciente);
	
	public Visita findVisitaByEnfermero(Enfermero enfermero);
	

}
