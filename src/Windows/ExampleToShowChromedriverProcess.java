package Windows;

import Windows.KillProcssChromedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleToShowChromedriverProcess {

    public static void main(String[] args) throws InterruptedException {

        for(int i=0;i<=2;i++) {
            System.setProperty("webdriver.chrome.driver", "Utils/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");

            //It will click on first button in our web page Currency is first button
            // driver.findElement(By.tagName("button")).click();
        }


        KillProcssChromedriver killdriver=new KillProcssChromedriver();
//        killdriver.killchromedriverprocess();

      //  Thread.sleep(5000);
       // driver.close();
    }

}
