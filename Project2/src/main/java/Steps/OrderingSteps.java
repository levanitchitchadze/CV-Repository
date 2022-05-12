package Steps;


import Data.CustomerServicePageData;
import Pages.*;
import org.openqa.selenium.support.ui.Select;
import java.io.File;

public class OrderingSteps {
    CartPage cartpage=new CartPage();
    AddressPage addresspage=new AddressPage();
    ShippingPage shippingpage =new ShippingPage();
    PaymentPage paymentpage =new PaymentPage();
    CustomerServicePage customerservicepage=new CustomerServicePage();
    CustomerServicePageData customerservicepagedata =new CustomerServicePageData();

    public OrderingSteps MoveToCheckout(){

        cartpage.CheckoutButton.click();

        return this;
    }


    public OrderingSteps AddressLeaveDefault(){

        addresspage.AddressPassButton.click();

        return this;
    }


    public OrderingSteps ShippingTabSteps(){

        shippingpage.ShippingTermsCheckbox.click();
        shippingpage.ProceedCheckoutButton.click();

        return this;
    }


    public OrderingSteps PayByCheck(String TotalPrice){

        paymentpage.PayByCheckButton.click();


        if (paymentpage.FullAmountOfProduct.getText().equals(TotalPrice)){
            System.out.println("Amount is Correct");
        }else{
            System.out.println("Amount is not correct");
        }


        return this;
    }


    public OrderingSteps ConfirmOrders(){

            paymentpage.ConfirmOrderButton.click();

            return this;
    }

    public OrderingSteps CustomerServiceLink(){

        paymentpage.CustomerServiceDepartmentLink.click();

        return this;
    }

    public OrderingSteps SelectCustomerServiceHeading(){

        Select HeadingSelect=new Select(customerservicepage.SubjectHeadingSelect);
        HeadingSelect.selectByValue("2");

        return this;
    }

    public OrderingSteps SelectOrderName(){
        Select OrderSelect=new Select(customerservicepage.OrderNameSelect);

        OrderSelect.selectByIndex(1);


        return this;
    }


    public OrderingSteps SelectProductName(){
        Select ProductNameSelect=new Select(customerservicepage.ProductNameSelect);
        ProductNameSelect.selectByIndex(1);

        return this;
    }

    public OrderingSteps UploadFile(){

        File file = customerservicepage.FileUploadInput.uploadFile(new File("src\\main\\resources\\failedScreens\\1645528079147.0.png"));


        return this;
    }

    public OrderingSteps WriteMessage(){

        customerservicepage.TextareaInput.sendKeys(customerservicepagedata.TextareaMessage);

        return this;
    }


    public OrderingSteps SubmitMessages(){

        customerservicepage.SubmitButton.click();

        return this;
    }

}
