package com.uis.simon.hta.service.impl;

import org.springframework.stereotype.Service;

import com.uis.simon.hta.multiplicadoresModelo.*;

@Service
public class RiesgoHta {
	
	private static final double constanteSexo = -0.202933;
	private static final double escala = 0.876925;
	private static final double beta = 22.949536;
	private static final double constanteEdad = -0.156412;
	private static final double constanteCigarrillo = -0.190731;
	private static final double constanteHerencia = -0.166121;
	private static final double constanteDiast = 0.001624;
	private static final double constanteMasa= -0.033881;
	private static final double constanteDiastolica = -0.128468;
	private static final double constanteSistolica = -0.059330;
	private static final int DIAS = 365;
	private static final int SEMANA = 7;
	private int edad;
	private int edadAct;
	private int tiempo;
	private int diasInicio;
	private int iteracion = 0;
	private int edadIngesta;
	private int diasCig;
	private int diasCigarrillo = 0;
	private int diasSf = 0;
	private double peso;
	private double pesoTotal;
	private double pesoAct;
	private int sexo;
	private double altura;
	private int t1;
	private int t2;
	private int t3;
	private int t4;
	private int t5;
	private int met1;
	private int met2;
	private int met3;
	private int met4;
	private int met5;
	private double p1;
	private double p2;
	private double p3;
	private double p4;
	private double p5;
	private double PAL;
	private double TMB;
	private double distincionPal;
	private double coefAct;
	private double gastoEnergetico;
	private double imc;
	private int opCal;
	private int opCig;
	private double pesoCig;
	private int upDown;	
	private int calExtra;
	private double ac;
	private double dc;
	private double ingestaDiaria;
    private double balanceEnergia;
    private double ingestaAdecuada;
    private double AP;
    private double DP;
    private static final int CAL = 7700;
    private double diferenciaPeso;
    private double SBP;
    private double DBP;
    private int opSBP;
    private int opDBP;
    private int herencia;
    private double riesgoHerencia;
    private double riesgoExtraDias;
    private double riesgoIMC;
    private double riesgoSistolica;
    private double riesgoDiastolica;
    private double riesgoCigarrillo;
	private int regulador;
	private double riesgoEdad;
	private double riesgoSexo;
	private double suma;
    private double riesgoHTA;
    private double pesoSinFumar;
    
    public RiesgoHta() {}
	
