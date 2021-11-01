
package dev.wasuwasu.remo.collect.service.models.devices.newestEvents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Humidity {

	@JsonProperty("val")
	public Integer val;
	@JsonProperty("created_at")
	public String createdAt;

}
