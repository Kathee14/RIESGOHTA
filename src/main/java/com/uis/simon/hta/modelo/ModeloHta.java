package com.uis.simon.hta.modelo;

public class ModeloHta {
	
	 //Declaración Niveles
	
	private double peso;
	private double ingestaDiariaEnergia;
	private int contador;
	private int edad;
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
	private double constanteDiast = 0.001624;
	private double constanteMasa= -0.033881;
	private double constanteDiastolica = -0.128468;
	private double constanteSistolica = -0.059330;
	private int kilogramosCalorias = 7700;
	private int sexo;
	private double altura;
	private int opcionCig;
	private int opcionHer;
	private int opcionCal;
	private int caloriaExt;
	private int ingesta;
	private int pesoAct;
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
	private int semanasCal;
	private int semanasCig;
	private int edadAct;
	private int presionS;
	private int presionD;
	
    //Declaración Flujos
	
	private double aumentoPeso;
	private double disminucionPeso;
	private int aumentoCalorias;
	private int disminucionCalorias;
	private int flujoDia;
	private int terminaAño;
	private int sumaAños;
	private double pesoFumar;
	private int dias = 365;
	private int menosTemportizador = 365;
	private double pesoMomentoFumar;
	private int diasSinF ;
	
	//Declaración Variables
	
	private double riesgoHta;
	private double ecHta;
	private double suma;
	private double riesgoSexo;
	private double riesgoEdad;
	private double regulador;
	private double riesgoSistolico;
	private double riesgoDiastolico;
	private double riesgoIndiceMasa;
	private double indiceMasaCorporal;
	private double pesoTotal;
	private double riesgoEdadDiast;
	private double riesgoHerencia;
	private double riesgoFumar;
	private double balanceEnergia;
	private double ingestaAdecuada;
	private double gastoEnergetico;
	private double CoeficienteActividad;
	private double distincionPAL;
	private double disminuiconAumento;
	private double pesoCigarrillo;
	private double diferenciaPeso;
	private double p1;
	private double p2;
	private double p3;
	private double p4;
	private double p5;
	private double PAL;
	private double tasaMetabolismo;
	private int edadIngesta;
	private int diasSinFumar;
	private int tempFumar;
	
