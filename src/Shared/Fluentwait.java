package Shared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Fluentwait {

    static public WebDriver driver;

    public static void main(String [] args) throws InterruptedException
    {
        System.setProperty ("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe" );
        String eTitle = "Account Test Login";
        String aTitle = "" ;
        driver = new ChromeDriver();
        // launch Chrome and redirect it to the Base URL
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login" );
        //Maximizes the browser window
        driver.manage().window().maximize() ;
        //get the actual value of the title
        aTitle = driver.getTitle();
        //compare the actual title with the expected title
        if (aTitle.contentEquals(eTitle))
        {
            System.out.println( "Test Passed") ;
        }
        else {
            System.out.println( "Test Failed" );
        }

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement clickseleniumlink = wait.until(new
Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver ) {
                return
                driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a[2]"));
            }
        }
        );

        //click on the selenium link
        clickseleniumlink.sendKeys("");



        driver.findElement(By.linkText("Address Book")).click();
        Thread.sleep(5000);
        //close~ browser
        driver.close() ;
    }

}
