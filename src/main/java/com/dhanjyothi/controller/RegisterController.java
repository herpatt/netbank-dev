package com.dhanjyothi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.dhanjyothi.model.User;

@Controller
public class RegisterController {

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView showRegister() {

		return new ModelAndView("");
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveRegister(@ModelAttribute("user") User user, BindingResult bindingResult) {

		return new ModelAndView("");
	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public ModelAndView getAllUsers() {

		return new ModelAndView("");
	}

}
