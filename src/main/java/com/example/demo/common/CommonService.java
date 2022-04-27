package com.example.demo.common;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.common.api.CommonLookUp;
import com.example.demo.common.api.CommonLookUpResponse;
import com.example.demo.common.properties.CommonProperties;

@Service
public class CommonService {

	private CommonProperties properties;
	
	public CommonService(CommonProperties properties) {
		this.properties = properties;
	}

	public CommonLookUpResponse getDateRange() {
		CommonLookUpResponse lookup = new CommonLookUpResponse();

		List<CommonLookUp> dateRangeResponse = properties.getRange().entrySet().stream()
			.map(m -> CommonLookUp.builder().code(m.getKey()).description(m.getValue()).build())
				.collect(Collectors.toList());
		lookup.setDateRange(dateRangeResponse);
		return lookup;
	}
}
