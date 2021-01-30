package org.mytests.tests.rozetkaTests;

import org.mytests.uiobjects.example.site.rozetkaPages.BasePage;
import org.mytests.uiobjects.example.site.rozetkaPages.MainPageRozetka;
import org.mytests.uiobjects.example.site.rozetkaPages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private WebDriver driver;
    private static final String ROZETKA_URL = "https://rozetka.com.ua/ua/";

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ROZETKA_URL );
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }


    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public MainPageRozetka getHomePage() {
        return new MainPageRozetka(getDriver());
    }

    public SearchPage getSearchPage() {
        return new SearchPage(getDriver());
    }
}
