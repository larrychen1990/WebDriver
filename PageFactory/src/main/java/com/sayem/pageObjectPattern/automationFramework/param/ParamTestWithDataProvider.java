package com.sayem.pageObjectPattern.automationFramework.param;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sayem.pageObjectPattern.pageObjects.Bean;
import com.sayem.pageObjectPattern.pageObjects.RunEnv;

public class ParamTestWithDataProvider {
//	    @DataProvider(name = "test1")
//	    public static Object[][] primeNumbers() {
//	        return new Object[][] { 
//		        		{ new Bean("hi I am the bean", 111) },
//		        		{ new Bean("hi I am the bean2", 222) }
//	        		};
//	    }
//
//	    @Test(dataProvider = "test1")
//	    public void testMethod(Bean myBean) {
//	        System.out.println(myBean.getVal() + " " + myBean.getI());
//	    }
	
	
	    @DataProvider(name = "test1")
	    public static Object[][] primeNumbers() {
	        return new Object[][] { 
		        		{ new RunEnv("local", "chrome")},
		        		{ new RunEnv("local", "firefox")},
		        		{ new RunEnv("local", "ie")}
	        		};
	    }
	    
	    
	    @BeforeMethod()
	    public void beforeMethod() {
	    	
	    }

	    @Test(dataProvider = "test1")
	    public void testMethod(RunEnv runEnv) {
	        System.out.println("env="+runEnv.getEnv()+" browser="+runEnv.getBrowser());
	    }
	    
	    
	    
	    
	    
	    
//	    @DataProvider(name = "dp")
//	    public Object[][] createData(Method m) {
//	      System.out.println(m.getName());  // print test method name
//	      return new Object[][] { new Object[] { "Cedric" }};
//	    }
//	     
//	    @Test(dataProvider = "dp")
//	    public void test1(String s) {
//	    }
//	     
//	    @Test(dataProvider = "dp")
//	    public void test2(String s) {
//	    }

}
