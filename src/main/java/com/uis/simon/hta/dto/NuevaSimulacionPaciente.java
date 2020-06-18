package com.uis.simon.hta.dto;

import java.util.ArrayList;

public class NuevaSimulacionPaciente {
	
	private String paciente;
	
	private int sexo;
	
	private double altura;

	private int edad;

	private double peso;

	private int sbp;

	private int dbp;
	
	private int herencia;

	private int fumar;
	
	private int semanaF;
	
	private int upDown;
	
	private int upDownCalorias;
	
	private int semanaC;

	private int calorias;

	private ArrayList<ActividadFront> actividades;
	
	public NuevaSimulacionPaciente() {}

	public NuevaSimulacionPaciente(String paciente, int sexo, double altura, int edad, double peso, int sbp, int dbp,
			int herencia, int fumar, int semanaF, int upDown, int upDownCalorias, int semanaC, int calorias,
			ArrayList<ActividadFront> actividades) {
		super();
		this.paciente = paciente;
		this.sexo = sexo;
		this.altura = altura;
		this.edad = edad;
		this.peso = peso;
		this.sbp = sbp;
		this.dbp = dbp;
		this.herencia = herencia;
		this.fumar = fumar;
		this.semanaF = semanaF;
		this.upDown = upDown;
		this.upDownCalorias = upDownCalorias;
		this.semanaC = semanaC;
		this.calorias = calorias;
		this.actividades = actividades;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
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

	public int getSemanaF() {
		return semanaF;
	}

	public void setSemanaF(int semanaF) {
		this.semanaF = semanaF;
	}

	public int getUpDown() {
		return upDown;
	}

	public void setUpDown(int upDown) {
		this.upDown = upDown;
	}

	public int getUpDownCalorias() {
		return upDownCalorias;
	}

	public void setUpDownCalorias(int upDownCalorias) {
		this.upDownCalorias = upDownCalorias;
	}

	public int getSemanaC() {
		return semanaC;
	}

	public void setSemanaC(int semanaC) {
		this.semanaC = semanaC;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public ArrayList<ActividadFront> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<ActividadFront> actividades) {
		this.actividades = actividades;
	}


}
