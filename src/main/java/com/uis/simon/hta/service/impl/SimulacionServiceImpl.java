package com.uis.simon.hta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uis.simon.hta.dao.ISimulacionDao;
import com.uis.simon.hta.entity.Simulacion;
import com.uis.simon.hta.service.ISimulacionService;

@Service
public class SimulacionServiceImpl implements ISimulacionService {
	
	@Autowired
	ISimulacionDao simulacionDao;

	@Override
	public void save(Simulacion simulacion) {
		simulacionDao.save(simulacion);
		
	}

}
