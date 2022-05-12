package Pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage2 {

//    რეგისტრაციის მეორე გვერდის ელემენტებს ვინახავ აქ
    public SelenideElement
            FirstNameInput=$(By.xpath("//input[@id='customer_firstname']")),
            LastNameInput=$(By.xpath("//input[@id='customer_lastname']")),
            PasswordInput=$(By.xpath("//input[@id='passwd']")),
            UnderFirstNameInput=$(By.xpath("//input[@id='firstname']")),
            UnderLastNameInput=$(By.xpath("//input[@id='lastname']")),
            AddressInput=$(By.xpath("//input[@id='address1']")),
            CityInput=$(By.xpath("//input[@id='city']")),
            PostalCodeInput=$(By.xpath("//input[@id='postcode']")),
            StateSelect=$(By.xpath("//select[@id='id_state']")),
            CountrySelect=$(By.xpath("//select[@id='id_country']")),
            PhoneNumberInput=$(By.xpath("//input[@id='phone_mobile']")),
            MyAddressInput=$(By.xpath("//input[@id='alias']")),
            RegistrationButton=$(By.xpath("//button[@id='submitAccount']"));

}
