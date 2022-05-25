//package com.selenium;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//import java.util.Base64;
//
//public class seleniumLocator {
//    WebDriver webDriver;
//
//    @Before
//    public void init() {
//        WebDriverManager.chromedriver().setup();
//        webDriver = new ChromeDriver();
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        webDriver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
//        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//    }
//
//    @After
//    public void done() {
//        webDriver.close();
//    }
//
//    @Test
//    public void openBrowser(){
//        webDriver.get("https://www.amazon.com/");
//        webDriver.findElement(By.name("field-keywords")).sendKeys("samsung SSD");
//        webDriver.findElement(By.id("nav-search-submit-button")).click();
//    }
//}
