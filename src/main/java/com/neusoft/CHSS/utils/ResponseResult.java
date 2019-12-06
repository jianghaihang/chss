package com.neusoft.CHSS.utils;

import java.io.Serializable;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 请求响应工具类
 *
 *      服务端向客户端响应的数据类型
 *
 * @time 2019/11/25 10:25
 */

public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = -9002637531104824514L;

    /**
     * state：响应状态
     * message：响应消息
     * data：响应内容
     */
    private Integer state;
    private String message;
    private T data;

    public ResponseResult() {
        super();
    }

    public ResponseResult(Integer state) {
        this.state = state;
    }

    public ResponseResult(Integer state, T data) {
        super();
        this.state = state;
        this.data = data;
    }

    public ResponseResult(T data) {
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "state='" + state + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}



































