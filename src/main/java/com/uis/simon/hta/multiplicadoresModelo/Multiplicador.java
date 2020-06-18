package com.uis.simon.hta.multiplicadoresModelo;

public class Multiplicador {

	private static double actividadFisicaHombres;
	private static double actividadFisicaMujeres;
	private static double pesoPresionSistolica;
	private static double pesoPresionDiastolica;
	private static double regularEdadHombres;
	private static double regularEdadMujeres;
	
	public static double reguladorEdadHombres(double regulador) {
		if(regulador >= 20 && regulador<21  ) {
			regularEdadHombres = 1 + ((regulador-20)*(1.043317-1));
		}
		if(regulador >= 21 && regulador<22  ) {
			regularEdadHombres = 1.043317 + ((regulador-21)*(1.046244-1.043317));
		}
		if(regulador >= 22 && regulador<23  ) {
			regularEdadHombres = 1.046244 + ((regulador-22)*(1.047707-1.046244));
		}
		if(regulador >= 23 && regulador<24  ) {
			regularEdadHombres = 1.047707 + ((regulador-23)*(1.048585-1.047707));
		}
		if(regulador >= 24 && regulador<25  ) {
			regularEdadHombres = 1.048585 + ((regulador-24)*(1.049756-1.048585));
		}
		if(regulador >= 25 && regulador<26  ) {
			regularEdadHombres = 1.049756 + ((regulador-25)*(1.050634-1.049756));
		}
		if(regulador >= 26 && regulador<27  ) {
			regularEdadHombres = 1.050634 + ((regulador-26)*(1.05122-1.050634));
		}
		if(regulador >= 27 && regulador<28  ) {
			regularEdadHombres = 1.05122 + ((regulador-27)*(1.051805-1.05122));
		}
		if(regulador >= 28 && regulador<29  ) {
			regularEdadHombres = 1.051805 + ((regulador-28)*(1.052098-1.051805));
		}
		if(regulador >= 29 && regulador<30  ) {
			regularEdadHombres = 1.052098 + ((regulador-29)*(1.05239-1.052098));
		}
		if(regulador >= 30 && regulador<31  ) {
			regularEdadHombres = 1.05239 + ((regulador-30)*(1.052976-1.05239));
		}
		if(regulador >= 31 && regulador<32  ) {
			regularEdadHombres = 1.052976  + ((regulador-31)*(1.053561-1.052976));
		}
		if(regulador >= 32 && regulador<33  ) {
			regularEdadHombres = 1.053561  + ((regulador-32)*(1.053561-1.053561));
		}
		if(regulador >= 33 && regulador<34  ) {
			regularEdadHombres = 1.053561  + ((regulador-33)*(1.053854-1.053561));
		}
		if(regulador >= 34 && regulador<35  ) {
			regularEdadHombres = 1.053854  + ((regulador-34)*(1.054146-1.053854));
		}
		if(regulador >= 35 && regulador<36  ) {
			regularEdadHombres = 1.054146  + ((regulador-35)*(1.054439-1.054146));
		}
		if(regulador >= 36 && regulador<37  ) {
			regularEdadHombres = 1.054439  + ((regulador-36)*(1.054732-1.054439));
		}
		if(regulador >= 37 && regulador<38  ) {
			regularEdadHombres = 1.054732  + ((regulador-37)*(1.055024-1.054732));
		}
		if(regulador >= 38 && regulador<39  ) {
			regularEdadHombres = 1.055024;
		}
		if(regulador >= 39 && regulador<40  ) {
			regularEdadHombres = 1.055024  + ((regulador-39)*(1.05561-1.055024));
		}
		if(regulador >= 40 && regulador<41  ) {
			regularEdadHombres = 1.05561  + ((regulador-40)*(1.055902-1.05561));
		}
		if(regulador >= 41 && regulador<63 ) {
			regularEdadHombres = 1.055902;
		}
		if(regulador >= 63 && regulador<64  ) {
			regularEdadHombres = 1.055902 + ((regulador-63)*(1.056195-1.055902));
		}
		if(regulador >= 64 && regulador<66  ) {
			regularEdadHombres = 1.056195;
		}
		if(regulador >= 66 && regulador<67  ) {
			regularEdadHombres = 1.056195 + ((regulador-66)*(1.056488-1.056195));
		}
		if(regulador >= 67 && regulador<71  ) {
			regularEdadHombres = 1.056488;
		}
		if(regulador >= 71 && regulador<72  ) {
			regularEdadHombres = 1.056488 + ((regulador-71)*(1.05678-1.056488));
		}
		if(regulador >= 72 && regulador<73  ) {
			regularEdadHombres = 1.05678 + ((regulador-72)*(1.057073-1.05678));
		}
		if(regulador >= 73 && regulador<75  ) {
			regularEdadHombres = 1.057073;
		}
		if(regulador >= 75 && regulador<76  ) {
			regularEdadHombres = 1.057073 + ((regulador-75)*(1.057366-1.057073));
		}
		if(regulador >= 76 && regulador<77  ) {
			regularEdadHombres = 1.057366 + ((regulador-76)*(1.057659-1.057366));
		}
		if(regulador >= 77 && regulador<78  ) {
			regularEdadHombres = 1.057659;
		}
		if(regulador >= 78 && regulador<79  ) {
			regularEdadHombres = 1.057659 + ((regulador-78)*(1.057951-1.057659));
		}
		if(regulador >= 79 && regulador<80  ) {
			regularEdadHombres = 1.057951 + ((regulador-79)*(1.058244-1.057951));
		}
		if(regulador >= 80 && regulador<82  ) {
			regularEdadHombres = 1.058244;
		}
		if(regulador >= 82 && regulador<83  ) {
			regularEdadHombres = 1.058244 + ((regulador-82)*(1.058537-1.058244));
		}
		if(regulador >= 83 && regulador<84  ) {
			regularEdadHombres = 1.058537 + ((regulador-83)*(1.058829-1.058537));
		}
		if(regulador >= 84 && regulador<85  ) {
			regularEdadHombres = 1.058829 + ((regulador-84)*(1.059122-1.058829));
		}
		if(regulador >= 85 && regulador<86  ) {
			regularEdadHombres = 1.059122 + ((regulador-85)*(1.059415-1.059122));
		}
		if(regulador >= 86 && regulador<=90  ) {
			regularEdadHombres = 1.059415;
		}

		return regularEdadHombres;
	}
	
	//reguladorEdaMujeres (SectorRiesgo)

