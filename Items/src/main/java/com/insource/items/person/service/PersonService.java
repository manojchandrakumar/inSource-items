package com.insource.items.person.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insource.items.person.model.Person;

public interface PersonService {

	public boolean addPerson(Person person, HttpServletRequest request);

	//public List<Person> getAllPersons();

	//public void deletePerson(Integer personId);

	public Person getPerson(String	email);

	//public Person updatePerson(Person person);
	
}
