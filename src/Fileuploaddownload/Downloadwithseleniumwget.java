package Fileuploaddownload;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Downloadwithseleniumwget {
    public static void main(String[] args) {
        String path="D:\\Softwares\\Testing\\Examples\\Selenium_Test\\src\\Fileuploaddownload\\";
        String baseUrl = "https://www.autoitscript.com/site/autoit/downloads/";
        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // starting Chrome browser
        driver.manage().window().maximize(); // maximizing window
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit. SECONDS);//for page load
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit. SECONDS);//for page load
        WebElement download = driver.findElement(By.xpath("//*[@id=\"post-77\"]/div/table[2]/tbody/tr[1]/td[2]/a"));
        System.out.println("get URL");
        String sourceLocation = download.getAttribute("href");
        System.out.println("sourceLocation "+ sourceLocation);
        String wget_command = "cmd /c C:/Wget/wget -P D:/Softwares/Download_with_wget --no-check-certificate " + sourceLocation;
        try {
            System.out.println("wget_command "+wget_command);
            Process pr1 = Runtime.getRuntime().exec(wget_command);

            System.out.println("Process exec "+pr1.toString());
            System.out.println("exec isAlive "+pr1.isAlive());

            //int exitval=pr1.waitFor();

            boolean status =  pr1.waitFor(180, TimeUnit.SECONDS);

            System.out.println("after call exec.waitFor,processs status isAlive  "+pr1.isAlive());
            System.out.println("after call exec.waitFor status is " + status);

            pr1.destroy();
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }

        driver.close();
    }
}
