package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class CustomerServicePage {

//    კლიენტების მომსახურების გვერდის ელემენტებს ვინახავ აქ
    public SelenideElement
            SubjectHeadingSelect=$(By.xpath("//select[@id='id_contact']")),
            OrderNameSelect=$(By.xpath("//select[@name='id_order']")),
            ProductNameSelect=$(By.xpath("//select[@name='id_product']")),
            FileUploadInput=$(By.xpath("//input[@id='fileUpload']")),
            TextareaInput=$(By.xpath("//textarea[@id='message']")),
            SubmitButton=$(By.xpath("//button[@id='submitMessage']"));


}
