package com.sayem.pageObjectPattern.automationFramework.pageFactory;

import java.util.concurrent.TimeUnit;

import mx4j.log.Log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Configuration;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sayem.SeleniumUtil;
import com.sayem.pageObjectPattern.pageObjects.Home_PG_POF;
import com.sayem.pageObjectPattern.pageObjects.LogIn_PG_POF;

public class PageFactory_TestCase {
	private Logger logger=Logger.getLogger(Log.class.getName());
	static WebDriver driver;
	Home_PG_POF HomePage;
	LogIn_PG_POF LoginPage;

	@BeforeClass
	public void beforeMethod() {
		
		System.setProperty("webdriver.firefox.bin",
				"./src/main/java/com/sayem/plugin/firefox/Mozilla Firefox/firefox.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.onlinestore.toolsqa.com");
		HomePage = PageFactory.initElements(driver, Home_PG_POF.class);
		LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);
	}

//	@Parameters("browser")
	@Test
	public void test() {
//		System.out.println(browser);
		HomePage.lnk_MyAccount.click();
		LoginPage.LogIn_Action("testuser_1", "Test@123");
		
		SeleniumUtil.TakeScreenshot(driver, "./output", "page");
		
		Reporter.log(" Login Successfully, now it is the time to Log Off buddy.",true);
		PropertyConfigurator.configure("./config/log4j.properties");
		
		logger.info("logined!");
		logger.error("error test!");
		HomePage.lnk_LogOut.click();
	}

	@AfterClass
	public void afterMethod() {
		driver.quit();
	}

}
