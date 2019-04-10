package com.acautotest.createproject;

import org.openqa.selenium.WebDriver;

public interface Project {
	public WebDriver clickProject(WebDriver driver);

	public WebDriver clickCreateProject(ProjectModel model,WebDriver driver);

    public WebDriver selectProject(WebDriver driver);

}
