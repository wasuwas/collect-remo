
package dev.wasuwasu.remo.collect.service.models.devices;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import dev.wasuwasu.remo.collect.service.models.devices.newestEvents.Humidity;
import dev.wasuwasu.remo.collect.service.models.devices.newestEvents.Illumination;
import dev.wasuwasu.remo.collect.service.models.devices.newestEvents.Movement;
import dev.wasuwasu.remo.collect.service.models.devices.newestEvents.Temperature;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class NewestEvents {

	@JsonProperty("te")
	public Temperature te;
	@JsonProperty("hu")
	public Humidity hu;
	@JsonProperty("il")
	public Illumination il;
	@JsonProperty("mo")
	public Movement mo;

}
