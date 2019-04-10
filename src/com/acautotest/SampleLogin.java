package com.acautotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.acautotest.util.ChromeDriverUtil;


public class SampleLogin {

		public static WebDriver doLogin() {
		WebDriver driver = ChromeDriverUtil.getChromeDriver();
		driver.navigate().to("https://www.avikcloud.com");
		driver.findElement(By.xpath("(//a[@class='elementor-item'])[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"azure\"]/a")).click();
		driver.findElement(By.id("i0116")).sendKeys("dinesh@gbalasubramanianunicosoluti.onmicrosoft.com");
		driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"i0118\"]")).sendKeys("Avik@123");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

}

