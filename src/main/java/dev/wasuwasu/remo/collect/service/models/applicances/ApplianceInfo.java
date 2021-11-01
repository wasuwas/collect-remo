package dev.wasuwasu.remo.collect.service.models.applicances;

/**
 * @author wnyto
 *
 */
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import dev.wasuwasu.remo.collect.service.models.RemoDevice;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)@Data
public class ApplianceInfo {

	@JsonProperty("id")
	public String id;
	@JsonProperty("device")
	public RemoDevice device;
	@JsonProperty("model")
	public RemoDeviceModelInfo model;
	@JsonProperty("nickname")
	public String nickname;
	@JsonProperty("image")
	public String image;
	@JsonProperty("type")
	public String type;
	@JsonProperty("settings")
	public Settings settings;
	@JsonProperty("signals")
	public List<Signals> signals = null;

}