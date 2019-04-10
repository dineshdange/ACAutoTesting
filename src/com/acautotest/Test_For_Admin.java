package com.acautotest;

import org.openqa.selenium.WebDriver;

import com.acautotest.admin.Admin;
import com.acautotest.admin.AdminImpl;
import com.acautotest.util.DivakarLoginUtil;

public class Test_For_Admin {
	public static void main(String[] args) {
		WebDriver driver = DivakarLoginUtil.divakarLogin();
		Admin admin = new AdminImpl();
		driver = admin.clickAdmin(driver);
		driver = admin.clickLoginHistory(driver);
		try {
			Thread.sleep(2000);
			driver = admin.clickUser(driver);
			driver = admin.selectUser(2, driver);

		} catch (Exception e) {

		}

	}

}
