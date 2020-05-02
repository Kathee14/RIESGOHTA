package com.uis.simon.hta.dto;

import java.util.Map;

public class JwtUser {

	private Long id;
	private String nombre;
	private String apellido;
	private String cc;
	private String role;
	private Map<String,String> token;

	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Map<String, String> getToken() {
		return token;
	}
	public void setToken(Map<String, String> token) {
		this.token = token;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
