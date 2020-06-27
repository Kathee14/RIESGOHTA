package com.uis.simon.hta;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.uis.simon.hta.controller.PacienteController;

@RunWith(SpringRunner.class)
@SpringBootTest
class HtaApplicationTests {

	@Autowired
	private PacienteController controller;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
