package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AppTest extends WebDriverSettings{
    @Test
    public void openGoogle(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.google.com/");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SearchPage.INPUT));
        Assert.assertTrue("Google".equals(driver.getTitle()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.search(QUEUE);
        ResultSetPage resultSetPage = searchPage.submit();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ResultSetPage.RESULT_HEADER));
        Assert.assertEquals("Картинки по запросу cats", resultSetPage.getResultHeader());
    }
}