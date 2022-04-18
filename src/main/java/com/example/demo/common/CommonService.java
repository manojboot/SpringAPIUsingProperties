package com.example.demo.common;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.common.api.DateRange;
import com.example.demo.common.api.GenericLookUp;
import com.example.demo.common.api.GenericLookUpResponse;
import com.example.demo.common.properties.CommonProperties;

@Service
public class CommonService {

	private CommonProperties properties;
	private CommonRepository commonRepository;
	
	public CommonService(CommonProperties properties,CommonRepository commonRepository) {
		this.properties = properties;
		this.commonRepository = commonRepository;
	}

	public GenericLookUpResponse getDateRange() {
		GenericLookUpResponse lookup = new GenericLookUpResponse();
		List<GenericLookUp> jpadateRangeResponse = commonRepository.findAll();
		if(jpadateRangeResponse.isEmpty()) {
		System.out.println("Inside Date Range" + properties.getRange());
		List<GenericLookUp> dateRangeResponse = properties.getRange().entrySet().stream()
				.map(m -> GenericLookUp.builder().code(m.getKey()).description(m.getValue()).build())
				.collect(Collectors.toList());
		lookup.setDateRange(dateRangeResponse);
		}else {
			lookup.setDateRange(jpadateRangeResponse);
		}
		return lookup;
	}
}
