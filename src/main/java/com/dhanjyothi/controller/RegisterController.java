package com.dhanjyothi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dhanjyothi.model.User;
import com.dhanjyothi.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	RegisterService registerService;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String showRegister(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "signup";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String saveRegister(@ModelAttribute("user") User user, BindingResult bindingResult,Model model) {
		boolean isSuccess = registerService.saveRegister(user);
		if( isSuccess ) {
			model.addAttribute("displayMessage","User registered successfully !! Email will be sent to registered address after user activation.");
			model.addAttribute("status","SUCCESS");
		} else {
			model.addAttribute("displayMessage","System Error !! Please try again.");
			model.addAttribute("status","ERROR");
		}
		return "login";
	}
}