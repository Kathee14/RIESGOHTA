package com.uis.simon.hta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.uis.simon.hta.entity.Visita;

public interface IVisitaDao extends CrudRepository<Visita, Long>{
	
	@Query(value = "SELECT * FROM Visita e WHERE e.enfermero = ?1", nativeQuery=true)
	List<Visita> findAllVisitasByEnfermero(Long enfermero);
	
	@Query(value = "SELECT * FROM Visita e WHERE e.enfermero = ?1 GROUP BY paciente", nativeQuery=true)
	List<Visita> findAllPacientesByEnfermero(Long enfermero);
	
	@Query(value = "SELECT * FROM Visita e WHERE e.paciente = ?1 GROUP BY enfermero", nativeQuery=true)
	List<Visita> findAllEnfermerosByPaciento(Long paciente);
	
	@Query(value = "SELECT * FROM Visita e WHERE e.paciente = ?1", nativeQuery=true)
	List<Visita> findAllVisitasByPaciente(Long paciente);

}
