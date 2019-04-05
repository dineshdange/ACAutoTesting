package com.acautotest;

public class AutoTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	Login.doLogin();
		//gotoProject(WebDriver)
		//projectCreate
		//projectGet
		//clusterGet
		//clusterCreate
		//clusterRun
		//gotoCluster
		//createFlowBuilder
		//createFlowQuality
		//createSchedule
		Project.projectCreate("ACTest","IT", "Testing", Login.doLogin());
		
	}

}
