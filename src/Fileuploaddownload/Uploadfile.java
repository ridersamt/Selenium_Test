package Fileuploaddownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Uploadfile {
    public static void main(String[] args) {
        String path="D:\\Softwares\\Testing\\Examples\\Selenium_Test\\src\\Fileuploaddownload\\";

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //launch application
        driver.get(path + "FileUploadDemo.html");

        // identify element  //  //input[@type='file']
        WebElement element=driver.findElement(By.name("fileToUpload"));

        // windows file upload with file path
        element.sendKeys(path + "logo.png");

        System.out.println(element.getAttribute("value"));

        //browser close
     //   driver.close();
    }
}
