package com.uis.simon.hta.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uis.simon.hta.dao.IVisitaDao;
import com.uis.simon.hta.dto.Enfermeros;
import com.uis.simon.hta.dto.Pacientes;
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
	public List<Pacientes> findAllPacientesByEnfermero(Long enfermero) {
		List<Visita> v = visitaDao.findAllPacientesByEnfermero(enfermero);
		List<Pacientes> lista = new ArrayList<Pacientes>();
		
			for (Visita a: v) {
				Pacientes pacientes = new Pacientes(a.getPaciente().getNombre(), a.getPaciente().getApellido(), a.getPaciente().getCc());
				lista.add(pacientes);
			}
		return lista;
	}

	@Override
	public List<Enfermeros> findAllEnfermerosByPaciento(Long paciente) {
		List<Visita> visitas = visitaDao.findAllEnfermerosByPaciento(paciente);
		List<Enfermeros> lista = new ArrayList<Enfermeros>();
		
		for(Visita a: visitas) {
			Enfermeros enfermeros = new Enfermeros(a.getEnfermero().getNombre(), a.getEnfermero().getApellido(), a.getEnfermero().getCc());
			lista.add(enfermeros);
		}
		return lista;
	}

	@Override
	public List<Visita> findAllVisitasByPaciente(Long paciente) {
		return visitaDao.findAllVisitasByPaciente(paciente);	
	}

	@Override
	public List<Visita> findAllVisitasByEnfermero(Long enfermero) {
		return visitaDao.findAllVisitasByEnfermero(enfermero);
	}
}
	

