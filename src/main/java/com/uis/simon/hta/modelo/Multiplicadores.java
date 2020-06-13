package com.uis.simon.hta.modelo;

public class Multiplicadores {
	
	private static double regularEdadHombres;
	private static double regularEdadMujeres;
	private static double actividadFisicaHombres;
	private static double actividadFisicaMujeres;
	private static double gananciaPesoHombres;
	private static double gananciaPesoMujeres;
	private static double pesoPresionSistolica;
	private static double pesoPresionDiastolica;
	
	public Multiplicadores() {}
	
	//reguladorEdaHombres (SectorRiesgo)
	
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
	
	//reguladorActividadFisicaHombres (SectorPeso)
	
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
	
	//reguladorActividadFisicaMujeres (SectorPeso)
	
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
	public static double MultiplicadorPresionDistolica(double diferenciaPeso) {
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
			pesoPresionSistolica = ((diferenciaPeso-(-59))*(-39.71385-(-40.26878))) + (-40.26878);
		}
		if(diferenciaPeso>=-58 && diferenciaPeso<-57) {
			pesoPresionSistolica = ((diferenciaPeso-(-58))*(-38.88146-(-39.71385))) + (-39.71385);
		}
		if(diferenciaPeso>=-57 && diferenciaPeso<-56) {
			pesoPresionSistolica = ((diferenciaPeso-(-57))*(-38.04907-(-38.88146))) + (-38.88146);
		}
		if(diferenciaPeso>=-56 && diferenciaPeso<-55) {
			pesoPresionSistolica = ((diferenciaPeso-(-56))*(-37.49415-(-38.04907))) + (-38.04907);
		}
		if(diferenciaPeso>=-55 && diferenciaPeso<-54) {
			pesoPresionSistolica = ((diferenciaPeso-(-55))*(-37.21668-(-37.49415))) + (-37.49415);
		}
		if(diferenciaPeso>=-54 && diferenciaPeso<-53) {
			pesoPresionSistolica = ((diferenciaPeso-(-54))*(-36.38429-(-37.21668))) + (-37.21668);
		}
		if(diferenciaPeso>=-53 && diferenciaPeso<-52) {
			pesoPresionSistolica = ((diferenciaPeso-(-53))*(-35.5519-(-36.38429))) + (-36.38429);
		}
		if(diferenciaPeso>=-52 && diferenciaPeso<-51) {
			pesoPresionSistolica = ((diferenciaPeso-(-52))*(-34.99698-(-35.5519))) + (-35.5519);
		}
		if(diferenciaPeso>=-51 && diferenciaPeso<-50) {
			pesoPresionSistolica = ((diferenciaPeso-(-51))*(-34.71951-(-34.99698))) + (-34.99698);
		}
		if(diferenciaPeso>=-50 && diferenciaPeso<-49) {
			pesoPresionSistolica = ((diferenciaPeso-(-50))*(-34.16459-(-34.71951))) + (-34.71951);
		}
		if(diferenciaPeso>=-49 && diferenciaPeso<-48) {
			pesoPresionSistolica = ((diferenciaPeso-(-49))*(-33.60966-(-34.16459))) + (-34.16459);
		}
		if(diferenciaPeso>=-48 && diferenciaPeso<-47) {
			pesoPresionSistolica = ((diferenciaPeso-(-48))*(-32.77727-(-33.60966))) + (-33.60966);
		}
		if(diferenciaPeso>=-47 && diferenciaPeso<-46) {
			pesoPresionSistolica = ((diferenciaPeso-(-47))*(-32.22234-(-32.77727))) + (-32.77727);
		}
		if(diferenciaPeso>=-46 && diferenciaPeso<-45) {
			pesoPresionSistolica = ((diferenciaPeso-(-46))*(-31.66741-(-32.22234))) + (-32.22234);
		}
		if(diferenciaPeso>=-45 && diferenciaPeso<-44) {
			pesoPresionSistolica = ((diferenciaPeso-(-45))*(-30.55756-(-31.66741))) + (-31.66741);
		}
		if(diferenciaPeso>=-44 && diferenciaPeso<-43) {
			pesoPresionSistolica = ((diferenciaPeso-(-44))*(-30.00263-(-30.55756))) + (-30.55756);
		}
		if(diferenciaPeso>=-43 && diferenciaPeso<-42) {
			pesoPresionSistolica = ((diferenciaPeso-(-43))*(-28.89278-(-30.00263))) + (-30.00263);
		}
		if(diferenciaPeso>=-42 && diferenciaPeso<-41) {
			pesoPresionSistolica = ((diferenciaPeso-(-42))*(-27.93902-(-28.89278))) + (-28.89278);
		}
		if(diferenciaPeso>=-41 && diferenciaPeso<-40) {
			pesoPresionSistolica = ((diferenciaPeso-(-41))*(-27.66351-(-27.93902))) + (-27.93902);
		}
		if(diferenciaPeso>=-40 && diferenciaPeso<-39) {
			pesoPresionSistolica = ((diferenciaPeso-(-40))*(-26.56146-(-27.66351))) + (-27.66351);
		}
		if(diferenciaPeso>=-39 && diferenciaPeso<-38) {
			pesoPresionSistolica = ((diferenciaPeso-(-39))*(-26.01044-(-26.56146))) + (-26.56146);
		}
		if(diferenciaPeso>=-38 && diferenciaPeso<-37) {
			pesoPresionSistolica = ((diferenciaPeso-(-38))*(-25.45941-(-26.01044))) + (-26.01044);
		}
		if(diferenciaPeso>=-37 && diferenciaPeso<-36) {
			pesoPresionSistolica = ((diferenciaPeso-(-37))*(-24.63288-(-25.45941))) + (-25.45941);
		}
		if(diferenciaPeso>=-36 && diferenciaPeso<-35) {
			pesoPresionSistolica = ((diferenciaPeso-(-36))*(-23.80634-(-24.63288))) + (-24.63288);
		}
		if(diferenciaPeso>=-35 && diferenciaPeso<-34) {
			pesoPresionSistolica = ((diferenciaPeso-(-35))*(-22.9798-(-23.80634))) + (-23.80634);
		}
		if(diferenciaPeso>=-34 && diferenciaPeso<-33) {
			pesoPresionSistolica = ((diferenciaPeso-(-34))*(-22.15327-(-22.9798))) + (-22.9798);
		}
		if(diferenciaPeso>=-33 && diferenciaPeso<-32) {
			pesoPresionSistolica = ((diferenciaPeso-(-33))*(-21.05122-(-22.15327))) + (-22.15327);
		}
		if(diferenciaPeso>=-32 && diferenciaPeso<-31) {
			pesoPresionSistolica = ((diferenciaPeso-(-32))*(-19.94917-(-21.05122))) + (-21.05122);
		}
		if(diferenciaPeso>=-31 && diferenciaPeso<-30) {
			pesoPresionSistolica = ((diferenciaPeso-(-31))*(-18.84712-(-19.94917))) + (-19.94917);
		}
		if(diferenciaPeso>=-30 && diferenciaPeso<-29) {
			pesoPresionSistolica = ((diferenciaPeso-(-30))*(-18.2961-(-18.84712))) + (-18.84712);
		}
		if(diferenciaPeso>=-29 && diferenciaPeso<-28) {
			pesoPresionSistolica = ((diferenciaPeso-(-29))*(-17.74507-(-18.2961))) + (-18.2961);
		}
		if(diferenciaPeso>=-28 && diferenciaPeso<-27) {
			pesoPresionSistolica = ((diferenciaPeso-(-28))*(-17.46956-(-17.74507))) + (-17.74507);
		}
		if(diferenciaPeso>=-27 && diferenciaPeso<-26) {
			pesoPresionSistolica = ((diferenciaPeso-(-27))*(-17.19045-(-17.46956))) + (-17.46956);
		}
		if(diferenciaPeso>=-26 && diferenciaPeso<-25) {
			pesoPresionSistolica = ((diferenciaPeso-(-26))*(-16.36751-(-17.19045))) + (-17.19045);
		}
		if(diferenciaPeso>=-25 && diferenciaPeso<-24) {
			pesoPresionSistolica = ((diferenciaPeso-(-25))*(-15.54098-(-16.36751))) + (-16.36751);
		}
		if(diferenciaPeso>=-24 && diferenciaPeso<-23) {
			pesoPresionSistolica = ((diferenciaPeso-(-24))*(-14.71444-(-15.54098))) + (-15.54098);
		}
		if(diferenciaPeso>=-23 && diferenciaPeso<-22) {
			pesoPresionSistolica = ((diferenciaPeso-(-23))*(-14.16341-(-14.71444))) + (-14.71444);
		}
		if(diferenciaPeso>=-23 && diferenciaPeso<-22) {
			pesoPresionSistolica = ((diferenciaPeso-(-23))*(-14.16341-(-14.16341))) + (-14.16341);
		}
		if(diferenciaPeso>=-22 && diferenciaPeso<-21) {
			pesoPresionSistolica = ((diferenciaPeso-(-22))*(-13.8879-(-14.16341))) + (-14.16341);
		}
		if(diferenciaPeso>=-21 && diferenciaPeso<-20) {
			pesoPresionSistolica = ((diferenciaPeso-(-21))*(-13.06137-(-13.8879))) + (-13.8879);
		}
		if(diferenciaPeso>=-20 && diferenciaPeso<-19) {
			pesoPresionSistolica = ((diferenciaPeso-(-20))*(-12.78585-(-13.06137))) + (-13.06137);
		}
		if(diferenciaPeso>=-19 && diferenciaPeso<-18) {
			pesoPresionSistolica = ((diferenciaPeso-(-19))*(-12.23483-(-12.78585))) + (-12.78585);
		}
		if(diferenciaPeso>=-18 && diferenciaPeso<-17) {
			pesoPresionSistolica = ((diferenciaPeso-(-18))*(-11.40829-(-12.23483))) + (-12.23483);
		}
		if(diferenciaPeso>=-17 && diferenciaPeso<-16) {
			pesoPresionSistolica = ((diferenciaPeso-(-17))*(-10.30624-(-11.40829))) + (-11.40829);
		}
		if(diferenciaPeso>=-16 && diferenciaPeso<-15) {
			pesoPresionSistolica = ((diferenciaPeso-(-16))*(-9.75522-(-10.30624))) + (-10.30624);
		}
		if(diferenciaPeso>=-15 && diferenciaPeso<-14) {
			pesoPresionSistolica = ((diferenciaPeso-(-15))*(-9.204195-(-9.75522))) + (-9.75522);
		}
		if(diferenciaPeso>=-14 && diferenciaPeso<-13) {
			pesoPresionSistolica = ((diferenciaPeso-(-14))*(-8.377659-(-9.204195))) + (-9.204195);
		}
		if(diferenciaPeso>=-13 && diferenciaPeso<-12) {
			pesoPresionSistolica = ((diferenciaPeso-(-13))*(-7.757152-(-8.377659))) + (-8.377659);
		}
		if(diferenciaPeso>=-12 && diferenciaPeso<-11) {
			pesoPresionSistolica = ((diferenciaPeso-(-12))*(-6.931024-(-7.757152))) + (-7.757152);
		}
		if(diferenciaPeso>=-11 && diferenciaPeso<-10) {
			pesoPresionSistolica = ((diferenciaPeso-(-11))*(-6.582732-(-6.931024))) + (-6.931024);
		}
		if(diferenciaPeso>=-10 && diferenciaPeso<-9) {
			pesoPresionSistolica = ((diferenciaPeso-(-10))*(-6.095122-(-6.582732))) + (-6.582732);
		}
		if(diferenciaPeso>=-9 && diferenciaPeso<-8) {
			pesoPresionSistolica = ((diferenciaPeso-(-9))*(-5.851317-(-6.095122))) + (-6.095122);
		}
		if(diferenciaPeso>=-8 && diferenciaPeso<-7) {
			pesoPresionSistolica = ((diferenciaPeso-(-8))*(-4.388488-(-5.851317))) + (-5.851317);
		}
		if(diferenciaPeso>=-7 && diferenciaPeso<-6) {
			pesoPresionSistolica = ((diferenciaPeso-(-7))*(-3.900878-(-4.388488))) + (-4.388488);
		}
		if(diferenciaPeso>=-6 && diferenciaPeso<-5) {
			pesoPresionSistolica = ((diferenciaPeso-(-6))*(-2.681854-(-3.900878))) + (-3.900878);
		}
		if(diferenciaPeso>=-5 && diferenciaPeso<-4) {
			pesoPresionSistolica = ((diferenciaPeso-(-5))*(-1.950439-(-2.681854))) + (-2.681854);
		}
		if(diferenciaPeso>=-4 && diferenciaPeso<-3) {
			pesoPresionSistolica = ((diferenciaPeso-(-4))*(-1.706634-(-1.950439))) + (-1.950439);
		}
		if(diferenciaPeso>=-3 && diferenciaPeso<-2) {
			pesoPresionSistolica = ((diferenciaPeso-(-3))*(-1.219024-(-1.706634))) + (-1.706634);
		}
		if(diferenciaPeso>=-2 && diferenciaPeso<-1) {
			pesoPresionSistolica = ((diferenciaPeso-(-2))*(-0.7314146-(-1.219024))) + (-1.219024);
		}
		if(diferenciaPeso>=-1 && diferenciaPeso<0) {
			pesoPresionSistolica = ((diferenciaPeso-(-1))*(0-(-0.7314146))) + (-0.7314146);
		}
		if(diferenciaPeso>=0 && diferenciaPeso<1) {
			pesoPresionSistolica = 0;
		}
		if(diferenciaPeso>=1 && diferenciaPeso<2) {
			pesoPresionSistolica = ((diferenciaPeso-1)*(0.1));
		}
		if(diferenciaPeso>=2 && diferenciaPeso<3) {
			pesoPresionSistolica = ((diferenciaPeso-2)*(0.5-0.1)) + 0.1;;
		}
		if(diferenciaPeso>=3 && diferenciaPeso<4) {
			pesoPresionSistolica = ((diferenciaPeso-3)*(0.6-0.5)) + 0.5;
		}
		if(diferenciaPeso>=4 && diferenciaPeso<5) {
			pesoPresionSistolica = ((diferenciaPeso-4)*(0.8-0.6)) + 0.6;
		}
		if(diferenciaPeso>=5 && diferenciaPeso<6) {
			pesoPresionSistolica = ((diferenciaPeso-5)*(1-0.8)) + 0.8;
		}
		if(diferenciaPeso>=6 && diferenciaPeso<7) {
			pesoPresionSistolica = ((diferenciaPeso-6)*(1.6-1)) + 1;
		}
		if(diferenciaPeso>=7 && diferenciaPeso<8) {
			pesoPresionSistolica = ((diferenciaPeso-7)*(2-1.6)) + 1.6;
		}
		if(diferenciaPeso>=8 && diferenciaPeso<9) {
			pesoPresionSistolica = ((diferenciaPeso-8)*(2.1-2)) + 2;
		}
		if(diferenciaPeso>=9 && diferenciaPeso<10) {
			pesoPresionSistolica = ((diferenciaPeso-9)*(2.3-2.1)) + 2.1;
		}
		if(diferenciaPeso>=10 && diferenciaPeso<11) {
			pesoPresionSistolica = ((diferenciaPeso-10)*(2.4-2.3)) + 2.3;
		}
		if(diferenciaPeso>=11 && diferenciaPeso<12) {
			pesoPresionSistolica = ((diferenciaPeso-11)*(2.5-2.4)) + 2.4;
		}
		if(diferenciaPeso>=12 && diferenciaPeso<13) {
			pesoPresionSistolica = ((diferenciaPeso-12)*(2.6-2.5)) + 2.5;
		}
		if(diferenciaPeso>=13 && diferenciaPeso<14) {
			pesoPresionSistolica = ((diferenciaPeso-13)*(3-2.6)) + 2.6;
		}
		if(diferenciaPeso>=14 && diferenciaPeso<15) {
			pesoPresionSistolica = ((diferenciaPeso-14)*(3.1-3)) + 3;
		}
		if(diferenciaPeso>=15 && diferenciaPeso<16) {
			pesoPresionSistolica = ((diferenciaPeso-15)*(3.5-3.1)) + 3.1;
		}
		if(diferenciaPeso>=16 && diferenciaPeso<17) {
			pesoPresionSistolica = ((diferenciaPeso-16)*(3.8-3.5)) + 3.5;
		}
		if(diferenciaPeso>=17 && diferenciaPeso<18) {
			pesoPresionSistolica = ((diferenciaPeso-17)*(4-3.8)) + 3.8;
		}
		if(diferenciaPeso>=18 && diferenciaPeso<19) {
			pesoPresionSistolica = ((diferenciaPeso-18)*(4.2-4)) + 4;
		}
		if(diferenciaPeso>=19 && diferenciaPeso<20) {
			pesoPresionSistolica = ((diferenciaPeso-19)*(4.6-4.2)) + 4.2;
		}
		if(diferenciaPeso>=20 && diferenciaPeso<21) {
			pesoPresionSistolica = ((diferenciaPeso-20)*(4.8-4.6)) + 4.6;
		}
		if(diferenciaPeso>=21 && diferenciaPeso<22) {
			pesoPresionSistolica = ((diferenciaPeso-21)*(5-4.8)) + 4.8;
		}
		if(diferenciaPeso>=22 && diferenciaPeso<23) {
			pesoPresionSistolica = ((diferenciaPeso-22)*(5.2-5)) + 5;
		}
		if(diferenciaPeso>=23 && diferenciaPeso<24) {
			pesoPresionSistolica = ((diferenciaPeso-23)*(5.3-5.2)) + 5.2;
		}
		if(diferenciaPeso>=24 && diferenciaPeso<25) {
			pesoPresionSistolica = ((diferenciaPeso-24)*(5.6-5.3)) + 5.3;
		}
		if(diferenciaPeso>=25 && diferenciaPeso<26) {
			pesoPresionSistolica = ((diferenciaPeso-25)*(6-5.6)) + 5.6;
		}
		if(diferenciaPeso>=26 && diferenciaPeso<27) {
			pesoPresionSistolica = ((diferenciaPeso-26)*(6.1-6)) + 6;
		}
		if(diferenciaPeso>=27 && diferenciaPeso<28) {
			pesoPresionSistolica = ((diferenciaPeso-27)*(6.3-6.1)) + 6.1;
		}
		if(diferenciaPeso>=28 && diferenciaPeso<29) {
			pesoPresionSistolica = ((diferenciaPeso-28)*(6.7-6.3)) + 6.3;
		}
		if(diferenciaPeso>=29 && diferenciaPeso<30) {
			pesoPresionSistolica = ((diferenciaPeso-29)*(6.9-6.7)) + 6.7;
		}
		if(diferenciaPeso>=30 && diferenciaPeso<31) {
			pesoPresionSistolica = ((diferenciaPeso-30)*(7-6.9)) + 6.9;
		}
		if(diferenciaPeso>=31 && diferenciaPeso<32) {
			pesoPresionSistolica = ((diferenciaPeso-31)*(7.2-7)) + 7;
		}
		if(diferenciaPeso>=32 && diferenciaPeso<33) {
			pesoPresionSistolica = 7.2;
		}
		if(diferenciaPeso>=33 && diferenciaPeso<34) {
			pesoPresionSistolica = ((diferenciaPeso-33)*(7.3-7.2)) + 7.2;
		}
		if(diferenciaPeso>=34 && diferenciaPeso<35) {
			pesoPresionSistolica = ((diferenciaPeso-34)*(7.5-7.3)) + 7.3;
		}
		if(diferenciaPeso>=35 && diferenciaPeso<36) {
			pesoPresionSistolica = ((diferenciaPeso-35)*(8-7.5)) + 7.5;
		}
		if(diferenciaPeso>=36 && diferenciaPeso<37) {
			pesoPresionSistolica = ((diferenciaPeso-36)*(8.5-8)) + 8;
		}
		if(diferenciaPeso>=37 && diferenciaPeso<38) {
			pesoPresionSistolica = ((diferenciaPeso-37)*(8.9-8.5)) + 8.5;
		}
		if(diferenciaPeso>=38 && diferenciaPeso<39) {
			pesoPresionSistolica = ((diferenciaPeso-38)*(9.2-8.9)) + 8.9;
		}
		if(diferenciaPeso>=39 && diferenciaPeso<40) {
			pesoPresionSistolica = ((diferenciaPeso-39)*(9.5-9.2)) + 9.2;
		}
		if(diferenciaPeso>=40 && diferenciaPeso<41) {
			pesoPresionSistolica = ((diferenciaPeso-40)*(9.6-9.5)) + 9.5;
		}
		if(diferenciaPeso>=41 && diferenciaPeso<42) {
			pesoPresionSistolica = 9.6;
		}
		if(diferenciaPeso>=42 && diferenciaPeso<43) {
			pesoPresionSistolica = ((diferenciaPeso-42)*(9.7-9.6)) + 9.6;
		}
		if(diferenciaPeso>=43 && diferenciaPeso<44) {
			pesoPresionSistolica = ((diferenciaPeso-43)*(9.8-9.7)) + 9.7;
		}
		if(diferenciaPeso>=44 && diferenciaPeso<45) {
			pesoPresionSistolica = ((diferenciaPeso-44)*(10-9.8)) + 9.8;
		}
		if(diferenciaPeso>=45 && diferenciaPeso<46) {
			pesoPresionSistolica = ((diferenciaPeso-45)*(10.5-10)) + 10;
		}
		if(diferenciaPeso>=46 && diferenciaPeso<47) {
			pesoPresionSistolica = ((diferenciaPeso-46)*(10.6-10.5)) + 10.5;
		}
		if(diferenciaPeso>=47 && diferenciaPeso<48) {
			pesoPresionSistolica = ((diferenciaPeso-47)*(11-10.6)) + 10.6;
		}
		if(diferenciaPeso>=48 && diferenciaPeso<=49) {
			pesoPresionSistolica = ((diferenciaPeso-48)*(11.5-11)) + 11;
		}	
		
