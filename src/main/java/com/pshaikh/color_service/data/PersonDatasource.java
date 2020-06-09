package com.pshaikh.color_service.data;

import java.util.List;

import com.pshaikh.color_service.persons.Person;

public interface PersonDatasource {
	List<Person> selectAll();
	
	Person selectById(int id);
	
	List<Person> selectByColor(String color);
	
	Person create(Person person);
	
	Person update(Person person);
	
	Person delete(Person person);
}
