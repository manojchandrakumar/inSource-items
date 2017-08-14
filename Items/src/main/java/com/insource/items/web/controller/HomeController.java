package com.insource.items.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author inSource Technologies
 *
 */
@Controller
public class HomeController {

	/**
	 * Loads Home Page
	 * 
	 * @return ModelAndView home.jsp
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		return new ModelAndView("home");
	}
	
	/**
	 * Loads Login Page
	 * 
	 * @return ModelAndView home.jsp
	 */
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public ModelAndView getLoginPage() {
		return new ModelAndView("account");
	}
	
	/**
	 * Loads Registration Page
	 * 
	 * @return ModelAndView home.jsp
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView getRegistrationPage() {
		return new ModelAndView("register");
	}
	
}
