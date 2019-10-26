package com.dhanjyothi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dhanjyothi.model.Account;
import com.dhanjyothi.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService as;

	@GetMapping("/createsavingsaccount")
	public String loadAccountCreationPage(Model model, HttpServletRequest request) {
		
		return null;

	}

	@GetMapping("/loadtermaccount")
	public String loadTermAccount(@ModelAttribute("account") Account account, Model model) {

		return null;
	}

	@PostMapping("/createtermaccount")
	public String createTermAccount(@ModelAttribute("account") Account account, Model model, HttpServletRequest request,
			BindingResult bindingResult) {
		return null;
	}

	@GetMapping("/viewtransactions")
	public String loadTransactionDetails(Model model, HttpServletRequest request) {
		return null;
	}
}
