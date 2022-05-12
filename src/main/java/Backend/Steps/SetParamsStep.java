package Backend.Steps;

import Backend.Models.RequestModel.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Step;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class SetParamsStep {

    @Step("Set user's parameters")
    public String setUserParams(String userName, String password) throws JsonProcessingException {
        User user = new User(userName, password);

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(user);
    }
}
