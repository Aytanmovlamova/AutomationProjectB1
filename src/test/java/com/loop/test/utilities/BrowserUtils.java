package com.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    /**

     validate if driver switch to expected url and title
     @param driver
     @param expectedUrl
     @param expectedTitle
     @author nurida
     note: usually we do not do vlidation in method, this is for practicing purposes
     */

    public static void swichWindowAndValidate (WebDriver driver,String expectedUrl, String expectedTitle){
        expectedUrl =expectedUrl.toLowerCase();
        expectedTitle = expectedTitle.toLowerCase();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl));
            break;
        }
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(expectedUrl));
    }

    /**

     switch to new window by the exact title
     returns to original window if windows with given title not found**/

    public static void switchToWindow(WebDriver driver,String targetTitle){
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)){
                return;
            }
        }
        driver.switchTo().window(origin);
    }

    /**

     @param driver
     @param expectedTitle
     returns void , assertion is implemented
     @author nurida
     **/
    public static void validateTitle(WebDriver driver, String expectedTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));

    }
}

