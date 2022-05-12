package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class PaymentPage {
//გადახდის გვერდის ელემენტებს ვინახავ აქ
    public SelenideElement
        PayByCheckButton=$(By.xpath("//a[@class='cheque'][@title='Pay by check.']")),
        FullAmountOfProduct=$(By.xpath("//span[@id='amount'][@class='price']")),
        ConfirmOrderButton=$(By.xpath("//button[@class='button btn btn-default button-medium'][@type='submit']")),
        CustomerServiceDepartmentLink=$(By.xpath("//a[contains(text(),'customer service department.')]"));


}
