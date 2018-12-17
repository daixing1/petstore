package com.cb.sp.petstore.facade.impl;

import com.cb.sp.petstore.biz.UserBiz;
import com.cb.sp.petstore.dao.UserDAO;
import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;
import com.cb.sp.petstore.entity.UserEntity;
import com.cb.sp.petstore.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/11 15:53
 */
@RestController
@RequestMapping("user")
public class UserFacadeImpl  implements UserFacade {

    @Autowired
    UserBiz userBiz;
    @Autowired
    UserDAO userDAO;

    @Override
    @PostMapping("login")
    public Boolean login(@RequestBody LoginDto loginDto) {
        Boolean flag = userBiz.login(loginDto);
        return flag;
    }

    @Override
    @PostMapping("register")
    public Integer register(@RequestBody RegisterDto registerDto) {
        Integer userId = userBiz.register(registerDto);
        return userId;
    }

    @Override
    @GetMapping("getUser")
    public UserEntity getUser(@RequestParam("userId") Integer userId) {
        UserEntity user = userDAO.getUserById(userId);
        return user;
    }

    @Override
    @PostMapping("updateUser")
    public Boolean updateUser(@RequestBody UserEntity userEntity) {
        Boolean flag = userDAO.updateUser(userEntity);
        return flag;
    }

    @Override
    @GetMapping("deleteByUserName")
    public Boolean deleteByUserName(@RequestParam("userName") String userName) {
        Boolean flag = userDAO.deleteByUserName(userName);
        return flag;
    }

    @Override
    @GetMapping("deleteByUserId")
    public Boolean deleteByUserId(@RequestParam("userId") Integer userId) {
        Boolean flag = userDAO.deleteByUserId(userId);
        return flag;
    }



}