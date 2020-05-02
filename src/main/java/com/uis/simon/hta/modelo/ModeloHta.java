package com.uis.simon.hta.modelo;

public class ModeloHta {
	
	
	 //Declaración Niveles
	
	private double peso;
	private double ingestaDiariaEnergia;
	private int contador;
	private int edadActual;
	private int diasCigarrillo;
	private int diasInicio;
	private int temporizador;
	private int pesoSinFumar;
	
	//Declaración parámetros
	
	private double constanteSexo = -0.202933;
	private double escala = 0.876925;
	private double beta = 22.949536;
	private double constanteEdad = -0.156412;
	private double constanteCigarrillo = -0.190731;
	private double constanteHerencia = -0.166121;
	private double multiplicadorEdad = 0.001624;
	private double multiplicadorMasa= -0.033881;
	private double multiplicaDiastolica = -0.128468;
	private double multiplicaSistolica = -0.059330;
	private int kilogramosCalorias = 7700;
	
    //Declaración Flujos
	
	private double aumentoPeso;
	private double disminucionPeso;
	private int aumentoCalorias;
	private int disminucionCalorias;
	private int flujoDia;
	private int terminaAño;
	private int sumaAños;
	private int pesoFumar;
	private int dias;
	private int menosTemportizador;
	private double pesoMomentoFumar;
	
	//Declaración Variables
	
	private double riesgoHta;
	private double inidiceRiesgo;
	private double riesgoSexo;
	private double riesgoEdad;
	private double regulador;
	private double riesgoSistolico;
	private double riesgoDiastolico;
	private double riesgoIndiceMasa;
	private double indiceMasaCorporal;
	private double pesoTotal;
	private double riesgoEdadSistolica;
	private double riesgoHerencia;
	private double riesgoFumar;
	private double balanceEnergia;
	private double ingesta;
	private double gastoEnergetico;
	private double CoeficienteActividad;
	private double distincionPAL;
	private double disminuionAumento;
	private double pesoCigarrillo;
	private double diferenciaPeso;
	private double PAL;
	private double tasaMetabolismo;
	private int edadIngesta;
	private int diasSinFumar;
	
	
	
	
	

	

}
