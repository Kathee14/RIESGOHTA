package com.uis.simon.hta.dto;

import java.util.Date;

import com.uis.simon.hta.entity.Paciente;

public class ModificarPaciente {

	private String nombre;

	private String apellido;

	private String tipo_doc;

	private String cc;

	private Date fec_nac;

	private String ciudad;

	private String direccion;

	private String barrio;

	private String sexo;
	
	private String email;

	private Long celular;
	
	
	public ModificarPaciente() {}
	
	
	public ModificarPaciente(String nombre, String apellido, String tipo_doc, String cc, Date fec_nac, String ciudad,
			String direccion, String barrio, String sexo, String email, Long celular) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo_doc = tipo_doc;
		this.cc = cc;
		this.fec_nac = fec_nac;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.barrio = barrio;
		this.sexo = sexo;
		this.email = email;
		this.celular = celular;
	}
	
	public ModificarPaciente(Paciente paciente) {
		this.nombre=paciente.getNombre();
		this.apellido=paciente.getApellido();
		this.tipo_doc=paciente.getTipo_doc();
		this.cc=paciente.getCc();
		this.fec_nac=paciente.getFec_nac();
		this.ciudad=paciente.getCiudad();
		this.direccion=paciente.getDireccion();
		this.barrio=paciente.getBarrio();
		this.sexo=paciente.getSexo();
		this.email=paciente.getEmail();
		this.celular=paciente.getCelular();		
	
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

	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public Date getFec_nac() {
		return fec_nac;
	}

	public void setFec_nac(Date fec_nac) {
		this.fec_nac = fec_nac;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}
	
	
}
