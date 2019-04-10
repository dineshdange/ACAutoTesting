package com.acautotest.login;

public class LoginModel {
	private String userNameXPath;
	private String userName;
	private String password;
	private String passwordXPath;
	private String nextClickXPath;
	private String signinBtnXPath;
	private String conformationBtnXPath;
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
	
	public String getNextClickXPath() {
		return nextClickXPath;
	}
	public void setNextClickXPath(String nextClickXPath) {
		this.nextClickXPath = nextClickXPath;
	}
	public String getUserNameXPath() {
		return userNameXPath;
	}
	public void setUserNameXPath(String userNameXPath) {
		this.userNameXPath = userNameXPath;
	}
	public String getPasswordXPath() {
		return passwordXPath;
	}
	public void setPasswordXPath(String passwordXPath) {
		this.passwordXPath = passwordXPath;
	}
	public String getSigninBtnXPath() {
		return signinBtnXPath;
	}
	public void setSigninBtnXPath(String signinBtnXPath) {
		this.signinBtnXPath = signinBtnXPath;
	}
	public String getConformationBtnXPath() {
		return conformationBtnXPath;
	}
	public void setConformationBtnXPath(String conformationBtnXPath) {
		this.conformationBtnXPath = conformationBtnXPath;
	}
	
	
}
