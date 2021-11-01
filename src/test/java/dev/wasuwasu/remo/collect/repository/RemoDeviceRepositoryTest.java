package dev.wasuwasu.remo.collect.repository;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import dev.wasuwasu.remo.collect.service.models.RemoDevice;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wasuwasu
 *
 */
@SpringBootTest
@Slf4j
class RemoDeviceRepositoryTest {

	@Autowired
	private RemoDeviceRepository remoDeviceRepository;

	@Autowired
	private ObjectMapper objectMapper;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
	}

	@Test
	void test() throws Exception {
		List<RemoDevice> deviceEvent = remoDeviceRepository.findAll();
		log.info(objectMapper.writeValueAsString(deviceEvent));
	}

}
