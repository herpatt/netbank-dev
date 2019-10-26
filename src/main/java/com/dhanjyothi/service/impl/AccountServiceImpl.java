package com.dhanjyothi.service.impl;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanjyothi.dao.AccountDao;
import com.dhanjyothi.model.Account;
import com.dhanjyothi.model.Beneficiaries;
import com.dhanjyothi.model.Transaction;
import com.dhanjyothi.model.User;
import com.dhanjyothi.service.AccountService;
import com.dhanjyothi.util.DhanJyothiUtil;

@Transactional
@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao ad;
	
	@Autowired
	private DhanJyothiUtil dj;

	public Account getAccountDetails(int userId, String accountType) throws Exception {
		return ad.getAccountDetails(userId, accountType);
	}

	public void openSavingsAccount(User user) throws Exception {
		Account ac = new Account("savings",10000, dj.getCurrentDate(),dj.getCurrentDate(),user);
		ad.openSavingsAccount(ac,false);
	}

	public void openTermAccount(Account account, User user) throws Exception {
       ad.openTermAccount(account);
	}

	public List<Account> getTermAccountDetails(int userId, String accountType) throws Exception {
		return ad.getTermAccountDetails(userId, accountType);
	}

	public Map<Integer, String> getTenureDetails() {
		return null;
	}

	public boolean checkSavingsAccBalance(long termAmt) throws Exception {
		
		return true;
	}

	public void updateSavingsAccount(Account account, User cust) throws Exception {

	}

	public User getUserDetails(User user) throws Exception {
		return null;
	}

	public void saveBeneficiaries(Account account, Beneficiaries beneficiaries) throws Exception {

	}

	public boolean checkAccountExists(Beneficiaries beneficiaries) throws Exception {
		return true;
	}

	public List<Beneficiaries> getAllBeneficiaries(int accountId) throws Exception {
		return null;
	}

	public void updateFromAccount(Account account, long transAmt, Transaction transaction) throws Exception {

	}

	public void updateToAccount(Transaction transaction) throws Exception {

	}

	public List<Transaction> loadAllTransactions(int accId) throws Exception {
		return null;
	}

	public boolean isUserNameExists(String name) throws Exception {
		if(ad.isUserNameExists(name)!=null){
		return true;
		}
		else
			return false;
	}

	public Account checkAccountExists(int accountId) throws Exception {
		return ad.checkAccountExists(accountId);

	}

	public User getUserById(int userId) throws Exception {
		return ad.getUserById(userId);
	}
}
