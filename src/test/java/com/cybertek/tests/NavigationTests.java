package com.cybertek.tests;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {
        callChrome("chrome");

    }

    public static WebDriver callChrome(String browser){
        WebDriver driver=null;
        if(browser.equalsIgnoreCase("chrome")) {
            driver= BrowserFactory.getDriver("chrome");
            driver.get("https://www.google.com");
            // driver.close();
        }
        return driver;
    }
}
