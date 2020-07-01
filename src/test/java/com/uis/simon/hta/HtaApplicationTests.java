package com.uis.simon.hta;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import com.uis.simon.hta.dao.IAlimentoDao;
import com.uis.simon.hta.dao.IPacienteDao;
import com.uis.simon.hta.dto.Login;
import com.uis.simon.hta.entity.Alimento;
import com.uis.simon.hta.entity.Paciente;
import com.uis.simon.hta.service.IAlimentoService;
import com.uis.simon.hta.service.IPacienteService;

@RunWith(SpringRunner.class)
@SpringBootTest
class HtaApplicationTests {
	
	//DAOS
	@MockBean
	private IPacienteDao pacienteDao;
	
	@MockBean
	private IAlimentoDao alimentoDao;
	

	//SERVICIOS
	@Autowired
	private IPacienteService service;
	
	@Autowired
	private IAlimentoService alimentoService;


	//	METODOS PACIENTE
	@Test
	public void ObtenerPacientesTest() {
		Date fecha = new Date(1195,12,10);
		Long cel = (long) 315201245;
		Date fecha1 = new Date(1195,12,10);
		Long cel1 = (long) 315201245;
		when(pacienteDao.findAll()).thenReturn(Stream
				.of(new Paciente("ana", "perez", "cc", "1025145232", fecha, "Cali", "calle 15", "la victoria", "1235", "1", "ana@gmail.com", cel),
					new Paciente("ana", "perez", "cc", "1025145232", fecha1, "Cali", "calle 15", "la victoria", "1235", "1", "ana@gmail.com", cel1)).collect(Collectors.toList()));
		assertEquals(2, service.findAll().size());	
	}
	

	@Test
	public void registrarPacienteTest() {
		Date fecha = new Date(1195,12,10);
		Long cel = (long) 315201245;
		Paciente pac = new Paciente("ana", "perez", "cc", "1025145232", fecha, "Cali", "calle 15", "la victoria", "1235", "1", "ana@gmail.com", cel );
		service.save(pac);
		verify(pacienteDao, times(1)).save(pac);
	}
	
	@Test 
	public void ObtenerPacienteCcTest() {
		Date fecha = new Date(1195,12,10);
		Long cel = (long) 315201245;
		String cc = "1025145232";
		Paciente pac = new Paciente("ana", "perez", "cc", "1025145232", fecha, "Cali", "calle 15", "la victoria", "1235", "1", "ana@gmail.com", cel );
		Paciente pac1 = new Paciente("ana", "perez", "cc", "1025478963", fecha, "Cali", "calle 15", "la victoria", "1235", "1", "ana@gmail.com", cel );
		when(pacienteDao.findByCc(cc)).thenReturn(pac);
		assertEquals(pac, service.findByCc(cc));
	}
	
	@Test 
	public void LoginTest() {
		Date fecha = new Date(1195,12,10);
		Long cel = (long) 315201245;
		Login login = new Login ("1025145232", "1235");
		Paciente pac = new Paciente("ana", "perez", "cc", "1025145232", fecha, "Cali", "calle 15", "la victoria", "1235", "1", "ana@gmail.com", cel );
		when(pacienteDao.findByCcAndPassword(pac.getCc(),pac.getPassword())).thenReturn(pac);
		assertEquals(pac, service.checkUsuarioLogin(login));
	}
	
	//METODO ALIMENTO
	@Test
	public void ObtenerAlimentosTest() {
		when(alimentoDao.findAll()).thenReturn(Stream
				.of(new Alimento("carne", 150, "carnes"),
					new Alimento("papa", 200, "harinas"),
					new Alimento("huevo", 230, "carnes")).collect(Collectors.toList()));
		assertEquals(3, alimentoService.findAll().size());	
	}


	
}
