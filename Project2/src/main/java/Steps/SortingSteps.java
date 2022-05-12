package Steps;

import Pages.RegistrationPage1;
import Pages.SummerDressesPage;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
public class SortingSteps {
    RegistrationPage1 registrationpage1= new RegistrationPage1();
    SummerDressesPage summerdressespage=new SummerDressesPage();

    public SortingSteps DressesBringDown(){

        actions().moveToElement(registrationpage1.Dresses_Button).perform();
        return this;
    }

    public SortingSteps MoveSummerDresses(){

        registrationpage1.Summer_dresses.click();
        return this;
    }

    public SortingSteps SortingWithPrice(){
        Select select=new Select(summerdressespage.SortDropDown);

        select.selectByValue("price:desc");

        return this;
    }

    public SortingSteps SortingCheck(){

        //ვქმნი ახალ ლისტს ფასებისთვის
        List<Double> Prices= new ArrayList<Double>();

        //ვქმნი ციკლს რომ ყველა ელემენტის ტექსტი რომელშიც ფასია მითითებული გადავიტანო ახალ ლისტში
        for (int i=0;i<summerdressespage.PriceCollection.size();++i) {

            //გავუწერე პირობა რომ გავფილტრო ღირებულების შემცველი ელემენტები
            if (summerdressespage.PriceCollection.get(i).getText().contains("$")) {
                //ღირებულების ტექსტს ვაშორებ ვალუტის ნიშანს და გადამყავს რიცხვად
                Prices.add(Double.parseDouble(summerdressespage.PriceCollection.get(i).getText().replace('$',' ')));
            }

        }

        //ვქმნი მეორე ციკლს რომ შევამოწმო დალაგებულია თუ არა ფასების კლების მიხედვით
        for (int i=0 ;i<Prices.size()-1;++i){
            //პირველ ფასს ვადარებ მომდევნოს თუ მეტია მაშინ ყველაფერი რიგზეა
            //თუ არა მაშინ არ არის დალაგევული ფასის კლების მიხედვით და გამოდის შეტყობინება
            if (Prices.get(i)>Prices.get(i+1)){

            }else {
                System.out.println("Sorting does not work ");
                break;
            }
        }



        return this;
    }

}
