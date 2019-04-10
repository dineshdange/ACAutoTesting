package com.acautotest;

import org.openqa.selenium.WebDriver;

import com.acautotest.createproject.Project;
import com.acautotest.createproject.ProjectImpl;
import com.acautotest.createproject.ProjectModel;
import com.acautotest.util.DivakarLoginUtil;

public class Test_For_CreateProject {
	public static void main(String[] args)  {
		WebDriver driver = DivakarLoginUtil.divakarLogin();
		Project project = new ProjectImpl();
		driver=project.clickProject(driver);
		try {
			Thread.sleep(4000);
			
		} catch (Exception e) {
		}
		ProjectModel model= new ProjectModel();
		model.setProjectName("divakar");
		model.setBusinessUnit("avikcloud");
		model.setDescription("selenium test");
		driver= project.clickCreateProject(model, driver);
		driver = project.selectProject(driver);

}
}
