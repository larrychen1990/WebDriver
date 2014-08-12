package com.sayem.pageObjectPattern.automationFramework.param;

import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sayem.pageObjectPattern.pageObjects.RunEnv;

public class WebTestChild {
//extends WebTest{

//	@Factory(dataProvider="run")
//	public WebTestChild(RunEnv env) {
//		super(env);
//	}
	
	@Test(alwaysRun=true)
	@Parameters({"e","b"})
	public void ss(String e,String b) {
		System.out.println(e);
		System.out.println(b);
	}
	
//	@Test
//	public void sss() {
//		System.out.println("sss2="+env.getBrowser());
//	}
	

}
