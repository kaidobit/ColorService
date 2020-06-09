package com.pshaikh.color_service.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pshaikh.color_service.persons.Person;

@Repository
public class PersonCsvDatasource implements PersonDatasource {

	@Override
	public List<Person> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> selectByColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person create(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person update(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person delete(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

}
