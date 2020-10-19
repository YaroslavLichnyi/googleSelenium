package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AppTest extends WebDriverSettings{
    @Test
    public void openGoogle(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.open();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SearchPage.INPUT));
        Assert.assertTrue("Google".equals(driver.getTitle()));
        searchPage.search(QUEUE);
        ResultSetPage resultSetPage = searchPage.submit();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ResultSetPage.RESULT_HEADER));
        Assert.assertTrue( resultSetPage.getResultHeader().contains(QUEUE));
    }
}