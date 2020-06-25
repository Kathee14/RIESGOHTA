package com.uis.simon.hta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uis.simon.hta.entity.Alimento;

public interface IAlimentoDao extends JpaRepository<Alimento, Long> {
	
	@Query(value = "SELECT * FROM Alimento e WHERE e.tipo_alimento = ?1 ORDER BY alimento", nativeQuery=true)
	List<Alimento> findAlimentoByTipoalimento(String tipoalimento);	
}
