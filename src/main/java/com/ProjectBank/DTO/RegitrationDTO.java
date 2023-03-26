package com.ProjectBank.DTO;


public class RegitrationDTO {
   
	int userId;
 
	String username;
	String password;
	String email;
	int mobile;
	String accountType;
	String creditCard;
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "RegitrationDTO [userId=" + userId + ", username=" + username + ", password=" + password + ", email="
				+ email + ", mobile=" + mobile + ", accountType=" + accountType + ", creditCard=" + creditCard + "]";
	}	
	
	
}
