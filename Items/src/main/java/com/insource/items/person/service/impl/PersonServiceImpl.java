package com.insource.items.person.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.insource.items.common.utils.AbstractServiceImpl;
import com.insource.items.person.dao.PersonDAO;
import com.insource.items.person.dao.impl.PersonDAOImpl;
import com.insource.items.person.model.Person;
import com.insource.items.person.service.PersonService;

@Service
@Transactional
public class PersonServiceImpl extends AbstractServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personDAO;

	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	@Transactional
	public boolean addPerson(Person Person, HttpServletRequest request) {
		//return personDAO.addPerson(Person);
		Person person = new Person();
		person.setEmail(request.getParameter("email"));
		person.setDob(getFormattedDate(request.getParameter("dob")));
		person.setCreatedDate(getFormattedDate(request.getParameter("created_date")));
		person.setLastLoginDate(getFormattedDate(request.getParameter("last_login_date")));
		person.setPhone(request.getParameter("phone"));
		person.setName(request.getParameter("Name"));
		person.setPassword(request.getParameter("Password"));
		System.out.println(person.toString());
		return personDAO.addPerson(person);
	}
/*
	@Override
	@Transactional
	public List<Person> getAllPersons() {
		return personDAO.getAllPersons();
	}

	@Override
	@Transactional
	public void deletePerson(Integer PersonId) {
		personDAO.deletePerson(PersonId);
	}
*/
	public Person getPerson(String email) {
		
		return personDAO.getPerson(email);
	}

	/*public Person updatePerson(Person Person) {
		// TODO Auto-generated method stub
		return personDAO.updatePerson(Person);
	}*/

}
