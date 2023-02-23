package closequit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class closemethod {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("D:\\Softwares\\Testing\\Examples\\Selenium_Test\\Utils\\Checkbox.html");


        driver =new ChromeDriver();

        driver.get("https://www.google.com");

        driver.close();
        driver.quit();
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
