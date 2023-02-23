package Shared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Explicitwait {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        WebElement email= driver.findElement(By.name("email"));
        WebElement pass= driver.findElement(By.name("pass"));

//        System.out.println(email +" "+pass );


        sendKeys(driver, email, 10, "ridersamt@gmail.com");

        sendKeys(driver, pass, 20, "Test");

        WebElement forgotAccount=driver.findElement(By.linkText("Forgotten username"));

        clickOn(driver,forgotAccount, 10);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value){

        new WebDriverWait(driver1,  Duration.ofDays(timeout)).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
    public static void clickOn(WebDriver driver1, WebElement element, int timeout)
    {
        new WebDriverWait(driver1,  Duration.ofDays(timeout)).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
