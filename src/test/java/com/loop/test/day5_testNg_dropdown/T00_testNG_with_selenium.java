package com.loop.test.day5_testNg_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T00_testNG_with_selenium {
//    @Test
//    public void googleTitle(){
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.google.com/");
//        String expected = "Google";
//        String actual = driver.getTitle();
//        Assert.assertEquals(expected, actual, "does not match");
//    }
//    @Test
//    public void docuportTitle(){
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://beta.docuport.app/");
//        String expected = "Docuport";
//        String actual = driver.getTitle();
//        Assert.assertTrue(actual.contains(expected));
//    }
WebDriver driver;
    String expected;
    String actual;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
     @AfterMethod
     public void tearDownMethod(){
        driver.close();
     }

    @Test
    public void googleTitle(){
        driver.get("https://www.google.com/");
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Google";
        actual = driver.getTitle();
        Assert.assertEquals(expected, actual, "does not match");
    }
    @Test
    public void docuportTitle(){
        driver.get("https://beta.docuport.app/");
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Docuport";
        actual = driver.getTitle();
        Assert.assertTrue(actual.contains(expected));
    }
}
