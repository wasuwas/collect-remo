package dev.wasuwasu.remo.collect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import dev.wasuwasu.remo.collect.repository.RemoDeviceRepository;
import dev.wasuwasu.remo.collect.service.models.RemoDevice;

/**
 * @author wasuwasu
 *
 */
@Service
public class SaveSensorDataService {

	@Autowired
	RemoClient remoClient;

	@Autowired
	RemoDeviceRepository repository;

	@Scheduled(initialDelay = 5000,
			fixedRate = 60000)
	public void run() {
		List<RemoDevice> deviceEvent = remoClient.getDevice();
		repository.saveAll(deviceEvent);
	}
}
