package Backend.Models.RequestModel;
import com.fasterxml.jackson.annotation.JsonProperty;

public record User(@JsonProperty("userName") String username,
                   @JsonProperty("password") String password) {
}
