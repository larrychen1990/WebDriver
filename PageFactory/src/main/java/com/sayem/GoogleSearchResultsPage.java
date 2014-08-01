package com.sayem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchResultsPage{

    @FindBy(css = ".q.qs")
    WebElement images;

    public void clickImages() {
        images.click();
    }
}
