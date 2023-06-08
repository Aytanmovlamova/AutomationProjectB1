package com.loop.test.day7_windows_webtables;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T3_webTables extends TestBase {
    /*
   1. login as an advisor
   2. go to users
   3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
   4. validate that user name for alex.de.souza@gmail.com is alexdesouze
   5. validate that phone number for alex.de.souza@gmail.com is +994512060042
   6. validate that role for alex.de.souza@gmail.com is client
   7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
    */
    @Test
    public void web_test() {
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
        String actual = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.FULLNAME);
        String expected = DocuportConstants.ALEX_DE_SOUZA;
        System.out.println("Full name: " + actual);
        Assert.assertEquals(actual, expected);
        String actualUserName = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.USERNAME);
        String expectedUserName = DocuportConstants.USER_NAME;
        System.out.println("User name:" + actualUserName);
        Assert.assertEquals(actualUserName, expectedUserName);
        String actualUserNameRole = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.ROLE);
        String expectedUserNameRole = DocuportConstants.ROLE_NAME;
        System.out.println("Role: " + actualUserNameRole);
        Assert.assertEquals(actualUserNameRole, expectedUserNameRole);
        String actualUserPhoneNumber = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.PHONE_NUMBER);
        String expectedUserPhoneNumber = DocuportConstants.PHONE_NUMBERS;
        System.out.println("Phone number: " + actualUserPhoneNumber);
        Assert.assertEquals(actualUserPhoneNumber, expectedUserPhoneNumber);

        String actualUserEmail = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.EMAIL_ALEX);
        String expectedUserEmail = DocuportConstants.EMAIL_ALEX;
        System.out.println("Email: " + actualUserEmail);
        Assert.assertEquals(actualUserEmail, expectedUserEmail);

        String actualUserAdvisor = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.ADVISOR_ALEX);
        String expectedUserAdvisor = DocuportConstants.ADVISORS;
        System.out.println("Advisor: " + actualUserAdvisor);
        Assert.assertEquals(actualUserAdvisor, expectedUserAdvisor);
    }
    @Test(priority = 2)
    public void web_test1(){
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
        String actual = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_GROUP1, DocuportConstants.FULLNAME);
        String expected = DocuportConstants.FULL_NAME;
        System.out.println("Full name: " + actual);
        Assert.assertEquals(actual, expected);
        String actualUserName = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_GROUP1, DocuportConstants.USERNAME);
        String expectedUserName = DocuportConstants.USER_NAME1;
        System.out.println("User name:" + actualUserName);
        Assert.assertEquals(actualUserName, expectedUserName);
        String actualUserNameRole = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_GROUP1, DocuportConstants.ROLE);
        String expectedUserNameRole = DocuportConstants.ROLE_NAME1;
        System.out.println("Role: " + actualUserNameRole);
        Assert.assertEquals(actualUserNameRole, expectedUserNameRole);

        String actualUserPhoneNumber = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_GROUP1, DocuportConstants.PHONE_NUMBER);
        String expectedUserPhoneNumber = DocuportConstants.PHONE_NUMBERS1;
        System.out.println("Phone number: " + actualUserPhoneNumber);
        Assert.assertEquals(actualUserPhoneNumber, expectedUserPhoneNumber);
    }

}
