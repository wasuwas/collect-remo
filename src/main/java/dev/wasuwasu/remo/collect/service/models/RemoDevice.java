
package dev.wasuwasu.remo.collect.service.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import dev.wasuwasu.remo.collect.service.models.devices.NewestEvents;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RemoDevice {

	// @JsonProperty("id")
	// public String id;
	@JsonProperty("name")
	public String name;
	@JsonProperty("temperature_offset")
	public Integer temperatureOffset;
	@JsonProperty("humidity_offset")
	public Integer humidityOffset;
	@JsonProperty("created_at")
	public String createdAt;
	@JsonProperty("updated_at")
	public String updatedAt;
	@JsonProperty("firmware_version")
	public String firmwareVersion;
	@JsonProperty("mac_address")
	public String macAddress;
	@JsonProperty("serial_number")
	public String serialNumber;
	@JsonProperty("newest_events")
	public NewestEvents newestEvents;
}
