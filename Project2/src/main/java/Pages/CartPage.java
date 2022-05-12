package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {

//    კალათში დამატებული პროდუქტების ელემენტებს ვინახავ აქ
    public ElementsCollection
            AllProductDescription=$$(By.xpath("//td[@class='cart_description']//p[@class='product-name']/a")),
            AllProductPrice=$$(By.xpath("//td[@class='cart_unit']//span[@class='price']/span"));

    public SelenideElement
            CheckoutButton=$(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")),
            TotalPriceOfProducts=$(By.xpath("//span[@id='total_price']"));

}
