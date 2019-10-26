package com.dhanjyothi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	private String accountType;
	private long accountBalance;
	private int depositTenure;
	private float interestRate;
	private Date accountCreatedDate;
	private Date accountUpdateDate;
	private long maturityAmount;
	@ManyToOne
	private User user;
	
	public Account() {
		
	}
	
    public Account(String accountType, long accountBalance, Date accountCreatedDate, Date accoutUpdateDate, User user) {
		
    	this.accountType = accountType;
    	this.accountBalance = accountBalance;
    	this.accountCreatedDate = accountCreatedDate;
    	this.accountCreatedDate=accountCreatedDate;
    	this.user = user;
	}
    
/*public Account(String accountType, int depositTenure,long accountBalance, Date accountCreatedDate, Date accoutUpdateDate, User user) {
		
    	this.accountType = accountType;
    	this.accountBalance = accountBalance;
    	this.accountCreatedDate = accountCreatedDate;
    	this.accountCreatedDate=accountCreatedDate;
    	this.user = user;
	}*/

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getDepositTenure() {
		return depositTenure;
	}

	public void setDepositTenure(int depositTenure) {
		this.depositTenure = depositTenure;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public Date getAccountCreatedDate() {
		return accountCreatedDate;
	}

	public void setAccountCreatedDate(Date accountCreatedDate) {
		this.accountCreatedDate = accountCreatedDate;
	}

	public Date getAccountUpdateDate() {
		return accountUpdateDate;
	}

	public void setAccountUpdateDate(Date accountUpdateDate) {
		this.accountUpdateDate = accountUpdateDate;
	}

	public long getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(long maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", accountBalance=" + accountBalance
				+ ", depositTenure=" + depositTenure + ", interestRate=" + interestRate + ", accountCreatedDate="
				+ accountCreatedDate + ", accountUpdateDate=" + accountUpdateDate + ", maturityAmount=" + maturityAmount
				+ ", user=" + user + "]";
	}
	
	


}