package com.uis.simon.hta.dto;

import javax.persistence.Column;

public class NuevaSimulacion {

	@Column(name="paciente")
	private String paciente;
	
	@Column(name="altura")
	private float altura;
	
	@Column(name="edad")
	private int edad;
		
	@Column(name="peso")
	private double peso;
	
	@Column(name="sbp")
	private int sbp;
	
	@Column(name="dbp")
	private int dbp;
	
	@Column(name="herencia")
	private int herencia;
	
	@Column(name="fumar")
	private int fumar;
	
	@Column(name="calorias")
	private double calorias;
	
	
	public NuevaSimulacion() {} 



	public NuevaSimulacion(String paciente, float altura, int edad, double peso, int sbp, int dbp, int herencia,
			int fumar, double calorias) {
		super();
		this.paciente = paciente;
		this.altura = altura;
		this.edad = edad;
		this.peso = peso;
		this.sbp = sbp;
		this.dbp = dbp;
		this.herencia = herencia;
		this.fumar = fumar;
		this.calorias = calorias;
	}



	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getHerencia() {
		return herencia;
	}

	public void setHerencia(int herencia) {
		this.herencia = herencia;
	}

	public int getFumar() {
		return fumar;
	}

	public void setFumar(int fumar) {
		this.fumar = fumar;
	}

	public int getSbp() {
		return sbp;
	}

	public void setSbp(int sbp) {
		this.sbp = sbp;
	}

	public int getDbp() {
		return dbp;
	}

	public void setDbp(int dbp) {
		this.dbp = dbp;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
