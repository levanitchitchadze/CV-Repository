package Pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShippingPage {

//    შიპინგის გვერდის ელემენტებს ვინახავ აქ
    public SelenideElement
            ShippingTermsCheckbox=$(By.xpath("//input[@id='cgv']")),
            ProceedCheckoutButton=$(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));


}
