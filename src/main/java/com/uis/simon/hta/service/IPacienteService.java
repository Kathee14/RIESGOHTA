package com.uis.simon.hta.service;

import java.util.List;

import com.uis.simon.hta.dto.NuevoPaciente;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.dto.Login;;

public interface IPacienteService {
	
   public List<Paciente> findAll();
	
	public void save(Paciente paciente);
	
	public Paciente findUsuario(NuevoPaciente nuevoPaciente);
	
	public Paciente findUsuario(Paciente Paciente);	
	
	public Paciente findByCc(String cc);
	
	public Paciente updateUsuario(Paciente paciente);

	public Paciente checkUsuarioLogin(Paciente paciente);
	
	public Paciente checkUsuarioLogin(Login login);
	
	public Paciente findPaciente(NuevoPaciente nuevoPaciente);
	
		
	}