package com.pshaikh.color_service.persons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pshaikh.color_service.data.PersonDatasource;

@Controller
public class PersonCtrlr {
	@Autowired
	PersonDatasource ds;
	
	public List<Person> selectAll() {
		return ds.selectAll();
	}
	
	public Person selectById(int id) {
		return ds.selectById(id);
	}
	
	public List<Person> selectByColor(String color) {
		return ds.selectByColor(color);
	}
	
	public Person create(Person person) {
		//TODO implementation
		
		return ds.create(person);
	}
	
	public Person update(Person person) {
		//TODO implementation
		
		return ds.update(person);
	}
	
	public Person delete(Person person) {
		return ds.delete(person);
	}
}