	public static double reguladorEdadMujeres(double regulador) {
		if(regulador>=20 && regulador<21 ) {
			regularEdadMujeres = ((regulador-20)*(1.045659-1)) + 1;
		}
		if(regulador>=21 && regulador<22 ) {
			regularEdadMujeres = ((regulador-21)*(1.047415-1.045659)) + 1.045659;
		}
		if(regulador>=22 && regulador<23 ) {
			regularEdadMujeres = ((regulador-22)*(1.050049-1.047415)) + 1.047415;
		}
		if(regulador>=23 && regulador<24 ) {
			regularEdadMujeres = ((regulador-23)*(1.05122-1.050049)) + 1.050049;
		}
		if(regulador>=24 && regulador<25 ) {
			regularEdadMujeres = ((regulador-24)*(1.051805-1.05122)) + 1.05122;
		}
		if(regulador>=25 && regulador<26 ) {
			regularEdadMujeres = ((regulador-25)*(1.052683-1.051805)) + 1.051805;
		}
		if(regulador>=26 && regulador<27 ) {
			regularEdadMujeres = ((regulador-26)*(1.053268-1.052683)) + 1.052683;
		}
		if(regulador>=27 && regulador<28 ) {
			regularEdadMujeres = ((regulador-27)*(1.053854-1.053268)) + 1.053268;
		}
		if(regulador>=28 && regulador<29 ) {
			regularEdadMujeres = 1.053854;
		}
		if(regulador>=29 && regulador<30 ) {
			regularEdadMujeres =  ((regulador-29)*(1.054146-1.053854)) + 1.053854;
		}
		if(regulador>=29 && regulador<30 ) {
			regularEdadMujeres =  ((regulador-29)*(1.054146-1.053854)) + 1.053854;
		}
		if(regulador>=30 && regulador<31 ) {
			regularEdadMujeres =  ((regulador-30)*(1.054439-1.054146)) + 1.054146;
		}
		if(regulador>=31 && regulador<32 ) {
			regularEdadMujeres =  ((regulador-31)*(1.055024-1.054439)) + 1.054439;
		}
		if(regulador>=32 && regulador<33 ) {
			regularEdadMujeres =  ((regulador-32)*(1.055317-1.055024)) + 1.055024;
		}
		if(regulador>=33 && regulador<34 ) {
			regularEdadMujeres = 1.055317;
		}
		if(regulador>=34 && regulador<35 ) {
			regularEdadMujeres =  ((regulador-34)*(1.05561-1.055317)) + 1.055317;
		}
		if(regulador>=35 && regulador<38 ) {
			regularEdadMujeres = 1.05561;
		}
		if(regulador>=38 && regulador<39 ) {
			regularEdadMujeres =  ((regulador-38)*(1.055902-1.05561)) + 1.05561;
		}
		if(regulador>=39 && regulador<62 ) {
			regularEdadMujeres =1.055902;
		}
		if(regulador>=62 && regulador<63 ) {
			regularEdadMujeres =  ((regulador-62)*(1.056195-1.055902)) + 1.055902;
		}
		if(regulador>=63 && regulador<65 ) {
			regularEdadMujeres = 1.056195;
		}
		if(regulador>=65 && regulador<66 ) {
			regularEdadMujeres =  ((regulador-65)*(1.056488-1.056195)) + 1.056195;
		}
		if(regulador>=66 && regulador<67 ) {
			regularEdadMujeres =  1.056488;
		}
		if(regulador>=67 && regulador<68 ) {
			regularEdadMujeres =  ((regulador-67)*(1.05678-1.056488)) + 1.056488;
		}
		if(regulador>=68 && regulador<69 ) {
			regularEdadMujeres =  ((regulador-68)*(1.057073-1.05678)) + 1.05678;
		}
		if(regulador>=69 && regulador<70 ) {
			regularEdadMujeres =  ((regulador-69)*(1.057366-1.057073)) + 1.057073;
		}
		if(regulador>=70 && regulador<71 ) {
			regularEdadMujeres =  ((regulador-70)*(1.057951-1.057366)) + 1.057366;
		}
		if(regulador>=71 && regulador<72 ) {
			regularEdadMujeres =  ((regulador-71)*(1.058244-1.057951)) + 1.057951;
		}
		if(regulador>=72 && regulador<73 ) {
			regularEdadMujeres =  ((regulador-72)*(1.058829-1.058244)) + 1.058244;
		}
		if(regulador>=73 && regulador<74 ) {
			regularEdadMujeres =1.058829;
		}
		if(regulador>=74 && regulador<75 ) {
			regularEdadMujeres =  ((regulador-74)*(1.059122-1.058829)) + 1.058829;
		}
		if(regulador>=75 && regulador<77) {
			regularEdadMujeres = 1.059122;
		}
		if(regulador>=77 && regulador<78 ) {
			regularEdadMujeres =  ((regulador-77)*(1.059415-1.059122)) + 1.059122;
		}
		if(regulador>=78 && regulador<80) {
			regularEdadMujeres = 1.059415;
		}
		if(regulador>=80 && regulador<81 ) {
			regularEdadMujeres =  ((regulador-80)*(1.059682-1.059415)) + 1.059415;
		}
		if(regulador>=81 && regulador<87 ) {
			regularEdadMujeres = 1.059682;
		}
		if(regulador>=87 && regulador<88) {
			regularEdadMujeres =  ((regulador-86)*(1.06-1.059682)) + 1.059682;
		}
		if(regulador>=87 && regulador<=90 ) {
			regularEdadMujeres = 1.06;
		}
		
		return regularEdadMujeres;
	}
	
	public static double MultiplicadorFisicoHombres(double distincionPAL) {
		if(distincionPAL == 1) {
			actividadFisicaHombres = 1;
		}
		if(distincionPAL == 2) {
			actividadFisicaHombres = 1.12;
		}
		if(distincionPAL == 3) {
			actividadFisicaHombres = 1.27;
		}
		if(distincionPAL == 4) {
			actividadFisicaHombres = 1.54;
		}
		return actividadFisicaHombres;
	}
	
	public static double MultiplicadorFisicoMujeres(double distincionPAL) {
		if(distincionPAL == 1) {
			actividadFisicaMujeres = 1;
		}
		if(distincionPAL == 2) {
			actividadFisicaMujeres = 1.14;
		}
		if(distincionPAL == 3) {
			actividadFisicaMujeres = 1.27;
		}
		if(distincionPAL == 4) {
			actividadFisicaMujeres = 1.45;
		}
		return actividadFisicaMujeres;
	}
	
