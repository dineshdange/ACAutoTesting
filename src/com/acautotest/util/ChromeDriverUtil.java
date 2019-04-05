package com.acautotest.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverUtil {
	public static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "\\AvikCloud_Testing\\AvikAutomation\\Drivers\\chromedriver.exe");
		
		ChromeOptions chromeopts = new ChromeOptions();
		chromeopts.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeopts);
		return driver;
		
	}
}
