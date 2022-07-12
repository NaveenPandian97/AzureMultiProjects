package com.springmvcxml.model;

public class User {
	
	private String firstName;
	private String lastName;
	private String password;
	private String confirmPassword;
	private String emailId;
	
	public User() {
		super();
	}

	public User(String firstName, String lastName, String password, String confirmPassword, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.emailId = emailId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", emailId=" + emailId + "]";
	}
	
	

}
