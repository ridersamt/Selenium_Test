package WebElement_commands;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Webelement_commandsexamples {


    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Thread.sleep(2000);

        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        //Example to showcase id Locator

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement elementgettext= driver.findElement(By.xpath("(//label[@class='control-label'])[1]"));
        //Example for getText Command
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

        //Example for submit Command
        WebElement elementbtn= driver.findElement(By.xpath("//input[@type='submit']"));
        elementbtn.submit();

        //Example for getText Command
        elementgettext= driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]"));
        String myaccount_h2 = elementgettext.getText();

        System.out.println("After login : "+myaccount_h2);

        //Example for getTagName Command
        String tagname=elementgettext.getTagName();

        System.out.println("Tag Name : "+tagname);

        //Example for getCssValue Command
       String getcssvalue= elementgettext.getCssValue("margin-top");
        System.out.println("get css value (propertyName):" +getcssvalue);



        //Example for getAttribute Command
        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/edit");

        WebElement element_getAttribute = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        String attValue = element_getAttribute.getAttribute("value"); //This will return "SubmitButton"

        System.out.println("value of button :"+attValue);
//
//
//        //Example for getSize  Command
        WebElement element_dimensions = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        Dimension dimensions = element_dimensions.getSize();
        System.out.println("Height :" + dimensions.height + " and Width : "+ dimensions.width);
//
//
//
//        //Example for getLocation  Command
            WebElement element_getLocation = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        Point point = element_getLocation.getLocation();
        System.out.println("X coordinate : " + point.x + " and Y coordinate: " + point.y);



          driver.close();
    }
}
