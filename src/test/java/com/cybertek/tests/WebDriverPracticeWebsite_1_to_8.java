package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

/**
 * Guideline:  Please create test scripts from 1 through 5 in the same class,
 * with implementing @Before method for driver setup, and @After method for
 * driver close. Also, do the same thing for tests cases from 9 through 12.
 */

public class WebDriverPracticeWebsite_1_to_8 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    /**
     * Test case #1
     * Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
     * Step 2. Click on “Registration Form”
     * Step 3. Enter “wrong_dob” into date of birth input box.
     * Step 4. Verify that warning message is displayed: “The date of birth is not valid”
     */
    @Test
    public void test1() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        driver.findElement(By.name("birthday")).sendKeys("wrong_dob");
        String actualresult = driver.findElement(By.xpath("//small[text()='The date of birth is not valid']")).getText();
        String expectedresult = "The date of birth is not valid";
        Assert.assertEquals(expectedresult, actualresult);

    }

    /**
     * Test case #2
     * Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
     * Step 2. Click on “Registration Form”
     * Step 3. Verify that following options for programming languages are displayed: c++, java, JavaScript
     */

    @Test
    public void test2() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        List<WebElement> button = driver.findElements(By.cssSelector(".form-check-label"));
        Assert.assertEquals(button.get(0).getText(), "C++");
        Assert.assertEquals(button.get(1).getText(), "Java");
        Assert.assertEquals(button.get(2).getText(), "JavaScript");


    }

    /**
     * Test case #3
     * Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
     * Step 2. Click on “Registration Form”
     * Step 3. Enter only one alphabetic character into first name input box.
     * Step 4. Verify that warning message is displayed: “first name must be more than 2 and less than 64 characters long”
     */
    @Test
    public void test3() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        driver.findElement(By.name("firstname")).sendKeys("a");
        String actualresult = driver.findElement(By.xpath("//small[text()='first name must be more than 2 and less than 64 characters long']")).getText();
        String expectedresult = "first name must be more than 2 and less than 64 characters long";

        Assert.assertEquals(actualresult, expectedresult);



    }

}
