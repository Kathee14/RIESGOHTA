package com.uis.simon.hta.dto;

import java.util.Date;

import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.entity.Visita;

public class ListaVisitasE {

	private Paciente paciente;
	
	private String comentarios;
	
	private String observaciones;
	
	private Date create_at;
	
    public ListaVisitasE() {}

	public ListaVisitasE(Paciente paciente, String comentarios, String observaciones, Date create_at) {
		super();
		this.paciente = paciente;
		this.comentarios = comentarios;
		this.observaciones = observaciones;
		this.create_at = create_at;
	}

	public ListaVisitasE(Visita visita) {
		
		this.paciente=visita.getPaciente();
		this.comentarios=visita.getComentarios();
		this.observaciones=visita.getObservaciones();
		this.create_at=visita.getCreateAt();
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
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
