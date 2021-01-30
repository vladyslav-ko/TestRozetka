package org.mytests.uiobjects.example.site.rozetkaPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageRozetka extends BasePage{

    @FindBy(xpath = "//input[contains(@class,'search-form')]")
    private WebElement searchInput;

    @FindBy(xpath = "//button[contains(@class,'search-form__submit')]")
    private WebElement searchButton;

    public MainPageRozetka(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }
}
