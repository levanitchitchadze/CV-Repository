package Frontend.Steps;

import Frontend.Pages.ProfilePage;
import io.qameta.allure.Step;

public class ProfilePageSteps {
    ProfilePage profilepage = new ProfilePage();

    @Step("Click on delete account button")
    public ProfilePageSteps clickDeleteAccount(){
        profilepage.deleteAccountButton.scrollIntoView(true).click();
        return this;
    }

}
