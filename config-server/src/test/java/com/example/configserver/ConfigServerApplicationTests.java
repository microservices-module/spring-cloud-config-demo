package com.example.configserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class ConfigServerApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private ConfigServerApplication context;

	@Test
	void contextLoads() {
		assertThat(context).isNotNull();
	}

	@Test
	void configServerIsUp() {
		assertThat(port).isGreaterThan(0);
	}
}
