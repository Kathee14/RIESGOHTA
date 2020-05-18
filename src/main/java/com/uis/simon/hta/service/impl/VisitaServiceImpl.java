package com.uis.simon.hta.service.impl;

import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uis.simon.hta.dao.IVisitaDao;
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
	@Transactional(readOnly = true)
	public List<Visita> findAll() {
		return (List<Visita>) visitaDao.findAll();
	}

	@Override
	public Collection<Visita> findAllVisitasByEnfermero(Long enfermero_id) {
		return visitaDao.findAllVisitasByEnfermero(enfermero_id);
	}

	@Override
	public Collection<Visita> findAllVisitasByPaciente(Long paciente_id) {
		return visitaDao.findAllVisitasByPaciente(paciente_id);	}
}
