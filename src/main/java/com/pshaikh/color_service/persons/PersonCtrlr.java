package com.pshaikh.color_service.persons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pshaikh.color_service.data.ColorDatasource;
import com.pshaikh.color_service.data.PersonDatasource;
import com.pshaikh.color_service.data.PersonEntity;

@Controller
public class PersonCtrlr {
	@Autowired
	private PersonDatasource pds;
	@Autowired
	private ColorDatasource cds;
	
	
	public List<Person> selectAll() {
		return personEntityListToPersonList(pds.selectAll());
	}
	
	public Person selectById(int id) {
		return personEntityToPerson(pds.selectById(id));
	}
	
	public List<Person> selectByColor(String color) {
		return personEntityListToPersonList(pds.selectByColor(color));
	}
	
	public Person create(Person person) {
		return personEntityToPerson(pds.create(person));
	}
	
	public Person update(Person person) {
		return personEntityToPerson(pds.update(person));
	}
	
	public Person delete(Person person) {
		return personEntityToPerson(pds.delete(person));
	}
	
	private Person personEntityToPerson(PersonEntity personentity) {
		return new Person(personentity.getId(), personentity.getName(), personentity.getLastname(),
				personentity.getZipcode(), personentity.getZipcode(), cds.selectById(personentity.getColorId()).getColor());
	}
	
	private List<Person> personEntityListToPersonList(List<PersonEntity> personEntities) {
		List<Person> persons = new ArrayList<>();
		
		for(PersonEntity pe : personEntities) {
			persons.add(new Person(pe.getId(), pe.getName(), pe.getLastname(),
							pe.getZipcode(), pe.getZipcode(), cds.selectById(pe.getColorId()).getColor()));
		}
		
		return persons;
	}
}
