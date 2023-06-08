package day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGmailPractice {
    private static String actualTitle;
    private static CharSequence expectedTitle;
    private static String actualUrl;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String expectedUrl = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ", =. TEST PASS");
        } else {
            System.err.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ", =. TEST FAIL");
        }


        driver.navigate().back();
        String expectedTitle1 = "Google";
        String actualTitle1 = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual url: " + actualUrl + ", matches expected url: " + expectedUrl + ", =. TEST PASS");
        } else {
            System.err.println("Actual url: " + actualUrl + ", DOES NOT match expected url: " + expectedUrl + ", =. TEST FAIL");
        }




        driver.quit();

    }
}
