package com.uis.simon.hta.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="actividad")
public class Actividad {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre_actividad")
	private String nombreActividad;
	
	@Column(name="mets")
	private int mets;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinTable(name="ActividadFisica",
		joinColumns = @JoinColumn(name="actividad_id", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name="relacion_id", referencedColumnName = "id"))
	private Set<Relacion> relaciones = new HashSet<Relacion>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
