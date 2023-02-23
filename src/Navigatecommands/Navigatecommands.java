package Navigatecommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatecommands {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe" );

        // Initialize Gecko Driver using Desired Capabilities Class

        WebDriver driver= new ChromeDriver();

        // Launch Website

        String a="http://tutorialsninja.com/";

       driver.navigate().to(a+"demo/index.php?route=account/login");

        Thread.sleep(2000);
        //Click on the Link Text using click() command
        driver.findElement(By.linkText("Register")).click();
        System.out.println("Click on Register link");

        Thread.sleep(2000);

        //Go back to Home Page
        driver.navigate().back();
        System.out.println("navigate back to Home Page");

        Thread.sleep(2000);
        //Go forward to Registration page
        driver.navigate().forward();
        System.out.println("navigate forward to Registration page");
        Thread.sleep(2000);

        // Navigate to Product iphone
        driver.navigate().to(a + "/demo/index.php?route=product/product&product_id=40");
        System.out.println("Navigate to Product iphone");
//
        Thread.sleep(5000);
        //Refresh browser
        driver.navigate().refresh();
        System.out.println("Refresh browser");

        driver.navigate().to(a);

//        //Closing browser
        driver.close();
        System.out.println("Closing browser");
    }

}
