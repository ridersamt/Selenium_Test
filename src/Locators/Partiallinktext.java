package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");

        //Example to showcase partialLinkText Locator
        // driver.findElement(By.partialLinkText("Apple Cinema")).click();

        Thread.sleep(5000);
        driver.close();
    }

}
