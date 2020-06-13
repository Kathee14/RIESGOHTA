package com.uis.simon.hta.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="simulacion")
public class Simulacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name= "paciente")
	private Paciente paciente;
	
	@Column(name="altura")
	private double altura;
	
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
	
	@Column(name= "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}

	public Simulacion() {}
	

	public Simulacion(double altura, double peso, double calorias) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.calorias = calorias;
	}
	
	public Simulacion(int edad, int sbp, int dbp, int herencia, int fumar) {
		super();
		this.edad = edad;
		this.sbp = sbp;
		this.dbp = dbp;
		this.herencia = herencia;
		this.fumar = fumar;
	}

	public Simulacion(Paciente paciente, double altura, int edad, double peso, int sbp, int dbp, int herencia, int fumar,
			double calorias) {
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


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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


	public double getCalorias() {
		return calorias;
	}


	public void setCalorias(double calorias) {
		this.calorias = calorias;
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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
}