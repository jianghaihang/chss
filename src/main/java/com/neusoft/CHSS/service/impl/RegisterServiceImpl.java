package com.neusoft.CHSS.service.impl;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.mapper.RegisterMapper;
import com.neusoft.CHSS.service.RegisterService;
import com.neusoft.CHSS.service.exception.UserCodeUniqueException;
import com.neusoft.CHSS.service.exception.UserConflictException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户注册实现类
 * @time 2019/11/24 17:59
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public Integer addUser(User user, String username) {

        // 用户注册成功条数
        Integer rows = 0;

        // 获取注册的用户
        String userName = user.getUserName();
        String password = user.getUserPassword();

        // 根据用户名查找用户名是否存在
        User data = getUserByUsername(userName);

        // 判断用户名是否存在
        if (data == null){

            // TODO 密码加密并封装
            String salt = UUID.randomUUID().toString().toUpperCase();
            System.out.println("salt: " + salt);

            String passwordMD5 = getMD5Password(user.getUserPassword(), salt);

            // 设置用户
            user.setUserName(user.getUserName());
            user.setUserPassword(passwordMD5);
            user.setUserAddress(user.getUserAddress());
            user.setRoleId(user.getRoleId());
            user.setIsDelete(0);
            user.setUserInfo(user.getUserInfo());
            user.setIsManager(0);

            user.setUserPhone(user.getUserPhone());
            user.setUserAccount(user.getUserAccount());
            user.setUserCode(user.getUserCode());
            user.setIdNum(user.getIdNum());

            user.setLandLine(user.getLandLine());
            user.setPinyin(user.getPinyin());
            user.setPerType(user.getPerType());
            user.setSubDept(user.getSubDept());
            user.setDocTitle(user.getDocTitle());
            user.setPubHealth(user.getPubHealth());
            user.setDocCode(user.getDocCode());

            // 设置备份信息
            user.setUserSalt(salt);
            user.setPwdBak(password);

            // 记录用户日志

            if (username == null){

                username = "小舵";
            }
            user.setCreateUser(username);
            user.setModifiedUser(username);

            try {

                // 用户注册
                rows = registerMapper.addNewUser(user);

            }catch (UserCodeUniqueException e){

                throw new UserCodeUniqueException("您尝试添加的用户编码【 " + user.getUserCode() + " 】已存在！");

            }

        }else {

            throw new UserConflictException("注册失败，你尝试注册的用户名【 " + user.getUserName() + " 】已被注册！");
        }

        return rows;
    }

    @Override
    public User getUserByUsername(String username) {

        return registerMapper.findUserByUsername(username);
    }

    /**
     * 使用MD5加密算法，进行密码加密，并加盐
     * @param password
     * @param salt
     * @return
     */
    private String getMD5Password(String password, String salt){

        // 加密规则

        // 1，将盐值添加到密码的左侧
        String saltPwd = salt + password;

        // 2， 执行加密十次
        for (int i = 0; i < 10; i++){

            saltPwd = DigestUtils.md5DigestAsHex(saltPwd.getBytes()).toUpperCase();

            System.out.println(saltPwd);

        }

        return saltPwd;
    }
}



























