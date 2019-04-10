package com.acautotest;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLogin {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testDoLogin() throws InterruptedException {
		SampleLogin.doLogin();
	}

}
