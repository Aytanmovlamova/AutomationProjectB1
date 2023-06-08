package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T3_upload {
    @Test
    public void upload_file() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("guru.url"));
        WebElement chooseFile = Driver.getDriver().findElement(By.id("uploadfile_0"));
        String path = "C://Users//theid//Desktop//some-file.txt";
        chooseFile.sendKeys(path);
        WebElement checkBox = Driver.getDriver().findElement(By.id("terms"));
        checkBox.click();
        WebElement submit = Driver.getDriver().findElement(By.id("submitbutton"));
        submit.click();
        WebElement successMessage = Driver.getDriver().findElement(By.id("res"));
        String expected = "1 file \nhas been succesfully uploaded";
        Thread.sleep(3000);
        assertEquals(successMessage.getText(), expected);
        //Driver.closeDrive
    }
}
