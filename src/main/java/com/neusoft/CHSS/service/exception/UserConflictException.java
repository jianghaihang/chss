package com.neusoft.CHSS.service.exception;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户名被占用异常
 * @time 2019/11/24 18:08
 */

public class UserConflictException extends ServiceException {

    private static final long serialVersionUID = -944230880494055057L;

    public UserConflictException() {
    }

    public UserConflictException(String message) {
        super(message);
    }

    public UserConflictException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserConflictException(Throwable cause) {
        super(cause);
    }

    public UserConflictException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
