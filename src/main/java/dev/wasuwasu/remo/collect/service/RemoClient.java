package dev.wasuwasu.remo.collect.service;

import java.net.URI;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import dev.wasuwasu.remo.collect.config.ApplicationProperties;
import dev.wasuwasu.remo.collect.service.models.RemoDevice;
import dev.wasuwasu.remo.collect.service.models.UserInfo;
import dev.wasuwasu.remo.collect.service.models.applicances.ApplianceInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@ControllerAdvice
public class RemoClient {

	private final RestTemplate restTemplate;

	private final ApplicationProperties properties;

	public List<RemoDevice> getDevice() {
		URI uri = UriComponentsBuilder.fromHttpUrl(properties.getRemoApiUrl())
				.path("/1/devices")
				.build()
				.toUri();
		RequestEntity<Void> request = RequestEntity
				.get(uri)
				.header("Authorization", "Bearer " + properties.getRemoAccessToken())
				.build();
		log.info("Request:" + request.getUrl().toASCIIString());
		ResponseEntity<List<RemoDevice>> response = restTemplate.exchange(request, new ParameterizedTypeReference<List<RemoDevice>>() {});
		log.info("Response status code:" + response.getStatusCodeValue());
		log.info("Response:" + response.getBody().toString());
		return response.getBody();
	}

	public UserInfo getCallUserInfo() {
		URI uri = UriComponentsBuilder.fromHttpUrl(properties.getRemoApiUrl())
				.path("/1/users/me")
				.build()
				.toUri();
		RequestEntity<Void> request = RequestEntity
				.get(uri)
				.header("Authorization", "Bearer " + properties.getRemoAccessToken())
				.build();
		log.info("Request:" + request.getUrl().toASCIIString());
		ResponseEntity<UserInfo> response = restTemplate.exchange(request, UserInfo.class);
		log.info("Response status code:" + response.getStatusCodeValue());
		log.info("Response:" + response.getBody().toString());
		return response.getBody();
	}

	/**
	 * @return
	 */
	public List<ApplianceInfo> getApplianceInfo() {
		URI uri = UriComponentsBuilder.fromHttpUrl(properties.getRemoApiUrl())
				.path("/1/appliances")
				.build()
				.toUri();
		RequestEntity<Void> request = RequestEntity
				.get(uri)
				.header("Authorization", "Bearer " + properties.getRemoAccessToken())
				.build();
		log.info("Request:" + request.getUrl().toASCIIString());
		ResponseEntity<List<ApplianceInfo>> response = restTemplate.exchange(request, new ParameterizedTypeReference<List<ApplianceInfo>>() {});
		log.info("Response status code:" + response.getStatusCodeValue());
		log.info("Response:" + response.getBody().toString());
		return response.getBody();
	}
}
