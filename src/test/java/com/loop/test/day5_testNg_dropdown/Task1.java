package com.loop.test.day5_testNg_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task1 {


    //1. go to http://the-internet.herokuapp.com/dropdown
    //2. validate "Please select an option" is selected by default
    //3. Choose option 1 and validate that it is selected
    //4. Choose option 2 and validate that it is selected
    //5. Validate dropdown name is "Dropdown List"
    WebDriver driver;
    String actual;
    String expected;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDownMethod() {
         driver.close();
    }
    @Test
    public void dropDown() throws InterruptedException {

        WebElement name = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropdown = new Select(name);
        actual = dropdown.getFirstSelectedOption().getText();
        expected = "Please select an option";
        Thread.sleep(3000);
        Assert.assertEquals(actual, expected);
        dropdown.selectByIndex(1);
        actual = dropdown.getFirstSelectedOption().getText();
        expected = "Option 1";
        Assert.assertEquals(actual, expected);
        Thread.sleep(3000);
        dropdown.selectByValue("2");
        actual = dropdown.getFirstSelectedOption().getText();
        expected = "Option 2";
        Assert.assertEquals(actual, expected);
        WebElement dropDownList = driver.findElement(By.xpath("//div[@id='content']//h3"));
        Assert.assertEquals(dropDownList.getText(), "Dropdown List");


    }

}
