package com.pshaikh.color_service.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonsApiCtrlr {
	@GetMapping("")
	public List<PersonsResponse> getAllPersons() {
		//TODO implementation
		
		return new ArrayList<PersonsResponse>();
	}
	
	@GetMapping("/{id}")
	public PersonsResponse getPersonById(@PathVariable("id") int id) {
		//TODO implementation
		
		return new PersonsResponse();
	}
	
	@GetMapping("/color/{color}")
	public List<PersonsResponse> getPersonsByColor(@PathVariable("color") String color) {
		//TODO implementation
		
		return new ArrayList<PersonsResponse>();	
	}
}
