package com.sayem.pageObjectPattern.automationFramework.param;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sayem.pageObjectPattern.pageObjects.RunEnv;

public class WebTest {
	public RunEnv env;

	
	public WebTest(RunEnv env) {
		this.env = env;
	}

	
	@BeforeMethod
	public void beforeMethod() {
//		System.out.println("bm");
	}
	
//	@Test
//	public void testServer() {
//		System.out.println("env="+env.getBrowser());
//	}

	
	@DataProvider(name="run")
	static public Object[][] dp() {
	  return new Object[][] {
			  { new RunEnv("local", "chrome")},
      		{ new RunEnv("local", "firefox")},
      		{ new RunEnv("local", "ie")}
	  };
	}

}
