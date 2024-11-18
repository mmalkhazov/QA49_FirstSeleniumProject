package com.ait.qa49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());


        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());


        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());


    }

    @Test
    public void findElementBySimpleLocators() {
        WebElement city = driver.findElement(By.id("city"));
        System.out.println(city.getText());

        WebElement className = driver.findElement(By.className("header"));
        System.out.println(className.getText());

//    WebElement linkText = driver.findElement(By.linkText("let-car-work"));
//    System.out.println(linkText.getText());

        driver.findElement(By.partialLinkText("car"));
//    System.out.println(className.getText());

    }


    @Test
    public void findElementByCssSelectorsTest() {
        driver.findElement(By.cssSelector("#city"));

        driver.findElement(By.cssSelector(".header"));

        driver.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));

        driver.findElement(By.cssSelector("[href*='login']"));

        driver.findElement(By.cssSelector("[href^='/log']"));

        driver.findElement(By.cssSelector("[href$='search']"));
    }
}
