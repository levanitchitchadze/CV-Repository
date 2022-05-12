package Backend.Utils;

import io.qameta.allure.Step;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class SetUsersParameters {

    private final int userNameLength = 8;
    private final int passwordLength = 8;

    @Step("Generate password")
    public String generatePassword() {
        String password = "";

        // add uppercase letter
        password += (char)(nextInt(65, 90));

        for (int i = 0; i < passwordLength - 3; i++){
            // add lowercase letter
            password += (char)(nextInt(97, 122));
        }

        // add digit
        password += nextInt(0, 9);

        // add special symbol
        String specialSymbols = "@#$%^&*";
        password += specialSymbols.charAt(nextInt(0, specialSymbols.length() - 1));

        return password;
    }

    @Step("Generate userName")
    public String generateUserName() {
        String userName = "";

        // add one uppercase letter randomly
        userName += (char)(nextInt(65, 90));

        for (int i = 0; i < userNameLength - 1; i++){
            // add lowercase letter
            userName += (char)(nextInt(97, 122));
        }
        return userName;
    }
}
