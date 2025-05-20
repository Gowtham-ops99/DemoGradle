package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebpageTest {
    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://example.com/");
    }

    @Test
    public void titleValidationTest() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Example Domain";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}