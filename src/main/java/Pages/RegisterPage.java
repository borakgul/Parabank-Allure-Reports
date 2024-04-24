package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends BaseTest {

    By txtfirstname = By.id("customer.firstName");
    By txtlastname = By.id("customer.lastName");
    By txtadress = By.id("customer.address.street");
    By txtcity = By.id("customer.address.city");
    By txtstate = By.id("customer.address.state");
    By txtzipcode = By.id("customer.address.zipCode");
    By txtPhonenumber = By.id("customer.phoneNumber");
    By txtSSN = By.id("customer.ssn");
    By txtUsername = By.id("customer.username");
    By txtPassword = By.id("customer.password");
    By txtConfPass = By.id("repeatedPassword");

    By AlreadyUsersExist = By.id("customer.username.errors");

    By RegisterButton = By.xpath(" //*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    //Fo Page buraya bağlı olduğu için Find My Login info'yu buraya ekledim.

    @Step("Kullanıcı adı doldur")
    public RegisterPage fillfirstname(String text) {
        driver.findElement(txtfirstname).sendKeys(text);
        return this;

    }
    @Step("Soyisim doldur")
    public RegisterPage Filllastname(String text) {
        driver.findElement(txtlastname).sendKeys(text);
        return this;
    }
    @Step("Adress doldur")
    public RegisterPage FillAdress(String text) {
        driver.findElement(txtadress).sendKeys(text);
        return this;
    }
    @Step("Şehir doldur")
    public RegisterPage FillCity(String text) {
        driver.findElement(txtcity).sendKeys(text);
        return this;
    }
    @Step("State doldur")
    public RegisterPage FillState(String text) {
        driver.findElement(txtstate).sendKeys(text);
        return this;
    }
    @Step("ZIP doldur")
    public RegisterPage FillzipCode(String text) {
        driver.findElement(txtzipcode).sendKeys(text);
        return this;

    }
    @Step("TelNo doldur")
    public RegisterPage FillPhoneNumber(String text) {
        driver.findElement(txtPhonenumber).sendKeys(text);
        return this;

    }@Step("SSN doldur")
    public RegisterPage FillSSN(String text) {
        driver.findElement(txtSSN).sendKeys(text);
        return this;
    }@Step("Kullanıcı adı doldur")
    public RegisterPage Fillusername(String text) {
        driver.findElement(txtUsername).sendKeys(text);
        return this;
    }
    @Step("Şifre doldur")
    public RegisterPage FillPassword(String text) {
        driver.findElement(txtPassword).sendKeys(text);
        return this;
    }
    @Step("Tekrar şifre doldur")
    public RegisterPage FillRptPass(String text) {
        driver.findElement(txtConfPass).sendKeys(text);
        return this;

    }
    @Step("Kayıt Butonuna bas")
    public RegisterPage RegButton() {
        driver.findElement(RegisterButton).click();
        return this;
    }@Step("Error mesajı doğru yanlış kontrol et")
    public RegisterPage usernameErrorMesage() {

      boolean status =  driver.findElement(AlreadyUsersExist).isDisplayed();
        Assert.assertEquals(true,status);
        return this;
    }

}



