package Junitexamples;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Junit_exmple2 {
    WebDriver driver ;
    String BaseURL="http://tutorialsninja.com/demo/index.php?route=account/login";


    @Before
    public void M2()
    {
        System.out.println("This is the (Before annotation) M2 Method");

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver(); // starting Chrome browser
        driver.manage().window().maximize(); // maximizing window

        driver.get(BaseURL);

    }

    @Test
    public void M1()
    {
        System.out.println("This is the (Test annotation) M1 Method");

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.name("email")).sendKeys("ridersamt@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Amt@123");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        /* //h2[text()='My Account']      */

        String actual = driver.findElement(By.xpath("//h2[text()='My Account']")).getText();

        String expected= "My Account";
        Assert.assertEquals(expected, actual);

        System.out.println("Assert is Executed");


    }

    @After
    public void M3() throws InterruptedException {
        System.out.println("This is the (After annotation) M3 Method");

        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }



}
