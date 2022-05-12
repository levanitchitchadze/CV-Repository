package Steps;

import Data.UserRegistrationData;
import Pages.HomePage;
import Pages.RegistrationPage1;
import Pages.RegistrationPage2;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Random;
import java.lang.*;


public class RegistrationSteps {
    UserRegistrationData userregistrationdata  = new UserRegistrationData();
    HomePage homePage=new HomePage();
    Random rand = new Random();
    RegistrationPage1 registrationpage1= new RegistrationPage1();
    RegistrationPage2 registrationpage2=new RegistrationPage2();


    public RegistrationSteps StartReg() {
        homePage.RegButton.click();
        return this;
    }

    public RegistrationSteps InsertMail(String EmailAddress) {
        registrationpage1.Create_Account_Email_Address_Element.sendKeys(EmailAddress);
        return this;
    }

    public RegistrationSteps CreateAccount(){
        registrationpage1.Create_Account_Button.click();
        return this;
    }

//    ვაგენერირებ შემთხვევით მეილს რომ გავიარო რეგისტრაცია
    public  String GenerateEmail(){
//რენდომად ვირჩევ 10-30მდე რიცხვს
        int randomNumber=rand.nextInt(10,30);

        String Alphabet="";

//        ციკლში ვატარებ ალფაბეტს და ვქმნი ანბანის სტრინგს
        for(char i='A';i<'Z';++i){
            Alphabet=Alphabet+i;
        }
        String EmailAddress="";
//        კიდევ ერთ ციკლში ვატარებს 10-30მდე სიმბოლოს ვიღებ რენდომად ანბანის სტრინგიდან და ვქმნი მეილის ადრესს
        for (int i = 0;i<randomNumber ;++i){
            int NewRandom=rand.nextInt(0,25);
            EmailAddress+= Alphabet.charAt(NewRandom);
        }

//        მეილს ვუმატებ დაბოლოვებას
        EmailAddress+="@GMAIL.COM";


        return EmailAddress;
    }



    public RegistrationSteps FillTheData(){

//        ველოდები გამოჩნდეს ელემენტები
        try {

            registrationpage2.FirstNameInput.should(Condition.visible, Duration.ofSeconds(5));

        }catch (Exception ex){

        }

        registrationpage2.FirstNameInput.sendKeys(userregistrationdata.FirstName);
        registrationpage2.LastNameInput.sendKeys(userregistrationdata.LastName);
        registrationpage2.PasswordInput.sendKeys(userregistrationdata.Password);
        registrationpage2.UnderFirstNameInput.sendKeys(userregistrationdata.FirstName);
        registrationpage2.UnderLastNameInput.sendKeys(userregistrationdata.LastName);
        registrationpage2.AddressInput.sendKeys(userregistrationdata.Address);
        registrationpage2.CityInput.sendKeys(userregistrationdata.City);
        Select StateSelect= new Select(registrationpage2.StateSelect);
        StateSelect.selectByVisibleText(userregistrationdata.State);
        Select CountrySelect= new Select(registrationpage2.CountrySelect);
        CountrySelect.selectByVisibleText(userregistrationdata.Country);
        registrationpage2.PostalCodeInput.sendKeys(userregistrationdata.PostalCode);
        registrationpage2.PhoneNumberInput.sendKeys(userregistrationdata.Mobile);
        registrationpage2.MyAddressInput.sendKeys(userregistrationdata.Address);
        registrationpage2.RegistrationButton.click();


        return this;
    }
}
