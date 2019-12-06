package com.neusoft.CHSS.service.exception;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户编码唯一约束异常
 * @time 2019/12/1 16:14
 */

public class UserCodeUniqueException extends ServiceException {

    public UserCodeUniqueException() {
    }

    public UserCodeUniqueException(String message) {
        super(message);
    }

    public UserCodeUniqueException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserCodeUniqueException(Throwable cause) {
        super(cause);
    }

    public UserCodeUniqueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
