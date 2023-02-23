package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        //Example to showcase Name Locator
        // driver.findElement(By.name("email")).sendKeys("ridersamt@gmail.com");
        Thread.sleep(2000);
        // driver.findElement(By.name("email")).clear();
         driver.findElement(By.name("email")).sendKeys("ridersamt@yopmail.com");
        Thread.sleep(5000);
        driver.close();
    }
}
