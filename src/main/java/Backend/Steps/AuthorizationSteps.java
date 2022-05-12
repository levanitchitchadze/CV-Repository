package Backend.Steps;

import Backend.Data.BackEndData;
import Backend.Models.RequestModel.User;
import Backend.Models.ResponseModel.ErrorResponse;
import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class AuthorizationSteps {
    BackEndData backEndData = new BackEndData();
    User user;
    Response response;
    ErrorResponse errorResponse;


    @Step("Serialize data user for authorization")
    public AuthorizationSteps serializeAuthorizingUser(){
        user = new User(BackEndData.username, BackEndData.password);
        return this;
    }


    @Step("Send authorization request and get response")
    public AuthorizationSteps getAuthorizationResponse(){
        response = given()
                .filter(new AllureRestAssured())
                .when()
                .baseUri(backEndData.authorizeBaseUri)
                .contentType(ContentType.JSON)
                .body(user)
                .post();
        return this;
    }


    @Step("Deserialize authorization error response")
    public AuthorizationSteps deserializeAuthorizationResponse(){
        errorResponse = response.as(ErrorResponse.class);
        return this;
    }


    @Step("Validate error message - user not found")
    public AuthorizationSteps validateErrorResponseMessage(){
        Assert.assertEquals(errorResponse.message,"User not found!");
        System.out.println(errorResponse.message);
        return this;
    }
}
