package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task {
    @Test
    public void LOOPCAMP_test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        Actions actions = new Actions(Driver.getDriver());
        WebElement poweredByLoop = Driver.getDriver().findElement(By.xpath("//div[contains(@style,'text-align: center;margin-bottom: 40px')]"));
        actions.moveToElement(poweredByLoop).perform();

        WebElement logoLoop = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link d-flex align-items-end']"));
        Thread.sleep(3000);
        actions.moveToElement(logoLoop).perform();


    }
}
