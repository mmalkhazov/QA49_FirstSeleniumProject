package com.ait.qa49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_13 {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementBySimpleLocators() {
        driver.findElement(By.id("dialog-notifications-success"));
        driver.findElement(By.id("bar-notification"));

        driver.findElement(By.className("master-wrapper-page"));
        driver.findElement(By.className("header-logo"));

        driver.findElement(By.linkText("Books"));
        driver.findElement(By.linkText("Twitter"));
        driver.findElement(By.linkText("Addresses"));

        driver.findElement(By.partialLinkText("About"));
        driver.findElement(By.partialLinkText("us"));
        driver.findElement(By.partialLinkText("cart"));




    }

    @Test
    public void findElementByCssSelectors(){
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("#mob-menu-button"));

        driver.findElement(By.cssSelector(".master-wrapper-content"));
        driver.findElement(By.cssSelector(".header-selectors-wrapper"));

        driver.findElement(By.cssSelector("[href='http://www.nopcommerce.com/']"));
        driver.findElement(By.cssSelector("[href='/customer/info']"));

        driver.findElement(By.cssSelector("[href*='facebook']"));
        driver.findElement(By.cssSelector("[href*='twitter']"));


        driver.findElement(By.cssSelector("[href^='/wish']"));
        driver.findElement(By.cssSelector("[href$='/info']"));






    }


}
