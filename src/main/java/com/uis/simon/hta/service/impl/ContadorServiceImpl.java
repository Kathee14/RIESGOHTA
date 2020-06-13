package com.uis.simon.hta.service.impl;

import org.springframework.stereotype.Service;

import com.uis.simon.hta.entity.Simulacion;
import com.uis.simon.hta.service.IContadorService;

@Service
public class ContadorServiceImpl implements IContadorService{
	
	private double contador = 1;
	private double flujodia = 1/365;
	private int terminaAño;
	private int edad;
	private int sumaAños;
	private int EdadAct;

	@Override
	public int edad(Simulacion simulacion) {
		
		this.EdadAct = simulacion.getEdad();
		
		if(this.contador == 1) {
			this.sumaAños = 365;
		} else {
			this.sumaAños = 0;
		}
		
		if(this.contador == 1) {
			this.terminaAño = 1;
		} else {
			this.terminaAño = 0;
		}	
		
		this.contador = (this.contador + this.flujodia - this.terminaAño);	
		
		this.edad = this.EdadAct + this.sumaAños;
	
	return edad;

}
	
}
