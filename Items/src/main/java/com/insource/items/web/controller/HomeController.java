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
	
}
