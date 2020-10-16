package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultSetPage {
    private WebDriver driver;
    public static final By RESULT_HEADER = new By.ByXPath("//div[@class='LnbJhc']//h3[@class='GmE3X']");

    public ResultSetPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getResultHeader() {
        return driver.findElement(RESULT_HEADER).getText();
    }
}