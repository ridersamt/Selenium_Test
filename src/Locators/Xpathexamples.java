package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Xpathexamples {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");

        //Example to showcase Xpath Locator

        //By XPath-Using Single Slash or Absolute XPath
//         driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Welcome to selenium automation");
//         Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
//         driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).clear();

        //By XPath-Using Double Slash or Relative XPath
//        driver.findElement(By.xpath("//input")).sendKeys("Welcome to selenium automation");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input")).sendKeys(Keys.ENTER);



        //By XPath-Using Double Slash or Relative XPath
//         driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div/input[1]")).sendKeys("Welcome to selenium automation");
//         driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div/input[1]")).clear();

        //By XPath-Using Single Attribute
//         driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Welcome to selenium automation");
//        Thread.sleep(2000);
//         driver.findElement(By.xpath("//*[@name='q']")).clear();

        //By XPath-Using Multiple Attribute
//         driver.findElement(By.xpath("//*[@name='q'][@class='gLFyf']")).sendKeys("Welcome to selenium automation");
//         driver.findElement(By.xpath("//*[@name='q'][@class='gLFyf']")).clear();
//         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//         driver.findElement(By.xpath("//input[@name='q'][@class='gLFyf']")).sendKeys("Welcome to selenium automation");
//         driver.findElement(By.xpath("//input[@name='q'][@class='gLFyf']")).sendKeys(Keys.ENTER);
//         driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//         driver.findElement(By.xpath("//input[@name='q'][@class='gLFyf']")).clear();


        //By XPath-Using And
//        driver.findElement(By.xpath("//*[@name='q' and @class='gLFyf']")).sendKeys("Welcome to selenium automation");
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@name='q' and @class='gLFyf']")).clear();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='q' and @class='gLFyf']")).sendKeys("Welcome to selenium automation");
//        driver.findElement(By.xpath("//input[@name='q' and @class='gLFyf']")).sendKeys(Keys.ENTER);
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='q' and @class='gLFyf']")).clear();

        //By XPath-Using Or
//        driver.findElement(By.xpath("//*[@name='q' or @class='gLFyfyyghfghf']")).sendKeys("Welcome to java");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@name='q' or @class='gLFygfhff']")).clear();
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='tq' or @class='gLFyf']")).sendKeys("Welcome to selenium automation");
//        driver.findElement(By.xpath("//input[@name='tq' or @class='gLFyf']")).sendKeys(Keys.ENTER);
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='q' or @class='gLFyf']")).clear();

        //By XPath-Using contains()
//        driver.findElement(By.xpath("//*[contains(@name,'q')]")).sendKeys("Welcome to JAVA");
//        driver.findElement(By.xpath("//*[contains(@name,'q')]")).clear();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Welcome to selenium automation");
//        driver.findElement(By.xpath("//input[contains(@name,'q')]")).clear();
//
        //By XPath-starts-with()
//         driver.findElement(By.xpath("//*[starts-with(@class,'gLF')]")).sendKeys("Welcome to JAVA");
//         driver.findElement(By.xpath("//*[starts-with(@class,'gLF')]")).clear();
//
//         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//         driver.findElement(By.xpath("//input[starts-with(@aria-label,'Sea')]")).sendKeys("Welcome to selenium automation");
//         driver.findElement(By.xpath("//input[starts-with(@aria-label,'Sea')]")).clear();

        //By XPath-Using text()
//        String text1= driver.findElement(By.xpath("//*[text()='Google offered in:  ']")).getText();
//        String text2= driver.findElement(By.xpath("//div[text()='Google offered in:  ']")).getText();
//        System.out.println("Text 1= "+text1 +"\nText 2= "+ text2);

        //By XPath-Using last()
        driver.findElement(By.xpath("(//*[@type='text'])[last()]")).sendKeys("Welcome to JAVA");
        driver.findElement(By.xpath("(//*[@type='text'])[last()]")).clear();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("Welcome to selenium automation");
        driver.findElement(By.xpath("(//input[@type='text'])[last()]")).clear();

//        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.close();
    }
}
