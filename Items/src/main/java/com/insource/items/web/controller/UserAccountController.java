package com.insource.items.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserAccountController {

	/**
	 * Loads Login Page
	 * 
	 * @return ModelAndView login.jsp
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		return new ModelAndView("login");
	}

}
