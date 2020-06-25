package com.uis.simon.hta.dto;

public class ResultadoModelo {
	
	private double riesgoHta;
	
	private int edad;
	
	private double peso;
	
	private double sistolica;
	
	private double diastolica;
	
	private double pal;
	
	private double imc;
	
	public ResultadoModelo() {}

	
	public ResultadoModelo(int edad, double riesgoHta, double peso, double sistolica, double diastolica, double pal, double imc) {
		super();
		this.riesgoHta = riesgoHta;
		this.edad = edad;
		this.peso = peso;
		this.sistolica = sistolica;
		this.diastolica = diastolica;
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
