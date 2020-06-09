package com.pshaikh.color_service.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class ColorEntity {
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String color;
}