	//otros
	private Thread hiloModelo;
	private int tiempoIteracion;
	
	
	public void iteracionModelo(){

		try {

			//variables
			
			//RiesgoHTA
			
			if(this.contador == 1){
				if(ecHta < 100 ) {
					this.riesgoHta= this.ecHta;
					} else {
						this.riesgoHta = 100;	
						}	
					} else {
					this.riesgoHta = 0;	
				}
			
			//Ec_Hta
			ecHta = (1-Math.exp(-Math.exp(Math.log(1)-this.suma)/this.escala))*100;

			//sum_F
			suma = this.beta + this.riesgoSexo + this.riesgoHerencia + this.riesgoEdadDiast +
				     this.riesgoIndiceMasa + this.riesgoDiastolico + this.riesgoSistolico + this.riesgoEdad + 
				     this.riesgoFumar;
			
			//R_Cig
			
			//R_Her
			this.riesgoHerencia = this.opcionHer*this.constanteHerencia;
			
			//R_EdadSisto
			this.riesgoEdadDiast = this.presionD*this.constanteDiast*this.edad;
			
			//R_IMC
			this.riesgoIndiceMasa = this.indiceMasaCorporal*this.constanteMasa;
			
			//IMC
			this.indiceMasaCorporal= this.pesoTotal/(this.altura*this.altura);
			
			//PesoTotal
			this.pesoTotal = this.peso+this.pesoCigarrillo;
			
			//R_DBP
			this.riesgoDiastolico= this.presionD*this.constanteDiastolica;
			
			//R_SBP
			this.riesgoSistolico = this.presionS*this.constanteSistolica;
			
			//R_Ed --> FALTA AGREGAR EL MULTIPLICADOR
			if(this.sexo == 1) {
				this.riesgoEdad= this.constanteEdad*this.edad;
			} else {
				this.riesgoEdad= this.constanteEdad*this.edad;
			}
			
			//R_Se
			this.riesgoSexo = this.constanteSexo*this.sexo;
			
			//Regulador
			this.regulador = this.edad-(this.edadAct-20);
			
			//pesoTotal
			this.pesoTotal = this.peso + this.pesoCigarrillo;
			
			//riesgooFumar
			if(this.diasInicio >= this.diasCigarrillo) {
				this.riesgoFumar = 0;
			} else {
				this.riesgoFumar = this.opcionCig*this.constanteCigarrillo;
			}

			//balanceEnergia
			this.balanceEnergia = this.ingestaAdecuada-this.gastoEnergetico;
			
			//ingestaAdecuada
			if(this.indiceMasaCorporal<18.5) {
				this.ingestaAdecuada = this.gastoEnergetico;
			} else {
				this.ingestaAdecuada = this.ingestaDiariaEnergia;
			}
		 
			//gastoEnergetico
			if(this.sexo == 0) {
				this.gastoEnergetico = (864-(9.72*this.edad)+(this.CoeficienteActividad*(14.2*this.pesoTotal)+(503*this.altura)));
			} else {
				this.gastoEnergetico = (387-(7.31*this.edad)+(this.CoeficienteActividad*(10.9*this.pesoTotal)+(660.7*this.altura)));
			}
			
			//coeficienteActividad
			
			//distincionPAL
			if((this.PAL>=0)&&(this.PAL<1.4)) {
				this.PAL=1;
			} else {
					if((this.PAL>=1.4)&&(this.PAL<1.6)) {
						this.PAL=2;
					} else {
							if((this.PAL>=1.6)&&(this.PAL<1.9)) {
								this.PAL=3;
							} else {
								this.PAL=4;
							}
					}
				
			}
			
			//disminucionAumento
			if(this.diasInicio<= this.edadIngesta ) {
				this.disminuiconAumento = this.opcionCal;
			} else { 
				if(this.opcionCal==1) {
					this.disminuiconAumento=0;
				} else {
					this.disminuiconAumento = 1;
				}
				
			}
			
			//pesoCigarrillo
			
			//diferenciaPeso
			this.diferenciaPeso = this.peso-this.pesoAct;
			
			//PAL
			this.PAL = this.p1 + this.p2 +this.p3 + this.p4 + this.p5;
			
			//TasaMetabolismo (TBM)
			if(this.sexo == 0) {
				this.tasaMetabolismo = 293-(3.8*this.edad)+(456*this.altura)+(10.12*this.pesoTotal);
			} else {
				this.tasaMetabolismo = 204-(4*this.edad)+(450.5*this.altura)+(11.69*this.pesoTotal);
			}
			
			//edadIngesta
			if(this.semanasCal == 0) {
				this.edadIngesta = 10000;
			} else {
				this.edadIngesta = ((this.edadAct*365)+(this.semanasCal*7));
			}
			
			//diasSinFumar
			if(this.semanasCig == 0) {
				this.diasSinFumar = 50000;
			} else {
				this.diasSinFumar = ((this.edadAct*365)+(this.semanasCig*7));
			}
			 
			//TempFumar
			this.tempFumar = (this.semanasCig*7)+1;
			
			
			// FLUJOS
			
			
			//AumentoPeso				
			if(this.balanceEnergia >= 0) {
				this.aumentoPeso = (this.balanceEnergia/this.kilogramosCalorias)*365;
			} else {
				 this.aumentoPeso = 0 ;
			}
			
			//DisminuciónPeso
			if(this.balanceEnergia < 0) {
				this.disminucionPeso = Math.abs(this.balanceEnergia/this.kilogramosCalorias)*365;
			} else {
				 this.disminucionPeso = 0 ;
			}
			
			//aumentoCalorias
			if(this.disminuiconAumento == 1) {
				this.aumentoCalorias = this.caloriaExt;
			} else {
				this.aumentoCalorias=0;
			}
			
			
			//disminucionCalorias
			if(this.disminuiconAumento == 0) {
				this.disminucionCalorias = this.caloriaExt;
			} else {
				this.disminucionCalorias = 0;
			}
			
			//flujoDia
			this.flujoDia = 1/365;
			
			//terminaAño
			if(this.contador == 1) {
				this.terminaAño = 1;
			} else {
				this.terminaAño = 0;
			}
			
			//sumaAños
			if(this.contador == 1) {
				this.sumaAños = 365;
			} else {
				this.sumaAños = 0;
			}
			
			//pesoFumar
			if((this.riesgoFumar == 0) && (this.opcionCig == 1) && (this.temporizador<=1.5) && (this.temporizador>=0.4)) {
				this.pesoFumar = this.peso*365;
			} else {
				this.pesoFumar = 0;
			}
			
			//PesoMomentoFumar
			if(this.diasInicio >= this.diasCigarrillo) {
				this.pesoMomentoFumar = 365;
			} else {
				this.pesoMomentoFumar = 0;
			}
			
			//NIVELES
			
			this.peso = this.pesoAct;
			this.edad = this.edadAct;
			
		} catch (Exception ex) {
			
		}
	}
	
	
	
}