package com.pshaikh.color_service.web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class PersonsResponse {
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private String lastname;
	@Getter
	@Setter
	private String zipcode;
	@Getter
	@Setter
	private String city;
	@Getter
	@Setter
	private String color;
}
