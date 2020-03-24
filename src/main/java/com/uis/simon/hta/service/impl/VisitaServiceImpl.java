package com.uis.simon.hta.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uis.simon.hta.dao.IVisitaDao;
import com.uis.simon.hta.entity.Enfermero;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.entity.Visita;
import com.uis.simon.hta.service.IVisitaService;

@Service
public class VisitaServiceImpl implements IVisitaService {

	@Autowired
	private IVisitaDao visitaDao;
	

	@Override
	@Transactional
	public void saveVisita(Visita visita) {
	visitaDao.save(visita);
		
	}

	@Override
	public Visita findVisitaByPaciente(Paciente paciente) {
		return visitaDao.findVisitaByPaciente(paciente);
	}

	@Override
	public Visita findVisitaByEnfermero(Enfermero enfermero) {
	return visitaDao.findVisitaByEnfermero(enfermero);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Visita> findAll() {
		return (List<Visita>) visitaDao.findAll();
	}



}
