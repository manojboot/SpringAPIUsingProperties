package com.example.demo.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse {

	private int statusCode = 200;
	private String statusMessage = "SUCCESS";
	private String statusDescription = "Data Reterieved Successfully";
	
}
