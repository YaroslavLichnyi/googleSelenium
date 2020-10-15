package org.example.pagesPojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;
    private By input = By.name("q");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String queue){
        driver.findElement(input).sendKeys(queue);
        driver.findElement(input).submit();
    }


}
