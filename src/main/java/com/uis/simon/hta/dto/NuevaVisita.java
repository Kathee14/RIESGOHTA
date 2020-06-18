package com.uis.simon.hta.dto;

import java.util.Date;

public class NuevaVisita {

	private String paciente;

	private String enfermero;
	
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
	
	private String recomendaciones;
	
	private String observaciones;
	
	private String diabetes;
	
	private String alcohol;
	
	private String estres;
	
	private String dieta;
	
	private String alimentacion;
	
	private String ejercicio;
	
	private Date fecha;
	
    public NuevaVisita() {}
	
	public NuevaVisita(String paciente, String enfermero, int sexo, double altura, int edad, double peso, int sbp,
			int dbp, int herencia, int fumar, int semanaF, int upDown, int upDownCalorias, int semanaC, int calorias,
			String recomendaciones, String observaciones, String diabetes, String alcohol, String estres, String dieta,
			String alimentacion, String ejercicio, Date fecha) {
		super();
		this.paciente = paciente;
		this.enfermero = enfermero;
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
		this.recomendaciones = recomendaciones;
		this.observaciones = observaciones;
		this.diabetes = diabetes;
		this.alcohol = alcohol;
		this.estres = estres;
		this.dieta = dieta;
		this.alimentacion = alimentacion;
		this.ejercicio = ejercicio;
		this.fecha = fecha;
	}

	public NuevaVisita(String paciente, int sexo, double altura, int edad, double peso, int sbp,
			int dbp, int herencia, int fumar, int semanaF, int upDown, int upDownCalorias, int semanaC, int calorias,
			String recomendaciones, String observaciones, String diabetes, String alcohol, String estres, String dieta,
			String alimentacion, String ejercicio, Date fecha) {
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
		this.recomendaciones = recomendaciones;
		this.observaciones = observaciones;
		this.diabetes = diabetes;
		this.alcohol = alcohol;
		this.estres = estres;
		this.dieta = dieta;
		this.alimentacion = alimentacion;
		this.ejercicio = ejercicio;
		this.fecha = fecha;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getEnfermero() {
		return enfermero;
	}

	public void setEnfermero(String enfermero) {
		this.enfermero = enfermero;
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

	public String getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public String getEstres() {
		return estres;
	}

	public void setEstres(String estres) {
		this.estres = estres;
	}

	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
