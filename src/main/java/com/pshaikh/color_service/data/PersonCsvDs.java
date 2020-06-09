package com.pshaikh.color_service.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pshaikh.color_service.persons.Person;

@Repository
public class PersonCsvDs implements PersonDatasource {
	@Override
	public List<PersonEntity> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonEntity selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonEntity> selectByColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonEntity create(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonEntity update(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonEntity delete(Person person) {
		// TODO Auto-generated method stub
		return null;
	}
}
