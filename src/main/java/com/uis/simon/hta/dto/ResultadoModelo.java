package com.uis.simon.hta.dto;

public class ResultadoModelo {
	
	private double riesgoHta;
	
	private int edad;
	
	
	public ResultadoModelo() {}

	public ResultadoModelo(double riesgoHta, int edad) {
		super();
		this.riesgoHta = riesgoHta;
		this.edad = edad;
	}

	public double getRiesgoHta() {
		return riesgoHta;
	}

	public void setRiesgoHta(double riesgoHta) {
		this.riesgoHta = riesgoHta;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


}
