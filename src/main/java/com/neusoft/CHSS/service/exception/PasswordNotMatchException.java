package com.neusoft.CHSS.service.exception;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 密码不匹配异常
 * @time 2019/11/24 20:48
 */

public class PasswordNotMatchException extends ServiceException {

    private static final long serialVersionUID = 2120244487802751987L;

    public PasswordNotMatchException() {
    }

    public PasswordNotMatchException(String message) {
        super(message);
    }

    public PasswordNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNotMatchException(Throwable cause) {
        super(cause);
    }

    public PasswordNotMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
