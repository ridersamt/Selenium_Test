package Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new HtmlUnitDriver();

        driver.navigate().to("https://www.google.com/");

        Thread.sleep(5000);

        System.out.println("Navigated to URL : "+driver.getTitle());

        WebElement element =driver.findElement(By.name("q"));
        element.sendKeys("selenium");

        element.sendKeys(Keys.ENTER);

        System.out.println("Google Search Result : "+driver.getTitle());

        driver.close();
        driver.quit();

    }
}
