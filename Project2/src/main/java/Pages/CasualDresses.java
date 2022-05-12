package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class CasualDresses {

//    კაბის დასამატებლად ელემენტებს ვინახავ აქ
    public SelenideElement
                CasualDressCard=$(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")),
                AddToCardButton=$(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")),
                SeeCardButton=$(By.xpath("//a[@Title='View my shopping cart']"));



}
