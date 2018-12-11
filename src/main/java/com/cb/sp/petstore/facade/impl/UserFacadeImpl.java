package com.cb.sp.petstore.facade.impl;

import com.cb.sp.petstore.biz.UserBiz;
import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;
import com.cb.sp.petstore.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/11 15:53
 */
@RestController
@RequestMapping("petstore")
public class UserFacadeImpl  implements UserFacade {

    @Autowired
    UserBiz userBiz;

    @Override
    @PostMapping("login")
    public Boolean login(LoginDto loginDto) {
        Boolean flag = userBiz.login(loginDto);
        return flag;
    }

    @Override
    public Integer register(RegisterDto registerDto) {
        Integer userId = userBiz.register(registerDto);
        return userId;
    }
}