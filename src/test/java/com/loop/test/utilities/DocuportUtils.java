package com.loop.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.InputMismatchException;

public class DocuportUtils {
   /**

    login to docuport
    @param driver, which initialized in testbase
    @param role, comes from docuport constants
    @author fuad
*/

    public static void login(WebDriver driver, String role) {
        driver.get(ConfigurationReader.getProperty("env"));
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@id='input-14']"));
        WebElement pasword = Driver.getDriver().findElement(By.xpath("//input[@id='input-15']"));
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        switch (role.toLowerCase()) {  // adviser
            case "client":
                username.sendKeys(ConfigurationReader.getProperty("client"));
                pasword.sendKeys(ConfigurationReader.getProperty("password"));
                break;
            case "supervisor":
                username.sendKeys(ConfigurationReader.getProperty("supervisor"));
                pasword.sendKeys(ConfigurationReader.getProperty("password"));
                break;
            case "advisor":
                username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
                pasword.sendKeys(DocuportConstants.PASSWORD);
                break;
            case "employee":
                username.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
                pasword.sendKeys(DocuportConstants.PASSWORD);
                break;
            default:
                throw new InputMismatchException("There is not suc a role: " + role);
        }
        loginButton.click();
    }
    /**

    logsout from the application
    @param driver
    @author nadir*/

    public static void logOut(WebDriver driver) {
        WebElement userIcon = Driver.getDriver().findElement(By.xpath("//div[@class='v-avatar primary']"));
        userIcon.click();
        WebElement logOut = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOut.click();
    }
    }

