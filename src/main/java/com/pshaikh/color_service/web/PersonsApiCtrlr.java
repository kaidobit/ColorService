package com.pshaikh.color_service.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pshaikh.color_service.persons.Person;
import com.pshaikh.color_service.persons.PersonCtrlr;

@RestController
@RequestMapping("/persons")
public class PersonsApiCtrlr {
	@Autowired
	PersonCtrlr pCtrlr;
	
	@GetMapping("")
	public List<PersonsResponse> getAllPersons() {
		return personListTopersonResponseList(pCtrlr.selectAll());
	}
	
	@GetMapping("/{id}")
	public PersonsResponse getPersonById(@PathVariable("id") int id) {
		Person p = pCtrlr.selectById(id); 
		
		return new PersonsResponse(p.getId(), p.getName(), p.getLastname(),
				p.getZipcode(), p.getCity(), p.getColor());
	}
	
	@GetMapping("/color/{color}")
	public List<PersonsResponse> getPersonsByColor(@PathVariable("color") String color) {
		return personListTopersonResponseList(pCtrlr.selectByColor(color));	
	}
	
	private List<PersonsResponse> personListTopersonResponseList(List<Person> persons) {
		List<PersonsResponse> personsResponse = new ArrayList<>();
		
		for(Person p : persons) {
			personsResponse.add(new PersonsResponse(
							p.getId(), p.getName(), p.getLastname(),
							p.getZipcode(), p.getCity(), p.getColor()));
		}
		
		return personsResponse;
	}
}
