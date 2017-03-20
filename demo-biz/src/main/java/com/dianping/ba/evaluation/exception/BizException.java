package com.dianping.ba.evaluation.exception;

/**
 * Created by jason on 2016/11/14.
 */
public class BizException extends RuntimeException {

    private String errorCode;

    private String errorMessage;

    //普通异常
    public static final String NUM_EXCEPTION  = "-1";

    public BizException(){
        super("业务异常");
        this.errorCode=NUM_EXCEPTION;
        this.errorMessage="业务异常";
    }

    public BizException(String errorCode, String errorMessage){
        super(errorMessage);
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }

    public BizException(String errorMessage){
        super(errorMessage);
        this.errorCode=NUM_EXCEPTION;
        this.errorMessage=errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
