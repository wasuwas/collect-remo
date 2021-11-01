package dev.wasuwasu.remo.collect.actuator;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author wasuwasu
 */
@SpringBootTest
@AutoConfigureMockMvc
@EnableAutoConfiguration
public class HealthCheckTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void healthCheckTest() throws Exception {
		mockMvc
		.perform(get("/actuator/health"))
		.andExpect(status().isOk())
		.andDo(print());
	}

	@Test
	void infoTest() throws Exception {

		mockMvc
		.perform(get("/actuator/info"))
		.andExpect(status().isOk())
		.andDo(print());
	}
}
