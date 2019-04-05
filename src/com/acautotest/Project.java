package com.acautotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Project {
	
	public static WebDriver projectCreate(String projectName, String businessUnit, String description, WebDriver driver) {
		//WebDriver driver = Login.doLogin();
		//WebDriver driver = ChromeDriverUtil.getChromeDriver();
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div/nav[1]/ul/li[1]/a")).click();
		gotoProject(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on Create Project
		driver.findElement(By.xpath("//*[@id=\"sub-nav\"]/ul/li/a")).click();
		//enter Project details
		driver.findElement(By.xpath("//*[@id=\"projectForm\"]/p[1]/input")).sendKeys(projectName);
		driver.findElement(By.xpath("//*[@id=\"projectForm\"]/p[2]/input")).sendKeys(businessUnit);
		driver.findElement(By.xpath("//*[@id=\"projectForm\"]/p[3]/input")).sendKeys(description);
		//Click on create Project
		driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("/html/body/app/main/ng-component/app-project-list/div/div/div/div/div[3]/table/tbody/tr[1]/td[2]/span/a")).click();
		return driver;
	}
	public static WebDriver projectGet(WebDriver driver) {
		gotoProject(driver);
		//Click on the created Project
		driver.findElement(By.xpath("/html/body/app/main/ng-component/app-project-list/div/div/div/div/div[3]/table/tbody/tr[1]/td[2]/span/a")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	public static WebDriver gotoProject(WebDriver driver) {
		//click on Projects Page
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/nav[1]/ul/li[1]/a")).click();
		return driver;
	}
	
}
