package com.sayem.pageObjectPattern.automationFramework.param;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWebServer {
	@Test
	@Parameters("number-of-times")
	public void accessPage(int numberOfTimes) {
			System.out.println(numberOfTimes);
	}

}
