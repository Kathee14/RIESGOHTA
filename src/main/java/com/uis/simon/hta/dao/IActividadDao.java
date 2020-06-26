package com.uis.simon.hta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.uis.simon.hta.entity.Actividad;

	public interface IActividadDao extends CrudRepository<Actividad, Long> {
		
		@Query(value = "SELECT * FROM Actividad ORDER BY nombre_actividad", nativeQuery=true)
		public List<Actividad> findAll();
	}