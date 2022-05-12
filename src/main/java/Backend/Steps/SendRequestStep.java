package Backend.Steps;

import Backend.Data.BackEndData;
import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendRequestStep {

    BackEndData data = new BackEndData();

    @Step("Send request")
    public Response generateToken(String params){
        return RestAssured.given().
                filter(new AllureRestAssured()).
                baseUri(data.generateTokenBaseUri).
                contentType(ContentType.JSON).
                body(params).
                when().
                post();
    }

    @Step("Create new user")
    public void createUser(String params){
        RestAssured.given().
                filter(new AllureRestAssured()).
                baseUri(data.registerBaseUri).
                contentType(ContentType.JSON).
                body(params).
                when().
                post();
    }
}
