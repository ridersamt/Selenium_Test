package Autosuggetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Autosuggetion {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("mobile");

        Thread.sleep(5000);

        String xp="//span[contains(text(),'mobile')]";

        List<WebElement> allMobiles = driver.findElements(By.xpath(xp));

        for(WebElement mobile:allMobiles)
        {
            System.out.println(mobile.getText());
        }

//        for(int i=0;i<allMobiles.size();i++)
//        {
//            System.out.println(allMobiles.get(i).getText());
//        }


        driver.quit();
    }
}
