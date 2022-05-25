package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumJunit2 {
    WebDriver webDriver;
    @Before
    public void init(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();

    }

    @After
    public void close(){
        webDriver.close();
    }

    @Test
    public void openBrowser(){
        webDriver.get("https://google.com");
    }

    @Test
    public void openBrowser2(){
        webDriver.get("https://amazon.com");
    }
}
