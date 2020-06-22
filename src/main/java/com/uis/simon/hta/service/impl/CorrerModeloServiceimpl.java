package com.uis.simon.hta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uis.simon.hta.dto.ActividadFront;
import com.uis.simon.hta.dto.NuevaSimulacionEnfermero;
import com.uis.simon.hta.dto.NuevaSimulacionPaciente;
import com.uis.simon.hta.dto.ResultadoModelo;
import com.uis.simon.hta.service.ICorrerModeloService;

@Service
public class CorrerModeloServiceimpl implements ICorrerModeloService{

	@Override
	public List<ResultadoModelo> simulaPaciente(NuevaSimulacionPaciente s) {
		
		List<ActividadFront> lista = s.getActividades();
				int met1 = lista.get(0).getMets();
				int met2 = lista.get(1).getMets();
				int met3 = lista.get(2).getMets();
				int met4 = lista.get(3).getMets();
				int met5 = lista.get(4).getMets();
				int t1 = lista.get(0).getTiempo();
				int t2 = lista.get(1).getTiempo();
				int t3 = lista.get(2).getTiempo();
				int t4 = lista.get(3).getTiempo();
				int t5 = lista.get(4).getTiempo();
		
		
		List<ResultadoModelo> g = new ArrayList<ResultadoModelo>();
		
		RiesgoHta r = new RiesgoHta (s.getEdad(),
				s.getPeso(),
				s.getSexo(),
				s.getAltura(),
				t1,t2,t3,t4,t5,
				met1,met2,met3,met4,met5,
				s.getUpDown(),
				s.getCalorias(),
				s.getUpDownCalorias(),
				s.getSemanaC(),
				s.getSemanaF(),
				s.getSbp(),
				s.getDbp(),
				s.getHerencia(),
				s.getFumar());
		int j =0;
		for (int i=0; i<((s.getTiempo()-s.getEdad()+1)*365); i++) {
			if(i == 365*j+1) { 
				j = j+1;
				
				ResultadoModelo valores = new ResultadoModelo (r.getEdad(), r.getRiesgoHTA(), r.getRiesgoCigarrillo(), r.getPeso(), r.getSBP(), r.getDBP());		
				g.add(valores);
				
		}
			
				r.riesgo();
		}
		
		return g;
}

	@Override
	public List<ResultadoModelo> simulaEnfermero(NuevaSimulacionEnfermero s) {
		
		List<ActividadFront> lista = s.getActividades();
		int met1 = lista.get(0).getMets();
		int met2 = lista.get(1).getMets();
		int met3 = lista.get(2).getMets();
		int met4 = lista.get(3).getMets();
		int met5 = lista.get(4).getMets();
		int t1 = lista.get(0).getTiempo();
		int t2 = lista.get(1).getTiempo();
		int t3 = lista.get(2).getTiempo();
		int t4 = lista.get(3).getTiempo();
		int t5 = lista.get(4).getTiempo();

		List<ResultadoModelo> g = new ArrayList<ResultadoModelo>();

		RiesgoHta r = new RiesgoHta (s.getEdad(),
		s.getPeso(),
		s.getSexo(),
		s.getAltura(),
		t1,t2,t3,t4,t5,
		met1,met2,met3,met4,met5,
		s.getUpDown(),
		s.getCalorias(),
		s.getUpDownCalorias(),
		s.getSemanaC(),
		s.getSemanaF(),
		s.getSbp(),
		s.getDbp(),
		s.getHerencia(),
		s.getFumar());
		
		int j =0;
		for (int i=0; i<((s.getTiempo()-s.getEdad()+1)*365); i++) {
			if(i == 365*j+1) { 
				j = j+1;
		ResultadoModelo valores = new ResultadoModelo(r.getEdad(), r.getRiesgoHTA(), r.getRiesgoCigarrillo(), r.getPeso(), r.getSBP(), r.getDBP());		
		g.add(valores);
		
}
	
		r.riesgo();
}

return g;
	}

}
