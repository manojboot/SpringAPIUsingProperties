package com.example.demo.common;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.api.GenericLookUpResponse;


@RestController
@RequestMapping(value="api/v1/targeting/properties")
public class CommonController {

	private CommonService commonService;
	
	public CommonController(CommonService commonService) {
		this.commonService = commonService;
	}

	@GetMapping("/daterange")
	public ResponseEntity<GenericLookUpResponse> getDateRange()
	{
		GenericLookUpResponse employees = commonService.getDateRange();
		return ResponseEntity.ok(employees);
	}
}
