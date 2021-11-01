package dev.wasuwasu.remo.collect.service.models.applicances;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * @author wnyto
 *
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Settings {

	@JsonProperty("temp")
	public String temp;
	@JsonProperty("mode")
	public String mode;
	@JsonProperty("vol")
	public String vol;
	@JsonProperty("dir")
	public String dir;
	@JsonProperty("button")
	public String button;

}