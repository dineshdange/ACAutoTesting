package com.acautotestcluster;

import org.openqa.selenium.WebDriver;

public interface Cluster {

	public WebDriver gotoFlow();

	public WebDriver gotoConnection();

	public WebDriver gotoSchedule();

	public WebDriver gotoMonitor();
}
