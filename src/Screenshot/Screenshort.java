package Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshort {

    public static void main(String[] args) throws WebDriverException, IOException {
        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");  //Scroll vertically down by 500 pixels


        TakesScreenshot ts = (TakesScreenshot)driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(source, new File("Utils/Screenshots/Screen1.png"));



        System.out.println("the Screenshot is taken");
        driver.quit();
    }
}
