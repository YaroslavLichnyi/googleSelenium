package org.example.pagesPojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultSetPage {
    private WebDriver driver;
    private By resultHeader = By.name("GmE3X");;

    public ResultSetPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getResultHeader() {
        return resultHeader.;
    }
}
