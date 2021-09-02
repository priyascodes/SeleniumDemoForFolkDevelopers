package com.folkdevelopers.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHello {

    @Test
    public void testHello() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Selenium/chromedriver_win32/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.id("orb-search-q"));
        searchBox.sendKeys("india");
        driver.findElement(By.id("orb-search-button")).click();
        Thread.sleep(4000);

        driver.quit();

    }
}
