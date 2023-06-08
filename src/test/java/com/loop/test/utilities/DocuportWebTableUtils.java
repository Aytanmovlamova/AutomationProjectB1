package com.loop.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocuportWebTableUtils {
    public static String returnAnyField(WebDriver driver, String emailAddress, String field) {
        WebElement element = null;
        String xpath = "";
        switch (field.toLowerCase()) {
            case DocuportConstants.FULLNAME:
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]/preceding-sibling::td//span[2]";
                element = driver.findElement(By.xpath(xpath));
                break;
            case DocuportConstants.USERNAME:
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]/following-sibling::td[1]";
                element = driver.findElement(By.xpath(xpath));
                break;
            case DocuportConstants.ROLE:
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]/following-sibling::td[4]";
                element = driver.findElement(By.xpath(xpath));
                break;
            case DocuportConstants.ADVISOR_ALEX:
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]/following-sibling::td[5]";
                element = driver.findElement(By.xpath(xpath));
                break;
            case DocuportConstants.PHONE_NUMBER:
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]/following-sibling::td[3]";
                element = driver.findElement(By.xpath(xpath));
                break;
            case DocuportConstants.EMAIL_ALEX :
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]";
                element = driver.findElement(By.xpath(xpath));
                break;

        }
        return element.getText();
    }
}
