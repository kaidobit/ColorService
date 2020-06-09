package com.pshaikh.color_service.data;

import java.util.List;

import com.pshaikh.color_service.persons.Person;

public interface PersonDatasource {
	List<PersonEntity> selectAll();
	
	PersonEntity selectById(int id);
	
	List<PersonEntity> selectByColor(String color);
	
	PersonEntity create(Person person);
	
	PersonEntity update(Person person);
	
	PersonEntity delete(Person person);
}
