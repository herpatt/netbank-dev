package com.dhanjyothi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dhanjyothi.service.RegisterService;

@Controller
public class AdminController {

	@Autowired
	RegisterService registerService;

	@RequestMapping(value = "/user-list", method = RequestMethod.GET)
	public String displayUserList(Model model) {
		model.addAttribute("users", registerService.getAllUsers());
		return "activate-user";
	}

	@RequestMapping(value = "/activate-user", method = RequestMethod.GET)
	public String activateUser(@RequestParam(value = "userId") String userId) {
		registerService.activateUser(userId);
		return "redirect:user-list";
	}
}