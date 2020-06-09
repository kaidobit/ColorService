package com.pshaikh.color_service.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {
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
	private int colorId;
}
