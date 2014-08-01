package com.sayem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage {

    @FindBy(name = "q")
    @CacheLookup
    private WebElement searchBox;

    public void searchFor(String text) {
        // And here we use it. Note that it looks like we've
        // not properly instantiated it yet....
        searchBox.sendKeys(text);
        searchBox.submit();
    }

}