    public RiesgoHta(int edadAct, double pesoAct, int sexo, double altura, int t1, int t2, int t3, int t4, int t5, int met1, int met2,
			int met3, int met4, int met5, int opCal, int calorias, int calExtra,int semCal, int semCig, int opSBP, int opDBP, int herencia,int opCig) {
		this.edad = edadAct;
		this.edadAct = edadAct;
		this.tiempo = edadAct;
		this.edadIngesta = setEdadIngesta(semCal);
		this.diasCig = setDiasCig(semCig);
		this.diasInicio = edadAct * DIAS;
		this.diasCigarrillo = 0;
		this.peso = pesoAct;
		this.pesoAct = pesoAct;
		this.pesoTotal = pesoAct;
		this.imc = pesoAct/(altura*altura);
		this.sexo = sexo;
		this.altura = altura;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
		this.met1 = met1;
		this.met2 = met2;
		this.met3 = met3;
		this.met4 = met4;
		this.met5 = met5;
		this.opCal = opCal;
		this.ingestaDiaria = calorias;
		this.upDown = opCal;
		this.calExtra = calExtra;
		this.opDBP = opDBP;
		this.opSBP = opSBP;
		this.herencia = herencia;
		this.opCig = opCig;
		this.riesgoCigarrillo = opCig*constanteCigarrillo;
		this.riesgoDiastolica= opDBP * constanteDiastolica;
		this.riesgoSistolica = opSBP * constanteSistolica;
		this.riesgoSexo = sexo*constanteSexo;
		this.riesgoEdad = edadAct*constanteEdad;
		this.riesgoHerencia = herencia * constanteHerencia;
		this.riesgoExtraDias = edadAct * constanteDiast * opDBP;
		this.riesgoIMC = this.imc*constanteMasa;
		this.suma = beta + this.riesgoCigarrillo + this.riesgoDiastolica + this.riesgoSistolica + this.riesgoSexo + this.riesgoEdad + this.riesgoHerencia + this.riesgoExtraDias + this.riesgoIMC;
		this.riesgoHTA =  (1-Math.exp(-Math.exp((Math.log(1)-this.suma)/escala)))*100;
		this.DBP = opDBP;
		this.SBP = opSBP;
		
		if (sexo == 0) {
			this.TMB = (293-(3.8*this.edad)+(456.4*altura)+(10.12*pesoAct));
		} else {
			this.TMB = (204-(4*edad)+(450.5*altura)+(11.69*pesoAct));
		}
		
		this.p1 = ((met1-1)*(((1.15/0.9)*t1)/1440))/(this.TMB/(0.0175*1440*pesoAct));
		
		this.p2 = ((met2-1)*(((1.15/0.9)*t2)/1440))/(this.TMB/(0.0175*1440*pesoAct));
		
		this.p3 = ((met3-1)*(((1.15/0.9)*t3)/1440))/(this.TMB/(0.0175*1440*pesoAct));
		
		this.p4 = ((met4-1)*(((1.15/0.9)*t4)/1440))/(this.TMB/(0.0175*1440*pesoAct));
		
		this.p5 = ((met5-1)*(((1.15/0.9)*t5)/1440))/(this.TMB/(0.0175*1440*pesoAct));
		
		
		this.PAL = this.p1 + this.p2 + this.p3 + this.p4 + this.p5;
		
		
		if((this.PAL>=0)&&(PAL<1.4)) {
			this.distincionPal=1;
		} else {
				if((this.PAL>=1.4)&&(PAL<1.6)) {
					this.distincionPal=2;
				} else {
						if((this.PAL>=1.6)&&(PAL<1.9)) {
							this.distincionPal=3;
						} else {
							this.distincionPal=4;
						}
				}
			
		}
		
		if(sexo == 0) {
			this.coefAct = Multiplicador.MultiplicadorFisicoHombres(distincionPal);		
		} else {
			this.coefAct = Multiplicador.MultiplicadorFisicoMujeres(distincionPal);
		}
		
		if(sexo == 0) {
			this.gastoEnergetico = (864-(9.72*edadAct)+(coefAct*(14.2*pesoAct)+(503*altura)));
		} else {
			this.gastoEnergetico = (387-(7.31*edadAct)+(coefAct*(10.9*pesoAct)+(660.7*altura)));
		}
		
		if(this.imc>18 && this.imc<24) {
			this.ingestaAdecuada = gastoEnergetico;
		} else {
			this.ingestaAdecuada = ingestaDiaria;
		}
		
		this.balanceEnergia = this.ingestaAdecuada-this.gastoEnergetico;
		
		if(this.upDown == 1) {
			this.ac = this.calExtra;
		} else {
			this.ac=0;
		}
		
		if(this.upDown == 0) {
			this.dc = this.calExtra;
		} else {
			this.dc = 0;
		}
		
		if(this.balanceEnergia >= 0) {
			this.AP = (this.balanceEnergia/CAL);
		} else {
			 this.AP = 0;
		}
		
		if(this.balanceEnergia < 0) {
			this.DP = (Math.abs(balanceEnergia/CAL));
		} else {
			 this.DP = 0 ;
		}
		
    }

    
    
