package Frontend.Steps;

import Frontend.Pages.Pop_upWindow;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.switchTo;

public class PopupWindowAndAlertSteps {
    Pop_upWindow popup = new Pop_upWindow();

    @Step("Click on confirm button")
    public PopupWindowAndAlertSteps clickConfirmDelete(){
        popup.confirmDelete.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Check alert message - user deleted")
    public PopupWindowAndAlertSteps checkAlertMessage(){
        Assert.assertEquals(switchTo().alert().getText(),"User Deleted.");
        System.out.println(switchTo().alert().getText());
        return this;
    }

    @Step("Accept alert")
    public PopupWindowAndAlertSteps acceptAlert(){
        switchTo().alert().accept();
        return this;
    }
}
