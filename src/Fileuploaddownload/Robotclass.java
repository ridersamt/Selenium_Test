package Fileuploaddownload;


import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Robotclass {

    public static void main(String[] args) throws InterruptedException, AWTException {
        String path="D:\\Softwares\\Testing\\Examples\\Selenium_Test\\src\\Fileuploaddownload\\";

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
 //       WebDriver driver = new ChromeDriver(); // starting Chrome browser


        ChromeOptions options = new ChromeOptions();
     //   options.addExtensions(new File("X://extension_3_40_1_0.crx"));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);

        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize(); // maximizing window

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit. SECONDS);//for page load

        driver.get("https://www.grammarly.com/plagiarism-checker");//open testing website

        driver.manage().timeouts().implicitlyWait(20, TimeUnit. SECONDS);// for Implicit wait

        System.out.println("JavascriptExecutor initialized");

        JavascriptExecutor js = (JavascriptExecutor)driver; // Scroll operation using Js Executor

        js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option

        Thread.sleep(2000); // suspending execution for specified time period

        WebElement browse = driver.findElement(By.xpath("//span[text()='Upload a file']"));

        // using xpath, to click on browse element
        browse.click(); // Click on browse option on the webpage

        Thread.sleep(2000); // suspending execution for specified time period

        System.out.println("Robot initialized");
        // creating object of Robot class
        Robot rb = new Robot();

        // copying File path to Clipboard
        StringSelection str = new StringSelection(path + "file1.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checktext\"]/div[2]/div[1]/div[2]/div/div[1]/textarea")).getText());


     //   driver.quit();

    }
}
