package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task5_optional {
    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        DocuportUtils.login(Driver.getDriver(), "advisor");
        WebElement myUpload = Driver.getDriver().findElement(By.xpath("//span[.='My uploads']"));
        myUpload.click();

        WebElement uploadDocuments = Driver.getDriver().findElement(By.xpath("//span[text()='Upload documents']"));
        uploadDocuments.click();
        WebElement uploadFile = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        String path = "C://Users//theid//Desktop//some-file.txt";
        uploadFile.sendKeys(path);

        WebElement client = Driver.getDriver().findElement(By.xpath("//div[@class='v-select__slot']/.."));
        client.click();
        WebElement test = Driver.getDriver().findElement(By.xpath("//div[.='Test']") );
        test.click();

        WebElement service = Driver.getDriver().findElement(By.xpath("//label[contains(.,'Service')]/.."));
        service.click();
        WebElement description = Driver.getDriver().findElement(By.xpath("(//div[.='Bookkeeping'])[4]"));
        description.click();

        WebElement checkBox = Driver.getDriver().findElement(By.xpath("//label[.='Upload on behalf of client']/.."));
        checkBox.click();
        WebElement check = Driver.getDriver().findElement(By.xpath("//span[.=' IRS/State Letter ']"));
        check.click() ;
        WebElement q =Driver.getDriver().findElement(By.xpath("//span[.=' Q4 ']") );
        q.click() ;

        WebElement description1 = Driver.getDriver().findElement(By.id("input-148"));
        description1.sendKeys("new client");
        WebElement upload = Driver.getDriver().findElement(By.xpath("//span[.=' Upload ']") );
        upload.click();




    }
}
