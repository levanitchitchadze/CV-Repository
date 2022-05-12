package Backend.Steps;

import Backend.Data.FailedResponseData;
import Backend.Models.ResponseModel.GenerateTokenSuccess;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.Assert;

public class ValidateStep {

    @Step("Validate response")
    public void validateResponse(Response response){
        FailedResponseData data = new FailedResponseData();

        Assert.assertEquals(response.body().as(GenerateTokenSuccess.class).token(), data.token);
        Assert.assertEquals(response.body().as(GenerateTokenSuccess.class).expires(), data.expires);
        Assert.assertEquals(response.body().as(GenerateTokenSuccess.class).status(), data.status);
        Assert.assertEquals(response.body().as(GenerateTokenSuccess.class).result(), data.result);
    }
}
