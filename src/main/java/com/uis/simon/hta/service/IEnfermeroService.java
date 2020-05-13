package com.uis.simon.hta.service;


import java.util.List;

import com.uis.simon.hta.dto.Login;
import com.uis.simon.hta.entity.Enfermero;

public interface IEnfermeroService {
	
	public List<Enfermero> findAll();
	
	public Enfermero findEnfermero(Enfermero enfermero);
	
	public Enfermero findByCc(String cc);
	
	public Enfermero checkUsuarioLogin(Enfermero enfermero);
	
	public Enfermero checkUsuarioLogin(Login login);
	
	public void save(Enfermero enfermero);
	
	public Enfermero findById(Long id);
	
	
}
