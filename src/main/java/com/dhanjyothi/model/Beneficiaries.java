package com.dhanjyothi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BENEFICIARY")
public class Beneficiaries {
	@Id
	@Column(name = "BEN_ID")
	private String beneficiaryId;
	@Column(name = "BEN_TYPE", columnDefinition = "char")
	private String beneficiaryType;
	@Column(name = "OWNER_ID")
	private String userId;
	@Column(name = "BEN_NICK_NAME")
	private String beneficiaryNickName;
	@Column(name = "BEN_NAME")
	private String beneficiaryName;
	@Column(name = "BEN_BANK")
	private String beneficiaryBankName;
	@Column(name = "BEN_BANK_IFSC")
	private String beneficiaryBankIfsc;
	@Column(name = "BEN_ACCT_NUM")
	private int beneficiaryAccountNumber;

	public String getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
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

	public String getBeneficiaryBankName() {
		return beneficiaryBankName;
	}

	public void setBeneficiaryBankName(String beneficiaryBankName) {
		this.beneficiaryBankName = beneficiaryBankName;
	}

	public String getBeneficiaryBankIfsc() {
		return beneficiaryBankIfsc;
	}

	public void setBeneficiaryBankIfsc(String beneficiaryBankIfsc) {
		this.beneficiaryBankIfsc = beneficiaryBankIfsc;
	}

	public int getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(int beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	public String getBeneficiaryType() {
		return beneficiaryType;
	}

	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	@Override
	public String toString() {
		return "Beneficiaries [beneficiaryId=" + beneficiaryId + ", beneficiaryType=" + beneficiaryType + ", userId="
				+ userId + ", beneficiaryNickName=" + beneficiaryNickName + ", beneficiaryName=" + beneficiaryName
				+ ", beneficiaryBankName=" + beneficiaryBankName + ", beneficiaryBankIfsc=" + beneficiaryBankIfsc
				+ ", beneficiaryAccountNumber=" + beneficiaryAccountNumber + "]";
	}

}
