package top.zyz.boot.exception.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.zyz.boot.exception.enums.ErrorCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class ServerException extends RuntimeException{
    private int code;
    private String msg;

    public ServerException(String msg){
        super(msg);
        this.code = ErrorCode.INTERNAL_SERVER_ERROR.getCode();
        this.msg = msg;
    }

    public ServerException(ErrorCode errorCode){
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

}
