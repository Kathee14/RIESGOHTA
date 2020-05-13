package com.uis.simon.hta.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.uis.simon.hta.entity.Enfermero;
import com.uis.simon.hta.entity.Paciente;

public class NuevaVisita {

	private String paciente;

	private String enfermero;
	
	private String observaciones;

	private String comentarios;
    
    private Date fecha;
	
    public NuevaVisita() {}
	
	public NuevaVisita(String paciente, String enfermero, String observaciones, String comentarios, Date fecha) {
		super();
		this.paciente = paciente;
		this.enfermero = enfermero;
		this.observaciones = observaciones;
		this.comentarios = comentarios;
		this.setFecha(fecha);
		
	}
	
	public NuevaVisita(String paciente, String observaciones, String comentarios, Date fecha) {
		super();
		this.paciente = paciente;
		this.observaciones = observaciones;
		this.comentarios = comentarios;
		this.setFecha(fecha);
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	

}
