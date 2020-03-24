package com.uis.simon.hta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="alimento")
public class Alimento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="alimento")
	private String alimento;
	
	@Column(unique = true, name="calorias")
	private int calorias;
	
	@Column(name="tipo_alimento")
	private String tipoalimento;	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	public String getTipoalimento() {
		return tipoalimento;
	}
	public void setTipoalimento(String tipoalimento) {
		this.tipoalimento = tipoalimento;
	}
	
}