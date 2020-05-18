package com.uis.simon.hta.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.uis.simon.hta.entity.Visita;

public interface IVisitaDao extends CrudRepository<Visita, Long>{
	
	@Query(value = "SELECT * FROM Visita e WHERE e.enfermero_id = ?1", nativeQuery=true)
	Collection<Visita> findAllVisitasByEnfermero(Long enfermero_id);
	
	@Query(value = "SELECT * FROM Visita e WHERE e.paciente_id = ?1", nativeQuery=true)
	Collection<Visita> findAllVisitasByPaciente(Long paciente_id);

}
