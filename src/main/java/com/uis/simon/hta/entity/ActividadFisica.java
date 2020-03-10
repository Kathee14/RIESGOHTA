package com.uis.simon.hta.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ActividadFisica implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @ManyToOne
    @JoinColumn
	private Actividad actividad;
	
	@Id
    @ManyToOne
    @JoinColumn
	private Relacion relacion;
	
	@Column(name="dia")
	private int dia;

	@Column(name="duracion")
	private int duracion;

	public ActividadFisica() {
		super();
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public Relacion getRelacion() {
		return relacion;
	}

	public void setRelacion(Relacion relacion) {
		this.relacion = relacion;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}
