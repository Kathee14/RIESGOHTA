package com.uis.simon.hta.modelo;

public class SectorPresion {
	
	private double peso;
	private int pesoAct;
	private int presionS;
	private int presionD;
	private double SBP;
	private double DBP;
	private double diferenciaPeso;
	
	public SectorPresion(double peso, int pesoAct, int presionS, int presionD, double sBP, double dBP,
			double diferenciaPeso) {
		super();
		this.peso = peso;
		this.pesoAct = pesoAct;
		this.presionS = presionS;
		this.presionD = presionD;
		SBP = sBP;
		DBP = dBP;
		this.diferenciaPeso = diferenciaPeso;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getPesoAct() {
		return pesoAct;
	}
	public void setPesoAct(int pesoAct) {
		this.pesoAct = pesoAct;
	}
	public int getPresionS() {
		return presionS;
	}
	public void setPresionS(int presionS) {
		this.presionS = presionS;
	}
	public int getPresionD() {
		return presionD;
	}
	public void setPresionD(int presionD) {
		this.presionD = presionD;
	}
	public double getSBP() {
		return SBP;
	}
	public void setSBP(double sBP) {
		SBP = sBP;
	}
	public double getDBP() {
		return DBP;
	}
	public void setDBP(double dBP) {
		DBP = dBP;
	}
	public double getDiferenciaPeso() {
		return diferenciaPeso;
	}
	public void setDiferenciaPeso(double diferenciaPeso) {
		this.diferenciaPeso = diferenciaPeso;
	}
	
}
