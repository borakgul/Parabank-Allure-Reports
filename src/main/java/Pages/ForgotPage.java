package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ForgotPage extends BaseTest {

    By Forgotfirstname = By.id("firstName");
    By Forgotlastname = By.id("lastName");
    By Forgotadress = By.id("address.street");
    By Forgotcity = By.id("address.city");
    By Forgotstate = By.id("address.state");
    By Forgotzipcode = By.id("address.zipCode");
    By ForgotSSN = By.id("ssn");


    //Fo Page buraya bağlı olduğu için Find My Login info'yu buraya ekledim.
    By btnFindmyinfo = By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input");
    @Step("Unuttum sayfası isim doldur ")
    public ForgotPage fillfirstnamee(String text) {
        driver.findElement(Forgotfirstname).sendKeys(text);
        return this;

    }
    @Step("Unuttum sayfası soy isim doldur ")
    public ForgotPage Filllastnamee(String text) {
        driver.findElement(Forgotlastname).sendKeys(text);
        return this;
    }
    @Step("Unuttum sayfası adress doldur")
    public ForgotPage FillAdresss(String text) {
        driver.findElement(Forgotadress).sendKeys(text);
        return this;
    }
    @Step("Unuttum sayfası şehir doldur ")
    public ForgotPage FillCityy(String text) {
        driver.findElement(Forgotcity).sendKeys(text);
        return this;
    }
    @Step("Unuttum sayfası state doldur")
    public ForgotPage FillStatee(String text) {
        driver.findElement(Forgotstate).sendKeys(text);
        return this;
    }
    @Step("Unuttum sayfası zipcode doldur ")
    public ForgotPage FillzipCodee(String text) {
        driver.findElement(Forgotzipcode).sendKeys(text);
        return this;

    } @Step("Unuttum sayfası SSN doldur ")
    public ForgotPage FillSSNN(String text) {
        driver.findElement(ForgotSSN).sendKeys(text);
        return this;
    } @Step("Unuttum sayfası Unuttum butonuna bas")
    public ForgotPage clickForgot() {
        driver.findElement(btnFindmyinfo).click();
        return this;
    }
}

