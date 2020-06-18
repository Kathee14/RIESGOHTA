package com.uis.simon.hta.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
@Table(name="visita")
public class Visita implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;  
	
	@ManyToOne
    @JoinColumn(name= "enfermero")
	private Enfermero enfermero;
	
	@ManyToOne
    @JoinColumn(name="paciente")
	private Paciente paciente;
	
	@Column(name ="altura")
	private double altura;

	@Column(name ="peso")
	private double peso;

	@Column(name ="sbp")
	private int sbp;
	
	@Column(name ="dbp")
	private int dbp;
	
	@Column(name ="herencia")
	private int herencia;

	@Column(name ="fumar")
	private int fumar;
	
	@Column(name ="semanaF")
	private int semanaF;
	
	@Column(name ="opCalorias")
	private int upDown;
	
	@Column(name ="caloriasExtra")
	private int upDownCalorias;
	
	@Column(name ="semanaCal")
	private int semanaC;

	@Column(name ="calorias")
	private int calorias;
	
	@Column(name="recomendaciones")
	private String recomendaciones;
	
	@Column(name="observaciones")
	private String observaciones;
	
	@Column(name="diabletes")
	private String diabetes;
	
	@Column(name = "alcohol")
	private String alcohol;
	
	@Column(name = "estres")
	private String estres;
	
	@Column(name = "dieta")
	private String dieta;
	
	@Column(name="alimentacion")
	private String alimentacion;
	
	@Column(name="ejercicio")
	private String ejercicio;
		
	@Column(name= "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@PrePersist 
	public void prePersist() {
		createAt = new Date();
	}
	
	public Visita () {}

	public Visita(Enfermero enfermero, Paciente paciente, double altura, double peso, int sbp,
			int dbp, int herencia, int fumar, int semanaF, int upDown, int upDownCalorias, int semanaC, int calorias,
			String recomendaciones, String observaciones, String diabetes, String alcohol, String estres, String dieta,
			String alimentacion, String ejercicio) {
		super();
		this.enfermero = enfermero;
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
	}
	
	public Visita(Visita visita) {}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Enfermero getEnfermero() {
		return enfermero;
	}

	public void setEnfermero(Enfermero enfermero) {
		this.enfermero = enfermero;
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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

		
}
