package com.insource.items.person.service.impl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.insource.items.common.utils.AbstractServiceImpl;
import com.insource.items.person.dao.PersonDAO;
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
		// return personDAO.addPerson(Person);
		Person person = new Person();
		person.setEmail(request.getParameter("email"));
		person.setDob((request.getParameter("dob") != null && !request.getParameter("dob").isEmpty())
				? getFormattedDate(request.getParameter("dob")) : new Date());
		person.setCreatedDate(
				(request.getParameter("created_date") != null && !request.getParameter("created_date").isEmpty())
						? getFormattedDate(request.getParameter("created_date")) : new Date());
		person.setLastLoginDate(
				(request.getParameter("last_login date ") != null && !request.getParameter("last_login_date").isEmpty())
						? getFormattedDate(request.getParameter("last_login_date")) : new Date());
		person.setPhone(request.getParameter("phone"));
		person.setName(request.getParameter("Name"));
		person.setPassword(request.getParameter("Password"));
		System.out.println(person.toString());
		return personDAO.addPerson(person);
	}

	/*
	 * @Override
	 * 
	 * @Transactional public List<Person> getAllPersons() { return
	 * personDAO.getAllPersons(); }
	 * 
	 * @Override
	 * 
	 * @Transactional public void deletePerson(Integer PersonId) {
	 * personDAO.deletePerson(PersonId); }
	 */
	public Person getPerson(String email) {

		return personDAO.getPerson(email);
	}

	/*
	 * public Person updatePerson(Person Person) { // TODO Auto-generated method
	 * stub return personDAO.updatePerson(Person); }
	 */

}
