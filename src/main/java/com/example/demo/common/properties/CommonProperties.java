package com.example.demo.common.properties;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "launch")
public class CommonProperties {

	public CommonProperties() {

	}
	private Map<String,String> range;
	public Map<String, String> getRange() {
		return range;
	}
	public void setRange(Map<String, String> range) {
		this.range = range;
	}

}
