import Backend.Steps.AuthorizationSteps;
import Backend.Steps.RegistrationSteps;
import Frontend.Steps.ConfigSteps;
import Frontend.Steps.LoginPageSteps;
import Frontend.Steps.PopupWindowAndAlertSteps;
import Frontend.Steps.ProfilePageSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Backend.Utils.ScreenshotListener.class)
@Epic("Functional test for checking if registration and authorization work correctly")
@Feature("User registration, account deletion and failed authorization")
public class Case1FullTest {
    ConfigSteps config = new ConfigSteps();
    LoginPageSteps login = new LoginPageSteps();
    ProfilePageSteps profile = new ProfilePageSteps();
    PopupWindowAndAlertSteps popupsteps = new PopupWindowAndAlertSteps();

    @Test(priority = 1, testName ="Back End Registration test")
    @Description("This test sends the request for registration of the user and gets success response")
    @Story("Registration of the user by API")
    public void register(){
        RegistrationSteps rsteps = new RegistrationSteps();
        rsteps.serializeRegistratingUserInfo().getRegistrationResponse().DeserializeRegistrationResponse();
    }

    @Test(priority = 2, testName = "UI test for login, account deletion and assertion")
    @Description("This UI test logs in a new user, deletes the account from profile settings and checks that deleted user can not log back in")
    @Story("User logs in, deletes account and gets error message trying to log back in")
    public void uitest(){
        config.configDriver();
        login.fillUserNameField().fillPasswordField().clickLogInButton();
        profile.clickDeleteAccount();
        popupsteps.clickConfirmDelete().checkAlertMessage().acceptAlert();
        login.fillUserNameField().fillPasswordField().clickLogInButton().assertLoginFailedMessage();
    }

    @Test(priority = 3, testName = "Back end authorization test")
    @Description("This test tries to authorize with deleted user credentials and gets error message")
    @Story("Failed authorization attempt by API")
    public void authorize(){
        AuthorizationSteps asteps = new AuthorizationSteps();
        asteps.serializeAuthorizingUser().getAuthorizationResponse().deserializeAuthorizationResponse().validateErrorResponseMessage();
    }
}
