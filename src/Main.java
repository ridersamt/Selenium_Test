import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

//        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

    //    driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/login");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");

  /*      // driver.findElement(By.id("input-email")).sendKeys("ridersamt@gmail.com");

        // driver.findElement(By.name("email")).clear();
        // driver.findElement(By.id("input-email")).sendKeys("ridersamt@yopmail.com");
        // driver.findElement(By.name("email")).clear();
        // driver.findElement(By.cssSelector("#input-email")).sendKeys("ridersamt@gmail.com");

    */

//        // driver.findElement(By.className("form-control")).sendKeys("iphone");
//
//        // driver.findElement(By.cssSelector("#search > span > button")).click();


//        // driver.findElement(By.tagName("button")).click();

//
//        String linktext1=// driver.findElement(By.linkText("Apple Cinema 30\"")).getText();
//        System.out.println(linktext1);
//
//        // driver.findElement(By.linkText("Apple Cinema 30\"")).click();

            // driver.findElement(By.partialLinkText("iPhone")).click();

//        // driver.findElement(By.linkText("iPhone")).click();
        Thread.sleep(5000);

        driver.close();

    }
}