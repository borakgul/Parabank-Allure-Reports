package Pages;

import Base.BaseTest;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
public class MainPage extends BaseTest {

    By lblErrormessage1 = By.xpath("//*[@id=\"rightPanel\"]/p");
    By lblErrormessage2 = By.cssSelector("[class='error'");
    @Step("Hata mesajı goruntulenir : {errormesage}")
public MainPage errorMessageControl(String errormesage){

    String text= driver.findElement(lblErrormessage1).getText();


    Assert.assertEquals(errormesage,text);
return this;
    }
    @Step("Hata mesajı 2 goruntulenir : {errormesage}")
    public MainPage errorMessageControl2(String errormesage) {

        String text = driver.findElement(lblErrormessage2).getText();


        Assert.assertEquals(errormesage, text);
        return this;
    }
}
