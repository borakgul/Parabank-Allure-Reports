import Base.BaseTest;
import Pages.ForgotPage;
import Pages.HomePage;
import Pages.RegisterPage;
import Pages.loginPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
@Feature("Forgot Test Senaryoları")
public class ForgetTest extends BaseTest {
    loginPage loginPage = new loginPage();
    RegisterPage RegisterPage = new RegisterPage();
    ForgotPage ForgotPage = new ForgotPage();
    HomePage HomePage = new HomePage();

    @Test(description = "Kullanıcı Kurtarma")
    public void Saveuser() {

        String username = "TEST12990";

        //href ine bakararak aldık çünkü href köprüleme için kullanılır.

        loginPage
                .clickrregister();
        RegisterPage
                .fillfirstname("boratest")
                .Filllastname("borabora12")
                .FillAdress("canakkaleee")
                .FillCity("Gelibolu")
                .FillState("SISLI")
                .FillzipCode("134000")
                .FillPhoneNumber("154345213670")
                .FillSSN("1231231234")
                .Fillusername(username)
                .FillPassword("123123")
                .FillRptPass("123123")
                .RegButton();

        //href ine bakararak aldık çünkü href köprüleme için kullanılır.

        loginPage
                .Forgotlogininfo();
        ForgotPage
                .fillfirstnamee("boratest")
                .Filllastnamee("borabora12")
                .FillAdresss("canakkaleee")
                .FillCityy("Gelibolu")
                .FillStatee("SISLI")
                .FillzipCodee("134000")
                .FillSSNN("1231231234")
                .clickForgot();
        HomePage.ForgotSuccesControl("Customer Lookup");
    }

    @Test(description = "Kullanıcı Hatalı Kurtarma")
    public void FailSave() {
        String firstname = "borakgul"+ createrandomNumber(100000);
        loginPage
                .Forgotlogininfo();
        ForgotPage
                .fillfirstnamee(firstname)
                .Filllastnamee("borakgull")
                .FillAdresss("canakkaler")
                .FillCityy("Gelibolsdsdu")
                .FillStatee("SISLhghghI")
                .FillzipCodee("3400sdasd0")
                .FillSSNN("1231231sadsd23")
                .clickForgot();
        HomePage.ForgotSuccesControl("Error!");


    }
}