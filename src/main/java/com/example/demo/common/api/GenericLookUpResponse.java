package com.example.demo.common.api;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GenericLookUpResponse {

	private List<GenericLookUp> dateRange;

}
