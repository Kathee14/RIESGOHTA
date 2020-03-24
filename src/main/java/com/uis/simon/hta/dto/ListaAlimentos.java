package com.uis.simon.hta.dto;

import com.uis.simon.hta.entity.Alimento;

public class ListaAlimentos {
	
	private String alimento;
	private int calorias;
	private String tipoalimento;
	
	
	public ListaAlimentos() {}	
	
	public ListaAlimentos(String alimento, int calorias, String tipoalimento) {
		super();
		this.alimento = alimento;
		this.calorias = calorias;
		this.tipoalimento = tipoalimento;
	}
	
	
	public ListaAlimentos(Alimento alimento) {
		this.alimento= alimento.getAlimento();
		this.calorias=alimento.getCalorias();
		this.tipoalimento=alimento.getTipoalimento();
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
