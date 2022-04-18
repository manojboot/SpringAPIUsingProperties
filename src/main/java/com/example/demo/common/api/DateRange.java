package com.example.demo.common.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "daterange")
public class DateRange {

	@Id
	@Column(length = 10)
	private String code;
	@Column(length = 20)
	private String description;
}
