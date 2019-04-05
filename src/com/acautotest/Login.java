package com.acautotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "E:\\AvikCloud_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "\\AvikCloud_Testing\\AvikAutomation\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.avikcloud.com");
	}

}

