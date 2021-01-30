package org.mytests.tests.rozetkaTests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest {

    private String SEARCH_TEXT = "Test";
    private int WAIT_FOR_PAGE_LOAD_COMPLETE = 30;

    @Test
    public void checkAddToCart(){
        getHomePage().searchByKeyword(SEARCH_TEXT);
        getHomePage().clickOnSearchButton();
        getBasePage().waitForPageLoadComplete(WAIT_FOR_PAGE_LOAD_COMPLETE);
        assertTrue(getSearchPage().getSearchText().isDisplayed(),"text on search page");
    }



}
