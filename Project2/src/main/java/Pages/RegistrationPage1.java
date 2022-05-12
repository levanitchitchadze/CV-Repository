package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage1 {
//რეგისტრაციის გვერდის ელემენტებს ვინახავ აქ
    public SelenideElement
            //რეგისტრაციის ღილაკი
            Create_Account_Button= $(By.xpath("//button[@id='SubmitCreate']")),

            //მეილის ჩასაწერი ველი
            //Create Account Email Address Element
            Create_Account_Email_Address_Element = $(By.xpath("//input[@class='is_required validate account_input form-control']")),

            //კაბებზე გადასასვლელი ღილაკი
            Dresses_Button=$(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")),
            //ზაფხულის კაბებზე გადასასვლელი ღილაკი
            Summer_dresses=$(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a"));

}
