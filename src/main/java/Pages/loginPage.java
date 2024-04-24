package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;

public class loginPage extends BaseTest {
    By txtUsername = By.name("username");
    By txtPassword = By.name("password");
    By btnLogin = By.cssSelector("[value='Log In']");
    By btnRegister =  By.cssSelector("[href*='register.htm']");
    By btnForgot =  By.cssSelector("[href*='lookup.htm']");
@Step("KULLANICI ADI DOLDUR: {text}")
    public loginPage fillusername(String text) {
        driver.findElement(txtUsername).sendKeys(text);
        return this;
    }
    @Step(" SİFRE DOLDUR : {text}")
    public loginPage fillpassword(String text) {
        driver.findElement(txtPassword).sendKeys(text);
        return this;
    }
    @Step("Login Butonuna tıklanır")
    public loginPage clicklogin() {
        driver.findElement(btnLogin).click();
        screenshot(driver);
        return this;
    }
    @Step("KAYIT OL BUTONUNA BAS")
    public loginPage clickrregister(){

        driver.findElement(btnRegister).click();
        return this ;

    }
    @Step("Unuttum Butonuna bas")
    public loginPage Forgotlogininfo(){

        driver.findElement(btnForgot).click();
        return this ;

    }
}
