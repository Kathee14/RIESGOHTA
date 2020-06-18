package com.uis.simon.hta.dto;

import java.util.Date;

import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.entity.Visita;

public class ListaVisitasE {

	private Paciente paciente;
	
	private double altura;

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
	
	private Date create_at;
	
    public ListaVisitasE() {}

	public ListaVisitasE(Paciente paciente, double altura, double peso,
			int sbp, int dbp, int herencia, int fumar, int semanaF, int upDown, int upDownCalorias, int semanaC,
			int calorias, String recomendaciones, String observaciones, String diabetes, String alcohol, String estres,
			String dieta, String alimentacion, String ejercicio,Date create_at) {
		super();
		this.paciente = paciente;
		this.altura = altura;
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
		this.create_at = create_at;
	}

	
	public ListaVisitasE(Visita visita) {
		
		this.paciente = visita.getPaciente();
		this.altura = visita.getAltura();
		this.peso = visita.getPeso();
		this.sbp = visita.getSbp();
		this.dbp = visita.getDbp();
		this.herencia = visita.getHerencia();
		this.fumar = visita.getFumar();
		this.semanaF = visita.getSemanaF();
		this.upDown = visita.getUpDown();
		this.upDownCalorias = visita.getUpDownCalorias();
		this.semanaC = visita.getSemanaC();
		this.recomendaciones = visita.getRecomendaciones();
		this.observaciones = visita.getObservaciones();
		this.diabetes = visita.getDiabetes();
		this.alcohol = visita.getAlcohol();
		this.estres = visita.getEstres();
		this.dieta = visita.getDieta();
		this.alimentacion = visita.getAlimentacion();
		this.ejercicio = visita.getEjercicio();
		this.create_at = visita.getCreateAt();
		
	
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
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

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

}