    public void riesgo() {

    	//VARIABLES
    	
    	this.diasInicio = diasInicio + 1;
		
		if(diasInicio >= diasCig) {
			this.diasSf = DIAS;
		}else {
			this.diasSf = 0;
		}
		
		this.diasCigarrillo = diasInicio>diasCig ? this.diasCigarrillo + 1 : this.diasCigarrillo;
		
		if(diasInicio < diasCig) {
			riesgoCigarrillo = opCig* constanteCigarrillo;
		} else {
			if(opCig == 1) { 
				riesgoCigarrillo = 0;
			} else {
				riesgoCigarrillo = constanteCigarrillo;
			}
		}
		
		if(riesgoCigarrillo == 0 && opCig == 1 && diasInicio<=diasCig) {
			pesoSinFumar = peso ;
		} 
	
			if(diasInicio>= diasCig) {
			if(opCig==1) {
				if(sexo == 0 ) {
				pesoCig = pesoSinFumar * MultiplicadorPesoHombres.MultiplicadorgananciaPesoHombres(diasCigarrillo);
				} else {
					pesoCig = pesoSinFumar * MultiplicadorPesoMujeres.MultiplicadorgananciaPesoMujeres(diasCigarrillo);
				}
			}
			
		}
		
		this.pesoTotal = this.peso + this.pesoCig;
		
		this.imc = (this.pesoTotal/(this.altura*this.altura));
		
		this.riesgoIMC = imc*constanteMasa;
		
		this.riesgoHerencia = constanteHerencia * herencia;
		
		//RiesgoDiastolica
		 this.riesgoDiastolica = DBP * constanteDiastolica;
		
		//RiesgoSistolica
		this.riesgoSistolica = SBP * constanteSistolica;
		
		//RIESGOExtraDiastolico
		this.riesgoExtraDias = DBP * edad * constanteDiast;
		
		//REGULADOR
		this.regulador = this.edad-(this.edadAct-20);
		
		//RiesgoEdad
		
		if(this.sexo == 1) {
			riesgoEdad= (constanteEdad*Multiplicador.reguladorEdadMujeres(regulador))*edad;
		} else {
			riesgoEdad= (constanteEdad*Multiplicador.reguladorEdadHombres(regulador))*edad;
		}
		
		//RiesgoSexo
		this.riesgoSexo = constanteSexo * sexo;
		
		//Suma
		this.suma =  beta + riesgoDiastolica + riesgoSistolica + riesgoEdad + riesgoExtraDias + riesgoHerencia + riesgoIMC + riesgoSexo;
		
		//RIESGOHTA
		riesgoHTA = (1-Math.exp(-Math.exp((Math.log(1)-suma)/escala)))*100;
		
		this.diferenciaPeso = peso - pesoAct;
		
		SBP = opSBP + (Multiplicador.MultiplicadorPresionSistolica(this.diferenciaPeso));
	
		DBP = opDBP + (Multiplicador.MultiplicadorPresionDiastolica(this.diferenciaPeso));	
		
		if (sexo == 0) {
			TMB = (293-(3.8*this.edad)+(456.4*altura)+(10.12*pesoTotal));
		} else {
			TMB = 204-(4*edad)+(450.5*altura)+(11.69*pesoTotal);
		}
    
		this.p1 = ((met1-1)*(((1.15/0.9)*t1)/1440))/(TMB/(0.0175*1440*peso));
		
		this.p2 = ((met2-1)*(((1.15/0.9)*t2)/1440))/(TMB/(0.0175*1440*peso));
		
		this.p3 = ((met3-1)*(((1.15/0.9)*t3)/1440))/(TMB/(0.0175*1440*peso));
		
		this.p4 = ((met4-1)*(((1.15/0.9)*t4)/1440))/(TMB/(0.0175*1440*peso));
		
		this.p5 = ((met5-1)*(((1.15/0.9)*t5)/1440))/(TMB/(0.0175*1440*peso));
		
		
		this.PAL = p1 + p2 + p3 + p4 + p5;
		
		if((PAL>=0)&&(PAL<1.4)) {
			this.distincionPal=1;
		} else {
				if((PAL>=1.4)&&(PAL<1.6)) {
					this.distincionPal=2;
				} else {
						if((PAL>=1.6)&&(PAL<1.9)) {
							this.distincionPal=3;
						} else {
							this.distincionPal=4;
						}
				}
			
		}
		
		if(diasInicio >= edadIngesta ) {
			upDown = opCal;
		} else { 
			if(this.opCal==1) {
				upDown=0;
			} else {
				upDown = 1;
			}
			
		}
		

		if(sexo == 0) {
			this.coefAct = Multiplicador.MultiplicadorFisicoHombres(distincionPal);		
		} else {
			this.coefAct = Multiplicador.MultiplicadorFisicoMujeres(distincionPal);
		}
		
		
		if(sexo == 0) {
			this.gastoEnergetico = (864-(9.72*edad)+(coefAct*(14.2*pesoTotal)+(503*altura)));
		} else {
			this.gastoEnergetico = (387-(7.31*edad)+(coefAct*(10.9*pesoTotal)+(660.7*altura)));
		}
		
		if(this.imc>18 && this.imc<24) {
			this.ingestaAdecuada = gastoEnergetico;
		} else {
			this.ingestaAdecuada = ingestaDiaria;
		}
		
		this.balanceEnergia = ingestaAdecuada-gastoEnergetico;
		
		//FLUJOS   	

		
		if(this.upDown == 1) {
			this.ac = this.calExtra;
		} else {
			this.ac=0;
		}
		
		if(this.upDown == 0) {
			this.dc = this.calExtra;
		} else {
			this.dc = 0;
		}
		

		if(this.balanceEnergia >= 0) {
			this.AP = (this.balanceEnergia/CAL);
		} else {
			 this.AP = 0 ;
		}
		
		if(this.balanceEnergia < 0) {
			this.DP = (Math.abs(balanceEnergia/CAL));
		} else {
			 this.DP = 0 ;
		}
		
		
		this.ingestaDiaria = ingestaDiaria + (ac)/365 - (dc)/365;

		
		this.peso = peso + AP - DP;
		
		
		if (iteracion % DIAS == 0) {
			this.edad = edad + 1;
					
		}
		
		this.iteracion = iteracion + 1;
    
    }
    
