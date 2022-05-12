package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SummerDressesPage {
//ზაფხულის კაბების გვერდის ელემენტებს ვინახავ აქ
    public SelenideElement
            SortDropDown=$(By.xpath("//select[@id='selectProductSort']")),
            WomenButton=$(By.xpath("//a[@title='Women']")),
            TShirtButton=$(By.xpath("//a[@title='T-shirts']"));
                    ;

    public ElementsCollection
            PriceCollection = $$(By.xpath("//ul[@class='product_list grid row']//span[@itemprop='price'][contains(text(),'$')]"));

}
