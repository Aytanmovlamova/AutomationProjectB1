package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3 {
    @Test
    public void test(){
        Driver.getDriver().get("https://loopcamp.vercel.app/upload.html%22");
                WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        String path = "C://Users//theid//Desktop//some-file.txt";
        chooseFile.sendKeys(path);

        WebElement uploadFile = Driver.getDriver().findElement(By.id("file-submit"));
        // uploadFile.click();
        Assert.assertTrue(uploadFile.isDisplayed());


    }
}
