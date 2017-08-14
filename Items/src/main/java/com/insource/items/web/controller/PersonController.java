package com.insource.items.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.insource.items.person.model.ItemsResponseVO;
import com.insource.items.person.model.Person;
import com.insource.items.person.model.PersonRequestVO;
import com.insource.items.person.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	
	@RequestMapping(name = "/createUser", method = RequestMethod.POST, produces="application/json")
	public @ResponseBody ItemsResponseVO addPerson(HttpServletRequest request) {
		boolean status = false;
		ItemsResponseVO responseVO = new ItemsResponseVO();
		if (request != null) {
			status = personService.addPerson(null, request);
			responseVO.setStatus(status);
			responseVO.setServiceMessage("User Account Created Successfully");
		} else {
			responseVO.setStatus(false);
			responseVO.setServiceMessage("No Request Header");
		}
		return responseVO;
	}
	@RequestMapping(name="/getUserDetails", method=RequestMethod.POST, produces="application/json")
	public @ResponseBody ItemsResponseVO getUserDetails(HttpServletRequest request) {
		ItemsResponseVO responseVO = new ItemsResponseVO();
		Person p = personService.getPerson(request.getParameter("email"));
		responseVO.setResultObject(p);
		return responseVO;
	}
}
