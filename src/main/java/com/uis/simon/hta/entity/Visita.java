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
	
	@Column(name= "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@PrePersist 
	public void prePersist() {
		createAt = new Date();
	}
	
	@Column(name="observaciones")
	private String observaciones;
	
	@Column(name="comentarios")
	private String comentarios;
	
	public Visita () {}

	public Visita(Enfermero enfermero, Paciente paciente, String observaciones, String comentarios) {
		super();
		this.enfermero = enfermero;
		this.paciente = paciente;
		this.observaciones = observaciones;
		this.comentarios = comentarios;
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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
	
	
}
