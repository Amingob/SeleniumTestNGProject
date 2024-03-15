package com.basetest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver wdriver;
    public String txtEmailAddress = "justin@gmail.com";
    public String txtPassWord = "12345";

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        wdriver = new ChromeDriver();

        wdriver.manage().window().maximize();
        wdriver.manage().deleteAllCookies();


    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        wdriver.quit();
    }
}
