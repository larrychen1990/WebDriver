package com.sayem;

import static org.junit.Assert.assertEquals;

import java.io.File;

import mx4j.log.Log;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class SeleniumUtil {
	private static Logger logger=Logger.getLogger(Log.class.getName());
	public static void TakeScreenshot(WebDriver driver, String filePath,
			String fileName) {
			try {
				File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				if (!fileName.endsWith(".png")) {
					fileName=fileName+".png";
				}
				File file = new File(filePath +"/"+fileName);
				
				FileUtils.copyFile(screenshotFile, file);
		        Reporter.log("<a href='"+ file.getAbsolutePath()+"'/> <img src='"+ file.getAbsolutePath() + "' height='100' width='100'/> </a>");

			} catch (Exception e) {
				logger.error(e.getMessage(), e.getCause());
				assertEquals(null, e);
			}
	}
}
