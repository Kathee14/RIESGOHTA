package com.uis.simon.hta.service;

import java.util.List;

import com.uis.simon.hta.dto.NuevaSimulacionEnfermero;
import com.uis.simon.hta.dto.NuevaSimulacionPaciente;
import com.uis.simon.hta.dto.ResultadoModelo;

public interface ICorrerModeloService {
	
	public List<ResultadoModelo> simulaPaciente(NuevaSimulacionPaciente s);

	public List<ResultadoModelo> simulaEnfermero(NuevaSimulacionEnfermero s);
	
}
