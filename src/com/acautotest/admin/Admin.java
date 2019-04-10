package com.acautotest.admin;

import org.openqa.selenium.WebDriver;

public interface Admin {
	public WebDriver clickAdmin(WebDriver driver);
	public WebDriver clickUser(WebDriver driver);
	public WebDriver clickLoginHistory(WebDriver driver);
	public WebDriver selectUser(int Index,WebDriver driver);

}
