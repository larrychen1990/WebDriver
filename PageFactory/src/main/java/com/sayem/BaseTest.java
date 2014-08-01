package com.sayem;

import mx4j.log.Log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;

public class BaseTest{
	public static WebDriver driver;
	public static Logger logger=Logger.getLogger(Log.class.getName());
	
	static {
//		DOMConfigurator.configure("log4j.xml");
		PropertyConfigurator.configure("./config/log4j.properties");
		
		System.setProperty("webdriver.firefox.bin", "./src/main/java/com/sayem/plugin/firefox/Mozilla Firefox/firefox.exe");
		
		// Create a new instance of a driver
		driver = new FirefoxDriver();
		logger.info("driver init...");
		
		Reporter.setEscapeHtml(true);
		
		Reporter.log("driver ready!",true);
		Reporter.log("FAILED FAILED FAILED");
		Reporter.log("<a href='abc.html'>HREF</a>");
		//add screenshot to reports
//        Reporter.log("<a href='"+ file.getAbsolutePath()+"/selenium-reports/html/" + result.getName() + ".jpg'> <img src='"+ file.getAbsolutePath()+"/selenium-reports/html/"+ result.getName() + ".jpg' height='100' width='100'/> </a>");

	}

    @Before
    public void setUp() {
        // Navigate to the right place
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com.au/");
    }

     @After
     public void tearDown(){
         // Close the browser
         driver.quit();
     }

}
