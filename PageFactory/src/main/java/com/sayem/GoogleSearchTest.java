package com.sayem;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class GoogleSearchTest extends BaseTest{

    @Test
    public void searchForCheese() {
        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        GoogleSearchPage searchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
        // And now do the search.
        searchPage.searchFor("Cheese");
        
    	Reporter.log("FAILED FAILED FAILED",true);
		Reporter.log("<a href='abc.html'>HREF</a>");
		
        // Initialize the results page
        GoogleSearchResultsPage resultsPage = PageFactory.initElements(driver, GoogleSearchResultsPage.class);
        // Click the 'Images' link in the sidebar
        resultsPage.clickImages();
    }

}