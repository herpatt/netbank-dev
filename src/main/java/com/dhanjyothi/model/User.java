package com.dhanjyothi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class User {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userRole;
	private String userStatus;
	private String firstName;
	private String lastName;
	private String dob;
	private String addressLine1;
	private String addressLine2;
	private String city;
    private String state;
	private String pin;
	private String mobileNumber;
	private String emailId;
	private String aadharId;
	private String pan;
	private String userName;
	private String password;
	private String confirmPassword;
	private MultipartFile dobProof;
	private MultipartFile addressProof;
	private MultipartFile aadharProof;
	private MultipartFile panProof;
	private List<KYC> kycDetails ;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public MultipartFile getDobProof() {
		return dobProof;
	}
	public void setDobProof(MultipartFile dobProof) {
		this.dobProof = dobProof;
	}
	public MultipartFile getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(MultipartFile addressProof) {
		this.addressProof = addressProof;
	}
	public MultipartFile getAadharProof() {
		return aadharProof;
	}
	public void setAadharProof(MultipartFile aadharProof) {
		this.aadharProof = aadharProof;
	}
	public MultipartFile getPanProof() {
		return panProof;
	}
	public void setPanProof(MultipartFile panProof) {
		this.panProof = panProof;
	}
	public List<KYC> getKycDetails() {
		return kycDetails;
	}
	public void setKycDetails(List<KYC> kycDetails) {
		this.kycDetails = kycDetails;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userRole=" + userRole + ", userStatus=" + userStatus + ", firstName="
				+ firstName + ", lastName=" + lastName + ", dob=" + dob + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + ", pin=" + pin
				+ ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", aadharId=" + aadharId + ", pan=" + pan
				+ ", userName=" + userName + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", dobProof=" + dobProof + ", addressProof=" + addressProof + ", aadharProof=" + aadharProof
				+ ", panProof=" + panProof + ", kycDetails=" + kycDetails + "]";
	}
	
	
	
	
}
