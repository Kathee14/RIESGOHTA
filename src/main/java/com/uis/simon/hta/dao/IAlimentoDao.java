package com.uis.simon.hta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uis.simon.hta.entity.Alimento;

public interface IAlimentoDao extends JpaRepository<Alimento, Long> {
	
	List<Alimento> findAlimentoByTipoalimento(String tipoalimento);	
}
