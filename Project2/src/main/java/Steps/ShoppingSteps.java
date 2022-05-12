package Steps;

import Pages.*;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
public class ShoppingSteps {

    SummerDressesPage summerDressesPage=new SummerDressesPage();
    TShirtsPage tshirtspage =new TShirtsPage();
    CardPage cardpage =new CardPage();
    CasualDresses casualdresses =new CasualDresses();
    CartPage cartpage =new CartPage();

    List<String> ProductsRealDescription =new ArrayList<>();
    List<String> ProductsRealPrice=new ArrayList<>();

    public ShoppingSteps MoveOnWomenButton(){

    actions().moveToElement(summerDressesPage.WomenButton).perform();

    return this;

    }


    public ShoppingSteps ClickTShirt(){

        summerDressesPage.TShirtButton.click();

        return this;
    }




    public ShoppingSteps ScrollToImage(){

        tshirtspage.TShirtImage.scrollIntoView(true);
        actions().moveToElement(tshirtspage.TShirtImage).perform();


        ProductsRealDescription.add(tshirtspage.TShirtDescription.getText());
        ProductsRealPrice.add(tshirtspage.TShirtPrice.getText());

        return this;
    }




    public ShoppingSteps QuickView(){
        tshirtspage.QuickViewButton.click();
        return this;
    }

    public ShoppingSteps QuantityOfShirts(){

        cardpage.QuantityInput.clear();
        cardpage.QuantityInput.sendKeys("2");

        return this;

    }

    public ShoppingSteps SizeOfShirts(){

        Select select= new Select(cardpage.ShirtSizeElement);

        select.selectByValue("2");

        return this;

    }

    public ShoppingSteps AddToCard(){
        cardpage.AddCardButton.click();
        return this;
    }

    public ShoppingSteps MoveToFrame(){

        try {
            cardpage.FrameElement.should(Condition.visible, Duration.ofSeconds(6));
        }catch (Exception Ex){

        }
        switchTo().frame(cardpage.FrameElement);

        return this;
    }

    public ShoppingSteps ContinueShopping(){
        try {
            cardpage.ContinueShoppingButton.should(Condition.visible, Duration.ofSeconds(5));
        }catch (Exception EX){

        }
        cardpage.ContinueShoppingButton.click();
        return this;
    }

    public ShoppingSteps BackToDefault(){

        switchTo().defaultContent();

        return this;
    }

    public ShoppingSteps MoveOnDressesButton(){
        tshirtspage.DressesButton.scrollTo();
        actions().moveToElement(tshirtspage.DressesButton).perform();

        return this;
    }

    public ShoppingSteps ClickOnCasualDresses(){

        tshirtspage.CasualDressesButton.click();

        return this;
    }


    public ShoppingSteps OpenCasualDress(){

        casualdresses.CasualDressCard.scrollTo();
        actions().moveToElement(casualdresses.CasualDressCard).perform();

        ProductsRealDescription.add(tshirtspage.TShirtDescription.getText());
        ProductsRealPrice.add(tshirtspage.TShirtPrice.getText());


        return this;
    }


    public ShoppingSteps AddDressToCard(){

        casualdresses.AddToCardButton.click();
        return this;
    }


    public ShoppingSteps MoveToCard(){

        casualdresses.SeeCardButton.click();


        return this;
    }

    public String TotalPrice(){
        String TotalPriceOfProducts=cartpage.TotalPriceOfProducts.getText();

        return TotalPriceOfProducts;
    }

//ვამოწმებ პროდუქტი და პროდუქტის ფასუ თუ ემთხვევა ერთმანეთს აღწერა და ფასი წამოღებული მაქვს ბარათებიდან დამატების დროს
    public ShoppingSteps CheckProduct(){




        for (int i=0;i<cartpage.AllProductDescription.size();++i){


            if(!cartpage.AllProductDescription.get(i).getText().equals(ProductsRealDescription.get(i)) || !cartpage.AllProductPrice.get(i).getText().equals(ProductsRealPrice.get(i))){
                System.out.println("Price or product is not correct"+cartpage.AllProductDescription.get(i).getText());
                break;
            }else{
                System.out.println("All Product is Correct ");
            }


        }
        return this;
    }



}
