package com.cb.sp.petstore.biz.impl;

import com.cb.sp.petstore.biz.UserBiz;
import com.cb.sp.petstore.dao.UserDAO;
import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;
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
        Integer userId = loginDto.getUserId();
        LoginDto login = userDAO.login(userId);
        Boolean flag = false;
        if (loginDto.getUserName().equals(login.getUserName()) && loginDto.getPassword().equals(login.getPassword())){
            flag = true;
        }
        return flag;
    }

    @Override
    public Integer register(RegisterDto registerDto) {
        return null;
    }
}