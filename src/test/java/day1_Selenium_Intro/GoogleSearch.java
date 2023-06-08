package day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String expectedTitle = "Google";
        String expectedUrl = "https://www.google.com";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ", =. TEST PASS");
        } else {
            System.err.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ", =. TEST FAIL");
        }


        String actualUrl = driver.getCurrentUrl();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual url: " + actualUrl + ", matches expected url: " + expectedUrl + ", =. TEST PASS");
        } else {
            System.err.println("Actual url: " + actualUrl + ", DOES NOT match expected url: " + expectedUrl + ", =. TEST FAIL");
        }




driver.quit();
    }
}
