package com.acautotest.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminImpl implements Admin{

	@Override
	public WebDriver clickAdmin(WebDriver driver) {
		driver.findElement(By.xpath("//a[@class='selected']")).click();
		return driver;
	}

	@Override
	public WebDriver clickUser(WebDriver driver) {
		driver.findElement(By.xpath("(//a[@routerlinkactive='active'])[1]")).click();
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return driver;
	}

	@Override
	public WebDriver clickLoginHistory(WebDriver driver) {
		driver.findElement(By.xpath("//a[@href='/elasticetl/admin/login-history']")).click();
		try {
			Thread.sleep(7000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return driver;
	}

	@Override
	public WebDriver selectUser(int index, WebDriver driver) {
		driver.findElement(By.xpath("(//tr[@class='hand'])["+index+"]")).click();
		return driver;
	}

	

}