	//PresionSistolica 
		public static double MultiplicadorPresionSistolica(double diferenciaPeso) {
			
			if(diferenciaPeso>=-70 && diferenciaPeso<-69 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-70))*(-57.34595-(-59.69151))) + (-59.69151);
			}
			if(diferenciaPeso>=-69 && diferenciaPeso<-68 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-69))*(-57.64595-(-57.34595))) + (-57.34595);
			}
			if(diferenciaPeso>=-68 && diferenciaPeso<-67 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-68))*(-57.01087-(-57.64595))) + (-57.64595);
			}
			if(diferenciaPeso>=-67 && diferenciaPeso<-66 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-67))*(-56.3407-(-57.01087))) + (-57.01087);
			}
			if(diferenciaPeso>=-66 && diferenciaPeso<-65 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-66))*(-56.00562-(-56.3407))) + (-56.3407);
			}
			if(diferenciaPeso>=-65 && diferenciaPeso<-64 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-65))*(-56.00038-(-56.00652))) + (-56.00652);
			}
			if(diferenciaPeso>=-64 && diferenciaPeso<-63 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-64))*(-54.6653-(-56.00038))) + (-56.00038);
			}
			if(diferenciaPeso>=-63 && diferenciaPeso<-62 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-63))*(-53.66006-(-54.6653))) + (-54.6653);
			}
			if(diferenciaPeso>=-62 && diferenciaPeso<-61 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-62))*(-52.655482-(-53.66006))) + (-53.66006);
			}
			if(diferenciaPeso>=-61 && diferenciaPeso<-60 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-61))*(-51.3145-(-52.655482))) + (-52.655482);
			}
			if(diferenciaPeso>=-60 && diferenciaPeso<-59 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-60))*(-50.97942-(-51.3145))) + (-51.3145);
			}
			if(diferenciaPeso>=-59 && diferenciaPeso<-58 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-59))*(-49.97417-(-50.97942))) + (-50.97942);
			}
			if(diferenciaPeso>=-58 && diferenciaPeso<-57 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-58))*(-49.30401-(-49.97417))) + (-49.97417);
			}
			if(diferenciaPeso>=-57 && diferenciaPeso<-56 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-57))*(-48.96893-(-49.30401))) + (-49.30401);
			}
			if(diferenciaPeso>=-56 && diferenciaPeso<-55 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-56))*(-47.96369-(-48.96893))) + (-48.96893);
			}
			if(diferenciaPeso>=-55 && diferenciaPeso<-54 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-55))*(-46.95845-(-48.96893))) + (-48.96893);
			}
			if(diferenciaPeso>=-54 && diferenciaPeso<-53 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-54))*(-46.28829-(-46.95845))) + (-46.95845);
			}
			if(diferenciaPeso>=-53 && diferenciaPeso<-52 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-53))*(-45.28305-(-46.28829))) + (-46.28829);
			}
			if(diferenciaPeso>=-52 && diferenciaPeso<-51 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-52))*(-44.94797-(-45.28305))) + (-45.28305);
			}
			if(diferenciaPeso>=-51 && diferenciaPeso<-50 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-51))*(-43.94272-(-44.94797))) + (-44.94797);
			}
			if(diferenciaPeso>=-50 && diferenciaPeso<-49 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-50))*(-43.27256-(-43.94272))) + (-43.94272);
			}
			if(diferenciaPeso>=-49 && diferenciaPeso<-48 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-49))*(-41.93224-(-49.27256))) + (-49.27256);
			}
			if(diferenciaPeso>=-48 && diferenciaPeso<-47 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-48))*(-41.59716-(-41.93224))) + (-41.93224);
			}
			if(diferenciaPeso>=-47 && diferenciaPeso<-46 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-47))*(-40.25684-(-41.59716))) + (-41.59716);
			}
			if(diferenciaPeso>=-46 && diferenciaPeso<-45 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-46))*(-38.58144-(-40.25684))) + (-40.25684);
			}
			if(diferenciaPeso>=-45 && diferenciaPeso<-43 ) {
				pesoPresionSistolica = -38.58144;
			}
			if(diferenciaPeso>=-43 && diferenciaPeso<-42 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-43))*(-38.24636-(-38.58144))) + (-38.58144);
			}
			if(diferenciaPeso>=-42 && diferenciaPeso<-41 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-42))*(-37.57619-(-38.24636))) + (-38.24636);
			}
			if(diferenciaPeso>=-41 && diferenciaPeso<-40 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-41))*(-36.57095-(-37.57619))) + (-37.57619);
			}
			if(diferenciaPeso>=-40 && diferenciaPeso<-39 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-40))*(-35.90079-(-36.57095))) + (-36.57095);
			}
			if(diferenciaPeso>=-39 && diferenciaPeso<-38 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-39))*(-34.56047-(-35.90079))) + (-35.90079);
			}
			if(diferenciaPeso>=-38 && diferenciaPeso<-37 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-38))*(-33.89031-(-34.56047))) + (-34.56047);
			}
			if(diferenciaPeso>=-37 && diferenciaPeso<-36 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-37))*(-32.88507-(-33.89031))) + (-33.89031);
			}
			if(diferenciaPeso>=-36 && diferenciaPeso<-35 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-36))*(-31.87983-(-32.88507))) + (-32.88507);
			}
			if(diferenciaPeso>=-35 && diferenciaPeso<-34 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-35))*(-30.87458-(-31.87983))) + (-31.87983);
			}
			if(diferenciaPeso>=-34 && diferenciaPeso<-33 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-34))*(-29.53426-(-30.87458))) + (-30.87458);
			}
			if(diferenciaPeso>=-33 && diferenciaPeso<-32 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-33))*(-26.85362-(-29.53426))) + (-29.53426);
			}
			if(diferenciaPeso>=-32 && diferenciaPeso<-31 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-32))*(-26.18346-(-26.85362))) + (-26.85362);
			}
			if(diferenciaPeso>=-31 && diferenciaPeso<-30 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-31))*(-25.48838-(-26.18346))) + (-26.18346);
			}
			if(diferenciaPeso>=-30 && diferenciaPeso<-29 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-30))*(-24.84131-(-25.48838))) + (-25.48838);
			}
			if(diferenciaPeso>=-29 && diferenciaPeso<-28 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-29))*(-23.83789-(-24.84131))) + (-24.84131);
			}
			if(diferenciaPeso>=-28 && diferenciaPeso<-27 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-28))*(-23.50281-(-23.83789))) + (-23.83789);
			}
			if(diferenciaPeso>=-27 && diferenciaPeso<-26 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-27))*(-22.49757-(-23.50281))) + (-23.50281);
			}
			if(diferenciaPeso>=-26 && diferenciaPeso<-25 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-26))*(-22.16249-(-22.49757))) + (-22.49757);
			}
			if(diferenciaPeso>=-25 && diferenciaPeso<-24 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-25))*(-21.82741-(-22.16249))) + (-22.16249);
			}
			if(diferenciaPeso>=-24 && diferenciaPeso<-23 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-24))*(-20.82217-(-21.82741))) + (-21.82741);
			}
			if(diferenciaPeso>=-23 && diferenciaPeso<-22 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-23))*(-19.48185-(-20.82217))) + (-20.82217);
			}
			if(diferenciaPeso>=-22 && diferenciaPeso<-21 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-22))*(-19.14677-(-19.48185))) + (-19.48185);
			}
			if(diferenciaPeso>=-21 && diferenciaPeso<-20 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-21))*(-17.80644-(-19.14677))) + (-19.14677);
			}
			if(diferenciaPeso>=-20 && diferenciaPeso<-19 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-20))*(-16.8012-(-17.80644))) + (-17.80644);
			}
			if(diferenciaPeso>=-19 && diferenciaPeso<-18 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-19))*(-15.79596-(-16.8012))) + (-16.8012);
			}
			if(diferenciaPeso>=-18 && diferenciaPeso<-17 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-18))*(-15.1258-(-15.79596))) + (-15.79596);
			}
			if(diferenciaPeso>=-17 && diferenciaPeso<-16 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-17))*(-14.12056-(-15.1258))) + (-15.1258);
			}
			if(diferenciaPeso>=-16 && diferenciaPeso<-15 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-16))*(-13.11532-(-14.12056))) + (-14.12056);
			}
			if(diferenciaPeso>=-15 && diferenciaPeso<-14 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-15))*(-12.44515-(-13.11532))) + (-13.11532);
			}
			if(diferenciaPeso>=-14 && diferenciaPeso<-13 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-14))*(-11.77499-(-12.44515))) + (-12.44515);
			}
			if(diferenciaPeso>=-13 && diferenciaPeso<-12 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-13))*(-10.48241-(-11.77499))) + (-11.77499);
			}
			if(diferenciaPeso>=-12 && diferenciaPeso<-11 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-12))*(-9.900055-(-10.48241))) + (-10.48241);
			}
			if(diferenciaPeso>=-11 && diferenciaPeso<-10 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-11))*(-9.608877-(-9.900055))) + (-9.900055);
			}
			if(diferenciaPeso>=-10 && diferenciaPeso<-9 ) {
				pesoPresionSistolica = ((diferenciaPeso-(-10))*(-9.317699-(-9.608877))) + (-9.608877);
			}
			if(diferenciaPeso>=-9 && diferenciaPeso<-8) {
				pesoPresionSistolica = ((diferenciaPeso-(-9))*(-8.735343-(-9.317699))) + (-9.317699);
			}
			if(diferenciaPeso>=-8 && diferenciaPeso<-7) {
				pesoPresionSistolica = ((diferenciaPeso-(-8))*(-7.570631-(-8.735343))) + (-8.735343);
			}
			if(diferenciaPeso>=-7 && diferenciaPeso<-6) {
				pesoPresionSistolica = ((diferenciaPeso-(-7))*(-6.405918-(-7.570631))) + (-7.570631);
			}
			if(diferenciaPeso>=-6 && diferenciaPeso<-5) {
				pesoPresionSistolica = ((diferenciaPeso-(-6))*(-4.44-(-6.405918))) + (-6.405918);
			}
			if(diferenciaPeso>=-5 && diferenciaPeso<-4) {
				pesoPresionSistolica = ((diferenciaPeso-(-5))*(-3-(-4.44))) + (-4.44);
			}
			if(diferenciaPeso>=-4 && diferenciaPeso<-3) {
				pesoPresionSistolica = ((diferenciaPeso-(-4))*(-2-(-3))) + (-3);
			}
			if(diferenciaPeso>=-3 && diferenciaPeso<-2) {
				pesoPresionSistolica = ((diferenciaPeso-(-3))*(-1-(-2))) + (-2);
			}
			if(diferenciaPeso>=-2 && diferenciaPeso<-1) {
				pesoPresionSistolica = ((diferenciaPeso-(-2))*(0-(-1))) + (-1);
			}
			if(diferenciaPeso>=-1 && diferenciaPeso<0) {
				pesoPresionSistolica = 0;
			}
			if(diferenciaPeso>=0 && diferenciaPeso<1 ) {
				pesoPresionSistolica = ((diferenciaPeso-0)*(0.1));
			}
			if(diferenciaPeso>=1 && diferenciaPeso<2 ) {
				pesoPresionSistolica = 0.1;
			}
			if(diferenciaPeso>=2 && diferenciaPeso<3 ) {
				pesoPresionSistolica = ((diferenciaPeso-2)*(0.5-0.1)) + 0.1;
			}
			if(diferenciaPeso>=3 && diferenciaPeso<4 ) {
				pesoPresionSistolica = ((diferenciaPeso-3)*(0.6-0.5)) + 0.5;
			}
			if(diferenciaPeso>=4 && diferenciaPeso<5 ) {
				pesoPresionSistolica = ((diferenciaPeso-4)*(0.8-0.6)) + 0.6;
			}
			if(diferenciaPeso>=5 && diferenciaPeso<6 ) {
				pesoPresionSistolica = ((diferenciaPeso-5)*(1-0.8)) + 0.8;
			}
			if(diferenciaPeso>=6 && diferenciaPeso<7 ) {
				pesoPresionSistolica = ((diferenciaPeso-6)*(1.6-1)) + 1;
			}
			if(diferenciaPeso>=7 && diferenciaPeso<8 ) {
				pesoPresionSistolica = ((diferenciaPeso-7)*(2-1.6)) + 1.6;
			}
			if(diferenciaPeso>=8 && diferenciaPeso<9 ) {
				pesoPresionSistolica = ((diferenciaPeso-8)*(2.1-2)) + 2;
			}
			if(diferenciaPeso>=9 && diferenciaPeso<10 ) {
				pesoPresionSistolica = ((diferenciaPeso-9)*(3-2.1)) + 2.1;
			}
			if(diferenciaPeso>=10 && diferenciaPeso<11 ) {
				pesoPresionSistolica = ((diferenciaPeso-10)*(2.4-3)) + 3;
			}
			if(diferenciaPeso>=11 && diferenciaPeso<12 ) {
				pesoPresionSistolica = ((diferenciaPeso-11)*(2.5-2.4)) + 2.4;
			}
			if(diferenciaPeso>=12 && diferenciaPeso<13 ) {
				pesoPresionSistolica = ((diferenciaPeso-12)*(3.973792-2.5)) + 2.5;
			}
			if(diferenciaPeso>=13 && diferenciaPeso<14 ) {
				pesoPresionSistolica = ((diferenciaPeso-13)*(4.308872-3.973792)) + 3.973792;
			}
			if(diferenciaPeso>=14 && diferenciaPeso<18 ) {
				pesoPresionSistolica = 4.308872;
			}
			if(diferenciaPeso>=18 && diferenciaPeso<19 ) {
				pesoPresionSistolica = ((diferenciaPeso-18)*(4.643953-4.308872)) + 4.308872;
			}
			if(diferenciaPeso>=19 && diferenciaPeso<20 ) {
				pesoPresionSistolica = ((diferenciaPeso-19)*(5.314114-4.643953)) + 4.643953;
			}
			if(diferenciaPeso>=20 && diferenciaPeso<21 ) {
				pesoPresionSistolica = 5.314114;
			}
			if(diferenciaPeso>=21 && diferenciaPeso<22 ) {
				pesoPresionSistolica = ((diferenciaPeso-21)*(6.319356-5.314114)) + 5.314114 ;
			}
			if(diferenciaPeso>=22 && diferenciaPeso<25 ) {
				pesoPresionSistolica = 6.319356 ;
			}
			if(diferenciaPeso>=25 && diferenciaPeso<26 ) {
				pesoPresionSistolica = ((diferenciaPeso-25)*(7.324597-6.319356)) + 6.319356 ;
			}
			if(diferenciaPeso>=26 && diferenciaPeso<27 ) {
				pesoPresionSistolica = ((diferenciaPeso-26)*(7.994758-7.324597)) + 7.324597 ;
			}
			if(diferenciaPeso>=27 && diferenciaPeso<28 ) {
				pesoPresionSistolica =7.994758 ;
			}
			if(diferenciaPeso>=28 && diferenciaPeso<29 ) {
				pesoPresionSistolica = ((diferenciaPeso-28)*(8.664919-7.994758)) + 7.994758 ;
			}
			if(diferenciaPeso>=29 && diferenciaPeso<30 ) {
				pesoPresionSistolica = ((diferenciaPeso-29)*(9-8.664919)) + 8.664919 ;
			}
			if(diferenciaPeso>=30 && diferenciaPeso<31 ) {
				pesoPresionSistolica = ((diferenciaPeso-30)*(9.1-9)) + 9 ;
			}
			if(diferenciaPeso>=31 && diferenciaPeso<32 ) {
				pesoPresionSistolica = ((diferenciaPeso-31)*(9.2-9.1)) + 9.1 ;
			}
			if(diferenciaPeso>=32 && diferenciaPeso<33 ) {
				pesoPresionSistolica = ((diferenciaPeso-32)*(9.3-9.2)) + 9.2 ;
			}
			if(diferenciaPeso>=33 && diferenciaPeso<34 ) {
				pesoPresionSistolica = ((diferenciaPeso-33)*(9.5-9.3)) + 9.3 ;
			}
			if(diferenciaPeso>=34 && diferenciaPeso<35 ) {
				pesoPresionSistolica = 9.5 ;
			}
			if(diferenciaPeso>=35 && diferenciaPeso<36 ) {
				pesoPresionSistolica = ((diferenciaPeso-35)*(10.25143-9.5)) + 9.5 ;
			}
			if(diferenciaPeso>=36 && diferenciaPeso<37 ) {
				pesoPresionSistolica = ((diferenciaPeso-36)*(10.60114-10.25143)) + 10.25143 ;
			}
			if(diferenciaPeso>=37 && diferenciaPeso<38 ) {
				pesoPresionSistolica = ((diferenciaPeso-37)*(10-10.60114)) + 10.60114 ;
			}
			if(diferenciaPeso>=38 && diferenciaPeso<39 ) {
				pesoPresionSistolica = ((diferenciaPeso-38)*(11-10)) + 10 ;
			}
			if(diferenciaPeso>=39 && diferenciaPeso<40 ) {
				pesoPresionSistolica = ((diferenciaPeso-39)*(12-11)) + 11 ;
			}
			if(diferenciaPeso>=40 && diferenciaPeso<41 ) {
				pesoPresionSistolica = ((diferenciaPeso-40)*(12.2-12)) + 12 ;
			}
			if(diferenciaPeso>=41 && diferenciaPeso<42 ) {
				pesoPresionSistolica = 12.2;
			}
			if(diferenciaPeso>=42 && diferenciaPeso<43 ) {
				pesoPresionSistolica = ((diferenciaPeso-42)*(12.3-12.2)) + 12.2 ;
			}
			if(diferenciaPeso>=43 && diferenciaPeso<44 ) {
				pesoPresionSistolica = ((diferenciaPeso-43)*(13.5426-12.3)) + 12.3 ;
			}
			if(diferenciaPeso>=44 && diferenciaPeso<45 ) {
				pesoPresionSistolica = ((diferenciaPeso-44)*(14.2713-13.5426)) + 13.5426 ;
			}
			if(diferenciaPeso>=45 && diferenciaPeso<49 ) {
				pesoPresionSistolica = 14.2713 ;
			}
			if(diferenciaPeso>=49 && diferenciaPeso<50 ) {
				pesoPresionSistolica = ((diferenciaPeso-49)*(15-14.2713)) + 14.2713 ;
			}
			if(diferenciaPeso>=50 && diferenciaPeso<51 ) {
				pesoPresionSistolica = ((diferenciaPeso-50)*(15.2-15)) + 15;
			}
			if(diferenciaPeso>=51 && diferenciaPeso<52 ) {
				pesoPresionSistolica = ((diferenciaPeso-51)*(15.3-15.2)) + 15.2;
			}
			if(diferenciaPeso>=52 && diferenciaPeso<53 ) {
				pesoPresionSistolica = ((diferenciaPeso-52)*(15.6-15.3)) + 15.3;
			}
			if(diferenciaPeso>=53 && diferenciaPeso<54 ) {
				pesoPresionSistolica = ((diferenciaPeso-53)*(16.7-15.6)) + 15.6;
			}
			if(diferenciaPeso>=54 && diferenciaPeso<55 ) {
				pesoPresionSistolica = ((diferenciaPeso-54)*(16.9-16.7)) + 16.7;
			}
			if(diferenciaPeso>=55 && diferenciaPeso<56 ) {
				pesoPresionSistolica = ((diferenciaPeso-55)*(17-16.9)) + 16.9;
			}
			if(diferenciaPeso>=56 && diferenciaPeso<57 ) {
				pesoPresionSistolica = ((diferenciaPeso-56)*(17.2-17)) + 17;
			}
			if(diferenciaPeso>=57 && diferenciaPeso<58 ) {
				pesoPresionSistolica = ((diferenciaPeso-57)*(17.3-17.2)) + 17.2;
			}
			if(diferenciaPeso>=58 && diferenciaPeso<59 ) {
				pesoPresionSistolica = ((diferenciaPeso-58)*(17.4-17.3)) + 17.3;
			}
			if(diferenciaPeso>=59 && diferenciaPeso<=60 ) {
				pesoPresionSistolica = ((diferenciaPeso-59)*(17.4-17.3)) + 17.4;
			}
			
			return pesoPresionSistolica;
		}
		
		
		////PresionDiastolica
		public static double MultiplicadorPresionDiastolica(double diferenciaPeso) {
			if(diferenciaPeso>=(-70) && diferenciaPeso<(-69)) {
				pesoPresionDiastolica= ((diferenciaPeso-(-70))*(-47.48283-(-49.98))) + (-49.98);	
			}
			if(diferenciaPeso>=(-69) && diferenciaPeso<(-68)) {
				pesoPresionDiastolica= ((diferenciaPeso-(-69))*(-45.81805-(-47.48283))) + (-47.48283);	
			}
			if(diferenciaPeso>=(-68) && diferenciaPeso<(-67)) {
				pesoPresionDiastolica= ((diferenciaPeso-(-68))*(-44.98566-(-45.81805))) + (-45.81805);	
			}
			if(diferenciaPeso>=(-67) && diferenciaPeso<(-66)) {
				pesoPresionDiastolica= ((diferenciaPeso-(-67))*(-44.15327-(-44.98566))) + (-44.98566);	
			}
			if(diferenciaPeso>=(-66) && diferenciaPeso<(-65)) {
				pesoPresionDiastolica= -44.15327;	
			}
			if(diferenciaPeso>=(-65) && diferenciaPeso<(-64)) {
				pesoPresionDiastolica= ((diferenciaPeso-(-65))*(-44.59834-(-44.15327))) + (-44.15327);	
			}
			if(diferenciaPeso>=-64 && diferenciaPeso<-63) {
				pesoPresionDiastolica= ((diferenciaPeso-(-64))*(-43.04341-(-44.59834))) + (-44.59834);	
			}
			if(diferenciaPeso>=-63 && diferenciaPeso<-62) {
				pesoPresionDiastolica= ((diferenciaPeso-(-63))*(-42.48849-(-43.04341))) + (-43.04341);	
			}
			if(diferenciaPeso>=-62 && diferenciaPeso<-61) {
				pesoPresionDiastolica= ((diferenciaPeso-(-61))*(-41.93356-(-42.48849))) + (-42.48849);	
			}
			if(diferenciaPeso>=-61 && diferenciaPeso<-60) {
				pesoPresionDiastolica= ((diferenciaPeso-(-61))*(-41.10117-(-41.93356))) + (-41.93356);	
			}
			if(diferenciaPeso>=-60 && diferenciaPeso<-59) {
				pesoPresionSistolica = ((diferenciaPeso-(-60))*(-40.26878-(-41.10117))) + (-41.10117);
			}
			if(diferenciaPeso>=-59 && diferenciaPeso<-58) {
				pesoPresionDiastolica = ((diferenciaPeso-(-59))*(-39.71385-(-40.26878))) + (-40.26878);
			}
			if(diferenciaPeso>=-58 && diferenciaPeso<-57) {
				pesoPresionDiastolica = ((diferenciaPeso-(-58))*(-38.88146-(-39.71385))) + (-39.71385);
			}
			if(diferenciaPeso>=-57 && diferenciaPeso<-56) {
				pesoPresionDiastolica = ((diferenciaPeso-(-57))*(-38.04907-(-38.88146))) + (-38.88146);
			}
			if(diferenciaPeso>=-56 && diferenciaPeso<-55) {
				pesoPresionDiastolica = ((diferenciaPeso-(-56))*(-37.49415-(-38.04907))) + (-38.04907);
			}
			if(diferenciaPeso>=-55 && diferenciaPeso<-54) {
				pesoPresionDiastolica = ((diferenciaPeso-(-55))*(-37.21668-(-37.49415))) + (-37.49415);
			}
			if(diferenciaPeso>=-54 && diferenciaPeso<-53) {
				pesoPresionDiastolica = ((diferenciaPeso-(-54))*(-36.38429-(-37.21668))) + (-37.21668);
			}
			if(diferenciaPeso>=-53 && diferenciaPeso<-52) {
				pesoPresionDiastolica = ((diferenciaPeso-(-53))*(-35.5519-(-36.38429))) + (-36.38429);
			}
			if(diferenciaPeso>=-52 && diferenciaPeso<-51) {
				pesoPresionDiastolica = ((diferenciaPeso-(-52))*(-34.99698-(-35.5519))) + (-35.5519);
			}
			if(diferenciaPeso>=-51 && diferenciaPeso<-50) {
				pesoPresionDiastolica = ((diferenciaPeso-(-51))*(-34.71951-(-34.99698))) + (-34.99698);
			}
			if(diferenciaPeso>=-50 && diferenciaPeso<-49) {
				pesoPresionDiastolica = ((diferenciaPeso-(-50))*(-34.16459-(-34.71951))) + (-34.71951);
			}
			if(diferenciaPeso>=-49 && diferenciaPeso<-48) {
				pesoPresionDiastolica = ((diferenciaPeso-(-49))*(-33.60966-(-34.16459))) + (-34.16459);
			}
			if(diferenciaPeso>=-48 && diferenciaPeso<-47) {
				pesoPresionDiastolica = ((diferenciaPeso-(-48))*(-32.77727-(-33.60966))) + (-33.60966);
			}
			if(diferenciaPeso>=-47 && diferenciaPeso<-46) {
				pesoPresionDiastolica = ((diferenciaPeso-(-47))*(-32.22234-(-32.77727))) + (-32.77727);
			}
			if(diferenciaPeso>=-46 && diferenciaPeso<-45) {
				pesoPresionDiastolica = ((diferenciaPeso-(-46))*(-31.66741-(-32.22234))) + (-32.22234);
			}
			if(diferenciaPeso>=-45 && diferenciaPeso<-44) {
				pesoPresionDiastolica = ((diferenciaPeso-(-45))*(-30.55756-(-31.66741))) + (-31.66741);
			}
			if(diferenciaPeso>=-44 && diferenciaPeso<-43) {
				pesoPresionDiastolica = ((diferenciaPeso-(-44))*(-30.00263-(-30.55756))) + (-30.55756);
			}
			if(diferenciaPeso>=-43 && diferenciaPeso<-42) {
				pesoPresionDiastolica = ((diferenciaPeso-(-43))*(-28.89278-(-30.00263))) + (-30.00263);
			}
			if(diferenciaPeso>=-42 && diferenciaPeso<-41) {
				pesoPresionDiastolica = ((diferenciaPeso-(-42))*(-27.93902-(-28.89278))) + (-28.89278);
			}
			if(diferenciaPeso>=-41 && diferenciaPeso<-40) {
				pesoPresionDiastolica = ((diferenciaPeso-(-41))*(-27.66351-(-27.93902))) + (-27.93902);
			}
			if(diferenciaPeso>=-40 && diferenciaPeso<-39) {
				pesoPresionDiastolica = ((diferenciaPeso-(-40))*(-26.56146-(-27.66351))) + (-27.66351);
			}
			if(diferenciaPeso>=-39 && diferenciaPeso<-38) {
				pesoPresionDiastolica = ((diferenciaPeso-(-39))*(-26.01044-(-26.56146))) + (-26.56146);
			}
			if(diferenciaPeso>=-38 && diferenciaPeso<-37) {
				pesoPresionDiastolica = ((diferenciaPeso-(-38))*(-25.45941-(-26.01044))) + (-26.01044);
			}
			if(diferenciaPeso>=-37 && diferenciaPeso<-36) {
				pesoPresionDiastolica = ((diferenciaPeso-(-37))*(-24.63288-(-25.45941))) + (-25.45941);
			}
			if(diferenciaPeso>=-36 && diferenciaPeso<-35) {
				pesoPresionDiastolica = ((diferenciaPeso-(-36))*(-23.80634-(-24.63288))) + (-24.63288);
			}
			if(diferenciaPeso>=-35 && diferenciaPeso<-34) {
				pesoPresionDiastolica = ((diferenciaPeso-(-35))*(-22.9798-(-23.80634))) + (-23.80634);
			}
			if(diferenciaPeso>=-34 && diferenciaPeso<-33) {
				pesoPresionDiastolica = ((diferenciaPeso-(-34))*(-22.15327-(-22.9798))) + (-22.9798);
			}
			if(diferenciaPeso>=-33 && diferenciaPeso<-32) {
				pesoPresionDiastolica = ((diferenciaPeso-(-33))*(-21.05122-(-22.15327))) + (-22.15327);
			}
			if(diferenciaPeso>=-32 && diferenciaPeso<-31) {
				pesoPresionDiastolica = ((diferenciaPeso-(-32))*(-19.94917-(-21.05122))) + (-21.05122);
			}
			if(diferenciaPeso>=-31 && diferenciaPeso<-30) {
				pesoPresionDiastolica = ((diferenciaPeso-(-31))*(-18.84712-(-19.94917))) + (-19.94917);
			}
			if(diferenciaPeso>=-30 && diferenciaPeso<-29) {
				pesoPresionDiastolica = ((diferenciaPeso-(-30))*(-18.2961-(-18.84712))) + (-18.84712);
			}
			if(diferenciaPeso>=-29 && diferenciaPeso<-28) {
				pesoPresionDiastolica = ((diferenciaPeso-(-29))*(-17.74507-(-18.2961))) + (-18.2961);
			}
			if(diferenciaPeso>=-28 && diferenciaPeso<-27) {
				pesoPresionDiastolica = ((diferenciaPeso-(-28))*(-17.46956-(-17.74507))) + (-17.74507);
			}
			if(diferenciaPeso>=-27 && diferenciaPeso<-26) {
				pesoPresionDiastolica = ((diferenciaPeso-(-27))*(-17.19045-(-17.46956))) + (-17.46956);
			}
			if(diferenciaPeso>=-26 && diferenciaPeso<-25) {
				pesoPresionDiastolica = ((diferenciaPeso-(-26))*(-16.36751-(-17.19045))) + (-17.19045);
			}
			if(diferenciaPeso>=-25 && diferenciaPeso<-24) {
				pesoPresionDiastolica = ((diferenciaPeso-(-25))*(-15.54098-(-16.36751))) + (-16.36751);
			}
			if(diferenciaPeso>=-24 && diferenciaPeso<-23) {
				pesoPresionDiastolica = ((diferenciaPeso-(-24))*(-14.71444-(-15.54098))) + (-15.54098);
			}
			if(diferenciaPeso>=-23 && diferenciaPeso<-22) {
				pesoPresionDiastolica = ((diferenciaPeso-(-23))*(-14.16341-(-14.71444))) + (-14.71444);
			}
			if(diferenciaPeso>=-23 && diferenciaPeso<-22) {
				pesoPresionDiastolica = ((diferenciaPeso-(-23))*(-14.16341-(-14.16341))) + (-14.16341);
			}
			if(diferenciaPeso>=-22 && diferenciaPeso<-21) {
				pesoPresionDiastolica = ((diferenciaPeso-(-22))*(-13.8879-(-14.16341))) + (-14.16341);
			}
			if(diferenciaPeso>=-21 && diferenciaPeso<-20) {
				pesoPresionDiastolica = ((diferenciaPeso-(-21))*(-13.06137-(-13.8879))) + (-13.8879);
			}
			if(diferenciaPeso>=-20 && diferenciaPeso<-19) {
				pesoPresionDiastolica = ((diferenciaPeso-(-20))*(-12.78585-(-13.06137))) + (-13.06137);
			}
			if(diferenciaPeso>=-19 && diferenciaPeso<-18) {
				pesoPresionDiastolica = ((diferenciaPeso-(-19))*(-12.23483-(-12.78585))) + (-12.78585);
			}
			if(diferenciaPeso>=-18 && diferenciaPeso<-17) {
				pesoPresionDiastolica = ((diferenciaPeso-(-18))*(-11.40829-(-12.23483))) + (-12.23483);
			}
			if(diferenciaPeso>=-17 && diferenciaPeso<-16) {
				pesoPresionDiastolica = ((diferenciaPeso-(-17))*(-10.30624-(-11.40829))) + (-11.40829);
			}
			if(diferenciaPeso>=-16 && diferenciaPeso<-15) {
				pesoPresionDiastolica = ((diferenciaPeso-(-16))*(-9.75522-(-10.30624))) + (-10.30624);
			}
			if(diferenciaPeso>=-15 && diferenciaPeso<-14) {
				pesoPresionDiastolica = ((diferenciaPeso-(-15))*(-9.204195-(-9.75522))) + (-9.75522);
			}
			if(diferenciaPeso>=-14 && diferenciaPeso<-13) {
				pesoPresionDiastolica = ((diferenciaPeso-(-14))*(-8.377659-(-9.204195))) + (-9.204195);
			}
			if(diferenciaPeso>=-13 && diferenciaPeso<-12) {
				pesoPresionDiastolica = ((diferenciaPeso-(-13))*(-7.757152-(-8.377659))) + (-8.377659);
			}
			if(diferenciaPeso>=-12 && diferenciaPeso<-11) {
				pesoPresionDiastolica = ((diferenciaPeso-(-12))*(-6.931024-(-7.757152))) + (-7.757152);
			}
			if(diferenciaPeso>=-11 && diferenciaPeso<-10) {
				pesoPresionDiastolica = ((diferenciaPeso-(-11))*(-6.582732-(-6.931024))) + (-6.931024);
			}
			if(diferenciaPeso>=-10 && diferenciaPeso<-9) {
				pesoPresionDiastolica = ((diferenciaPeso-(-10))*(-6.095122-(-6.582732))) + (-6.582732);
			}
			if(diferenciaPeso>=-9 && diferenciaPeso<-8) {
				pesoPresionDiastolica = ((diferenciaPeso-(-9))*(-5.851317-(-6.095122))) + (-6.095122);
			}
			if(diferenciaPeso>=-8 && diferenciaPeso<-7) {
				pesoPresionDiastolica = ((diferenciaPeso-(-8))*(-4.388488-(-5.851317))) + (-5.851317);
			}
			if(diferenciaPeso>=-7 && diferenciaPeso<-6) {
				pesoPresionDiastolica = ((diferenciaPeso-(-7))*(-3.900878-(-4.388488))) + (-4.388488);
			}
			if(diferenciaPeso>=-6 && diferenciaPeso<-5) {
				pesoPresionDiastolica = ((diferenciaPeso-(-6))*(-2.681854-(-3.900878))) + (-3.900878);
			}
			if(diferenciaPeso>=-5 && diferenciaPeso<-4) {
				pesoPresionDiastolica = ((diferenciaPeso-(-5))*(-1.950439-(-2.681854))) + (-2.681854);
			}
			if(diferenciaPeso>=-4 && diferenciaPeso<-3) {
				pesoPresionDiastolica = ((diferenciaPeso-(-4))*(-1.706634-(-1.950439))) + (-1.950439);
			}
			if(diferenciaPeso>=-3 && diferenciaPeso<-2) {
				pesoPresionDiastolica = ((diferenciaPeso-(-3))*(-1.219024-(-1.706634))) + (-1.706634);
			}
			if(diferenciaPeso>=-2 && diferenciaPeso<-1) {
				pesoPresionDiastolica = ((diferenciaPeso-(-2))*(-0.7314146-(-1.219024))) + (-1.219024);
			}
			if(diferenciaPeso>=-1 && diferenciaPeso<0) {
				pesoPresionDiastolica = ((diferenciaPeso-(-1))*(0-(-0.7314146))) + (-0.7314146);
			}
			if(diferenciaPeso>=0 && diferenciaPeso<1) {
				pesoPresionDiastolica = 0;
			}
			if(diferenciaPeso>=1 && diferenciaPeso<2) {
				pesoPresionDiastolica = ((diferenciaPeso-1)*(0.1));
			}
			if(diferenciaPeso>=2 && diferenciaPeso<3) {
				pesoPresionDiastolica = 0.1;
			}
			if(diferenciaPeso>=3 && diferenciaPeso<4) {
				pesoPresionDiastolica = ((diferenciaPeso-3)*(0.5-0.1)) + 0.1;
			}
			if(diferenciaPeso>=4 && diferenciaPeso<5) {
				pesoPresionDiastolica = ((diferenciaPeso-4)*(0.6-0.5)) + 0.5;
			}
			if(diferenciaPeso>=5 && diferenciaPeso<6) {
				pesoPresionDiastolica = ((diferenciaPeso-5)*(0.8-0.6)) + 0.6;
			}
			if(diferenciaPeso>=6 && diferenciaPeso<7) {
				pesoPresionDiastolica = ((diferenciaPeso-6)*(1-0.8)) + 0.8;
			}
			if(diferenciaPeso>=7 && diferenciaPeso<8) {
				pesoPresionDiastolica = ((diferenciaPeso-7)*(1.6-1)) + 1;
			}
			if(diferenciaPeso>=8 && diferenciaPeso<9) {
				pesoPresionDiastolica = ((diferenciaPeso-8)*(2-1.6)) + 1.6;
			}
			if(diferenciaPeso>=9 && diferenciaPeso<10) {
				pesoPresionDiastolica = ((diferenciaPeso-9)*(2.1-2)) + 2;
			}
			if(diferenciaPeso>=10 && diferenciaPeso<11) {
				pesoPresionDiastolica = ((diferenciaPeso-10)*(2.3-2.1)) + 2.1;
			}
			if(diferenciaPeso>=11 && diferenciaPeso<12) {
				pesoPresionDiastolica = ((diferenciaPeso-11)*(2.4-2.3)) + 2.3;
			}
			if(diferenciaPeso>=12 && diferenciaPeso<13) {
				pesoPresionDiastolica = ((diferenciaPeso-12)*(2.5-2.4)) + 2.4;
			}
			if(diferenciaPeso>=13 && diferenciaPeso<14) {
				pesoPresionDiastolica = ((diferenciaPeso-13)*(2.6-2.5)) + 2.5;
			}
			if(diferenciaPeso>=14 && diferenciaPeso<15) {
				pesoPresionDiastolica = ((diferenciaPeso-14)*(3-2.6)) + 2.6;
			}
			if(diferenciaPeso>=15 && diferenciaPeso<16) {
				pesoPresionDiastolica = ((diferenciaPeso-15)*(3.1-3)) + 3;
			}
			if(diferenciaPeso>=16 && diferenciaPeso<17) {
				pesoPresionDiastolica = ((diferenciaPeso-16)*(3.5-3.1)) + 3.1;
			}
			if(diferenciaPeso>=17 && diferenciaPeso<18) {
				pesoPresionSistolica = ((diferenciaPeso-17)*(3.8-3.5)) + 3.5;
			}
			if(diferenciaPeso>=18 && diferenciaPeso<19) {
				pesoPresionDiastolica = ((diferenciaPeso-18)*(4-3.8)) + 3.8;
			}
			if(diferenciaPeso>=19 && diferenciaPeso<20) {
				pesoPresionDiastolica = ((diferenciaPeso-19)*(4.2-4)) + 4;
			}
			if(diferenciaPeso>=20 && diferenciaPeso<21) {
				pesoPresionDiastolica = ((diferenciaPeso-20)*(4.6-4.2)) + 4.2;
			}
			if(diferenciaPeso>=21 && diferenciaPeso<22) {
				pesoPresionDiastolica = ((diferenciaPeso-21)*(4.8-4.6)) + 4.6;
			}
			if(diferenciaPeso>=22 && diferenciaPeso<23) {
				pesoPresionDiastolica = ((diferenciaPeso-22)*(5-4.8)) + 4.8;
			}
			if(diferenciaPeso>=23 && diferenciaPeso<24) {
				pesoPresionDiastolica = ((diferenciaPeso-23)*(5.2-5)) + 5;
			}
			if(diferenciaPeso>=24 && diferenciaPeso<25) {
				pesoPresionDiastolica = ((diferenciaPeso-24)*(5.3-5.2)) + 5.2;
			}
			if(diferenciaPeso>=25 && diferenciaPeso<26) {
				pesoPresionDiastolica = ((diferenciaPeso-25)*(5.6-5.3)) + 5.3;
			}
			if(diferenciaPeso>=26 && diferenciaPeso<27) {
				pesoPresionDiastolica = ((diferenciaPeso-26)*(6-5.6)) + 5.6;
			}
			if(diferenciaPeso>=27 && diferenciaPeso<28) {
				pesoPresionDiastolica = ((diferenciaPeso-27)*(6.1-6)) + 6;
			}
			if(diferenciaPeso>=28 && diferenciaPeso<29) {
				pesoPresionDiastolica = ((diferenciaPeso-28)*(6.3-6.1)) + 6.1;
			}
			if(diferenciaPeso>=29 && diferenciaPeso<30) {
				pesoPresionDiastolica = ((diferenciaPeso-29)*(6.7-6.3)) + 6.3;
			}
			if(diferenciaPeso>=30 && diferenciaPeso<31) {
				pesoPresionDiastolica = ((diferenciaPeso-30)*(6.9-6.7)) + 6.7;
			}
			if(diferenciaPeso>=31 && diferenciaPeso<32) {
				pesoPresionDiastolica = ((diferenciaPeso-31)*(7-6.9)) + 6.9;
			}
			if(diferenciaPeso>=32 && diferenciaPeso<33) {
				pesoPresionDiastolica = ((diferenciaPeso-32)*(7.2-7)) + 7;
			}
			if(diferenciaPeso>=33 && diferenciaPeso<34) {
				pesoPresionDiastolica = 7.2;
			}
			if(diferenciaPeso>=34 && diferenciaPeso<35) {
				pesoPresionDiastolica = ((diferenciaPeso-34)*(7.3-7.2)) + 7.2;
			}
			if(diferenciaPeso>=35 && diferenciaPeso<36) {
				pesoPresionDiastolica = ((diferenciaPeso-35)*(7.5-7.3)) + 7.3;
			}
			if(diferenciaPeso>=36 && diferenciaPeso<37) {
				pesoPresionDiastolica = ((diferenciaPeso-36)*(8-7.5)) + 7.5;
			}
			if(diferenciaPeso>=37 && diferenciaPeso<38) {
				pesoPresionDiastolica = ((diferenciaPeso-37)*(8.5-8)) + 8;
			}
			if(diferenciaPeso>=38 && diferenciaPeso<39) {
				pesoPresionDiastolica = ((diferenciaPeso-38)*(8.9-8.5)) + 8.5;
			}
			if(diferenciaPeso>=39 && diferenciaPeso<40) {
				pesoPresionDiastolica = ((diferenciaPeso-39)*(9.2-8.9)) + 8.9;
			}
			if(diferenciaPeso>=40 && diferenciaPeso<41) {
				pesoPresionDiastolica = ((diferenciaPeso-40)*(9.5-9.2)) + 9.2;
			}
			if(diferenciaPeso>=41 && diferenciaPeso<42) {
				pesoPresionDiastolica = ((diferenciaPeso-41)*(9.6-9.5)) + 9.5;
			}
			if(diferenciaPeso>=42 && diferenciaPeso<43) {
				pesoPresionDiastolica = 9.6;
			}
			if(diferenciaPeso>=43 && diferenciaPeso<44) {
				pesoPresionDiastolica = ((diferenciaPeso-43)*(9.7-9.6)) + 9.6;
			}
			if(diferenciaPeso>=44 && diferenciaPeso<45) {
				pesoPresionDiastolica = ((diferenciaPeso-44)*(9.8-9.7)) + 9.7;
			}
			if(diferenciaPeso>=45 && diferenciaPeso<46) {
				pesoPresionDiastolica = ((diferenciaPeso-45)*(10-9.8)) + 9.8;
			}
			if(diferenciaPeso>=46 && diferenciaPeso<47) {
				pesoPresionDiastolica = ((diferenciaPeso-46)*(10.5-10)) + 10;
			}
			if(diferenciaPeso>=47 && diferenciaPeso<48) {
				pesoPresionDiastolica = ((diferenciaPeso-47)*(10.6-10.5)) + 10.5;
			}
			if(diferenciaPeso>=48 && diferenciaPeso<=49) {
				pesoPresionDiastolica = ((diferenciaPeso-48)*(11-10.6)) + 10.6;
			}	
			if(diferenciaPeso>=49 && diferenciaPeso<=50) {
				pesoPresionDiastolica = ((diferenciaPeso-49)*(11.5-11)) + 11;
			}
			
			return pesoPresionDiastolica;
		}
	
}
