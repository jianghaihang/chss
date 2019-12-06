package com.neusoft.CHSS.service.exception;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 菜单未找到的自定义异常
 * @time 2019/11/26 1:09
 */

public class MenuNoFoundException extends ServiceException {

    public MenuNoFoundException() {
    }

    public MenuNoFoundException(String message) {
        super(message);
    }

    public MenuNoFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuNoFoundException(Throwable cause) {
        super(cause);
    }

    public MenuNoFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
