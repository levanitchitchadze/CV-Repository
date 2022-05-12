import Backend.Steps.ChangeCredentialsStep;
import Backend.Steps.SendRequestStep;
import Backend.Steps.SetParamsStep;
import Backend.Steps.ValidateStep;
import Backend.Utils.SetUsersParameters;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Backend.Utils.ScreenshotListener.class)
@Epic("Backend functional tests for negative authorization cases")
@Feature("Negative test cases")
public class Case2FullTest {

    private String userName;
    private String password;

    private SetParamsStep setParamsStep;
    private SetUsersParameters setUserParams;
    private SendRequestStep sendRequestStep;
    private ChangeCredentialsStep changeCredentialsStep;
    private ValidateStep validateStep;

    @BeforeTest
    public void createUser() throws JsonProcessingException {
        setParamsStep = new SetParamsStep();
        setUserParams = new SetUsersParameters();
        sendRequestStep = new SendRequestStep();
        changeCredentialsStep = new ChangeCredentialsStep();
        validateStep = new ValidateStep();

        userName = setUserParams.generateUserName();
        password = setUserParams.generatePassword();

        String params = setParamsStep.setUserParams(userName, password);
        sendRequestStep.createUser(params);
    }

    @Test
    @Story("Incorrect password")
    @Description("Correct userName and incorrect password")
    public void incorrectPassword() throws JsonProcessingException {
        String incorrectPassword = changeCredentialsStep.changePassword(password);
        String params = setParamsStep.setUserParams(userName, incorrectPassword);
        Response response = sendRequestStep.generateToken(params);
        validateStep.validateResponse(response);
    }

    @Test
    @Story("Incorrect userName")
    @Description("Incorrect userName and correct password")
    public void incorrectUserName() throws JsonProcessingException {
        String incorrectUserName = changeCredentialsStep.changeUserName(userName);
        String params = setParamsStep.setUserParams(incorrectUserName, password);
        Response response = sendRequestStep.generateToken(params);
        validateStep.validateResponse(response);
    }

    @Test
    @Story("Both credentials incorrect")
    @Description("Incorrect userName and incorrect password")
    public void bothCredentialsIncorrect() throws JsonProcessingException {
        String incorrectPassword = changeCredentialsStep.changePassword(password);
        String incorrectUserName = changeCredentialsStep.changeUserName(userName);
        String params = setParamsStep.setUserParams(incorrectUserName,incorrectPassword);
        Response response = sendRequestStep.generateToken(params);
        validateStep.validateResponse(response);

    }
}
