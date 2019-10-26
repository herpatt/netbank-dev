package com.dhanjyothi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Beneficiaries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long beneficiaryId;
	private int userId;
	private String beneficiaryNickName;
	private String beneficiaryName;
	public long getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(long beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getBeneficiaryNickName() {
		return beneficiaryNickName;
	}
	public void setBeneficiaryNickName(String beneficiaryNickName) {
		this.beneficiaryNickName = beneficiaryNickName;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	@Override
	public String toString() {
		return "Beneficiaries [beneficiaryId=" + beneficiaryId + ", userId=" + userId + ", beneficiaryNickName="
				+ beneficiaryNickName + ", beneficiaryName=" + beneficiaryName + "]";
	}
	
	
	
}
