import Frontend.Steps.ConfigSteps;
import Frontend.Steps.LoginPageSteps;
import Frontend.Steps.PopupWindowAndAlertSteps;
import Frontend.Steps.ProfilePageSteps;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class UItest {

    ConfigSteps config = new ConfigSteps();
    LoginPageSteps login = new LoginPageSteps();
    ProfilePageSteps profile = new ProfilePageSteps();
    PopupWindowAndAlertSteps popupsteps = new PopupWindowAndAlertSteps();

    @Description("This UI test logs in a new user, deletes the account from profile settings and checks that deleted user can not log back in")
    @Story("User logs in, deletes account and gets error message trying to log back in")
    @Test(priority = 2, testName = "UI test for login, account deletion and assertion", description = "This UI test logs in a new user, deletes the account from profile settings and checks that deleted user can not log back in")
    public void uitest(){
        config.configDriver();
        login.fillUserNameField().fillPasswordField().clickLogInButton();
        profile.clickDeleteAccount();
        popupsteps.clickConfirmDelete().checkAlertMessage().acceptAlert();
        login.fillUserNameField().fillPasswordField().clickLogInButton().assertLoginFailedMessage();
    }

    @AfterTest
    public void teardown(){
        Selenide.closeWebDriver();
    }
}
