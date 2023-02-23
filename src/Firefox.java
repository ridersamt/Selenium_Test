import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {


    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","Utils/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");


        // driver.findElement(By.linkText("iPhone")).click();


    }
}
