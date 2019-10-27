package com.dhanjyothi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dhanjyothi.model.Beneficiaries;
import com.dhanjyothi.model.Transaction;
import com.dhanjyothi.service.AccountService;

@Controller
public class FundTransferController {

	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "/beneficiary", method = RequestMethod.GET)
	public String addBeneficiary(Model model) {
		Beneficiaries beneficiary = new Beneficiaries();
		model.addAttribute("beneficiary", beneficiary);		
		return "addbeneficiary";
	}
	
	@RequestMapping(value = "/addbeneficiary", method = RequestMethod.POST)
	public String saveBeneficiary(@ModelAttribute("beneficiary") Beneficiaries beneficiaries,Authentication authentication, BindingResult bindingResult,Model model) {
		model.addAttribute("userName", authentication.getName());
		beneficiaries.setUserId(authentication.getName());
		boolean isSuccess = accountService.saveBeneficiaries(beneficiaries);
		if( isSuccess ) {
			model.addAttribute("displayMessage","Save Beneficiary Successfull");
			model.addAttribute("status","SUCCESS");
		} else {
			model.addAttribute("displayMessage","Save Beneficiary Failed");
			model.addAttribute("status","ERROR");
		}
		return "home";
	}	
	
	@GetMapping("/loadbeneficiary")
	public String loadBeneficiaryPage() {
		return null;
	}

	@GetMapping("/loadtransfer")
	public String loadTransferPage(@ModelAttribute("transaction") Transaction transaction, Model model,
			HttpServletRequest request) {
		return null;
	}

	@GetMapping("/beneficiarywithinbank")
	public String beneficiarywithinbank(@ModelAttribute("beneficiary") Beneficiaries beneficiary, Model model) {

		return null;
	}

	@GetMapping("/beneficiaryotherbank")
	public String beneficiaryotherbank(@ModelAttribute("beneficiary") Beneficiaries beneficiary, Model model) {

		return null;
	}

	@PostMapping("/savebeneficiary")
	public String saveBeneficiary(@ModelAttribute("beneficiary") Beneficiaries beneficiary, Model model,
			BindingResult bindingResult, HttpServletRequest request) {
		return null;
	}

	@PostMapping("/transferamt")
	public String transferAmount(@ModelAttribute("transaction") Transaction transaction, Model model,
			BindingResult bindingResult, HttpServletRequest request) {
		return null;
	}
}
