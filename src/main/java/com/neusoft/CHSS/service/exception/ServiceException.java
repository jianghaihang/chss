package com.neusoft.CHSS.service.exception;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 服务层异常超类
 * @time 2019/11/24 15:51
 */

public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -2971586709147600548L;


    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
