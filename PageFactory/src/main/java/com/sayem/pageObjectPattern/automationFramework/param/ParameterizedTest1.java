package com.sayem.pageObjectPattern.automationFramework.param;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
	@Test
	@Parameters("myName")
	public void parameterTest(@Optional("anyName") String myName) {
		System.out.println("Parameterized value is : " + myName);
	}
}
