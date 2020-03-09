package com.uis.simon.hta.dto;

import com.uis.simon.hta.entity.Alimento;

public class ListaAlimentos {
	
	private String alimento;
	private int calorias;
	private String tipo_alimento;
	
	
	public ListaAlimentos() {}	
	
	public ListaAlimentos(String alimento, int calorias, String tipo_alimento) {
		super();
		this.alimento = alimento;
		this.calorias = calorias;
		this.tipo_alimento = tipo_alimento;
	}
	
	
	public ListaAlimentos(Alimento alimento) {
		this.alimento= alimento.getAlimento();
		this.calorias=alimento.getCalorias();
		this.tipo_alimento=alimento.getTipo_alimento();
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
	public String getTipo_alimento() {
		return tipo_alimento;
	}
	public void setTipo_alimento(String tipo_alimento) {
		this.tipo_alimento = tipo_alimento;
	}
	
	
	
	

}
