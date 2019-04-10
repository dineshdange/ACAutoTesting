package com.acautotest.util;

import org.openqa.selenium.WebDriver;

import com.acautotest.login.Login;
import com.acautotest.login.LoginImpl;
import com.acautotest.login.LoginModel;

public class DivakarLoginUtil {
	public static WebDriver divakarLogin() {
		WebDriver driver=ChromeDriverUtil.getChromeDriver();
		Login lg=new LoginImpl();
		driver=lg.gotoHome(driver);
		driver=lg.clickLogin(driver);
		driver=lg.loginWith("//a[@class='button alt color']", driver);
		LoginModel model =new LoginModel();
		//todo set the all fields.
		model.setUserName("divakar@gbalasubramanianunicosoluti.onmicrosoft.com");
		model.setPassword("Divapriya2");
		model.setConformationBtnXPath("//input[@class='btn btn-block btn-primary']");
		model.setNextClickXPath("//input[@class='btn btn-block btn-primary']");
		model.setPasswordXPath("//input[@id=\"i0118\"]");
		model.setUserNameXPath("//input[@class='form-control ltr_override']");
		model.setSigninBtnXPath("//input[@class='btn btn-block btn-primary']");
		
		driver=lg.doLogin(model, driver);
		return driver;
	}

}
