package Backend.Data;

import Backend.Utils.SetUsersParameters;

public class BackEndData {

    static SetUsersParameters params = new SetUsersParameters();

    public static String username = params.generateUserName();
    public static String password = params.generatePassword();
    public String registerBaseUri = "https://bookstore.toolsqa.com/Account/v1/User";
    public String authorizeBaseUri = "https://bookstore.toolsqa.com/Account/v1/Authorized";
    public String generateTokenBaseUri = "https://bookstore.toolsqa.com/Account/v1/GenerateToken";
}
