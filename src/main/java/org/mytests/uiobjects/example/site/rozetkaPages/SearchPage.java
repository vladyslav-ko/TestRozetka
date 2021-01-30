package org.mytests.uiobjects.example.site.rozetkaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//h1[@class='catalog-heading']")
    private WebElement searchText;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchText() {
        return searchText;
    }
}
