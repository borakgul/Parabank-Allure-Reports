package Base;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest extends BaseLib{

    public static  WebDriver driver;

    @BeforeMethod
    public void BeforeTest(){


        if (browser.equals("Chrome")){
        driver = new ChromeDriver();

        }
        else if (browser.equals("Firefox")){
            driver = new FirefoxDriver();

        }
        else if (browser.equals(("Safari"))) {
            driver =new SafariDriver();

        }
        else if (browser.equals(("Edege"))) {
            driver =new EdgeDriver();

        }
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }
    @AfterMethod
    public void AfterTest(){

        driver.quit();

    }

}
