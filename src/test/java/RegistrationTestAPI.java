import Backend.Steps.RegistrationSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class RegistrationTestAPI {

    @Description("This test sends the request for registration of the user and gets success response")
    @Story("Registration of the user by API")
    @Test(priority = 1, testName ="Back End Registration test", description = "This test sends the request for registration of the user and gets success response")
    public void register(){
        RegistrationSteps rsteps = new RegistrationSteps();
        rsteps.serializeRegistratingUserInfo().getRegistrationResponse().DeserializeRegistrationResponse();
    }
}
