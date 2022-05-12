package Backend.Steps;

import io.qameta.allure.Step;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class ChangeCredentialsStep {

    @Step("Change password")
    public String changePassword(String password){
        // remove one character randomly
        System.out.println("correct password: "+password);
        int removeIndex = nextInt(0, password.length() - 1);
        String incpassw = password.substring(0, removeIndex) + password.substring(removeIndex + 1);
        System.out.println("incorrect password: "+incpassw);
        return incpassw;

    }

    @Step("Change userName")
    public String changeUserName(String userName){
        // change one character randomly
        System.out.println("correct username: "+userName);
        int index = nextInt(0, userName.length() - 1);
        char replace = (char)(nextInt(97, 122));
        while (userName.charAt(index) == replace){
            replace = (char)(nextInt(97, 122));
        }
        String incusername = userName.substring(0, index) + replace + userName.substring(index + 1);
        System.out.println("incorrect username: "+incusername);
        return incusername;
    }
}
