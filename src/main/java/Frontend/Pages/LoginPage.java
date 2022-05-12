package Frontend.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            usernameField = $("#userName"),
            passwordField = $("#password"),
            loginButton = $("#login"),
            message = $(By.xpath("//div[@id='output']//p[@id='name']"));
}
