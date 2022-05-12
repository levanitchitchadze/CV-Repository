package Pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TShirtsPage {
//პერანგების გვერდის ელემენტებს ვინახავ აქ
    public SelenideElement
            TShirtImage=$(By.xpath("//img[@class='replace-2x img-responsive'][@title='Faded Short Sleeve T-shirts']")),
            QuickViewButton=$(By.xpath("//a[@class='quick-view']")),
            DressesButton=$(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")),
            CasualDressesButton =$(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")),
            TShirtDescription=$(By.xpath("//h5[@itemprop='name']/a")),
            TShirtPrice=$(By.xpath("//span[@itemprop='price']"));
}