		return pesoPresionDiastolica;
	}
	
	//
	
	public static double MultiplicadorGananciaPesoMujeres(double diasCigarrillo) {  
		if(diasCigarrillo>=0 && diasCigarrillo <18) {
			gananciaPesoMujeres = 0;
		}
		if(diasCigarrillo>=18 && diasCigarrillo <19) {
			gananciaPesoMujeres = ((diasCigarrillo-18)*(0.0007960976));
		}
		if(diasCigarrillo>=19 && diasCigarrillo <20) {
			gananciaPesoMujeres = ((diasCigarrillo-19)*(0.001194146-0.0007960976)) + 0.0007960976;
		}
		if(diasCigarrillo>=20 && diasCigarrillo <21) {
			gananciaPesoMujeres = 0.001194146;
		}
		if(diasCigarrillo>=21 && diasCigarrillo <22) {
			gananciaPesoMujeres = ((diasCigarrillo-21)*(0.00119-0.001194146)) + 0.001194146;
		}
		if(diasCigarrillo>=22 && diasCigarrillo <23) {
			gananciaPesoMujeres = ((diasCigarrillo-22)*(0.00119416-0.00119)) + 0.00119;
		}
		if(diasCigarrillo>=23 && diasCigarrillo <24) {
			gananciaPesoMujeres = 0.001194146;
		}
		if(diasCigarrillo>=24 && diasCigarrillo <25) {
			gananciaPesoMujeres = ((diasCigarrillo-24)*(0.001592195-0.00119416)) + 0.00119416;
		}
		if(diasCigarrillo>=25 && diasCigarrillo <26) {
			gananciaPesoMujeres = 0.001592195;
		}
		if(diasCigarrillo>=26 && diasCigarrillo <27) {
			gananciaPesoMujeres = ((diasCigarrillo-26)*(0.0015921-0.001592195)) + 0.001592195;
		}
		if(diasCigarrillo>=27 && diasCigarrillo <28) {
			gananciaPesoMujeres = ((diasCigarrillo-26)*(0.0015921-0.0015921)) + 0.0015921;
		}
		if(diasCigarrillo>=28 && diasCigarrillo <30) {
			gananciaPesoMujeres = 0.001592195;
		}
		if(diasCigarrillo>=30 && diasCigarrillo <31) {
			gananciaPesoMujeres = ((diasCigarrillo-30)*(0.001990244-0.001592195)) + 0.001592195;
		}
		if(diasCigarrillo>=31 && diasCigarrillo <32) {
			gananciaPesoMujeres = ((diasCigarrillo-31)*(0.00199-0.001990244)) + 0.001990244;
		}
		if(diasCigarrillo>=32 && diasCigarrillo <33) {
			gananciaPesoMujeres = ((diasCigarrillo-32)*(0.001990244-0.00199)) + 0.00199;
		}
		if(diasCigarrillo>=33 && diasCigarrillo <36) {
			gananciaPesoMujeres = 0.001990244;
		}
		if(diasCigarrillo>=36 && diasCigarrillo <37) {
			gananciaPesoMujeres = ((diasCigarrillo-36)*(0.002-0.001990244)) + 0.001990244;
		}
		if(diasCigarrillo>=37 && diasCigarrillo <38) {
			gananciaPesoMujeres = ((diasCigarrillo-37)*(0.002388293-0.002)) + 0.002;
		}
		if(diasCigarrillo>=38 && diasCigarrillo <39) {
			gananciaPesoMujeres = 0.002388293;
		}
		if(diasCigarrillo>=39 && diasCigarrillo <40) {
			gananciaPesoMujeres = ((diasCigarrillo-37)*(0.002786341-0.002388293)) + 0.002388293;
		}
		if(diasCigarrillo>=40 && diasCigarrillo <41) {
			gananciaPesoMujeres =0.002786341;
		}
		if(diasCigarrillo>=41 && diasCigarrillo <42) {
			gananciaPesoMujeres = ((diasCigarrillo-41)*(0.002786-0.002786341)) + 0.002786341;
		}
		if(diasCigarrillo>=42 && diasCigarrillo <43) {
			gananciaPesoMujeres = ((diasCigarrillo-42)*(0.002786341-0.002786)) + 0.002786341;
		}
		if(diasCigarrillo>=43 && diasCigarrillo <45) {
			gananciaPesoMujeres = 0.002786341;
		}
		if(diasCigarrillo>=45 && diasCigarrillo <46) {
			gananciaPesoMujeres = ((diasCigarrillo-45)*(0.00318439-0.002786341)) + 0.002786341;
		}
		if(diasCigarrillo>=46 && diasCigarrillo <47) {
			gananciaPesoMujeres = ((diasCigarrillo-46)*(0.003184-0.00318439)) + 0.00318439;
		}
		if(diasCigarrillo>=47 && diasCigarrillo <48) {
			gananciaPesoMujeres = ((diasCigarrillo-47)*(0.00318439-0.003184)) + 0.003184;
		}
		if(diasCigarrillo>=48 && diasCigarrillo <50) {
			gananciaPesoMujeres = 0.00318439;
		}
		if(diasCigarrillo>=50 && diasCigarrillo <51) {
			gananciaPesoMujeres = ((diasCigarrillo-50)*(0.003582439-0.00318439)) + 0.003184;
		}
		if(diasCigarrillo>=51 && diasCigarrillo <52) {
			gananciaPesoMujeres = ((diasCigarrillo-51)*(0.0035824-0.00318439)) + 0.003184;
		}
		if(diasCigarrillo>=52 && diasCigarrillo <53) {
			gananciaPesoMujeres = ((diasCigarrillo-52)*(0.003582439-0.0035824)) + 0.0035824;
		}
		if(diasCigarrillo>=53 && diasCigarrillo <55) {
			gananciaPesoMujeres = 0.003582439;
		}
		if(diasCigarrillo>=55 && diasCigarrillo <56) {
			gananciaPesoMujeres = ((diasCigarrillo-55)*(0.004776585-0.003582439)) + 0.003582439;
		}
		if(diasCigarrillo>=56 && diasCigarrillo <57) {
			gananciaPesoMujeres = ((diasCigarrillo-56)*(0.004477-0.004776585)) + 0.004776585;
		}
		if(diasCigarrillo>=57 && diasCigarrillo <58) {
			gananciaPesoMujeres = ((diasCigarrillo-57)*(0.004776585-0.004477)) + 0.00477;
		}
		if(diasCigarrillo>=58 && diasCigarrillo <61) {
			gananciaPesoMujeres = 0.004776585;
		}
		if(diasCigarrillo>=61 && diasCigarrillo <62) {
			gananciaPesoMujeres = ((diasCigarrillo-61)*(0.0047765-0.004776585)) + 0.004776585;
		}
		if(diasCigarrillo>=62 && diasCigarrillo <63) {
			gananciaPesoMujeres = ((diasCigarrillo-62)*(0.004776585-0.0047765)) + 0.0047765;
		}
		if(diasCigarrillo>=63 && diasCigarrillo <64) {
			gananciaPesoMujeres = 0.004776585;
		}
		if(diasCigarrillo>=64 && diasCigarrillo <65) {
			gananciaPesoMujeres = ((diasCigarrillo-64)*(0.005174634-0.004776585)) + 0.004776585;
		}
		if(diasCigarrillo>=65 && diasCigarrillo <66) {
			gananciaPesoMujeres =0.005174634;
		}
		if(diasCigarrillo>=66 && diasCigarrillo <67) {
			gananciaPesoMujeres = ((diasCigarrillo-66)*(0.0053-0.00517434)) + 0.00517434;
		}
		if(diasCigarrillo>=67 && diasCigarrillo <68) {
			gananciaPesoMujeres = ((diasCigarrillo-67)*(0.005572683-0.0053)) + 0.0053;
		}
		if(diasCigarrillo>=68 && diasCigarrillo <69) {
			gananciaPesoMujeres = ((diasCigarrillo-68)*(0.005970732-0.005572683)) + 0.005572683;
		}
		if(diasCigarrillo>=69 && diasCigarrillo <70) {
			gananciaPesoMujeres = 0.005970732;
		}
		if(diasCigarrillo>=70 && diasCigarrillo <71) {
			gananciaPesoMujeres = ((diasCigarrillo-70)*(0.00636878-0.005970732)) + 0.005970732;
		}
		if(diasCigarrillo>=71 && diasCigarrillo <72) {
			gananciaPesoMujeres = ((diasCigarrillo-71)*(0.006368-0.00636878)) + 0.00636878;
		}
		if(diasCigarrillo>=72 && diasCigarrillo <73) {
			gananciaPesoMujeres = ((diasCigarrillo-72)*(0.006766829-0.006368)) + 0.006368;
		}
		if(diasCigarrillo>=73 && diasCigarrillo <75) {
			gananciaPesoMujeres = 0.006766829;
		}
		if(diasCigarrillo>=75 && diasCigarrillo <76) {
			gananciaPesoMujeres = ((diasCigarrillo-75)*(0.006766-0.006766829)) + 0.006766829;
		}
		if(diasCigarrillo>=76 && diasCigarrillo <77) {
			gananciaPesoMujeres = ((diasCigarrillo-76)*(0.007164878-0.006766)) + 0.006766;
		}
		if(diasCigarrillo>=77 && diasCigarrillo <78) {
			gananciaPesoMujeres = ((diasCigarrillo-77)*(0.007562927-0.007164878)) + 0.007164878;
		}
		if(diasCigarrillo>=78 && diasCigarrillo <79) {
			gananciaPesoMujeres = ((diasCigarrillo-78)*(0.007960976-0.007562927)) + 0.007562927;
		}
		if(diasCigarrillo>=79 && diasCigarrillo <80) {
			gananciaPesoMujeres = ((diasCigarrillo-79)*(0.008359024-0.007960976)) + 0.007960976;
		}
		if(diasCigarrillo>=80 && diasCigarrillo <81) {
			gananciaPesoMujeres = ((diasCigarrillo-80)*(0.00835-0.008359024)) + 0.008359024;
		}
		if(diasCigarrillo>=81 && diasCigarrillo <82) {
			gananciaPesoMujeres = ((diasCigarrillo-81)*(0.008757073-0.00835)) + 0.00835;
		}
		if(diasCigarrillo>=82 && diasCigarrillo <85) {
			gananciaPesoMujeres = 0.008757073;
		}
		if(diasCigarrillo>=85 && diasCigarrillo <86) {
			gananciaPesoMujeres = ((diasCigarrillo-85)*(0.00875-0.008757073)) + 0.008757073;
		}
		if(diasCigarrillo>=86 && diasCigarrillo <87) {
			gananciaPesoMujeres = ((diasCigarrillo-86)*(0.009155122-0.00875)) + 0.00875;
		}
		if(diasCigarrillo>=87 && diasCigarrillo <88) {
			gananciaPesoMujeres = 0.009155122;
		}
		if(diasCigarrillo>=88 && diasCigarrillo <89) {
			gananciaPesoMujeres = ((diasCigarrillo-86)*(0.00995122-0.009155122)) +  0.009155122;
		}
		if(diasCigarrillo>=89 && diasCigarrillo <90) {
			gananciaPesoMujeres = ((diasCigarrillo-89)*(0.01233951-0.00995122)) +  0.00995122;
		}
		if(diasCigarrillo>=90 && diasCigarrillo <91) {
			gananciaPesoMujeres = ((diasCigarrillo-90)*(0.0123-0.01233951)) +  0.01233951;
		}
		if(diasCigarrillo>=91 && diasCigarrillo <92) {
			gananciaPesoMujeres = ((diasCigarrillo-91)*(0.01074732-0.0123)) +  0.0123;
		}
		if(diasCigarrillo>=92 && diasCigarrillo <93) {
			gananciaPesoMujeres = ((diasCigarrillo-92)*(0.0111453-0.01074732)) +  0.01074732;
		}
		if(diasCigarrillo>=93 && diasCigarrillo <94) {
			gananciaPesoMujeres = ((diasCigarrillo-93)*(0.01194146-0.0111453)) +  0.0111453;
		}
		if(diasCigarrillo>=94 && diasCigarrillo <95) {
			gananciaPesoMujeres = 0.01194146;
		}
		if(diasCigarrillo>=95 && diasCigarrillo <96) {
			gananciaPesoMujeres = ((diasCigarrillo-95)*(0.01194-0.01194146)) + 0.01194146;
		}
		if(diasCigarrillo>=96 && diasCigarrillo <97) {
			gananciaPesoMujeres =  ((diasCigarrillo-96)*(0.01194146-0.01194)) + 0.01194;
		}
		if(diasCigarrillo>=97 && diasCigarrillo <98) {
			gananciaPesoMujeres =  ((diasCigarrillo-97)*(0.01273756-0.01194146)) + 0.01194146;
		}
		if(diasCigarrillo>=98 && diasCigarrillo <99) {
			gananciaPesoMujeres =  ((diasCigarrillo-98)*(0.0147278-0.01273756)) + 0.01273756;
		}
		if(diasCigarrillo>=99 && diasCigarrillo <100) {
			gananciaPesoMujeres =  ((diasCigarrillo-99)*(0.01353366-0.0147278)) + 0.0147278;
		}
		if(diasCigarrillo>=100 && diasCigarrillo <101) {
			gananciaPesoMujeres =  ((diasCigarrillo-100)*(0.013533-0.01353366)) + 0.01353366;
		}
		if(diasCigarrillo>=101 && diasCigarrillo <102) {
			gananciaPesoMujeres =  ((diasCigarrillo-101)*(0.01393171-0.013533)) + 0.013533;
		}
		if(diasCigarrillo>=102 && diasCigarrillo <103) {
			gananciaPesoMujeres =  ((diasCigarrillo-102)*(0.0147278-0.01393171)) + 0.01393171;
		}
		if(diasCigarrillo>=103 && diasCigarrillo <104) {
			gananciaPesoMujeres =  ((diasCigarrillo-103)*(0.01512585-0.0147278)) + 0.0147278;
		}
		if(diasCigarrillo>=104 && diasCigarrillo <105) {
			gananciaPesoMujeres =  ((diasCigarrillo-104)*(0.0155239-0.01512585)) + 0.01512585;
		}
		if(diasCigarrillo>=105 && diasCigarrillo <106) {
			gananciaPesoMujeres =  ((diasCigarrillo-105)*(0.0155-0.0155239)) + 0.0155239;
		}
		if(diasCigarrillo>=106 && diasCigarrillo <107) {
			gananciaPesoMujeres =  ((diasCigarrillo-106)*(0.01632-0.0155)) + 0.0155;
		}
		if(diasCigarrillo>=107 && diasCigarrillo <108) {
			gananciaPesoMujeres =  ((diasCigarrillo-107)*(0.01671805-0.01632)) + 0.01632;
		}
		if(diasCigarrillo>=108 && diasCigarrillo <109) {
			gananciaPesoMujeres =  0.01671805;
		}
		if(diasCigarrillo>=109 && diasCigarrillo <110) {
			gananciaPesoMujeres =  ((diasCigarrillo-109)*(0.0171161-0.01671805)) + 0.0171161;
		}
		if(diasCigarrillo>=110 && diasCigarrillo <111) {
			gananciaPesoMujeres =  ((diasCigarrillo-110)*(0.0171161-0.017)) + 0.017;
		}
		if(diasCigarrillo>=111 && diasCigarrillo <112) {
			gananciaPesoMujeres =  ((diasCigarrillo-111)*(0.01751415-0.0171161)) + 0.0171161;
		}
		if(diasCigarrillo>=112 && diasCigarrillo <113) {
			gananciaPesoMujeres =  ((diasCigarrillo-112)*(0.01831024-0.01751415)) + 0.01751415;
		}
		if(diasCigarrillo>=113 && diasCigarrillo <114) {
			gananciaPesoMujeres =  0.01831024;
		}
		if(diasCigarrillo>=114 && diasCigarrillo <115) {
			gananciaPesoMujeres =  ((diasCigarrillo-114)*(0.01870829-0.01831024)) + 0.01831024;
		}
		if(diasCigarrillo>=115 && diasCigarrillo <116) {
			gananciaPesoMujeres =  ((diasCigarrillo-115)*(0.0187-0.01870829)) + 0.01870829;
		}
		if(diasCigarrillo>=116 && diasCigarrillo <117) {
			gananciaPesoMujeres =  ((diasCigarrillo-116)*(0.01910634-0.0187)) + 0.0187;
		}
		if(diasCigarrillo>=117 && diasCigarrillo <118) {
			gananciaPesoMujeres =  ((diasCigarrillo-117)*(0.01950439-0.01910634)) + 0.01910634;
		}
		if(diasCigarrillo>=118 && diasCigarrillo <119) {
			gananciaPesoMujeres =  ((diasCigarrillo-118)*(0.0190244-0.01950439)) + 0.01950439;
		}
		if(diasCigarrillo>=119 && diasCigarrillo <120) {
			gananciaPesoMujeres =  ((diasCigarrillo-119)*(0.02030049-0.0190244)) + 0.0190244;
		}
		if(diasCigarrillo>=120 && diasCigarrillo <121) {
			gananciaPesoMujeres =  ((diasCigarrillo-120)*(0.02-0.02030049)) + 0.02030049;
		}
		if(diasCigarrillo>=121 && diasCigarrillo <122) {
			gananciaPesoMujeres =  ((diasCigarrillo-121)*(0.02109659-0.02)) + 0.02109659;
		}
		if(diasCigarrillo>=122 && diasCigarrillo <123) {
			gananciaPesoMujeres = 0.02109659;
		}
		if(diasCigarrillo>=123 && diasCigarrillo <124) {
			gananciaPesoMujeres =  ((diasCigarrillo-123)*(0.02189268-0.02109659)) + 0.02109659;
		}
		if(diasCigarrillo>=124 && diasCigarrillo <125) {
			gananciaPesoMujeres =  ((diasCigarrillo-124)*(0.02229073-0.02189268)) + 0.02189268;
		}
		if(diasCigarrillo>=125 && diasCigarrillo <126) {
			gananciaPesoMujeres =  ((diasCigarrillo-125)*(0.0222-0.02229073)) + 0.02229073;
		}
		if(diasCigarrillo>=126 && diasCigarrillo <127) {
			gananciaPesoMujeres =  ((diasCigarrillo-126)*(0.02308683-0.0222)) + 0.0222;
		}
		if(diasCigarrillo>=127 && diasCigarrillo <128) {
			gananciaPesoMujeres =  ((diasCigarrillo-127)*(0.02348488-0.02308683)) + 0.0222;
		}
		if(diasCigarrillo>=128 && diasCigarrillo <129) {
			gananciaPesoMujeres =  ((diasCigarrillo-128)*(0.02388293-0.02348488)) + 0.02348488;
		}
		if(diasCigarrillo>=129 && diasCigarrillo <130) {
			gananciaPesoMujeres =  0.02388293;
		}
		if(diasCigarrillo>=130 && diasCigarrillo <131) {
			gananciaPesoMujeres =  ((diasCigarrillo-130)*(0.02388-0.02388293)) + 0.02388293;
		}
		if(diasCigarrillo>=131 && diasCigarrillo <132) {
			gananciaPesoMujeres =  ((diasCigarrillo-131)*(0.02467902-0.02388)) + 0.02388;
		}
		if(diasCigarrillo>=132 && diasCigarrillo <133) {
			gananciaPesoMujeres =  ((diasCigarrillo-132)*(0.02507707-0.02467902)) + 0.02467902;
		}
		if(diasCigarrillo>=134 && diasCigarrillo <135) {
			gananciaPesoMujeres =  ((diasCigarrillo-134)*(0.02587317-0.02507707)) + 0.02507707;
		}
		if(diasCigarrillo>=135 && diasCigarrillo <136) {
			gananciaPesoMujeres =  ((diasCigarrillo-135)*(0.02587-0.02587317)) + 0.02587317;
		}
		if(diasCigarrillo>=136 && diasCigarrillo <137) {
			gananciaPesoMujeres =  ((diasCigarrillo-136)*(0.02627122-0.02587)) + 0.02587;
		}
		if(diasCigarrillo>=137 && diasCigarrillo <138) {
			gananciaPesoMujeres =  ((diasCigarrillo-137)*(0.02666927-0.02627122)) + 0.02627122;
		}
		if(diasCigarrillo>=138 && diasCigarrillo <139) {
			gananciaPesoMujeres =  ((diasCigarrillo-138)*(0.02746537-0.02666927)) + 0.02666927;
		}
		if(diasCigarrillo>=139 && diasCigarrillo <140) {
			gananciaPesoMujeres =  ((diasCigarrillo-139)*(0.02786341-0.02746537)) + 0.02746537;
		}
		if(diasCigarrillo>=140 && diasCigarrillo <141) {
			gananciaPesoMujeres =  ((diasCigarrillo-140)*(0.0286-0.02786341)) + 0.02786341;
		}
		if(diasCigarrillo>=141 && diasCigarrillo <142) {
			gananciaPesoMujeres =  ((diasCigarrillo-141)*(0.02826146-0.0286)) + 0.0286;
		}
		if(diasCigarrillo>=142 && diasCigarrillo <143) {
			gananciaPesoMujeres =  ((diasCigarrillo-142)*(0.02905756-0.02826146)) + 0.02826146;
		}
		if(diasCigarrillo>=143 && diasCigarrillo <144) {
			gananciaPesoMujeres =  ((diasCigarrillo-143)*(0.02985366-0.02905756)) + 0.02905756;
		}
		if(diasCigarrillo>=144 && diasCigarrillo <145) {
			gananciaPesoMujeres =  ((diasCigarrillo-144)*(0.03025171-0.02985366)) + 0.02985366;
		}
		if(diasCigarrillo>=145 && diasCigarrillo <146) {
			gananciaPesoMujeres =  ((diasCigarrillo-145)*(0.03025-0.03025171)) + 0.03025171;
		}
		if(diasCigarrillo>=146 && diasCigarrillo <147) {
			gananciaPesoMujeres =  ((diasCigarrillo-146)*(0.0310478-0.03025)) + 0.03025;
		}
		if(diasCigarrillo>=147 && diasCigarrillo <148) {
			gananciaPesoMujeres =  ((diasCigarrillo-147)*(0.03144585-0.0310478)) + 0.0310478;
		}
		if(diasCigarrillo>=148 && diasCigarrillo <149) {
			gananciaPesoMujeres =  ((diasCigarrillo-148)*(0.03224195-0.03144585)) + 0.03144585;
		}
		if(diasCigarrillo>=149 && diasCigarrillo <150) {
			gananciaPesoMujeres =  ((diasCigarrillo-149)*(0.03224-0.03224195)) + 0.03224195;
		}
		if(diasCigarrillo>=150 && diasCigarrillo <151) {
			gananciaPesoMujeres =  ((diasCigarrillo-150)*(0.03264-0.03224)) + 0.03224;
		}
		if(diasCigarrillo>=151 && diasCigarrillo <152) {
			gananciaPesoMujeres =  ((diasCigarrillo-151)*(0.03303805-0.03264)) + 0.03264;
		}
		if(diasCigarrillo>=152 && diasCigarrillo <153) {
			gananciaPesoMujeres =  ((diasCigarrillo-152)*(0.0342322-0.03303805)) + 0.03303805;
		}
		if(diasCigarrillo>=153 && diasCigarrillo <154) {
			gananciaPesoMujeres =  ((diasCigarrillo-153)*(0.03463024-0.0342322)) + 0.0342322;
		}
		if(diasCigarrillo>=154 && diasCigarrillo <155) {
			gananciaPesoMujeres =  ((diasCigarrillo-154)*(0.03463-0.03463024)) + 0.03463024;
		}
		if(diasCigarrillo>=155 && diasCigarrillo <156) {
			gananciaPesoMujeres =  ((diasCigarrillo-155)*(0.03502829-0.03463)) + 0.03463;
		}
		if(diasCigarrillo>=156 && diasCigarrillo <157) {
			gananciaPesoMujeres =  ((diasCigarrillo-156)*(0.03542634-0.03502829)) + 0.03502829;
		}
		if(diasCigarrillo>=157 && diasCigarrillo <158) {
			gananciaPesoMujeres =  ((diasCigarrillo-157)*(0.03622244-0.03542634)) + 0.03542634;
		}
		if(diasCigarrillo>=158 && diasCigarrillo <159) {
			gananciaPesoMujeres =  ((diasCigarrillo-158)*(0.03662049-0.03622244)) + 0.03622244;
		}
		if(diasCigarrillo>=159 && diasCigarrillo <160) {
			gananciaPesoMujeres =  ((diasCigarrillo-159)*(0.0366-0.03662049)) + 0.03662049;
		}
		if(diasCigarrillo>=160 && diasCigarrillo <161) {
			gananciaPesoMujeres =  ((diasCigarrillo-160)*(0.03701854-0.0366)) + 0.0366;
		}
		if(diasCigarrillo>=161 && diasCigarrillo <162) {
			gananciaPesoMujeres =  ((diasCigarrillo-161)*(0.03741659-0.03701854)) + 0.03701854;
		}
		if(diasCigarrillo>=162 && diasCigarrillo <163) {
			gananciaPesoMujeres =  ((diasCigarrillo-162)*(0.03781463-0.03741659)) + 0.03741659;
		}
		if(diasCigarrillo>=163 && diasCigarrillo <164) {
			gananciaPesoMujeres =  ((diasCigarrillo-163)*(0.0382268-0.03781463)) + 0.03781463;
		}
		if(diasCigarrillo>=164 && diasCigarrillo <165) {
			gananciaPesoMujeres =  ((diasCigarrillo-164)*(0.038-0.0382268)) + 0.0382268;
		}
		if(diasCigarrillo>=165 && diasCigarrillo <166) {
			gananciaPesoMujeres =  ((diasCigarrillo-165)*(0.03861073-0.038)) + 0.038;
		}
		if(diasCigarrillo>=166 && diasCigarrillo <167) {
			gananciaPesoMujeres =  ((diasCigarrillo-166)*(0.03900878-0.03861073)) + 0.03861073;
		}
		if(diasCigarrillo>=167 && diasCigarrillo <168) {
			gananciaPesoMujeres =  ((diasCigarrillo-167)*(0.03940683-0.03900878)) + 0.03900878;
		}
		if(diasCigarrillo>=168 && diasCigarrillo <169) {
			gananciaPesoMujeres =  ((diasCigarrillo-168)*(0.03980488-0.03940683)) + 0.03940683;
		}
		if(diasCigarrillo>=169 && diasCigarrillo <170) {
			gananciaPesoMujeres =  ((diasCigarrillo-169)*(0.039-0.03980488)) + 0.03980488;
		}
		if(diasCigarrillo>=170 && diasCigarrillo <171) {
			gananciaPesoMujeres =  ((diasCigarrillo-170)*(0.04020293-0.039)) + 0.039;
		}
		if(diasCigarrillo>=171 && diasCigarrillo <172) {
			gananciaPesoMujeres =  ((diasCigarrillo-171)*(0.04060098-0.04020293)) + 0.04020293;
		}
		if(diasCigarrillo>=172 && diasCigarrillo <173) {
			gananciaPesoMujeres =  ((diasCigarrillo-172)*(0.04139707-0.04060098)) + 0.04060098;
		}
		if(diasCigarrillo>=173 && diasCigarrillo <174) {
			gananciaPesoMujeres =  ((diasCigarrillo-173)*(0.04179512-0.04139707)) + 0.04139707;
		}
		if(diasCigarrillo>=174 && diasCigarrillo <175) {
			gananciaPesoMujeres =  ((diasCigarrillo-174)*(0.04179-0.04179512)) + 0.04179512;
		}
		if(diasCigarrillo>=175 && diasCigarrillo <176) {
			gananciaPesoMujeres =  ((diasCigarrillo-175)*(0.04259122-0.04179)) + 0.04179;
		}
		if(diasCigarrillo>=176 && diasCigarrillo <177) {
			gananciaPesoMujeres =  ((diasCigarrillo-176)*(0.04338732-0.04259122)) + 0.04259122;
		}
		if(diasCigarrillo>=177 && diasCigarrillo <178) {
			gananciaPesoMujeres =  ((diasCigarrillo-177)*(0.04458146-0.04338732)) + 0.04338732;
		}
		if(diasCigarrillo>=178 && diasCigarrillo <179) {
			gananciaPesoMujeres =  ((diasCigarrillo-178)*(0.04497951-0.04458146)) + 0.04458146;
		}
		if(diasCigarrillo>=179 && diasCigarrillo <180) {
			gananciaPesoMujeres =  ((diasCigarrillo-179)*(0.04497-0.04497951)) + 0.04497951;
		}
		if(diasCigarrillo>=179 && diasCigarrillo <180) {
			gananciaPesoMujeres =  ((diasCigarrillo-179)*(0.04497-0.04497951)) + 0.04497951;
		}
		if(diasCigarrillo>=180 && diasCigarrillo <181) {
			gananciaPesoMujeres =  ((diasCigarrillo-180)*(0.04617366-0.04497)) + 0.04497;
		}
		if(diasCigarrillo>=181 && diasCigarrillo <182) {
			gananciaPesoMujeres =  ((diasCigarrillo-181)*(0.04657171-0.04617366)) + 0.0617366;
		}
		if(diasCigarrillo>=182 && diasCigarrillo <183) {
			gananciaPesoMujeres =  ((diasCigarrillo-182)*(0.04776585-0.04657171)) + 0.04657171;
		}
		if(diasCigarrillo>=183 && diasCigarrillo <184) {
			gananciaPesoMujeres =  ((diasCigarrillo-183)*(0.0481639-0.01476585)) + 0.01476585;
		}
		if(diasCigarrillo>=184 && diasCigarrillo <185) {
			gananciaPesoMujeres =  ((diasCigarrillo-184)*(0.04816-0.0481639)) + 0.0481639;
		}
		if(diasCigarrillo>=185 && diasCigarrillo <186) {
			gananciaPesoMujeres =  ((diasCigarrillo-185)*(0.0481639-0.04816)) + 0.04816;
		}
		if(diasCigarrillo>=186 && diasCigarrillo <187) {
			gananciaPesoMujeres =  ((diasCigarrillo-186)*(0.04896-0.0481639)) + 0.04896;
		}
		if(diasCigarrillo>=187 && diasCigarrillo <188) {
			gananciaPesoMujeres =  ((diasCigarrillo-187)*(0.04935805-0.04896)) + 0.04896;
		}
		if(diasCigarrillo>=188 && diasCigarrillo <189) {
			gananciaPesoMujeres =  ((diasCigarrillo-188)*(0.05015415-0.04935805)) + 0.04935805;
		}
		if(diasCigarrillo>=189 && diasCigarrillo <190) {
			gananciaPesoMujeres =  ((diasCigarrillo-189)*(0.05015-0.05015415)) + 0.05015415;
		}
		if(diasCigarrillo>=190 && diasCigarrillo <191) {
			gananciaPesoMujeres =  ((diasCigarrillo-190)*(0.0505522-0.05015)) + 0.05015;
		}
		if(diasCigarrillo>=191 && diasCigarrillo <192) {
			gananciaPesoMujeres =  0.0505522;
		}
		if(diasCigarrillo>=192 && diasCigarrillo <193) {
			gananciaPesoMujeres =  ((diasCigarrillo-192)*(0.05134829-0.0505522)) + 0.0505522;
		}
		if(diasCigarrillo>=193 && diasCigarrillo <194) {
			gananciaPesoMujeres =  ((diasCigarrillo-193)*(0.05214439-0.05134829)) + 0.05134829;
		}
		if(diasCigarrillo>=194 && diasCigarrillo <195) {
			gananciaPesoMujeres =  ((diasCigarrillo-194)*(0.052144-0.05214439)) + 0.05214439;
		}
		if(diasCigarrillo>=195 && diasCigarrillo <196) {
			gananciaPesoMujeres =  ((diasCigarrillo-195)*(0.05294049-0.052144)) + 0.052144;
		}
		if(diasCigarrillo>=196 && diasCigarrillo <197) {
			gananciaPesoMujeres =  0.05294049;
		}
		if(diasCigarrillo>=198 && diasCigarrillo <199) {
			gananciaPesoMujeres =  ((diasCigarrillo-198)*(0.05453268-0.05373659)) + 0.05373659;
		}
		if(diasCigarrillo>=199 && diasCigarrillo <200) {
			gananciaPesoMujeres =  ((diasCigarrillo-199)*(0.05453-0.05453268)) + 0.05453268;
		}
		if(diasCigarrillo>=200 && diasCigarrillo <201) {
			gananciaPesoMujeres =  ((diasCigarrillo-200)*(0.055322878-0.05453)) + 0.05453;
		}
		if(diasCigarrillo>=201 && diasCigarrillo <202) {
			gananciaPesoMujeres =  ((diasCigarrillo-201)*(0.05572683-0.055322878)) + 0.055322878;
		}
		if(diasCigarrillo>=202 && diasCigarrillo <203) {
			gananciaPesoMujeres =  ((diasCigarrillo-202)*(0.05652293-0.05572683)) + 0.05572683;
		}
		if(diasCigarrillo>=203 && diasCigarrillo <204) {
			gananciaPesoMujeres =  ((diasCigarrillo-203)*(0.05692098-0.05652293)) + 0.05652293;
		}
		if(diasCigarrillo>=204 && diasCigarrillo <205) {
			gananciaPesoMujeres =  ((diasCigarrillo-204)*(0.0569-0.05692098)) + 0.05692098;
		}
		if(diasCigarrillo>=205 && diasCigarrillo <206) {
			gananciaPesoMujeres =  ((diasCigarrillo-205)*(0.05771707-0.0569)) + 0.0569;
		}
		if(diasCigarrillo>=206 && diasCigarrillo <207) {
			gananciaPesoMujeres =  ((diasCigarrillo-206)*(0.05811512-0.05771707)) + 0.05771707;
		}
		if(diasCigarrillo>=207 && diasCigarrillo <208) {
			gananciaPesoMujeres =  ((diasCigarrillo-20)*(0.05851317-0.05811512)) + 0.05811512;
		}
		if(diasCigarrillo>=208 && diasCigarrillo <209) {
			gananciaPesoMujeres =  ((diasCigarrillo-208)*(0.05891122-0.05851317)) + 0.05851317;
		}
		if(diasCigarrillo>=209 && diasCigarrillo <210) {
			gananciaPesoMujeres =  ((diasCigarrillo-209)*(0.058911-0.05891122)) + 0.05891122;
		}
		if(diasCigarrillo>=210 && diasCigarrillo <211) {
			gananciaPesoMujeres =  ((diasCigarrillo-210)*(0.05970732-0.058911)) + 0.058911;
		}
		if(diasCigarrillo>=211 && diasCigarrillo <212) {
			gananciaPesoMujeres =  ((diasCigarrillo-211)*(0.06010537-0.05970732)) + 0.05970732;
		}
		if(diasCigarrillo>=212 && diasCigarrillo <213) {
			gananciaPesoMujeres =  ((diasCigarrillo-212)*(0.06050341-0.06010537)) + 0.06010537;
		}
		if(diasCigarrillo>=213 && diasCigarrillo <214) {
			gananciaPesoMujeres =  ((diasCigarrillo-213)*(0.06090146-0.06050341)) + 0.06050341;
		}
		if(diasCigarrillo>=214 && diasCigarrillo <215) {
			gananciaPesoMujeres =  ((diasCigarrillo-214)*(0.06090-0.06090146)) + 0.06090146;
		}
		if(diasCigarrillo>=215 && diasCigarrillo <216) {
			gananciaPesoMujeres =  ((diasCigarrillo-215)*(0.06090146-0.06090)) + 0.06090;
		}
		if(diasCigarrillo>=216 && diasCigarrillo <217) {
			gananciaPesoMujeres =  ((diasCigarrillo-216)*(0.06129951-0.06090146)) + 0.06090146;
		}
		if(diasCigarrillo>=217 && diasCigarrillo <218) {
			gananciaPesoMujeres =  ((diasCigarrillo-217)*(0.0669756-0.06129951)) + 0.06129951;
		}
		if(diasCigarrillo>=218 && diasCigarrillo <219) {
			gananciaPesoMujeres =  ((diasCigarrillo-218)*(0.06169-0.0669756)) + 0.0669756;
		}
		if(diasCigarrillo>=219 && diasCigarrillo <220) {
			gananciaPesoMujeres =  ((diasCigarrillo-219)*(0.06209561-0.06169)) + 0.06169;
		}
		if(diasCigarrillo>=220 && diasCigarrillo <221) {
			gananciaPesoMujeres =  0.06209561;
		}
		if(diasCigarrillo>=221 && diasCigarrillo <222) {
			gananciaPesoMujeres =  ((diasCigarrillo-221)*(0.06289171-0.06209561)) + 0.06209561;
		}
		if(diasCigarrillo>=222 && diasCigarrillo <223) {
			gananciaPesoMujeres =  0.06289171;
		}
		if(diasCigarrillo>=223 && diasCigarrillo <224) {
			gananciaPesoMujeres =  ((diasCigarrillo-223)*(0.06289-0.06289171)) + 0.06289171;
		}
		if(diasCigarrillo>=224 && diasCigarrillo <225) {
			gananciaPesoMujeres =  ((diasCigarrillo-224)*(0.06328976-0.06289)) + 0.06289;
		}
		if(diasCigarrillo>=225 && diasCigarrillo <226) {
			gananciaPesoMujeres =  ((diasCigarrillo-225)*(0.00636878-0.06328976)) + 0.06328976;
		}
		if(diasCigarrillo>=226 && diasCigarrillo <227) {
			gananciaPesoMujeres =  ((diasCigarrillo-226)*(0.06408585-0.00636878)) + 0.00636878;
		}
		if(diasCigarrillo>=227 && diasCigarrillo <228) {
			gananciaPesoMujeres =  0.06408585;
		}
		if(diasCigarrillo>=228 && diasCigarrillo <229) {
			gananciaPesoMujeres =  ((diasCigarrillo-228)*(0.064085-0.6408585)) + 0.6408585;
		}
		if(diasCigarrillo>=229 && diasCigarrillo <230) {
			gananciaPesoMujeres =  ((diasCigarrillo-229)*(0.0644839-0.064085)) + 0.064085;
		}
		if(diasCigarrillo>=230 && diasCigarrillo <231) {
			gananciaPesoMujeres =  ((diasCigarrillo-230)*(0.06488195-0.0644839)) + 0.0644839;
		}
		if(diasCigarrillo>=231 && diasCigarrillo <232) {
			gananciaPesoMujeres =  ((diasCigarrillo-231)*(0.06528-0.06488195)) + 0.06488195;
		}
		if(diasCigarrillo>=232 && diasCigarrillo <234) {
			gananciaPesoMujeres =  0.06528;
		}
		if(diasCigarrillo>=234 && diasCigarrillo <235) {
			gananciaPesoMujeres =  ((diasCigarrillo-234)*(0.06567805-0.06528)) + 0.06528;
		}
		if(diasCigarrillo>=235 && diasCigarrillo <236) {
			gananciaPesoMujeres =  ((diasCigarrillo-235)*(0.0660761-0.06567805)) + 0.06567805;
		}
		if(diasCigarrillo>=236 && diasCigarrillo <237) {
			gananciaPesoMujeres =  0.0660761;
		}
		if(diasCigarrillo>=237 && diasCigarrillo <238) {
			gananciaPesoMujeres =  ((diasCigarrillo-237)*(0.0668722-0.0660761)) + 0.0660761;
		}
		if(diasCigarrillo>=238 && diasCigarrillo <239) {
			gananciaPesoMujeres =  ((diasCigarrillo-238)*(0.06687-0.0668722)) + 0.0668722;
		}
		if(diasCigarrillo>=239 && diasCigarrillo <240) {
			gananciaPesoMujeres =  ((diasCigarrillo-239)*(0.0668722-0.06687)) + 0.06687;
		}
		if(diasCigarrillo>=240 && diasCigarrillo <241) {
			gananciaPesoMujeres =  ((diasCigarrillo-240)*(0.06727024-0.0668722)) + 0.0668722;
		}
		if(diasCigarrillo>=241 && diasCigarrillo <242) {
			gananciaPesoMujeres =  ((diasCigarrillo-241)*(0.06766829-0.06727024)) + 0.06727024;
		}
		if(diasCigarrillo>=242 && diasCigarrillo <243) {
			gananciaPesoMujeres =  ((diasCigarrillo-242)*(0.06846439-0.06766829)) + 0.06766829;
		}
		if(diasCigarrillo>=243 && diasCigarrillo <244) {
			gananciaPesoMujeres =  ((diasCigarrillo-243)*(0.068464-0.06846439)) + 0.06846439;
		}
		if(diasCigarrillo>=244 && diasCigarrillo <245) {
			gananciaPesoMujeres =  ((diasCigarrillo-244)*(0.06846439-0.068464)) + 0.068464;
		}
		if(diasCigarrillo>=245 && diasCigarrillo <246) {
			gananciaPesoMujeres =  ((diasCigarrillo-245)*(0.06926049-0.06846439)) + 0.06846439;
		}
		if(diasCigarrillo>=246 && diasCigarrillo <247) {
			gananciaPesoMujeres =  ((diasCigarrillo-246)*(0.06965854-0.06926049)) + 0.06926049;
		}
		if(diasCigarrillo>=247 && diasCigarrillo <248) {
			gananciaPesoMujeres =  ((diasCigarrillo-247)*(0.07005659-0.06965854)) + 0.06965854;
		}
		if(diasCigarrillo>=248 && diasCigarrillo <249) {
			gananciaPesoMujeres =  ((diasCigarrillo-248)*(0.070056-0.07005659)) + 0.07005659;
		}
		if(diasCigarrillo>=249 && diasCigarrillo <250) {
			gananciaPesoMujeres =  ((diasCigarrillo-249)*(0.0704563-0.070056)) + 0.070056;
		}
		if(diasCigarrillo>=250 && diasCigarrillo <251) {
			gananciaPesoMujeres = 0.07045463;
		}
		if(diasCigarrillo>=251 && diasCigarrillo <252) {
			gananciaPesoMujeres =  ((diasCigarrillo-251)*(0.07085268-0.0704563)) + 0.0704563;
		}
		if(diasCigarrillo>=252 && diasCigarrillo <253) {
			gananciaPesoMujeres =  ((diasCigarrillo-252)*(0.07164878-0.07085268)) + 0.07085268;
		}
		if(diasCigarrillo>=253 && diasCigarrillo <254) {
			gananciaPesoMujeres =  ((diasCigarrillo-253)*(0.07164-0.07164878)) + 0.07164878;
		}
		if(diasCigarrillo>=254 && diasCigarrillo <255) {
			gananciaPesoMujeres =  ((diasCigarrillo-254)*(0.07164878-0.07164)) + 0.07164;
		}
		if(diasCigarrillo>=255 && diasCigarrillo <256) {
			gananciaPesoMujeres =  ((diasCigarrillo-255)*(0.07204683-0.07164878)) + 0.07164878;
		}
		if(diasCigarrillo>=256 && diasCigarrillo <257) {
			gananciaPesoMujeres = 0.07204683;
		}
		if(diasCigarrillo>=257 && diasCigarrillo <258) {
			gananciaPesoMujeres =  ((diasCigarrillo-257)*(0.07244488-0.07204683)) + 0.07204683;
		}
		if(diasCigarrillo>=258 && diasCigarrillo <259) {
			gananciaPesoMujeres =  ((diasCigarrillo-258)*(0.072444-0.07244488)) + 0.07244488;
		}
		if(diasCigarrillo>=259 && diasCigarrillo <260) {
			gananciaPesoMujeres =  ((diasCigarrillo-259)*(0.07244488-0.072444)) + 0.072444;
		}
		if(diasCigarrillo>=260 && diasCigarrillo <261) {
			gananciaPesoMujeres =  ((diasCigarrillo-260)*(0.07284293-0.07244488)) + 0.07244488;
		}
		if(diasCigarrillo>=261 && diasCigarrillo <262) {
			gananciaPesoMujeres =  ((diasCigarrillo-261)*(0.07324098-0.07284293)) + 0.07284293;
		}
		if(diasCigarrillo>=262 && diasCigarrillo <263) {
			gananciaPesoMujeres =  0.07324098;
		}
		if(diasCigarrillo>=263 && diasCigarrillo <264) {
			gananciaPesoMujeres =  ((diasCigarrillo-263)*(0.073240-0.07324098)) + 0.07324098;
		}
		if(diasCigarrillo>=264 && diasCigarrillo <265) {
			gananciaPesoMujeres =  ((diasCigarrillo-264)*(0.07363902-0.073240)) + 0.073240;
		}
		if(diasCigarrillo>=265 && diasCigarrillo <267) {
			gananciaPesoMujeres =  0.07363902;
		}
		if(diasCigarrillo>=267 && diasCigarrillo <268) {
			gananciaPesoMujeres =  ((diasCigarrillo-267)*(0.07403707-0.07363902)) + 0.07363902;
		}
		if(diasCigarrillo>=268 && diasCigarrillo <269) {
			gananciaPesoMujeres =  ((diasCigarrillo-268)*(0.07403707-0.07363902)) + 0.07363902;
		}
		if(diasCigarrillo>=269 && diasCigarrillo <270) {
			gananciaPesoMujeres =  ((diasCigarrillo-269)*(0.07443512-0.07403707)) + 0.07403707;
		}
		if(diasCigarrillo>=270 && diasCigarrillo <272) {
			gananciaPesoMujeres =  0.07443512;
		}
		if(diasCigarrillo>=272 && diasCigarrillo <273) {
			gananciaPesoMujeres =  ((diasCigarrillo-272)*(0.07483317-0.07443512)) + 0.07443512;
		}
		if(diasCigarrillo>=273 && diasCigarrillo <274) {
			gananciaPesoMujeres =  ((diasCigarrillo-272)*(0.075-0.07483317)) + 0.07483317;
		}
		if(diasCigarrillo>=274 && diasCigarrillo <275) {
			gananciaPesoMujeres =  ((diasCigarrillo-274)*(0.07523122-0.075)) + 0.075;
		}
		if(diasCigarrillo>=275 && diasCigarrillo <276) {
			gananciaPesoMujeres = 0.07523122;
		}
		if(diasCigarrillo>=276 && diasCigarrillo <277) {
			gananciaPesoMujeres =  ((diasCigarrillo-276)*(0.07562927-0.07523122)) + 0.07523122;
		}
		if(diasCigarrillo>=277 && diasCigarrillo <278) {
			gananciaPesoMujeres =0.07562927;
		}
		if(diasCigarrillo>=278 && diasCigarrillo <279) {
			gananciaPesoMujeres =  ((diasCigarrillo-278)*(0.07562-0.07562927)) + 0.07562927;
		}
		if(diasCigarrillo>=279 && diasCigarrillo <280) {
			gananciaPesoMujeres =  ((diasCigarrillo-279)*(0.07602732-0.07562)) + 0.07562;
		}
		if(diasCigarrillo>=280 && diasCigarrillo <282) {
			gananciaPesoMujeres =  0.07602732;		
		}
		if(diasCigarrillo>=282 && diasCigarrillo <283) {
			gananciaPesoMujeres =  ((diasCigarrillo-280)*(0.07642537-0.07602732)) + 0.07602732;		
		}
		if(diasCigarrillo>=283 && diasCigarrillo <284) {
			gananciaPesoMujeres =  ((diasCigarrillo-283)*(0.0764-0.07642537)) + 0.07642537;		
		}
		if(diasCigarrillo>=284 && diasCigarrillo <285) {
			gananciaPesoMujeres =  ((diasCigarrillo-284)*(0.07682341-0.0764)) + 0.0764;		
		}
		if(diasCigarrillo>=285 && diasCigarrillo <287) {
			gananciaPesoMujeres =  0.07682341;		
		}
		if(diasCigarrillo>=287 && diasCigarrillo <288) {
			gananciaPesoMujeres =  ((diasCigarrillo-287)*(0.07722146-0.07682341)) +0.07682341;		
		}
		if(diasCigarrillo>=288 && diasCigarrillo <289) {
			gananciaPesoMujeres =  ((diasCigarrillo-288)*(0.07722-0.07722146)) + 0.07722146;		
		}
		if(diasCigarrillo>=289 && diasCigarrillo <290) {
			gananciaPesoMujeres =  ((diasCigarrillo-289)*(0.07722146-0.07722)) + 0.07722;		
		}
		if(diasCigarrillo>=290 && diasCigarrillo <292) {
			gananciaPesoMujeres = 0.07722146;		
		}
		if(diasCigarrillo>=292 && diasCigarrillo <293) {
			gananciaPesoMujeres =  ((diasCigarrillo-292)*(0.07722-0.07722146)) + 0.07722146;		
		}
		if(diasCigarrillo>=293 && diasCigarrillo <294) {
			gananciaPesoMujeres =  ((diasCigarrillo-293)*(0.07761951-0.07722)) + 0.07722;		
		}
		if(diasCigarrillo>=294 && diasCigarrillo <295) {
			gananciaPesoMujeres =  0.07761951;		
		}
		if(diasCigarrillo>=295 && diasCigarrillo <296) {
			gananciaPesoMujeres =  ((diasCigarrillo-295)*(0.07801756-0.07761951)) + 0.07761951;		
		}
		if(diasCigarrillo>=296 && diasCigarrillo <297) {
			gananciaPesoMujeres = 0.07801756;		
		}
		if(diasCigarrillo>=297 && diasCigarrillo <298) {
			gananciaPesoMujeres =  ((diasCigarrillo-297)*(0.0780-0.07801756)) + 0.07801756;		
		}
		if(diasCigarrillo>=298 && diasCigarrillo <299) {
			gananciaPesoMujeres =  ((diasCigarrillo-298)*(0.07841561-0.0780)) + 0.0780;		
		}
		if(diasCigarrillo>=299 && diasCigarrillo <302) {
			gananciaPesoMujeres =  0.07841561;		
		}
		if(diasCigarrillo>=302 && diasCigarrillo <303) {
			gananciaPesoMujeres =  ((diasCigarrillo-302)*(0.07805-0.07841561)) + 0.07841561;		
		}
		if(diasCigarrillo>=303 && diasCigarrillo <304) {
			gananciaPesoMujeres =  ((diasCigarrillo-303)*(0.07841561-0.7805)) + 0.07805;		
		}
		if(diasCigarrillo>=304 && diasCigarrillo <306) {
			gananciaPesoMujeres =  0.07841561;		
		}
		if(diasCigarrillo>=306 && diasCigarrillo <307) {
			gananciaPesoMujeres =  ((diasCigarrillo-306)*(0.07881366-0.07841561)) + 0.07841561;		
		}
		if(diasCigarrillo>=307 && diasCigarrillo <308) {
			gananciaPesoMujeres =  ((diasCigarrillo-307)*(0.07805-0.07881366)) + 0.07881366;		
		}
		if(diasCigarrillo>=308 && diasCigarrillo <309) {
			gananciaPesoMujeres =  ((diasCigarrillo-308)*(0.07881366-0.07805)) + 0.07805;		
		}
		if(diasCigarrillo>=309 && diasCigarrillo <312) {
			gananciaPesoMujeres =  0.07881366;		
		}
		if(diasCigarrillo>=312 && diasCigarrillo <313) {
			gananciaPesoMujeres =  ((diasCigarrillo-312)*(0.07805-0.07881366)) + 0.07881366;		
		}
		if(diasCigarrillo>=313 && diasCigarrillo <314) {
			gananciaPesoMujeres =  ((diasCigarrillo-313)*(0.07881366-0.07805)) + 0.07805;		
		}
		if(diasCigarrillo>=314 && diasCigarrillo <315) {
			gananciaPesoMujeres =  ((diasCigarrillo-314)*(0.07921171-0.07881366)) + 0.07881366;		
		}
		if(diasCigarrillo>=315 && diasCigarrillo <317) {
			gananciaPesoMujeres =  0.07921171;		
		}
		if(diasCigarrillo>=317 && diasCigarrillo <318) {
			gananciaPesoMujeres =  ((diasCigarrillo-317)*(0.079059-0.07921171)) + 0.07921171;		
		}
		if(diasCigarrillo>=318 && diasCigarrillo <319) {
			gananciaPesoMujeres =  ((diasCigarrillo-318)*(0.07921171-0.079059)) + 0.079059;		
		}
		if(diasCigarrillo>=319 && diasCigarrillo <320) {
			gananciaPesoMujeres =  ((diasCigarrillo-319)*(0.079816-0.07921171)) + 0.07921171;		
		}
		if(diasCigarrillo>=320 && diasCigarrillo <321) {
			gananciaPesoMujeres =  ((diasCigarrillo-320)*(0.07921171-0.079816)) + 0.079816;		
		}
		if(diasCigarrillo>=321 && diasCigarrillo <322) {
			gananciaPesoMujeres =  0.07921171;		
		}
		if(diasCigarrillo>=322 && diasCigarrillo <323) {
			gananciaPesoMujeres =  ((diasCigarrillo-322)*(0.08059-0.07921171)) + 0.07921171;		
		}
		if(diasCigarrillo>=323 && diasCigarrillo <324) {
			gananciaPesoMujeres =  ((diasCigarrillo-323)*(0.07921171-0.08059)) + 0.08059;		
		}
		if(diasCigarrillo>=324 && diasCigarrillo <326) {
			gananciaPesoMujeres = 0.07921171;		
		}
		if(diasCigarrillo>=326 && diasCigarrillo <327) {
			gananciaPesoMujeres =  ((diasCigarrillo-324)*(0.08038833-0.07921171)) + 0.07921171;		
		}
		if(diasCigarrillo>=327 && diasCigarrillo <328) {
			gananciaPesoMujeres =  ((diasCigarrillo-327)*(0.08059-0.08038833)) + 0.08038833;		
		}
		if(diasCigarrillo>=328 && diasCigarrillo <329) {
			gananciaPesoMujeres =  ((diasCigarrillo-328)*(0.08038833-0.08059)) + 0.08059;		
		}
		if(diasCigarrillo>=329 && diasCigarrillo <330) {
			gananciaPesoMujeres = 0.08038833;		
		}
		if(diasCigarrillo>=330 && diasCigarrillo <331) {
			gananciaPesoMujeres =  ((diasCigarrillo-330)*(0.08079027-0.08038833)) + 0.08038833;		
		}
		if(diasCigarrillo>=331 && diasCigarrillo <332) {
			gananciaPesoMujeres =  0.08079027;		
		}
		if(diasCigarrillo>=332 && diasCigarrillo <333) {
			gananciaPesoMujeres =  ((diasCigarrillo-332)*(0.081-0.08079027)) + 0.08079027;		
		}
		if(diasCigarrillo>=333 && diasCigarrillo <334) {
			gananciaPesoMujeres =  ((diasCigarrillo-333)*(0.08079027-0.081)) + 0.081;		
		}
		if(diasCigarrillo>=334 && diasCigarrillo <335) {
			gananciaPesoMujeres =  ((diasCigarrillo-334)*(0.0808039-0.08079027)) + 0.08079027;		
		}
		if(diasCigarrillo>=335 && diasCigarrillo <336) {
			gananciaPesoMujeres =  ((diasCigarrillo-335)*(0.08079027-0.0808039)) + 0.0808039;		
		}
		if(diasCigarrillo>=336 && diasCigarrillo <337) {
			gananciaPesoMujeres =  ((diasCigarrillo-335)*(0.08120195-0.08079027)) + 0.08079027;		
		}
		if(diasCigarrillo>=337 && diasCigarrillo <338) {
			gananciaPesoMujeres =  ((diasCigarrillo-337)*(0.081-0.08120195)) + 0.08120195;		
		}
		if(diasCigarrillo>=338 && diasCigarrillo <339) {
			gananciaPesoMujeres =  ((diasCigarrillo-337)*(0.08179027-0.081)) + 0.081;		
		}
		if(diasCigarrillo>=339 && diasCigarrillo <340) {
			gananciaPesoMujeres = 0.08179027;		
		}
		if(diasCigarrillo>=340 && diasCigarrillo <341) {
			gananciaPesoMujeres =  ((diasCigarrillo-340)*(0.08120195-0.08179027)) + 0.08179027;		
		}
		if(diasCigarrillo>=341 && diasCigarrillo <342) {
			gananciaPesoMujeres =  ((diasCigarrillo-341)*(0.081119222-0.08120195)) + 0.08120195;		
		}
		if(diasCigarrillo>=342 && diasCigarrillo <343) {
			gananciaPesoMujeres =  ((diasCigarrillo-342)*(0.081-0.081119222)) + 0.081119222;		
		}
		if(diasCigarrillo>=343 && diasCigarrillo <344) {
			gananciaPesoMujeres =  ((diasCigarrillo-343)*(0.08119222-0.081)) + 0.081;		
		}
		if(diasCigarrillo>=344 && diasCigarrillo <345) {
			gananciaPesoMujeres =  ((diasCigarrillo-344)*(0.08159416-0.08119222)) + 0.08119222;		
		}
		if(diasCigarrillo>=345 && diasCigarrillo <346) {
			gananciaPesoMujeres =  ((diasCigarrillo-345)*(0.081-0.08159416)) + 0.08159416;		
		}
		if(diasCigarrillo>=346 && diasCigarrillo <349) {
			gananciaPesoMujeres =  0.081;		
		}
		if(diasCigarrillo>=349 && diasCigarrillo <350) {
			gananciaPesoMujeres =  ((diasCigarrillo-349)*(0.0816-0.081)) + 0.081;		
		}
		if(diasCigarrillo>=350 && diasCigarrillo <367) {
			gananciaPesoMujeres =  0.0816;		
		}
		if(diasCigarrillo>=367 && diasCigarrillo <368) {
			gananciaPesoMujeres =  ((diasCigarrillo-367)*(0.0817-0.0816)) + 0.0816;		
		}
		if(diasCigarrillo>=368 && diasCigarrillo <377) {
			gananciaPesoMujeres =  0.0817;		
		}
		if(diasCigarrillo>=377 && diasCigarrillo <378) {
			gananciaPesoMujeres =  ((diasCigarrillo-377)*(0.0817561-0.0817)) + 0.0817;		
		}
		if(diasCigarrillo>=378 && diasCigarrillo <380) {
			gananciaPesoMujeres =  0.0817561;		
		}
		if(diasCigarrillo>=380 && diasCigarrillo <381) {
			gananciaPesoMujeres =  ((diasCigarrillo-380)*(0.08183415-0.0817561)) + 0.0817561;		
		}
		if(diasCigarrillo>=381 && diasCigarrillo <382) {
			gananciaPesoMujeres =  ((diasCigarrillo-381)*(0.08183-0.08183415)) + 0.08183415;		
		}
		if(diasCigarrillo>=382 && diasCigarrillo <383) {
			gananciaPesoMujeres =  ((diasCigarrillo-381)*(0.08183425-0.08183)) + 0.08183;		
		}
		if(diasCigarrillo>=383 && diasCigarrillo <384) {
			gananciaPesoMujeres =  ((diasCigarrillo-383)*(0.0819122-0.08183425)) + 0.08183425;		
		}
		if(diasCigarrillo>=384 && diasCigarrillo <386) {
			gananciaPesoMujeres =  0.0819122;		
		}
		if(diasCigarrillo>=386 && diasCigarrillo <387) {
			gananciaPesoMujeres =  ((diasCigarrillo-386)*(0.08191-0.0819122)) + 0.0819122;		
		}
		if(diasCigarrillo>=387 && diasCigarrillo <388) {
			gananciaPesoMujeres =  ((diasCigarrillo-387)*(0.0819122-0.08191)) + 0.08191;		
		}
		if(diasCigarrillo>=388 && diasCigarrillo <389) {
			gananciaPesoMujeres =  0.0819122;		
		}
		if(diasCigarrillo>=389 && diasCigarrillo <390) {
			gananciaPesoMujeres =  ((diasCigarrillo-389)*(0.08199024-0.0819122)) + 0.0819122;		
		}
		if(diasCigarrillo>=390 && diasCigarrillo <391) {
			gananciaPesoMujeres =  ((diasCigarrillo-390)*(0.081990-0.08199024)) + 0.08199024;		
		}
		if(diasCigarrillo>=391 && diasCigarrillo <392) {
			gananciaPesoMujeres =  ((diasCigarrillo-391)*(0.08199024-0.081990)) + 0.081990;		
		}
		if(diasCigarrillo>=392 && diasCigarrillo <395) {
			gananciaPesoMujeres = 0.08199024;		
		}
		if(diasCigarrillo>=395 && diasCigarrillo <396) {
			gananciaPesoMujeres =  ((diasCigarrillo-395)*(0.0819902-0.08199024)) + 0.08199024;		
		}
		if(diasCigarrillo>=396 && diasCigarrillo <397) {
			gananciaPesoMujeres =  ((diasCigarrillo-396)*(0.08206829-0.0819902)) + 0.0819902 ;		
		}
		if(diasCigarrillo>=397 && diasCigarrillo <399) {
			gananciaPesoMujeres =  0.08206829 ;		
		}
		if(diasCigarrillo>=399 && diasCigarrillo <400) {
			gananciaPesoMujeres =  ((diasCigarrillo-399)*(0.081068-0.08206829)) + 0.08206829 ;		
		}
		if(diasCigarrillo>=400 && diasCigarrillo <401) {
			gananciaPesoMujeres =  ((diasCigarrillo-400)*(0.0821634-0.081068)) + 0.081068 ;		
		}
		if(diasCigarrillo>=401 && diasCigarrillo <402) {
			gananciaPesoMujeres =  0.0821634;		
		}
		if(diasCigarrillo>=402 && diasCigarrillo <403) {
			gananciaPesoMujeres =  ((diasCigarrillo-402)*(0.08222439-0.0821634)) + 0.0821634;		
		}
		if(diasCigarrillo>=403 && diasCigarrillo <404) {
			gananciaPesoMujeres = 0.08222439;		
		}
		if(diasCigarrillo>=404 && diasCigarrillo <405) {
			gananciaPesoMujeres =  ((diasCigarrillo-404)*(0.08222-0.08222439)) + 0.08222439;		
		}
		if(diasCigarrillo>=405 && diasCigarrillo <406) {
			gananciaPesoMujeres =  ((diasCigarrillo-405)*(0.08222439-0.08222)) + 0.08222;		
		}
		if(diasCigarrillo>=406 && diasCigarrillo <407) {
			gananciaPesoMujeres =  ((diasCigarrillo-406)*(0.08230244-0.08222439)) + 0.08222439;		
		}
		if(diasCigarrillo>=407 && diasCigarrillo <408) {
			gananciaPesoMujeres =  ((diasCigarrillo-407)*(0.08238049-0.08230244)) + 0.08230244;		
		}
		if(diasCigarrillo>=408 && diasCigarrillo <409) {
			gananciaPesoMujeres =  ((diasCigarrillo-408)*(0.082380-0.08238049)) + 0.08238049;		
		}
		if(diasCigarrillo>=409 && diasCigarrillo <410) {
			gananciaPesoMujeres =  ((diasCigarrillo-409)*(0.08245854-0.082380)) + 0.082380;		
		}
		if(diasCigarrillo>=410 && diasCigarrillo <415) {
			gananciaPesoMujeres =  0.08245854;		
		}
		if(diasCigarrillo>=415 && diasCigarrillo <416) {
			gananciaPesoMujeres =  ((diasCigarrillo-415)*(0.08253659-0.08245854)) + 0.08245854;		
		}
		if(diasCigarrillo>=416 && diasCigarrillo <417) {
			gananciaPesoMujeres = 0.08253659;		
		}
		if(diasCigarrillo>=417 && diasCigarrillo <418) {
			gananciaPesoMujeres =  ((diasCigarrillo-417)*(0.0825365-0.08253659)) + 0.08253659;		
		}
		if(diasCigarrillo>=418 && diasCigarrillo <419) {
			gananciaPesoMujeres =  ((diasCigarrillo-418)*(0.08261463-0.0825365)) + 0.0825365;		
		}
		if(diasCigarrillo>=419 && diasCigarrillo <421) {
			gananciaPesoMujeres = 0.08261463;		
		}
		if(diasCigarrillo>=421 && diasCigarrillo <422) {
			gananciaPesoMujeres =  ((diasCigarrillo-421)*(0.08269268-0.08261463)) + 0.08261463;		
		}
		if(diasCigarrillo>=422 && diasCigarrillo <424) {
			gananciaPesoMujeres =  0.08269268;		
		}
		if(diasCigarrillo>=424 && diasCigarrillo <425) {
			gananciaPesoMujeres =  ((diasCigarrillo-424)*(0.08277073-0.08269268)) + 0.08269268;		
		}
		if(diasCigarrillo>=425 && diasCigarrillo <426) {
			gananciaPesoMujeres =  0.08277073;		
		}
		if(diasCigarrillo>=426 && diasCigarrillo <427) {
			gananciaPesoMujeres =  ((diasCigarrillo-426)*(0.08284878-0.08277073)) + 0.08277073;		
		}
		if(diasCigarrillo>=427 && diasCigarrillo <429) {
			gananciaPesoMujeres = 0.08284878;		
		}
		if(diasCigarrillo>=429 && diasCigarrillo <430) {
			gananciaPesoMujeres =  ((diasCigarrillo-429)*(0.08292683-0.08284878)) + 0.08284878;		
		}
		if(diasCigarrillo>=430 && diasCigarrillo <431) {
			gananciaPesoMujeres =  0.08292683;		
		}
		if(diasCigarrillo>=431 && diasCigarrillo <432) {
			gananciaPesoMujeres =  ((diasCigarrillo-431)*(0.0829268-0.08292683)) + 0.08292683;		
		}
		if(diasCigarrillo>=432 && diasCigarrillo <433) {
			gananciaPesoMujeres =  ((diasCigarrillo-432)*(0.08292683-0.0829268)) + 0.0829268;		
		}
		if(diasCigarrillo>=433 && diasCigarrillo <434) {
			gananciaPesoMujeres =  ((diasCigarrillo-433)*(0.08300488-0.08292683)) + 0.08292683;		
		}
		if(diasCigarrillo>=434 && diasCigarrillo <435) {
			gananciaPesoMujeres =  ((diasCigarrillo-434)*(0.08308293-0.08300488)) + 0.08300488;		
		}
		if(diasCigarrillo>=435 && diasCigarrillo <436) {
			gananciaPesoMujeres =  0.08308293;		
		}
		if(diasCigarrillo>=436 && diasCigarrillo <437) {
			gananciaPesoMujeres =  ((diasCigarrillo-436)*(0.083082-0.08308293)) + 0.08308293;		
		}
		if(diasCigarrillo>=437 && diasCigarrillo <438) {
			gananciaPesoMujeres =  ((diasCigarrillo-437)*(0.08316098-0.083082)) + 0.083082;		
		}
		if(diasCigarrillo>=438 && diasCigarrillo <439) {
			gananciaPesoMujeres =  0.08316098;		
		}
		if(diasCigarrillo>=439 && diasCigarrillo <440) {
			gananciaPesoMujeres =  ((diasCigarrillo-439)*(0.08323902-0.08323902)) + 0.08323902;		
		}
		if(diasCigarrillo>=440 && diasCigarrillo <441) {
			gananciaPesoMujeres =  ((diasCigarrillo-440)*(0.083239-0.08323902)) + 0.08323902;		
		}
		if(diasCigarrillo>=441 && diasCigarrillo <442) {
			gananciaPesoMujeres =  ((diasCigarrillo-440)*(0.08323902-0.083239)) + 0.083239;		
		}
		if(diasCigarrillo>=442 && diasCigarrillo <443) {
			gananciaPesoMujeres = 0.08323902;		
		}
		if(diasCigarrillo>=443 && diasCigarrillo <444) {
			gananciaPesoMujeres =  ((diasCigarrillo-443)*(0.08339512-0.08323902)) + 0.08323902;		
		}
		if(diasCigarrillo>=444 && diasCigarrillo <445) {
			gananciaPesoMujeres = 0.08339512;		
		}
		if(diasCigarrillo>=445 && diasCigarrillo <446) {
			gananciaPesoMujeres =  ((diasCigarrillo-445)*(0.08339-0.08339512)) + 0.08339512;		
		}
		if(diasCigarrillo>=446 && diasCigarrillo <447) {
			gananciaPesoMujeres =  ((diasCigarrillo-446)*(0.08347317-0.08339)) + 0.08339;		
		}
		if(diasCigarrillo>=447 && diasCigarrillo <448) {
			gananciaPesoMujeres = 0.08347317;		
		}
		if(diasCigarrillo>=448 && diasCigarrillo <449) {
			gananciaPesoMujeres =  ((diasCigarrillo-448)*(0.08355122-0.08347317)) + 0.8347317;		
		}
		if(diasCigarrillo>=449 && diasCigarrillo <450) {
			gananciaPesoMujeres =  ((diasCigarrillo-449)*(0.08355-0.08355122)) + 0.08355122;		
		}
		if(diasCigarrillo>=450 && diasCigarrillo <451) {
			gananciaPesoMujeres =  ((diasCigarrillo-450)*(0.08355122-0.08355)) + 0.08355;		
		}
		if(diasCigarrillo>=451 && diasCigarrillo <452) {
			gananciaPesoMujeres =  ((diasCigarrillo-451)*(0.083362927-0.08355122)) + 0.08355122;		
		}
		if(diasCigarrillo>=452 && diasCigarrillo <453) {
			gananciaPesoMujeres =  ((diasCigarrillo-452)*(0.08370732-0.083362927)) + 0.083362927 ;		
		}
		if(diasCigarrillo>=453 && diasCigarrillo <454) {
			gananciaPesoMujeres = 0.08370732;		
		}
		if(diasCigarrillo>=454 && diasCigarrillo <455) {
			gananciaPesoMujeres =  ((diasCigarrillo-454)*(0.083707-0.08370732)) + 0.08370732;		
		}
		if(diasCigarrillo>=455 && diasCigarrillo <456) {
			gananciaPesoMujeres =  ((diasCigarrillo-455)*(0.08378537-0.083707)) + 0.083707;		
		}
		if(diasCigarrillo>=456 && diasCigarrillo <458) {
			gananciaPesoMujeres = 0.08378537;		
		}
		if(diasCigarrillo>=458 && diasCigarrillo <459) {
			gananciaPesoMujeres =  ((diasCigarrillo-458)*(0.08386341-0.08378537)) + 0.08378537;		
		}
		if(diasCigarrillo>=459 && diasCigarrillo <460) {
			gananciaPesoMujeres =  ((diasCigarrillo-459)*(0.083863-0.08386341)) + 0.08386341;		
		}
		if(diasCigarrillo>=460 && diasCigarrillo <461) {
			gananciaPesoMujeres =  ((diasCigarrillo-460)*(0.08386341-0.083863)) + 0.083863;		
		}
		if(diasCigarrillo>=461 && diasCigarrillo <462) {
			gananciaPesoMujeres =  0.08386341;		
		}
		if(diasCigarrillo>=462 && diasCigarrillo <463) {
			gananciaPesoMujeres =  ((diasCigarrillo-462)*(0.08394146-0.08386341)) + 0.08386341;		
		}
		if(diasCigarrillo>=463 && diasCigarrillo <464) {
			gananciaPesoMujeres = 0.08394146;		
		}
		if(diasCigarrillo>=464 && diasCigarrillo <465) {
			gananciaPesoMujeres =  ((diasCigarrillo-464)*(0.08401951-0.08394146)) + 0.08394146;		
		}
		if(diasCigarrillo>=465 && diasCigarrillo <466) {
			gananciaPesoMujeres =  0.08401951;		
		}
		if(diasCigarrillo>=466 && diasCigarrillo <467) {
			gananciaPesoMujeres =  ((diasCigarrillo-466)*(0.08409756-0.08401951)) + 0.08401951;		
		}
		if(diasCigarrillo>=467 && diasCigarrillo <468) {
			gananciaPesoMujeres = 0.08409756;		
		}
		if(diasCigarrillo>=468 && diasCigarrillo <469) {
			gananciaPesoMujeres =  ((diasCigarrillo-468)*(0.084097-0.08409756)) + 0.08409756;		
		}
		if(diasCigarrillo>=469 && diasCigarrillo <470) {
			gananciaPesoMujeres =  ((diasCigarrillo-469)*(0.08417561-0.084097)) + 0.084097;		
		}
		if(diasCigarrillo>=470 && diasCigarrillo <471) {
			gananciaPesoMujeres =  0.08417561;		
		}
		if(diasCigarrillo>=471 && diasCigarrillo <472) {
			gananciaPesoMujeres =  ((diasCigarrillo-471)*(0.08425366-0.08417561)) + 0.08417561;		
		}
		if(diasCigarrillo>=472 && diasCigarrillo <473) {
			gananciaPesoMujeres =  ((diasCigarrillo-472)*(0.08425-0.08425366)) + 0.08425366;		
		}
		if(diasCigarrillo>=473 && diasCigarrillo <474) {
			gananciaPesoMujeres =  ((diasCigarrillo-473)*(0.08425366-0.08425)) + 0.08425;		
		}
		if(diasCigarrillo>=474 && diasCigarrillo <475) {
			gananciaPesoMujeres =  ((diasCigarrillo-474)*(0.08433171-0.08425366)) + 0.08425366;		
		}
		if(diasCigarrillo>=475 && diasCigarrillo <476) {
			gananciaPesoMujeres =  ((diasCigarrillo-475)*(0.084440976-0.08433171)) + 0.08433171;		
		}
		if(diasCigarrillo>=476 && diasCigarrillo <477) {
			gananciaPesoMujeres =  ((diasCigarrillo-476)*(0.0844878-0.084440976)) +0.084440976;		
		}
		if(diasCigarrillo>=477 && diasCigarrillo <478) {
			gananciaPesoMujeres =  ((diasCigarrillo-477)*(0.08448-0.0844878)) + 0.0844878;		
		}
		if(diasCigarrillo>=478 && diasCigarrillo <479) {
			gananciaPesoMujeres =  ((diasCigarrillo-478)*(0.0844878-0.08448)) + 0.08448;		
		}
		if(diasCigarrillo>=479 && diasCigarrillo <480) {
			gananciaPesoMujeres =  0.0844878;		
		}
		if(diasCigarrillo>=480 && diasCigarrillo <481) {
			gananciaPesoMujeres =  ((diasCigarrillo-480)*(0.0846439-0.0844878)) + 0.0844878;		
		}
		if(diasCigarrillo>=481 && diasCigarrillo <482) {
			gananciaPesoMujeres =  ((diasCigarrillo-481)*(0.08464-0.0846439)) + 0.0846439;		
		}
		if(diasCigarrillo>=482 && diasCigarrillo <483) {
			gananciaPesoMujeres =  ((diasCigarrillo-482)*(0.08461439-0.08464)) + 0.08464;		
		}
		if(diasCigarrillo>=482 && diasCigarrillo <483) {
			gananciaPesoMujeres =  ((diasCigarrillo-482)*(0.08461439-0.08464)) + 0.08464;		
		}
		if(diasCigarrillo>=483 && diasCigarrillo <484) {
			gananciaPesoMujeres =  ((diasCigarrillo-483)*(0.08472195-0.08461439)) + 0.08461439;		
		}
		if(diasCigarrillo>=484 && diasCigarrillo <485) {
			gananciaPesoMujeres =  ((diasCigarrillo-484)*(0.0847219-0.08472195)) + 0.08472195;		
		}
		if(diasCigarrillo>=485 && diasCigarrillo <486) {
			gananciaPesoMujeres =  ((diasCigarrillo-485)*(0.08487805-0.0847219)) + 0.0847219;		
		}
		if(diasCigarrillo>=486 && diasCigarrillo <487) {
			gananciaPesoMujeres =  ((diasCigarrillo-486)*(0.084878-0.08487805)) + 0.08487805;		
		}
		if(diasCigarrillo>=487 && diasCigarrillo <488) {
			gananciaPesoMujeres =  ((diasCigarrillo-487)*(0.0849561-0.084878)) + 0.084878;		
		}
		if(diasCigarrillo>=488 && diasCigarrillo <489) {
			gananciaPesoMujeres =  ((diasCigarrillo-488)*(0.08503415-0.0849561)) + 0.0849561;		
		}
		if(diasCigarrillo>=489 && diasCigarrillo <490) {
			gananciaPesoMujeres =  ((diasCigarrillo-489)*(0.0851122-0.08503415)) + 0.08503415;		
		}
		if(diasCigarrillo>=490 && diasCigarrillo <492) {
			gananciaPesoMujeres = 0.0851122;		
		}
		if(diasCigarrillo>=492 && diasCigarrillo <493) {
			gananciaPesoMujeres =  ((diasCigarrillo-490)*(0.08509024-0.0851122)) + 0.0851122;		
		}
		if(diasCigarrillo>=493 && diasCigarrillo <494) {
			gananciaPesoMujeres =  ((diasCigarrillo-493)*(0.08526829-0.08509024)) +0.08509024;		
		}
		if(diasCigarrillo>=494 && diasCigarrillo <495) {
			gananciaPesoMujeres = 0.08526829;		
		}
		if(diasCigarrillo>=495 && diasCigarrillo <496) {
			gananciaPesoMujeres =  ((diasCigarrillo-495)*(0.085268-0.08526829)) + 0.08526829;		
		}
		if(diasCigarrillo>=496 && diasCigarrillo <497) {
			gananciaPesoMujeres =  ((diasCigarrillo-496)*(0.08534634-0.085268)) + 0.085268;		
		}
		if(diasCigarrillo>=497 && diasCigarrillo <498) {
			gananciaPesoMujeres =  ((diasCigarrillo-497)*(0.08542439-0.08534634)) + 0.08534634;		
		}
		if(diasCigarrillo>=498 && diasCigarrillo <499) {
			gananciaPesoMujeres =  ((diasCigarrillo-498)*(0.08550244-0.08542439)) + 0.08542439;		
		}
		if(diasCigarrillo>=499 && diasCigarrillo <500) {
			gananciaPesoMujeres =  ((diasCigarrillo-499)*(0.08558049-0.08550244)) + 0.08550244;		
		}
		if(diasCigarrillo>=500 && diasCigarrillo <501) {
			gananciaPesoMujeres =  ((diasCigarrillo-500)*(0.085580-0.08558049)) +0.08558049;		
		}
		if(diasCigarrillo>=501 && diasCigarrillo <502) {
			gananciaPesoMujeres =  ((diasCigarrillo-501)*(0.08565854-0.085580)) + 0.085580;		
		}
		if(diasCigarrillo>=502 && diasCigarrillo <503) {
			gananciaPesoMujeres =  ((diasCigarrillo-502)*(0.08573659-0.08565854)) + 0.08565854;		
		}
		if(diasCigarrillo>=503 && diasCigarrillo <504) {
			gananciaPesoMujeres =  0.08573659;		
		}
		if(diasCigarrillo>=504 && diasCigarrillo <505) {
			gananciaPesoMujeres =  ((diasCigarrillo-504)*(0.085736-0.08573659)) + 0.08573659;		
		}
		if(diasCigarrillo>=505 && diasCigarrillo <506) {
			gananciaPesoMujeres =  ((diasCigarrillo-504)*(0.08589268-0.085736)) + 0.085736;		
		}
		if(diasCigarrillo>=506 && diasCigarrillo <507) {
			gananciaPesoMujeres = 0.08589268;		
		}
		if(diasCigarrillo>=507 && diasCigarrillo <508) {
			gananciaPesoMujeres =  ((diasCigarrillo-507)*(0.08597073-0.08589268)) + 0.08589268;		
		}
		if(diasCigarrillo>=508 && diasCigarrillo <509) {
			gananciaPesoMujeres =  ((diasCigarrillo-508)*(0.08604878-0.08597073)) + 0.08597073;		
		}
		if(diasCigarrillo>=509 && diasCigarrillo <510) {
			gananciaPesoMujeres =  ((diasCigarrillo-509)*(0.086048-0.08604878)) + 0.08604878;		
		}
		if(diasCigarrillo>=510 && diasCigarrillo <511) {
			gananciaPesoMujeres =  ((diasCigarrillo-510)*(0.08612683-0.086048)) + 0.086048;		
		}
		if(diasCigarrillo>=511 && diasCigarrillo <512) {
			gananciaPesoMujeres =  ((diasCigarrillo-511)*(0.08620488-0.08612683)) + 0.08612683;		
		}
		if(diasCigarrillo>=512 && diasCigarrillo <513) {
			gananciaPesoMujeres =  ((diasCigarrillo-512)*(0.08628293-0.08620488)) + 0.08620488;		
		}
		if(diasCigarrillo>=513 && diasCigarrillo <514) {
			gananciaPesoMujeres =  ((diasCigarrillo-513)*(0.08628-0.08628293)) + 0.08628293;		
		}
		if(diasCigarrillo>=514 && diasCigarrillo <515) {
			gananciaPesoMujeres =  ((diasCigarrillo-514)*(0.08636098-0.08628)) + 0.08628;		
		}
		if(diasCigarrillo>=515 && diasCigarrillo <516) {
			gananciaPesoMujeres = 0.08636098;		
		}
		if(diasCigarrillo>=516 && diasCigarrillo <517) {
			gananciaPesoMujeres =  ((diasCigarrillo-516)*(0.08643902-0.08636098)) + 0.08636098;		
		}
		if(diasCigarrillo>=517 && diasCigarrillo <518) {
			gananciaPesoMujeres =  ((diasCigarrillo-517)*(0.08651707-0.08643902)) + 0.08643902;		
		}
		if(diasCigarrillo>=518 && diasCigarrillo <519) {
			gananciaPesoMujeres =  ((diasCigarrillo-518)*(0.086517-0.08651707)) + 0.08651707;		
		}
		if(diasCigarrillo>=519 && diasCigarrillo <520) {
			gananciaPesoMujeres =  ((diasCigarrillo-519)*(0.08659512-0.086517)) + 0.086517;		
		}
		if(diasCigarrillo>=520 && diasCigarrillo <521) {
			gananciaPesoMujeres =  0.08659512;		
		}
		if(diasCigarrillo>=521 && diasCigarrillo <522) {
			gananciaPesoMujeres =  ((diasCigarrillo-521)*(0.08675122-0.08659512)) + 0.08659512;		
		}
		if(diasCigarrillo>=522 && diasCigarrillo <523) {
			gananciaPesoMujeres =  ((diasCigarrillo-522)*(0.08675-0.08675122)) + 0.08675122;		
		}
		if(diasCigarrillo>=523 && diasCigarrillo <524) {
			gananciaPesoMujeres =  ((diasCigarrillo-523)*(0.08690732-0.08675)) + 0.08675;		
		}
		if(diasCigarrillo>=524 && diasCigarrillo <525) {
			gananciaPesoMujeres =  ((diasCigarrillo-524)*(0.08698537-0.08690732)) + 0.08690732;		
		}
		if(diasCigarrillo>=525 && diasCigarrillo <526) {
			gananciaPesoMujeres =  ((diasCigarrillo-525)*(0.08706341-0.08698537)) + 0.08698537;		
		}
		if(diasCigarrillo>=526 && diasCigarrillo <527) {
			gananciaPesoMujeres =  ((diasCigarrillo-526)*(0.08714146-0.08706341)) + 0.08706341;		
		}
		if(diasCigarrillo>=527 && diasCigarrillo <528) {
			gananciaPesoMujeres =  ((diasCigarrillo-527)*(0.08714-0.08714146)) + 0.08714146;		
		}
		if(diasCigarrillo>=528 && diasCigarrillo <529) {
			gananciaPesoMujeres =  ((diasCigarrillo-528)*(0.08721951-0.08714)) + 0.08714;		
		}
		if(diasCigarrillo>=529 && diasCigarrillo <530) {
			gananciaPesoMujeres =  ((diasCigarrillo-529)*(0.08737561-0.08721951)) + 0.08721951;		
		}
		if(diasCigarrillo>=530 && diasCigarrillo <531) {
			gananciaPesoMujeres = 0.08737561;		
		}
		if(diasCigarrillo>=531 && diasCigarrillo <532) {
			gananciaPesoMujeres =  ((diasCigarrillo-531)*(0.08753171-0.08737561)) + 0.08737561;		
		}
		if(diasCigarrillo>=532 && diasCigarrillo <533) {
			gananciaPesoMujeres =  ((diasCigarrillo-532)*(0.08753-0.08753171)) + 0.08753171;		
		}
		if(diasCigarrillo>=533 && diasCigarrillo <534) {
			gananciaPesoMujeres =  ((diasCigarrillo-533)*(0.0876878-0.08753)) + 0.08753;		
		}
		if(diasCigarrillo>=534 && diasCigarrillo <535) {
			gananciaPesoMujeres =  0.0876878;		
		}
		if(diasCigarrillo>=535 && diasCigarrillo <536) {
			gananciaPesoMujeres =  ((diasCigarrillo-535)*(0.08776585-0.0876878)) + 0.0876878;		
		}
		if(diasCigarrillo>=536 && diasCigarrillo <537) {
			gananciaPesoMujeres =  ((diasCigarrillo-536)*(0.087765-0.08776585)) + 0.08776585;		
		}
		if(diasCigarrillo>=537 && diasCigarrillo <538) {
			gananciaPesoMujeres =  ((diasCigarrillo-537)*(0.087921955-0.087765)) + 0.087765;		
		}
		if(diasCigarrillo>=538 && diasCigarrillo <539) {
			gananciaPesoMujeres =  ((diasCigarrillo-538)*(0.088-0.087921955)) + 0.087921955;		
		}
		if(diasCigarrillo>=539 && diasCigarrillo <540) {
			gananciaPesoMujeres =  ((diasCigarrillo-539)*(0.08807805-0.088)) + 0.088;		
		}
		if(diasCigarrillo>=540 && diasCigarrillo <541) {
			gananciaPesoMujeres =  ((diasCigarrillo-540)*(0.0881561-0.08807805)) + 0.08807805;		
		}
		if(diasCigarrillo>=541 && diasCigarrillo <542) {
			gananciaPesoMujeres =  ((diasCigarrillo-541)*(0.08815-0.0881561)) + 0.0881561;		
		}
		if(diasCigarrillo>=542 && diasCigarrillo <543) {
			gananciaPesoMujeres =  ((diasCigarrillo-542)*(0.08823415-0.08815)) + 0.08815;		
		}
		if(diasCigarrillo>=543 && diasCigarrillo <544) {
			gananciaPesoMujeres =  ((diasCigarrillo-543)*(0.0883122-0.08823415)) + 0.08823415;		
		}
		if(diasCigarrillo>=544 && diasCigarrillo <545) {
			gananciaPesoMujeres =  ((diasCigarrillo-544)*(0.08839024-0.0883122)) + 0.0883122;		
		}
		if(diasCigarrillo>=545 && diasCigarrillo <546) {
			gananciaPesoMujeres =  ((diasCigarrillo-545)*(0.08839-0.08839024)) + 0.08839024;		
		}
		if(diasCigarrillo>=546 && diasCigarrillo <547) {
			gananciaPesoMujeres =  ((diasCigarrillo-546)*(0.08846829-0.08839)) + 0.08839;		
		}
		if(diasCigarrillo>=547 && diasCigarrillo <548) {
			gananciaPesoMujeres =  ((diasCigarrillo-547)*(0.08854634-0.08846829)) + 0.08846829;		
		}
		if(diasCigarrillo>=548 && diasCigarrillo <549) {
			gananciaPesoMujeres =  ((diasCigarrillo-548)*(0.08862439-0.08854634)) + 0.08854634;		
		}
		if(diasCigarrillo>=549 && diasCigarrillo <550) {
			gananciaPesoMujeres =  ((diasCigarrillo-549)*(0.08870244-0.08862439)) + 0.08862439;		
		}
		if(diasCigarrillo>=550 && diasCigarrillo <551) {
			gananciaPesoMujeres =  ((diasCigarrillo-549)*(0.088702-0.08870244)) + 0.08870244;		
		}
		if(diasCigarrillo>=551 && diasCigarrillo <552) {
			gananciaPesoMujeres =  ((diasCigarrillo-551)*(0.088854-0.088702)) + 0.088702;		
		}
		if(diasCigarrillo>=552 && diasCigarrillo <553) {
			gananciaPesoMujeres = 0.088854;		
		}
		if(diasCigarrillo>=553 && diasCigarrillo <554) {
			gananciaPesoMujeres =  ((diasCigarrillo-553)*(0.08893659-0.088854)) + 0.088854;		
		}
		if(diasCigarrillo>=554 && diasCigarrillo <555) {
			gananciaPesoMujeres =  ((diasCigarrillo-554)*(0.08893-0.08893659)) + 0.08893659;		
		}
		if(diasCigarrillo>=555 && diasCigarrillo <556) {
			gananciaPesoMujeres =  ((diasCigarrillo-555)*(0.08901463-0.08893)) + 0.08893;		
		}
		if(diasCigarrillo>=556 && diasCigarrillo <557) {
			gananciaPesoMujeres =  ((diasCigarrillo-556)*(0.089909268-0.08901463)) + 0.08901463;		
		}
		if(diasCigarrillo>=557 && diasCigarrillo <558) {
			gananciaPesoMujeres =  ((diasCigarrillo-557)*(0.08917073-0.089909268)) + 0.089909268;		
		}
		if(diasCigarrillo>=558 && diasCigarrillo <559) {
			gananciaPesoMujeres =  ((diasCigarrillo-558)*(0.083248778-0.08917073)) + 0.08917073;		
		}
		
		
		
		
		return gananciaPesoMujeres;
	
	}
}








