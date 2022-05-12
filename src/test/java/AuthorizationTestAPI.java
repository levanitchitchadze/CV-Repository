import Backend.Steps.AuthorizationSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class AuthorizationTestAPI {

    @Description("This test tries to authorize with deleted user credentials and gets error message")
    @Story("Failed authorization attempt by API")
    @Test(priority = 3, testName = "Back end authorization test", description = "This test tries to authorize with deleted user credentials and gets error message")
    public void authorize(){
        AuthorizationSteps asteps = new AuthorizationSteps();
        asteps.serializeAuthorizingUser().getAuthorizationResponse().deserializeAuthorizationResponse().validateErrorResponseMessage();
    }

}
