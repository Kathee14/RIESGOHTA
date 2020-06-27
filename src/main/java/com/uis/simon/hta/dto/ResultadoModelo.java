package com.uis.simon.hta.dto;

public class ResultadoModelo {
	
	private double riesgoHta;
	
	private int edad;
	
	private double peso;
	
	private double pal;
	
	private double imc;
	
	public ResultadoModelo() {}

	
	public ResultadoModelo(int edad, double riesgoHta, double peso, double pal, double imc) {
		super();
		this.riesgoHta = riesgoHta;
		this.edad = edad;
		this.peso = peso;
		this.pal = pal;
		this.imc = imc;
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

	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPal() {
		return pal;
	}


	public void setPal(double pal) {
		this.pal = pal;
	}


	public double getImc() {
		return imc;
	}


	public void setImc(double imc) {
		this.imc = imc;
	}


}
