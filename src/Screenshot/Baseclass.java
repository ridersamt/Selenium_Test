package Screenshot;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Baseclass {
    public static WebDriver driver;

    public static void initialization()
    {
        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
    }

    @Test
    public void takeScreenshotTest()
    {
       try {

           initialization();

           Thread.sleep(5000);
           JavascriptExecutor js = (JavascriptExecutor) driver;

           js.executeScript("window.scrollBy(0,500)");  //Scroll vertically down by 500 pixels


          driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/h4/a")).click();
//           int z=10/0;
//           System.out.println(z);
       }
       catch (Exception e)
       {
           System.out.println("Failed Test");
           failed();
       }
    }
    public void failed()
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            System.out.println("in failed tc");
            FileUtils.copyFile(srcFile, new File("Utils/"
                    + "ScreenshotsTaken/tests.jpg"));
        } catch (IOException e) {

            System.out.println("in exception");
            e.printStackTrace();

        }
    }



}
