package com.insource.items.person.dao;

import java.sql.SQLException;
import java.util.List;

import com.insource.items.person.model.Person;

public interface PersonDAO {

	public boolean addPerson(Person Person);
	 
	/*public List<Person> getAllPersons();
 
    public void deletePerson(Integer PersonId);
 
    public Person updatePerson(Person Person);
*/ 
    public Person getPerson(String email) ;

}
