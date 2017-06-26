package com.insource.items.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.insource.items.model.ItemsResponseVO;


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
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView getRegisterPage() {
		return new ModelAndView("register");
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/auth/login", method=RequestMethod.POST)
	public @ResponseBody HttpServletResponse attemptLogin(HttpServletRequest request, HttpServletResponse response) {
		response.setStatus(1, "Success");
		return response; 
	}
	
	@RequestMapping(value="/account/create", method=RequestMethod.POST, produces="application/json")
	public ModelAndView createUserAccount(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword=request.getParameter("confirmPassword");
		String mobile = request.getParameter("mobile");
		
		return new ModelAndView("home");
	}

}
