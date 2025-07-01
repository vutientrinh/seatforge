package seatforge.seatforge.handler;

import lombok.Getter;
import lombok.Setter;
import seatforge.seatforge.common.ErrorCode;

@Getter
@Setter
public class AppException extends RuntimeException{
    private ErrorCode errorCode;
    public AppException(ErrorCode errorCode){
        super(errorCode.getMessage());
    }
}
