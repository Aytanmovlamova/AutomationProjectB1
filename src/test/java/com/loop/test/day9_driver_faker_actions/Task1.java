package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {
    @Test
    public void hover_test() throws InterruptedException {
        Driver.getDriver().get("https://loopcamp.vercel.app/hovers.html%22");
                Actions action = new Actions(Driver.getDriver());
        WebElement firstImage = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][1]"));
        Thread.sleep(3000);
        // firstImage.click();
        action.moveToElement(firstImage).perform();
        WebElement image = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']") );
        Assert.assertTrue(image.isDisplayed());

        WebElement viewProfile = Driver.getDriver().findElement(By.xpath("//a[@href='users/1.html']") );
        Thread.sleep(3000);
        Assert.assertTrue(viewProfile.isDisplayed());

        WebElement secondImage = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        Thread.sleep(3000);
        // firstImage.click();
        action.moveToElement(secondImage).perform();
        WebElement nameUser2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']") );
        Assert.assertTrue(nameUser2.isDisplayed());

        WebElement viewProfile2 = Driver.getDriver().findElement(By.xpath("//a[@href='users/2.html']") );
        Thread.sleep(3000);
        Assert.assertTrue(viewProfile2.isDisplayed());

        WebElement thirdImage = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));
        Thread.sleep(3000);
        // firstImage.click();
        action.moveToElement(secondImage).perform();
        WebElement nameUser3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']") );
        Assert.assertTrue(nameUser2.isDisplayed());

        WebElement viewProfile3 = Driver.getDriver().findElement(By.xpath("//a[@href='users/3.html']") );
        Thread.sleep(3000);
        Assert.assertTrue(viewProfile3.isDisplayed());


    }



}
