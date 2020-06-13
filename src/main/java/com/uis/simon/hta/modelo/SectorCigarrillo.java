package com.uis.simon.hta.modelo;

public class SectorCigarrillo {
	
	private int sexo;
	private double pesoSinFumar;
	private int diasSinFumar;
	private int diasInicio;
	private int opcionCig;
	private int diasCigarrillo;
	private double pesoCigarrillo;
	
	
	public SectorCigarrillo(int sexo, double pesoSinFumar, int diasSinFumar, int diasInicio, int opcionCig,
			int diasCigarrillo, double pesoCigarrillo) {
		super();
		this.sexo = sexo;
		this.pesoSinFumar = pesoSinFumar;
		this.diasSinFumar = diasSinFumar;
		this.diasInicio = diasInicio;
		this.opcionCig = opcionCig;
		this.diasCigarrillo = diasCigarrillo;
		this.pesoCigarrillo = pesoCigarrillo;
	}


	public int getSexo() {
		return sexo;
	}


	public void setSexo(int sexo) {
		this.sexo = sexo;
	}


	public double getPesoSinFumar() {
		return pesoSinFumar;
	}


	public void setPesoSinFumar(double pesoSinFumar) {
		this.pesoSinFumar = pesoSinFumar;
	}


	public int getDiasSinFumar() {
		return diasSinFumar;
	}


	public void setDiasSinFumar(int diasSinFumar) {
		this.diasSinFumar = diasSinFumar;
	}


	public int getDiasInicio() {
		return diasInicio;
	}


	public void setDiasInicio(int diasInicio) {
		this.diasInicio = diasInicio;
	}


	public int getOpcionCig() {
		return opcionCig;
	}


	public void setOpcionCig(int opcionCig) {
		this.opcionCig = opcionCig;
	}


	public int getDiasCigarrillo() {
		return diasCigarrillo;
	}


	public void setDiasCigarrillo(int diasCigarrillo) {
		this.diasCigarrillo = diasCigarrillo;
	}


	public double getPesoCigarrillo() {
		return pesoCigarrillo;
	}


	public void setPesoCigarrillo(double pesoCigarrillo) {
		this.pesoCigarrillo = pesoCigarrillo;
	}
	
}
