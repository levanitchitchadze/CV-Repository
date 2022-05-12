package Frontend.Steps;

import Frontend.Data.FrontEndData;
import Frontend.Pages.LoginPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class LoginPageSteps {
    LoginPage loginpage = new LoginPage();
    FrontEndData frontEndData = new FrontEndData();

    @Step("Fill the username field")
    public LoginPageSteps fillUserNameField(){
        loginpage.usernameField.setValue(frontEndData.username);
        return this;
    }

    @Step("Fill the password field")
    public LoginPageSteps fillPasswordField(){
        loginpage.passwordField.setValue(frontEndData.password);
        return this;
    }

    @Step("Click on log in button")
    public LoginPageSteps clickLogInButton(){
        loginpage.loginButton.scrollIntoView(true).click();
        return this;
    }

    @Step("Check if invalid login message is displayed")
    public LoginPageSteps assertLoginFailedMessage(){
        Assert.assertEquals(loginpage.message.getText(),"Invalid username or password!");
        System.out.println(loginpage.message.getText());
        return this;
    }

}
