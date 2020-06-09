package com.pshaikh.color_service.persons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
public class PersonCtrlr {
	public List<Person> selectAll() {
		//TODO implementation
		
		return new ArrayList<Person>();
	}
	
	public Person selectById(int id) {
		//TODO implementation
		
		return new Person();
	}
	
	public List<Person> selectByColor(String color) {
		//TODO implementation
		
		return new ArrayList<Person>();
	}
	
	public Person create(Person p) {
		//TODO implementation
		
		return p;
	}
	
	public Person update(Person p) {
		//TODO implementation
		
		return p;
	}
	
	public Person delete(Person p) {
		return p;
	}
}
