package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleCSSselectors {

    static WebDriver driver=new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        exampleCSSselectors obj1=new exampleCSSselectors();

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");

        driver.manage().window().maximize();
        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/login");

        //Example to showcase cssSelector Locator

        //By CSS- Tag and ID
         driver.findElement(By.cssSelector("input#input-email")).sendKeys("ridersamt@gmail.com");
         Thread.sleep(2000);
         driver.findElement(By.cssSelector("input#input-email")).clear();
         driver.findElement(By.cssSelector("input#input-email")).sendKeys("ridersamt@yopmail.com");


        //By CSS-Tag and Class
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("iPhone");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.form-control")).clear();
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("MacBook");

        driver.findElement(By.cssSelector("button.btn-default")).click();


        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/login");
        //By CSS-Tag and Attribute
         driver.findElement(By.cssSelector("input[name=email]")).sendKeys("ridersamt@yopmail.com");
        Thread.sleep(2000);
         driver.findElement(By.cssSelector("input[id=input-email]")).clear();
         driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys("ridersamt@gmail.com");
         driver.findElement(By.cssSelector("input[id=input-password]")).sendKeys("Amt@123");
         driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();

         obj1.logout();


        //By CSS-Tag, Class and Attribute
         driver.findElement(By.cssSelector("input.form-control[name=email]")).sendKeys("ridersamt@yopmail.com");
        Thread.sleep(2000);
         driver.findElement(By.cssSelector("input.form-control[name=email]")).clear();
         driver.findElement(By.cssSelector("input.form-control[name=email]")).sendKeys("ridersamt@gmail.com");
         driver.findElement(By.cssSelector("input.form-control[name=password]")).sendKeys("Amt@123");
         driver.findElement(By.cssSelector("input.btn-primary[value=Login]")).click();
        obj1.logout();

        //By CSS-Substring Matches --> Starts with (^):
         driver.findElement(By.cssSelector("input[id^='input-e']")).sendKeys("ridersamt@yopmail.com");
        Thread.sleep(2000);
         driver.findElement(By.cssSelector("input[id^='input-e']")).clear();
         driver.findElement(By.cssSelector("input[id^='input-e']")).sendKeys("ridersamt@gmail.com");
         driver.findElement(By.cssSelector("input[id^='input-p']")).sendKeys("Amt@123");
         driver.findElement(By.cssSelector("input[class^='btn']")).click();
        obj1.logout();



        // Starts with (^): example for button
//        // driver.findElement(By.cssSelector("button[class^='btn btn-d']")).click();

//        By CSS-Substring Matches -->  Ends with ($):
         driver.findElement(By.cssSelector("input[id$='mail']")).sendKeys("ridersamt@yopmail.com");
        Thread.sleep(2000);
         driver.findElement(By.cssSelector("input[id$='mail']")).clear();
         driver.findElement(By.cssSelector("input[id$='mail']")).sendKeys("ridersamt@gmail.com");
         driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("Amt@123");
         driver.findElement(By.cssSelector("input[class$='mary']")).click();
        obj1.logout();

        //By CSS-Substring Matches --> Contains (*):
         driver.findElement(By.cssSelector("input[id*='put-ema']")).sendKeys("ridersamt@yopmail.com");
        Thread.sleep(2000);
         driver.findElement(By.cssSelector("input[id*='input-email']")).clear();
         driver.findElement(By.cssSelector("input[id*='input-email']")).sendKeys("ridersamt@gmail.com");
         driver.findElement(By.cssSelector("input[id*='put-pass']")).sendKeys("Amt@123");
         driver.findElement(By.cssSelector("input[class*='primary']")).click();
        obj1.logout();

        Thread.sleep(5000);
        driver.close();
    }

    public void logout() throws InterruptedException {
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Login")).click();
    }


}
