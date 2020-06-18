package com.uis.simon.hta.dto;

public class ActividadFront {
	
	private String nombreActividad;
	
	private int mets;
	
	private int tiempo;
	
	public ActividadFront() {}

	public ActividadFront(String nombre, int mets, int tiempo) {
		super();
		this.nombreActividad = nombre;
		this.mets = mets;
		this.tiempo = tiempo;
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

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	
	
	

}
