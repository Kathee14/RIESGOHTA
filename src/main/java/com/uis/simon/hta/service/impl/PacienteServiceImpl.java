package com.uis.simon.hta.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uis.simon.hta.dao.IPacienteDao;
import com.uis.simon.hta.dto.NuevoPaciente;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.dto.Login;
import com.uis.simon.hta.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	
	@Autowired
	private IPacienteDao pacienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Paciente> findAll() {
		return (List<Paciente>) pacienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Paciente paciente) {
		pacienteDao.save(paciente);
	}

	@Override
	@Transactional(readOnly=true)
	public Paciente findUsuario(NuevoPaciente nuevoPaciente) {
		return (Paciente) pacienteDao.findByCc(nuevoPaciente.getCc());
	}

	@Override
	@Transactional(readOnly=true)
	public Paciente checkUsuarioLogin(Paciente paciente) {
		return (Paciente) pacienteDao.findByCcAndPassword(paciente.getCc(),paciente.getPassword());
	}

	@Override
	public Paciente findByCc(String cc) {
		return pacienteDao.findByCc(cc);
	}

	@Override
	public Paciente updateUsuario(Paciente paciente) {
		return (Paciente)pacienteDao.save(paciente);
	}

	@Override
	public Paciente findUsuario(Paciente paciente) {
		return (Paciente) pacienteDao.findByCc(paciente.getCc());
	}

	@Override
	public Paciente checkUsuarioLogin(Login login) {
		return (Paciente) pacienteDao.findByCcAndPassword(login.getCc(),(login.getPassword()));
	}
	
}