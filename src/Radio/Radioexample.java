package Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Radioexample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("D:\\Softwares\\Testing\\Examples\\Selenium_Test\\Utils\\radio.html");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        int a = driver.findElements(By.xpath("//input [@name='group1']")).size();

        System.out.println(a);



        WebElement element;

        for(int i=1;i<=a;i++) {
            //  /html/body/input[3]
            element = driver.findElement(By.xpath("(//input [@name='group1'])["+ i +"]"));

            System.out.println(element.isSelected());
            element.click();
            System.out.println(element.isSelected());
            ////input [@name='group1'][@value='Banana']
            String value = element.getAttribute("value");
            System.out.println(value+"\n");

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.close();
//        driver.quit();
    }
}
