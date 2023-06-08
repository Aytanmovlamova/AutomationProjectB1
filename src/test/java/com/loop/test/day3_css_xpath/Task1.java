package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
                WebElement userName = driver.findElement(By.cssSelector("input#input-14"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.cssSelector("input#input-15"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);

        WebElement login = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        login.click();
        Thread.sleep(3000);
        WebElement groupName = driver.findElement(By.cssSelector("span[class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3'"));
        if (groupName.isDisplayed()){
            System.out.println("Login was succesful");
        } else {
            System.out.println("Login failed");
        }
        groupName.click();
        Thread.sleep(3000);
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"list-item-88\"]/div/span"));
        logout.click();
        Thread.sleep(3000);
        WebElement login1=driver.findElement(By.cssSelector("[class='text-h5 font-weight-medium mb-6']"));
        if(login1.isDisplayed()){
            System.out.println("Logout was successful");
        }else{
            System.out.println("Logout failed");
        }
    }
}
