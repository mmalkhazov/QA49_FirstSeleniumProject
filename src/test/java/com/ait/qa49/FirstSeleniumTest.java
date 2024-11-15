package com.ait.qa49;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

public class FirstSeleniumTest {

    WebDriver driver;
    //before - setUP
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.navigate().to("https://www.google.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    //test
    @Test
    public void openGoogleTest(){
        System.out.println("Google open");
    }


    // after - tearDown
    @AfterMethod(enabled =true)
    public void tearDown(){
//        driver.quit();
        driver.close();
    }
}
