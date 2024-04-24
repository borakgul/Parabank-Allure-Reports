package Pages;

import Base.BaseTest;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePage extends BaseTest {

    By objTitle = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");// login olunca orada yazan overview'i alır
    By ForgotControl = By.xpath("//*[@id=\"rightPanel\"]/h1");
     //*[@id="rightPanel"]/h1 Error'un xPath'i
    By lblUsername = By.cssSelector("[id='rightPanel'] h1");


@Step("sayfa kontrolu saglanır {title}")
    public HomePage PageControl(String title) {
        String text = driver.findElement(objTitle).getText();
        Assert.assertEquals(title, text);
        return this;
    }

    public HomePage usernamecontrol(String Title) {
        String text = driver.findElement(lblUsername).getText();
        Assert.assertEquals(Title, text);

        return this;
    }
    public HomePage ForgotSuccesControl(String Titlee) {
        String text = driver.findElement(ForgotControl).getText();
        Assert.assertEquals(Titlee, text);

        return this;
    }
}
