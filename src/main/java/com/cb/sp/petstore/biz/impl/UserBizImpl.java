package com.cb.sp.petstore.biz.impl;

import com.cb.sp.petstore.biz.UserBiz;
import com.cb.sp.petstore.dao.UserDAO;
import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;
import com.cb.sp.petstore.entity.UserEntity;
import com.cb.sp.petstore.util.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/11 16:43
 */
@Component("userBiz")
public class UserBizImpl implements UserBiz {

    @Autowired
    UserDAO userDAO;

    @Override
    public Boolean login(LoginDto loginDto) {
        String userName = loginDto.getUserName();
        LoginDto login = userDAO.login(userName);
        Boolean flag = false;
        if (loginDto.getUserName().equals(login.getUserName()) && loginDto.getPassword().equals(login.getPassword())){
            flag = true;
        }
        return flag;
    }

    @Override
    public Integer register(RegisterDto registerDto) {
        UserEntity user = userDAO.getUserByEmail(registerDto.getEmail());
        Integer userId = 0;
        if (null == user){
            userDAO.insertUser(registerDto);
            userId = registerDto.getUserId();
        }else {
            throw new BizException("该邮箱已被注册");
        }
        return userId;
    }
}