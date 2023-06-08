package com.loop.test.day5_testNg_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task2 {

    //1. go to https://www.etsy.com/
    //2. search for rings
    //3. validate that Estimated Arrival shows any time
    //3. click Estimated Arrival dropdown
    //4. click Select custom date
    //5. choose may 30 from dropdown
    //6. validate Estimated Arrival shows may 30
    WebDriver driver;
    String actual;
    String expected;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public  void tearDownMethod(){
       driver.close();
    }
    @Test
    public  void searchItemMethod (){
        WebElement search = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        search.click();
        search.sendKeys( "rings" + Keys.ENTER);

       WebElement  arrivalTime= driver.findElement(By.xpath( "(//span[@class='wt-menu__trigger__label'])[1]"));
       Assert.assertEquals(arrivalTime.getText(),"Estimated Arrival Any time");
       arrivalTime.click();
       Select dropDown = new Select(driver.findElement(By.xpath( "(//select[@name='delivery_days'][1])")));
       dropDown.selectByIndex(2);
       expected="By May 30";
       actual= arrivalTime.getText();
       Assert.assertTrue(actual.contains(expected));

    }
}
