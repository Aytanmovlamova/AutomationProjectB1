package day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // Thread.sleep(3000);
        //driver.get("http://www.etsy.com/");
        driver.manage().window().maximize();
        //  Thread.sleep(3000);
        //driver.manage().window().fullscreen();
        driver.navigate().to("http://www.etsy.com/");
        //Thread.sleep(3000);
        //Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();







    }
}



