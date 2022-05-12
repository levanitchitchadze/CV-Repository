package Frontend.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public SelenideElement
            deleteAccountButton = $(By.xpath("//button[text()='Delete Account']"));
}
