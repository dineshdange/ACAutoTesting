package com.acautotest;


import org.openqa.selenium.WebDriver;

import com.acautotest.admin.Admin;
import com.acautotest.admin.AdminImpl;
import com.acautotest.login.Login;
import com.acautotest.login.LoginImpl;
import com.acautotest.login.LoginModel;
import com.acautotest.util.ChromeDriverUtil;

public class Test_For_Login {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeDriverUtil.getChromeDriver();
		Login lg=new LoginImpl();
		driver=lg.gotoHome(driver);
		driver=lg.clickLogin(driver);
		driver=lg.loginWith("//a[@class='button alt color']", driver);
		LoginModel model =new LoginModel();
		//todo set the all fields.
		model.setUserName("dinesh@gbalasubramanianunicosoluti.onmicrosoft.com");
		model.setPassword("Avik@123");
		model.setConformationBtnXPath("//input[@class='btn btn-block btn-primary']");
		model.setNextClickXPath("//input[@class='btn btn-block btn-primary']");
		model.setPasswordXPath("//input[@id=\"i0118\"]");
		model.setUserNameXPath("//input[@class='form-control ltr_override']");
		model.setSigninBtnXPath("//input[@class='btn btn-block btn-primary']");
		
		driver=lg.doLogin(model, driver);
		Admin admin= new AdminImpl();
		admin.clickAdmin(driver);
		admin.clickLoginHistory(driver);
		admin.clickUser(driver);
		admin.selectUser(3, driver);
		
	}

}
