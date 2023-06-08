package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task1 extends TestBase {
    //1. go to https://demoqa.com/alerts
    //2. click - click button to see alert
    //3. handle alert
    //4. click - On button click, alert will appear after 5 seconds
    //5. handle alert
    //6. click - On button click, confirm box will appear
    //7. click ok and validate - You selected Ok
    //8. after that do it again this time cancel and validate - You selected Cancel
    //9. click - On button click, prompt box will appear
    //10. enter "Loop Academy" and validate You entered Loop Academy
    @Test
    public void informationAlert () throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        WebElement clickForInformationAlert=driver.findElement(By.xpath("(//button[contains(text(),'')])[2]"));
        clickForInformationAlert.click();
        Alert alert = driver.switchTo().alert();
        // driver.switchTo().alert().accept();
        //Thread.sleep(3000);
        alert.accept();
    }
    @Test
    public void informationAlert2 () throws InterruptedException{
        driver.get("https://demoqa.com/alerts");
        WebElement clickForInformationAlert2=driver.findElement(By.xpath("(//button[contains(text(),'')])[3]"));
        Thread.sleep(7000);
        clickForInformationAlert2.click();
        Thread.sleep(7000);
        Alert alert = driver.switchTo().alert();
        // driver.switchTo().alert().accept();
        alert.accept();

    }
    @Test
    public void confirmBox () throws InterruptedException{
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement confirmBox=driver.findElement(By.xpath("(//button[contains(text(),'')])[4]"));
        confirmBox.click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        // driver.switchTo().alert().accept();
        Thread.sleep(3000);
        alert.accept();
        WebElement successMessage= driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String actual = successMessage.getText();
        String expected="You selected Ok";
        Assert.assertTrue(actual.contains(expected));
        WebElement clickBox=driver.findElement(By.xpath("(//button[contains(text(),'')])[4]"));
        Thread.sleep(3000);
        clickBox.click();
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();
        WebElement cancelMessage= driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String actual1 = cancelMessage.getText();
        String expected1="You selected Cancel";
        Assert.assertTrue(actual1.contains(expected1));
        WebElement promtBox=driver.findElement(By.xpath("(//button[contains(text(),'')])[5]"));
        promtBox.click();
        Thread.sleep(3000);
        Alert alert2 = driver.switchTo().alert();
        // driver.switchTo().alert().accept();
        alert2.sendKeys("Loop Academy");
        Thread.sleep(3000);
        alert.accept();
        WebElement message = driver.findElement(By.xpath("//span[@id='promptResult']"));
        String actual2= message.getText();
        String expected2= "Loop Academy";
        Thread.sleep(3000);
        Assert.assertTrue(actual2.contains(expected2));






    }

}
