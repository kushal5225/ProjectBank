package com.ProjectBank.DAOModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="RG_DTO" )
public class registrationDao {
	@Id
    @GeneratedValue
	int userId;
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;
	@Column(name="email")
	String email;
	@Column(name="mobile")
	int mobile;
	@Column(name="accountType")
	String accountType;
	@Column(name="creditCard")
	String creditCard;
	
	
	
    public registrationDao(int userId, String username, String password, String email, int mobile, String accountType,
			String creditCard) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.accountType = accountType;
		this.creditCard = creditCard;
	}
	
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
	
	
	

}
