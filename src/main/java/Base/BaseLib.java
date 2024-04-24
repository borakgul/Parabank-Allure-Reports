package Base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Random;

public class BaseLib  extends DATA {

    @Attachment(value = "Screenshot", type ="image/png")
    public byte[] screenshot(WebDriver driver){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    public int createrandomNumber(int length){

        Random random = new Random();
        random.nextInt(length);

        return random.nextInt(length);

    }

}
