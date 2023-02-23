package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ID {


    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Thread.sleep(2000);
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        //Example to showcase id Locator
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement elementgettext= driver.findElement(By.xpath("(//label[@class='control-label'])[1]"));
        String email_label = elementgettext.getText();
        System.out.println("Lable : "+email_label);
        WebElement element= driver.findElement(By.id("input-email"));
        //Example for isDisplayed()
        boolean status = element.isDisplayed();
        System.out.println("Status for isDisplayed : "+status);
        //Example for isDisplayed()
        boolean statusisenable = element.isEnabled();
        System.out.println("Status for isEnabled: "+statusisenable);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Intentionally changing the value
   //     statusisenable=false;
        if(statusisenable) {
            System.out.println(" we are in if block and able to locate element");
            element.sendKeys("ridersamt@yopmail.com");
            element.clear();
            element.sendKeys("ridersamt@gmail.com");

            driver.findElement(By.id("input-password")).sendKeys("Amt@123");

        }
        else
        {
            System.out.println("Status for isEnabled: "+statusisenable);
            System.out.println("Unable to find element");
        }


        WebElement elementbtn= driver.findElement(By.xpath("//input[@type='submit']"));
        elementbtn.submit();


        elementgettext= driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[4]"));
        String myaccount_h2 = elementgettext.getText();

        System.out.println("After login : "+myaccount_h2);

        String tagname=elementgettext.getTagName();

        System.out.println("Tag Name : "+tagname);



       String getcssvalue= elementgettext.getCssValue("font-size");
        System.out.println("get css value font-size):" +getcssvalue);

      //  driver.close();
    }
}
