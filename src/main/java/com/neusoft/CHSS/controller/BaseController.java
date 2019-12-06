package com.neusoft.CHSS.controller;

import com.neusoft.CHSS.service.exception.*;
import com.neusoft.CHSS.utils.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 控制器层的基类
 * @time 2019/11/25 11:04
 */

public class BaseController {

    // 响应成功
    public static final int SUCCESS = 200;

    // 客户端请求资源未找到
    public static final Integer ERROR = 404;

    // 服务端处理错误
    public static final Integer SERVERERROR = 500;

    /**
     * 通过session的绑定值中获取userId
     * @param session
     * @return
     */
    public Integer getUidFromSession(HttpSession session){

        return Integer.valueOf(session.getAttribute("userId").toString());
    }

    /**
     * 设置异常返回的错误代码
     *
     *      根据异常的不同，返回不同的错误代码
     * @param excep
     * @return
     */
    @ExceptionHandler({ServiceException.class})
    public ResponseResult<Void> handleController(Exception excep){

        // 声明响应对象类
        ResponseResult<Void> responseResult = new ResponseResult<Void>(SUCCESS);

        // 返回封装错误提示的异常情况
        responseResult.setMessage(excep.getMessage());

        if (excep instanceof UserConflictException){

            // 用户名冲突异常
            responseResult.setState(400);
        }else if (excep instanceof UserNotFoundException){

            // 用户不存在异常
            responseResult.setState(401);
        }else if (excep instanceof PasswordNotMatchException){

            // 登录密码验证不匹配异常
            responseResult.setState(402);
        }else if (excep instanceof InsertException){

            // 插入数据错误异常
            responseResult.setState(500);
        }

        return responseResult;
    }
}




































