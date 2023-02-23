import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Utils/chromedriver_win32/chromedriver.exe");

      //  WebDriverManager.chromedriver().setup();

  //      WebDriver driver = new ChromeDriver();



        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
     //   driver.navigate().to("D:\\Softwares\\Html task\\Html task\\Task_by_classname\\byclassname.html");

        driver.navigate().to("D:/Softwares/Testing/Examples/Selenium_Test/Utils/DemoHtml.html");
//
//        // driver.findElement(By.className("fname")).sendKeys("Test name");
//        // driver.findElement(By.tagName("input")).clear();
//        // driver.findElement(By.tagName("input")).sendKeys("Tech Motion");
//
//       String textvalue=// driver.findElement(By.tagName("h2")).getText();
//
//       System.out.println(textvalue);
//
//
//       // driver.findElement(By.tagName("button")).click();


//        // driver.findElement(By.className("fname")).sendKeys("Rider");
//        // driver.findElement(By.tagName("input")).sendKeys("ridersamt@gmail.com");
//
//        String texth2=// driver.findElement(By.tagName("h2")).getText();
//        System.out.println(texth2);


        // driver.findElement(By.cssSelector("input.fname")).sendKeys("iPhone");


        Thread.sleep(5000);
        driver.close();
    }
}
