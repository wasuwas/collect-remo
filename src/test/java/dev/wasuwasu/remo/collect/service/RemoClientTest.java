package dev.wasuwasu.remo.collect.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import dev.wasuwasu.remo.collect.service.models.RemoDevice;
import dev.wasuwasu.remo.collect.service.models.UserInfo;
import dev.wasuwasu.remo.collect.service.models.applicances.ApplianceInfo;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class RemoClientTest {

	@Autowired
	private RemoClient remoClient;

	@Autowired
	ObjectMapper objectMapper;

	@BeforeEach
	public void setup() {
		this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
	}

	@Test
	void testGetDeviceWithSuccess() throws Exception {
		List<RemoDevice> device = remoClient.getDevice();
		log.info(objectMapper.writeValueAsString(device));
		MatcherAssert.assertThat(device, notNullValue());
		MatcherAssert.assertThat(device.get(0).getName(), is("Remo"));
	}

	@Test
	void testCallUserInfo() throws Exception {
		UserInfo userInfo = remoClient.getCallUserInfo();
		log.info(objectMapper.writeValueAsString(userInfo));
		MatcherAssert.assertThat(userInfo, notNullValue());
	}

	@Test
	void testGetRegisteredSignalsWithSuccess() throws Exception {
		List<ApplianceInfo> appliance = remoClient.getApplianceInfo();
		log.info(objectMapper.writeValueAsString(appliance));
		MatcherAssert.assertThat(appliance, notNullValue());
	}
}
