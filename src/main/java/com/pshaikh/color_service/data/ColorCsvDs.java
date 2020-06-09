package com.pshaikh.color_service.data;

import org.springframework.stereotype.Repository;

import com.pshaikh.color_service.persons.Color;

@Repository
public class ColorCsvDs implements ColorDatasource {
	@Override
	public ColorEntity selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ColorEntity selectByColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
