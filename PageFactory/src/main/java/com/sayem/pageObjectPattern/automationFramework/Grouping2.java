package com.sayem.pageObjectPattern.automationFramework;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping2 {

	@BeforeSuite(groups= {"bs"})
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	
	@BeforeTest(groups= {"bt"})
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@BeforeClass(groups= {"bc"})
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeMethod(groups= {"bm"})
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@Test(groups = { "local" })
	public void local() {
//		public void local(Method m) {
//		System.out.println(m.getName());
		
		System.out.println("local");
	}
	@Test(groups = { "qa" })
	public void qa() {
		System.out.println("qa");
	}
	@Test(groups = { "uat" })
	public void uat() {
		System.out.println("uat");
	}
	
	@Test(groups = { "chrome" })
	public void chrome() {
		System.out.println("chrome");
	}

	@Test(groups = { "firefox" })
	public void firefox() {
		System.out.println("firefox");
	}

	@Test(groups = { "ie" })
	public void ie() {
		System.out.println("ie");
	}
	
	@Test
//	(groups= {"local","qa","uat","firefox","chrome","ie"})
	public void normalMethod() {
		System.out.println("normalMethod");
	}
	
	@Test
	public void noGroup() {
		System.out.println("noGroup");
	}
	
//	@Test(groups = { "windows" })
//	public void windows() {
//		System.out.println("windows");
//	}
//	
//	@Test(groups = { "linux" })
//	public void linux() {
//		System.out.println("linux");
//	}
}
