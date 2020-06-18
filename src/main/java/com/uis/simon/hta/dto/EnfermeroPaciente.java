package com.uis.simon.hta.dto;

public class EnfermeroPaciente {
	
	private String enfermero;
	private String paciente;
	
	public EnfermeroPaciente() {}
	
	public EnfermeroPaciente(String enfermero, String paciente) {
		super();
		this.enfermero = enfermero;
		this.paciente = paciente;
	}
	
	public String getEnfermero() {
		return enfermero;
	}
	public void setEnfermero(String enfermero) {
		this.enfermero = enfermero;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	
	

}
