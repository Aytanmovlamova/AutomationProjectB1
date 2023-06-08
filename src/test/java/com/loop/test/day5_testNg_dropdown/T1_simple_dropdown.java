package com.loop.test.day5_testNg_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_simple_dropdown {

    WebDriver driver;

    String expected = "Please select an option";

    String actual;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

    @Test
    public void dropdownTest() {
        driver.get("http://the-internet.herokuapp.com/dropdown%22");
                // created dropdown
//        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='dropdown']"));
//        Select dropdown = new Select(dropdownElement);
                Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        // gives us what is already selected
        actual = dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, expected, "does not match");
    }
}
