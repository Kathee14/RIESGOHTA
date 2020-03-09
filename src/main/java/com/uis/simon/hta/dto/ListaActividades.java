package com.uis.simon.hta.dto;

import com.uis.simon.hta.entity.Actividad;

public class ListaActividades {

	private String nombreActividad;
	
	private int mets;

	
	public ListaActividades(){}	
	
	
	public ListaActividades(String nombreActividad, int mets) {
		super();
		this.nombreActividad = nombreActividad;
		this.mets = mets;
	}

	public ListaActividades(Actividad actividad) {
		this.nombreActividad=actividad.getNombreActividad();
		this.mets=actividad.getMets();
	}

	
	public String getNombreActividad() {
		return nombreActividad;
	}

	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public int getMets() {
		return mets;
	}

	public void setMets(int mets) {
		this.mets = mets;
	}
	
	
}
