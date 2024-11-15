package com.ait.qa49;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstHomeworkInQaAutomation {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to("https://demowebshop.tricentis.com/apparel-shoes");




    }

    @Test
    public void openDemoWebShopTest(){
        System.out.println("The website Demo Web Shop is open");
    }

    @AfterMethod (enabled=false)
    public void tearDown(){
        driver.quit();
    }

}
