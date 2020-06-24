package com.uis.simon.hta.dto;

public class ResultadoModelo {
	
	private double riesgoHta;
	
	private int edad;
	
	private double peso;
	
	private double sistolica;
	
	private double diastolica;
	
	
	public ResultadoModelo() {}

	
	public ResultadoModelo(int edad, double riesgoHta, double peso, double sistolica, double diastolica) {
		super();
		this.riesgoHta = riesgoHta;
		this.edad = edad;
		this.peso = peso;
		this.sistolica = sistolica;
		this.diastolica = diastolica;
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


	public double getSistolica() {
		return sistolica;
	}


	public void setSistolica(double sistolica) {
		this.sistolica = sistolica;
	}


	public double getDiastolica() {
		return diastolica;
	}


	public void setDiastolica(double diastolica) {
		this.diastolica = diastolica;
	}


}
