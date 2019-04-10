package com.acautotest.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginImpl implements Login {

	@Override
	public WebDriver clickLogin(WebDriver driver) {
		driver.findElement(By.xpath("(//a[@class='elementor-item'])[4]")).click();
		return driver;
	}

	@Override
	public WebDriver loginWith(String loginType, WebDriver driver) {
		driver.findElement(By.xpath(loginType)).click();
		return driver;
	}

	@Override
	public WebDriver doLogin(LoginModel model, WebDriver driver) {
		driver.findElement(By.xpath(model.getUserNameXPath())).sendKeys(model.getUserName());
		driver.findElement(By.xpath(model.getNextClickXPath())).click();
		driver.findElement(By.xpath(model.getPasswordXPath())).sendKeys(model.getPassword());
		try {
			Thread.sleep(7000);
			driver.findElement(By.xpath(model.getSigninBtnXPath())).click();
			driver.findElement(By.xpath(model.getConformationBtnXPath())).click();
			Thread.sleep(8000);
		}catch(Exception e) {
			
		}
		return driver;
	}

	@Override
	public WebDriver doLogout(WebDriver driver) {
		return driver;
	}

	@Override
	public WebDriver gotoHome(WebDriver driver) {
		driver.navigate().to("https://www.avikcloud.com");
		return driver;
	}

}
