package com.pshaikh.color_service.data;

public interface ColorDatasource {
	ColorEntity selectById(int id);
	
	ColorEntity selectByColor(String color);
}
