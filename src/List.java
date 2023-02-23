import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class List {

    static WebDriver Driver;

    public static void main(String[] args) {
        invokeBrowser();
        searchProduct("iMac","Mac (1)");
        searchAllProduct();
        closebrowser();
    }

    public static void invokeBrowser(){

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        /*Setting property of a system variable used by chrome driver*/
        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver_win32/chromedriver.exe");

        Driver = new ChromeDriver();

        String url = "http://tutorialsninja.com/demo/index.php?route=common/home";


        //To maximise the browser
        Driver.manage().window().maximize();

        //	Driver.manage().deleteAllCookies();

        Driver.get(url);

    }

    public static void searchProduct(String product, String category){

        Driver.findElement(By.name("search")).sendKeys(product);

        Driver.findElement(By.xpath("//*[@id='search']/span/button")).click();

        WebElement dropElement = Driver.findElement(By.name("category_id"));

        Select dropdown = new Select(dropElement);
        dropdown.selectByVisibleText("Desktops");
        String result = dropElement.getAttribute("value");

        System.out.println("Result is : "+ result);

    }


    public static void searchAllProduct(){

        ArrayList<WebElement> allProduct = (ArrayList<WebElement>) Driver.findElements(By.name("category_id"));

        for( WebElement product : allProduct){

            System.out.println(product.getText());
            System.out.println("*********************************************************************");
        }
    }

    public static void closebrowser()
    {
        Driver.close();
        Driver.quit();
    }

}
