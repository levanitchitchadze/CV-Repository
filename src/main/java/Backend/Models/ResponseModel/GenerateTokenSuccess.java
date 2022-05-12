package Backend.Models.ResponseModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record GenerateTokenSuccess(@JsonProperty("token") String token,
                                   @JsonProperty("expires") Date expires,
                                   @JsonProperty("status") String status,
                                   @JsonProperty("result") String result) {
}
