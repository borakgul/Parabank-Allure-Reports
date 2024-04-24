import Base.BaseTest;
import Pages.HomePage;
import Pages.RegisterPage;
import Pages.loginPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
@Feature("Register Test Senaryoları")
public class RegisterTest extends BaseTest {

    loginPage loginPage = new loginPage();
    RegisterPage RegisterPage = new RegisterPage();

    HomePage HomePage = new HomePage();

    @Test(description = "Kullanıcı Olusturma")
    public void UserCreate() {

        String username = "tesqa"+ createrandomNumber(100000);

        //href ine bakararak aldık çünkü href köprüleme için kullanılır.

        loginPage
                .clickrregister();
        RegisterPage
                .fillfirstname("TestQA")
                .Filllastname("QA TEST")
                .FillAdress("Deneme mah")
                .FillCity("ISTANBUL")
                .FillState("SISLI")
                .FillzipCode("34000")
                .FillPhoneNumber("54345670")
                .FillSSN("123123123")
                .Fillusername(username)
                .FillPassword("rrrr")
                .FillRptPass("rrrr")
                .RegButton();
                screenshot(driver);
         HomePage.usernamecontrol("Welcome "+username);
    }
    @Test(description = "Sistemde kayıtlı kullanıcı kontrolu")
    public void KayıtlıKullanıcı() {

        String username = "borakgul";

        //href ine bakararak aldık çünkü href köprüleme için kullanılır.

        loginPage
                .clickrregister();
        RegisterPage
                .fillfirstname("borakgul")
                .Filllastname("borakgull")
                .FillAdress("canakkale")
                .FillCity("Gelibolu")
                .FillState("SISLI")
                .FillzipCode("34000")
                .FillPhoneNumber("54345213670")
                .FillSSN("123123123")
                .Fillusername(username)
                .FillPassword("123123")
                .FillRptPass("123123")
                .RegButton()
                .usernameErrorMesage();

    }
}

