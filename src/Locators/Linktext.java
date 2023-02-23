package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");

        //Example to showcase linkText Locator
        // driver.findElement(By.linkText("iPhone")).click();

        Thread.sleep(5000);
        driver.close();
    }
}