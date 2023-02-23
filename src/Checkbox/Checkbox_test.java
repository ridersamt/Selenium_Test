package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox_test {
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("D:\\Softwares\\Testing\\Examples\\Selenium_Test\\Utils\\Checkbox.html");

        WebElement element= driver.findElement(By.cssSelector("input[id*='check2']"));

        System.out.println(element.isSelected());

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        element.click();

        System.out.println(element.isSelected());

        String checkboxvalue=element.getAttribute("value");

        System.out.println("Successfully click on checkbox : "+ checkboxvalue);

        driver.findElement(By.id("submit_button1")).click();

        String result= driver.findElement(By.id("result")).getText();

        System.out.println("Result: "+result);

        driver.close();
        driver.quit();
    }
}
