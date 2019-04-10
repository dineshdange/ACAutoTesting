package com.acautotest.createproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectImpl implements Project{

	@Override
	public WebDriver clickProject(WebDriver driver) {
		driver.findElement(By.xpath("(//a[@href='/elasticetl/projects'])[1]")).click();
		return driver;
	}

	@Override
	public WebDriver clickCreateProject(ProjectModel model,WebDriver driver) {
		driver.findElement(By.xpath("//a[@class='button alt create btn btn-lg btn-outline-primary']")).click();
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
		}
		driver.findElement(By.xpath("//*[@id=\"projectForm\"]/p[1]/input")).sendKeys(model.getProjectName());
		driver.findElement(By.xpath("//*[@id=\"projectForm\"]/p[2]/input")).sendKeys(model.getBusinessUnit());
		driver.findElement(By.xpath("//*[@id=\"projectForm\"]/p[3]/input")).sendKeys(model.getDescription());
		driver.findElement(By.xpath("(//button[@class='button alt'])[2]")).click();
		try {
			Thread.sleep(6000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return driver;
	}


	@Override
	public WebDriver selectProject(WebDriver driver) {
		driver.findElement(By.xpath("(//a[@href='./repository'])[3]")).click();
		return driver;
	}

	
}
