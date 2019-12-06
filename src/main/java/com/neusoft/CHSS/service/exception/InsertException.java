package com.neusoft.CHSS.service.exception;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 插入数据失败异常
 * @time 2019/11/24 18:09
 */

public class InsertException extends ServiceException {

    private static final long serialVersionUID = -6153070917224635053L;

    public InsertException() {
    }

    public InsertException(String message) {
        super(message);
    }

    public InsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsertException(Throwable cause) {
        super(cause);
    }

    public InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
