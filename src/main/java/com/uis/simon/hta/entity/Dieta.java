package com.uis.simon.hta.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dieta")
public class Dieta implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @ManyToOne
    @JoinColumn
	private Alimento alimento;
	
	@Id
    @ManyToOne
    @JoinColumn
	private Relacion relacion;
	
	private String tipo;
	
	public Dieta () {
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}

	public Relacion getRelacion() {
		return relacion;
	}

	public void setRelacion(Relacion relacion) {
		this.relacion = relacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
