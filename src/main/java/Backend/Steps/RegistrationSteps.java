package Backend.Steps;

import Backend.Data.BackEndData;
import Backend.Models.RequestModel.User;
import Backend.Models.ResponseModel.ErrorResponse;
import Backend.Models.ResponseModel.RegisterSuccess;
import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RegistrationSteps {
    BackEndData backEndData = new BackEndData();
    User user;
    Response response;


    @Step("Serialize data user for registration")
    public RegistrationSteps serializeRegistratingUserInfo(){
        user = new User(BackEndData.username, BackEndData.password);
        return this;
    }


    @Step("Send Registration request and get response")
    public RegistrationSteps getRegistrationResponse(){
        response = given()
                .filter(new AllureRestAssured())
                .when()
                .baseUri(backEndData.registerBaseUri)
                .contentType(ContentType.JSON)
                .body(user)
                .post();
        return this;
    }


   @Step("Deserialize response according to response code")
    public RegistrationSteps DeserializeRegistrationResponse(){
        RegisterSuccess sr = response.as(RegisterSuccess.class);
        System.out.println("Created user: "+sr.username);
        return this;
    }

}
