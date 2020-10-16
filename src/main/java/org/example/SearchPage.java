package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    public final static By INPUT = By.name("q");

    public void open(){

    }

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String queue){
        driver.findElement(INPUT).sendKeys(queue);
    }

    public ResultSetPage submit(){
        driver.findElement(INPUT).submit();
        return new ResultSetPage(driver);
    }
}
