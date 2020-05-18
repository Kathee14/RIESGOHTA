package com.uis.simon.hta.dto;

import java.util.Date;

import com.uis.simon.hta.entity.Enfermero;
import com.uis.simon.hta.entity.Visita;

public class ListaVisitasP {
	
	private Enfermero enfermero;
	
	private String comentarios;
	
	private String observaciones;
	
	private Date create_at;
	
	public ListaVisitasP() {}

	public ListaVisitasP(Enfermero enfermero, String comentarios, String observaciones, Date create_at) {
		super();
		this.enfermero = enfermero;
		this.comentarios = comentarios;
		this.observaciones = observaciones;
		this.create_at = create_at;
	}

	public ListaVisitasP(Visita visita) {
		this.enfermero = visita.getEnfermero();
		this.comentarios = visita.getComentarios();
		this.observaciones = visita.getObservaciones();
		this.create_at = visita.getCreateAt();
	}
	
	
	public Enfermero getEnfermero() {
		return enfermero;
	}

	public void setEnfermero(Enfermero enfermero) {
		this.enfermero = enfermero;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

}
