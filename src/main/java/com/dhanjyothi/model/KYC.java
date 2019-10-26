package com.dhanjyothi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KYC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int kyc_id;
	private String kyc_type;
	private String doc_description;
	private User user;
	public int getKyc_id() {
		return kyc_id;
	}
	public void setKyc_id(int kyc_id) {
		this.kyc_id = kyc_id;
	}
	public String getKyc_type() {
		return kyc_type;
	}
	public void setKyc_type(String kyc_type) {
		this.kyc_type = kyc_type;
	}
	public String getDoc_description() {
		return doc_description;
	}
	public void setDoc_description(String doc_description) {
		this.doc_description = doc_description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "KYC [kyc_id=" + kyc_id + ", kyc_type=" + kyc_type + ", doc_description=" + doc_description + ", user="
				+ user + "]";
	}
	
	
	
}
