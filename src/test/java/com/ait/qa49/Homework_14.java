package com.ait.qa49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_14 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByXpath(){

        driver.findElement(By.xpath("//div[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//div[contains(., 'nopCommerce')]"));

        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        driver.findElement(By.xpath("//span[text()='Sign up for our newsletter:']"));
        driver.findElement(By.xpath("//div[@class='header-logo']"));

        driver.findElement(By.xpath("//p[.='Welcome to the new Tricentis store!']"));
        driver.findElement(By.xpath("//div[@class='column my-account']/.."));
        driver.findElement(By.xpath("//div[@class='column my-account']/parent::*"));

        driver.findElement(By.xpath("//div[@class='top-menu-triangle']/.."));
        driver.findElement(By.xpath("//div[@class='footer-poweredby']/ancestor::*"));
        driver.findElement(By.xpath("//div[@class='footer-poweredby']/ancestor::div[2]"));



        driver.findElement(By.xpath("//div[@class='footer-poweredby']/following-sibling::*"));
        driver.findElement(By.xpath("//div[@class='top-menu-triangle']/following-sibling::*"));
        driver.findElement(By.xpath("//div[@class='column my-account']/preceding-sibling::*"));











    }




}
