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
public class RemoDeviceModelInfo {

	@JsonProperty("id")
	public String id;
	@JsonProperty("manufacturer")
	public String manufacturer;
	@JsonProperty("remote_name")
	public String remoteName;
	@JsonProperty("name")
	public String name;
	@JsonProperty("image")
	public String image;

}