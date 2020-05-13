package com.uis.simon.hta.dto;

import java.util.Date;

import com.uis.simon.hta.entity.Visita;

public class ListaVisitas {

	private String cc_paciente;
	
	private String comentarios;
	
	private String observaciones;
	
	private Date create_at;
	
    public ListaVisitas() {}
	
	public ListaVisitas(String cc_paciente, String comentarios, String observaciones,
			Date create_at) {
		super();
		this.cc_paciente = cc_paciente;
		this.comentarios = comentarios;
		this.observaciones = observaciones;
		this.create_at = create_at;
	}

	public ListaVisitas(Visita visita) {
		
		this.cc_paciente=visita.getPaciente().getCc();
		this.comentarios=visita.getComentarios();
		this.observaciones=visita.getObservaciones();
		this.create_at=visita.getCreateAt();
	}
	
	public String getCc_paciente() {
		return cc_paciente;
	}

	public void setCc_paciente(String cc_paciente) {
		this.cc_paciente = cc_paciente;
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
