
import Steps.OrderingSteps;
import Steps.RegistrationSteps;
import Steps.ShoppingSteps;
import Steps.SortingSteps;
import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.FileDownloadMode;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginTests {

//    ვიძახებ სტეპ კლასებს შემდეგი გამოყენებისთვის
    RegistrationSteps RegSteps = new RegistrationSteps();
    SortingSteps sortingSteps=new SortingSteps();
    OrderingSteps orderingsteps=new OrderingSteps();
    ShoppingSteps shoppingsteps=new ShoppingSteps();

//ვქმნი პირველ მეთოდს და აქედან ვიძახებ ბროუზერს ასევე კონფიგურაციებსაც
// ამ მეთოდიდან ვცვლი
    @Test(priority = 0)
    public void UserRegistration(){
        startMaximized=true;
        reportsFolder="src/main/resources/failedScreens";
        reopenBrowserOnFail = true;
        fastSetValue=true;
        assertionMode= AssertionMode.SOFT;
        fileDownload= FileDownloadMode.HTTPGET;

        open("http://automationpractice.com/index.php");


        //ვიძახებ RegistrationSteps კლასიდან მეთოდებს რომ დავარეგისტრირო მომხმარებელი
        RegSteps.StartReg()
                .InsertMail(RegSteps.GenerateEmail())
                .CreateAccount()
                .FillTheData();

    }

//ვქმნი მეორე მეთოდს პროდუქტების დალაგებისთვის
    @Test(priority = 1,groups = {"Resgression1"})
    public void SortByPrice (){
//        ვიძახებ მეთოდებს SortingSteps კლასიდან
        sortingSteps.DressesBringDown()
                    .MoveSummerDresses()
                    .SortingWithPrice()
                    .SortingCheck();

    }

//ვქმნი მესამე მეთოდს რომელიც იუზერის რეგისტრაციის მეთოდზე არის დამოკიდებული
    @Test(dependsOnMethods = {"UserRegistration"},priority = 2,groups = {"Resgression2"})
    public void StartShopping(){


        //ვიძახებ მეთოდებს ShoppingSteps კლასიდან
        shoppingsteps.MoveOnWomenButton()
                .ClickTShirt()
                .ScrollToImage()
                .QuickView()
                .MoveToFrame()
                .QuantityOfShirts()
                .SizeOfShirts()
                .AddToCard()
                .BackToDefault()
                .ContinueShopping()
                .MoveOnDressesButton()
                .ClickOnCasualDresses()
                .OpenCasualDress()
                .AddDressToCard()
                .ContinueShopping()
                .MoveToCard()
                .CheckProduct();


    }

//ვქმნი მეოთხე მეთოდს რომელიც დამოკიდებულია StartShopping მეთოდზე
    @Test(dependsOnMethods = {"StartShopping"},priority = 3,groups = {"Resgression2"})
    public void OrderProducts(){

//        ShoppingSteps კლასიდან ვიღებ მეთოდს რომელიც მიბრუნებს პროდუქტის სრულ თანხას
//        და სემდეგ გადავცემ OrderingSteps კლასის ერთერთ მეთოდს (.PayByCheck(TotalPrice)) რომ შევამოწმო
//        სწორია თუ არა დაანგარიშებული თანხა
    String TotalPrice=shoppingsteps.TotalPrice();


//    ვიძახებ მეთოდებს OrderingSteps კლასიდან
        orderingsteps.MoveToCheckout()
                .AddressLeaveDefault()
                .ShippingTabSteps()
                .PayByCheck(TotalPrice)
                .ConfirmOrders()
                .CustomerServiceLink()
                .SelectCustomerServiceHeading()
                .SelectOrderName()
                .SelectProductName()
                .UploadFile()
                .WriteMessage()
                .SubmitMessages();


    }



}





