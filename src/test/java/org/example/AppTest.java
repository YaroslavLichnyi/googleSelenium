package org.example;

import static org.junit.Assert.assertTrue;

import org.example.pagesPojo.SearchPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private WebDriver driver;
    public final static String QUEUE = "cats";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void afterTests(){
        //driver.quit();
    }

    @Test
    public void openGoogle(){
        driver.get("https://www.google.com/");
        Assert.assertTrue("Google".equals(driver.getTitle()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.search(QUEUE);
    }

    public void checkOpenedPage(){

    }
}