	public int setEdadIngesta(int semCal) {
		if (semCal == 0)
			return 1000;
		else
			return edadAct * DIAS + semCal * SEMANA;
	}

	public int setDiasCig(int semCig) {
		if (semCig == 0)
			return 50000;
		else
			return edadAct * DIAS + semCig * SEMANA;
	}
	
	public String toString() {      
		return String.valueOf("        "+ edad + "        "+ peso + "     "+ riesgoHTA + "       " + imc);  
	} 

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getDiasInicio() {
		return diasInicio;
	}

	public void setDiasInicio(int diasInicio) {
		this.diasInicio = diasInicio;
	}

	public int getIteracion() {
		return iteracion;
	}

	public void setIteracion(int iteracion) {
		this.iteracion = iteracion;
	}

	public int getDiasCigarrillo() {
		return diasCigarrillo;
	}

	public void setDiasCigarrillo(int diasCigarrillo) {
		this.diasCigarrillo = diasCigarrillo;
	}

	public int getDiasSf() {
		return diasSf;
	}

	public void setDiasSf(int diasSf) {
		this.diasSf = diasSf;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPesoAct() {
		return pesoAct;
	}

	public void setPesoAct(double pesoAct) {
		this.pesoAct = pesoAct;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public double getP3() {
		return p3;
	}

	public void setP3(double p3) {
		this.p3 = p3;
	}

	public double getP4() {
		return p4;
	}

	public void setP4(double p4) {
		this.p4 = p4;
	}

	public double getP5() {
		return p5;
	}

	public void setP5(double p5) {
		this.p5 = p5;
	}

	public double getPAL() {
		return PAL;
	}

	public void setPAL(double pAL) {
		PAL = pAL;
	}

	public double getTMB() {
		return TMB;
	}

	public void setTMB(double tMB) {
		TMB = tMB;
	}

	public double getDistincionPal() {
		return distincionPal;
	}

	public void setDistincionPal(double distincionPal) {
		this.distincionPal = distincionPal;
	}

	public double getCoefAct() {
		return coefAct;
	}

	public void setCoefAct(double coefAct) {
		this.coefAct = coefAct;
	}

	public double getGastoEnergetico() {
		return gastoEnergetico;
	}

	public void setGastoEnergetico(double gastoEnergetico) {
		this.gastoEnergetico = gastoEnergetico;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public int getOpCal() {
		return opCal;
	}

	public void setOpCal(int opCal) {
		this.opCal = opCal;
	}

	public int getUpDown() {
		return upDown;
	}

	public void setUpDown(int upDown) {
		this.upDown = upDown;
	}

	public double getAc() {
		return ac;
	}

	public void setAc(double ac) {
		this.ac = ac;
	}

	public double getDc() {
		return dc;
	}

	public void setDc(double dc) {
		this.dc = dc;
	}

	public double getIngestaDiaria() {
		return ingestaDiaria;
	}

	public void setIngestaDiaria(double ingestaDiaria) {
		this.ingestaDiaria = ingestaDiaria;
	}

	public double getBalanceEnergia() {
		return balanceEnergia;
	}

	public void setBalanceEnergia(double balanceEnergia) {
		this.balanceEnergia = balanceEnergia;
	}

	
	public double getIngestaAdecuada() {
		return ingestaAdecuada;
	}

	public void setIngestaAdecuada(double ingestaAdecuada) {
		this.ingestaAdecuada = ingestaAdecuada;
	}

	public double getAP() {
		return AP;
	}

	public void setAP(double aP) {
		AP = aP;
	}

	public double getDP() {
		return DP;
	}

	public void setDP(double dP) {
		DP = dP;
	}

	public double getDiferenciaPeso() {
		return diferenciaPeso;
	}

	public void setDiferenciaPeso(double diferenciaPeso) {
		this.diferenciaPeso = diferenciaPeso;
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

	public int getOpSBP() {
		return opSBP;
	}

	public void setOpSBP(int opSBP) {
		this.opSBP = opSBP;
	}

	public int getOpDBP() {
		return opDBP;
	}

	public void setOpDBP(int opDBP) {
		this.opDBP = opDBP;
	}

	public int getHerencia() {
		return herencia;
	}

	public void setHerencia(int herencia) {
		this.herencia = herencia;
	}

	public double getRiesgoHerencia() {
		return riesgoHerencia;
	}

	public void setRiesgoHerencia(double riesgoHerencia) {
		this.riesgoHerencia = riesgoHerencia;
	}

	public double getRiesgoExtraDias() {
		return riesgoExtraDias;
	}

	public void setRiesgoExtraDias(double riesgoExtraDias) {
		this.riesgoExtraDias = riesgoExtraDias;
	}

	public double getRiesgoIMC() {
		return riesgoIMC;
	}

	public void setRiesgoIMC(double riesgoIMC) {
		this.riesgoIMC = riesgoIMC;
	}

	public double getRiesgoSistolica() {
		return riesgoSistolica;
	}

	public void setRiesgoSistolica(double riesgoSistolica) {
		this.riesgoSistolica = riesgoSistolica;
	}

	public double getRiesgoDiastolica() {
		return riesgoDiastolica;
	}

	public void setRiesgoDiastolica(double riesgoDiastolica) {
		this.riesgoDiastolica = riesgoDiastolica;
	}

	public int getRegulador() {
		return regulador;
	}

	public void setRegulador(int regulador) {
		this.regulador = regulador;
	}

	public double getRiesgoEdad() {
		return riesgoEdad;
	}

	public void setRiesgoEdad(double riesgoEdad) {
		this.riesgoEdad = riesgoEdad;
	}

	public double getRiesgoSexo() {
		return riesgoSexo;
	}

	public void setRiesgoSexo(double riesgoSexo) {
		this.riesgoSexo = riesgoSexo;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public double getRiesgoHTA() {
		return riesgoHTA;
	}

	public void setRiesgoHTA(double riesgoHTA) {
		this.riesgoHTA = riesgoHTA;
	}

	public int getEdadIngesta() {
		return edadIngesta;
	}

	public int getDiasCig() {
		return diasCig;
	}  
	
	
}
