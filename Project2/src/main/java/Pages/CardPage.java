package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CardPage {


//    გამოტანილი პროდუქტის ბარათის ელემენტებს ვინახავ აქ
    public SelenideElement
            QuantityInput=$(By.xpath("//input[@id='quantity_wanted']")),
            ShirtSizeElement=$(By.xpath("//select[@id='group_1']")),
            AddCardButton =$(By.xpath("//button[@name='Submit']")),
            FrameElement=$(By.xpath("//iframe [@class='fancybox-iframe']")),
            ContinueShoppingButton=$(By.xpath("//span[@title='Continue shopping']"));


}
