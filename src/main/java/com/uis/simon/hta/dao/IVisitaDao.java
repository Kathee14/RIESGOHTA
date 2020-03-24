package com.uis.simon.hta.dao;

import org.springframework.data.repository.CrudRepository;

import com.uis.simon.hta.entity.Enfermero;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.entity.Visita;

public interface IVisitaDao extends CrudRepository<Visita, Long>{

	public Visita findVisitaByPaciente(Paciente paciente);
	
	public Visita findVisitaByEnfermero(Enfermero enfermero);	
	
}
