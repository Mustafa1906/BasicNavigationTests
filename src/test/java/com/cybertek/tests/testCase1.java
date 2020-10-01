package com.cybertek.tests;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class testCase1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        driver.get(" https://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println(driver.getTitle().equals(title));
        Thread.sleep(1000);
        driver.navigate().forward();
        System.out.println(driver.getTitle().equals(etsyTitle));


    }
}
