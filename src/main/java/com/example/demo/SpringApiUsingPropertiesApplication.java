package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.demo.common.properties.CommonProperties;

@ConfigurationPropertiesScan("com.example.demo.common.properties")
@SpringBootApplication
public class SpringApiUsingPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiUsingPropertiesApplication.class, args);
	}

}
