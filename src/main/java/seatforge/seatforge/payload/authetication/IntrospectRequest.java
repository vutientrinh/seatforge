package seatforge.seatforge.payload.authetication;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntrospectRequest {
    @NotBlank(message = "NOT_BLANK")
    private String token;
}