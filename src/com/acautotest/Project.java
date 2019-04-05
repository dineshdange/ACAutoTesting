package com.acautotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Project {
	
	public static WebDriver projectCreate() throws InterruptedException {
		WebDriver driver = Login.doLogin();
		//WebDriver driver = ChromeDriverUtil.getChromeDriver();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/nav[1]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"sub-nav\"]/ul/li/a")).click();
		driver.findElement(By.xpath("//*[@id=\"projectForm\"]/p[1]/input")).sendKeys("ACTesting1");
		driver.findElement(By.xpath("//*[@id=\"projectForm\"]/p[2]/input")).sendKeys("IT");
		driver.findElement(By.xpath("//*[@id=\"projectForm\"]/p[3]/input")).sendKeys("Testing Project");
		driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app/main/ng-component/app-project-list/div/div/div/div/div[3]/table/tbody/tr[1]/td[2]/span/a")).click();
		Thread.sleep(5000);
		return driver;
	}
	
}
