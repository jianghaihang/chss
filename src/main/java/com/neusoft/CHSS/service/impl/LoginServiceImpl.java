package com.neusoft.CHSS.service.impl;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.mapper.LoginMapper;
import com.neusoft.CHSS.service.LoginService;
import com.neusoft.CHSS.service.exception.PasswordNotMatchException;
import com.neusoft.CHSS.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户登录接口实现类
 * @time 2019/11/24 15:42
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User login(String account,String password) {

        User data =  loginMapper.findUserByAccount(account);

        // 判断用户数据是否为空
        if (data == null){

            throw new UserNotFoundException("登录失败！账号【 " + account + " 】不存在！");
        }

        // 判断用户账号是否删除，如果删除表示为1，未删除表示为0
        if (data.getIsDelete().equals("1")){

            throw new UserNotFoundException("账号异常！账号【 " + account + " 】已失效！");
        }else {

            // 将用户密码再次进行加密
            String passwordMD5 = getPasswordMD5(password, data.getUserSalt());

            System.err.println("pwdMD5: " + passwordMD5 + ", data: " + data.getUserPassword());

            if (data.getUserPassword().equals(passwordMD5)){

                // 先将查询到的用户数据中的密码、盐值、isDelete设置未null时，在返回，否则会暴露数据
                data.setUserPassword(null);
                data.setUserSalt(null);
                data.setIsDelete(null);

                // 返回查询到的数据
                return data;

            }else {

                throw new PasswordNotMatchException("【 " + password + " 】密码不正确，请重新输入！");
            }
        }
    }

    /**
     * 使用MD5加密原生密码和盐值
     * @param password
     * @param salt
     * @return
     */
    private String getPasswordMD5(String password, String salt){

        String saltPwd = salt + password;

        // 注意：此处循环的次数需要和注册中循环的次数一致
        for (int i = 0; i < 10; i ++){

            saltPwd = DigestUtils.md5DigestAsHex(saltPwd.getBytes()).toUpperCase();

//            System.err.println("saltPwd: " + saltPwd);
        }

        return saltPwd;
    }
}
































