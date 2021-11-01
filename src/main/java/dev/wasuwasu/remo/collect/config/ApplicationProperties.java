package dev.wasuwasu.remo.collect.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ApplicationProperties {

	@Value("${remo.api.url}")
	private String remoApiUrl;

	@Value("${remo.accesstoken}")
	private String remoAccessToken;
}
