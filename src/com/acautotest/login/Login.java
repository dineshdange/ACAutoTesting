package com.acautotest.login;

import org.openqa.selenium.WebDriver;

public interface Login {
	public WebDriver gotoHome(WebDriver driver);
	public WebDriver clickLogin(WebDriver driver);
	public WebDriver loginWith(String loginType,WebDriver driver);
	public WebDriver doLogin(LoginModel model,WebDriver driver);
	/**
	 * @Todo add logout related parameters.
	 */
	public WebDriver doLogout(WebDriver driver);
	

}
