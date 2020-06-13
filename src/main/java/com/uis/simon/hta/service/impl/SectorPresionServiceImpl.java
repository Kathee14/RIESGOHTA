package com.uis.simon.hta.service.impl;

import org.springframework.stereotype.Service;

import com.uis.simon.hta.entity.Simulacion;
import com.uis.simon.hta.modelo.Multiplicadores;
import com.uis.simon.hta.service.ISectorPresionService;

@Service
public class SectorPresionServiceImpl implements ISectorPresionService {
	
	private double peso;
	private double SBP;
	private double DBP;
	private double diferenciaPeso;
	
	@Override
	public void diferenciaPeso(Simulacion simulacion) {
		this.diferenciaPeso = simulacion.getPeso()-this.peso;
	}

	@Override
	public void SBP(Simulacion simulacion) {
		this.SBP = simulacion.getSbp() + Multiplicadores.MultiplicadorPresionSistolica(diferenciaPeso);
	}

	@Override
	public void DBP(Simulacion simulacion) {
	
		this.DBP = simulacion.getDbp() + Multiplicadores.MultiplicadorPresionDistolica(diferenciaPeso);
	}
	
	

}
