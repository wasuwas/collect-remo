package dev.wasuwasu.remo.collect.service.models.applicances;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * @author wnyto
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Signals {
	private String id;
	private String name;
	private String image;
}
