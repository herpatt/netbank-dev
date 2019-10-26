package com.dhanjyothi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dhanjyothi.dao.LoginDao;
import com.dhanjyothi.model.User;

@Controller
public class LoginController {
	
	@Autowired
	private LoginDao loginDao;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showRegister() {
		
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new User());
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String validateUser(@ModelAttribute("user") User user, HttpServletRequest request, Model model, HttpSession session) {
		if(loginDao.validateUser(user)==0){
		    session.setAttribute("userName", user.getUserName());
			return "accountsummary";
		}
		return "login";
	}

	@RequestMapping("/accsummary")
	public String loadAccSummary(HttpServletRequest request, Model model) {
		return null;
	}

	@RequestMapping("/adduser")
	public String addUser(HttpServletRequest request, Model model) {
		return null;
	}

	@GetMapping("/logout")
	public String logoutPage(HttpServletRequest request, HttpSession session) {
         session.removeAttribute("userName");
		return "login";
	}
}
