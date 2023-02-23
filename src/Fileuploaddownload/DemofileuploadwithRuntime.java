package Fileuploaddownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DemofileuploadwithRuntime {

    public static void main(String[] args) throws IOException {
        String path="D:\\Softwares\\Testing\\Examples\\Selenium_Test\\src\\Fileuploaddownload\\";

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //launch application
        driver.get(path + "FileUploadDemo.html");

        driver.findElement(By.name("fileToUpload")).click();

        Runtime.getRuntime().exec(path+"logo.png");



        //browser close
        //   driver.close();
    }
}
