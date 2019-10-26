package com.dhanjyothi.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Transaction {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	private String transactionType;
	private long transactionAmount;
	private Date transactionDate;
	private String transactionDescription;
	private Account account;
	private Beneficiaries benificiary;
	//private List<Beneficiaries> beneficiaries;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public long getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionDescription() {
		return transactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Beneficiaries getBenificiary() {
		return benificiary;
	}
	public void setBenificiary(Beneficiaries benificiary) {
		this.benificiary = benificiary;
	}
	/*public List<Beneficiaries> getBeneficiaries() {
		return beneficiaries;
	}
	public void setBeneficiaries(List<Beneficiaries> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}*/
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionType=" + transactionType
				+ ", transactionAmount=" + transactionAmount + ", transactionDate=" + transactionDate
				+ ", transactionDescription=" + transactionDescription + ", account=" + account + ", benificiary="
				+ benificiary + "]";/*, beneficiaries=" + beneficiaries + "]";
*/	}
	
	
	
}
