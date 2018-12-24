package com.cb.sp.petstore.facade.impl;

import com.cb.sp.petstore.biz.UserBiz;
import com.cb.sp.petstore.dao.UserDAO;
import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;
import com.cb.sp.petstore.entity.UserEntity;
import com.cb.sp.petstore.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    @Autowired
    JavaMailSender jms;

    @Override
    @PostMapping("login")
    public Map<Boolean, String> login(@RequestBody LoginDto loginDto) {
        return userBiz.login(loginDto);
    }

    @Override
    @PostMapping("register")
    public Map<Boolean, String> register(@RequestBody RegisterDto registerDto) {
        return userBiz.register(registerDto);
    }

    @Override
    @GetMapping("getUser")
    public UserEntity getUser(@RequestParam("userId") Integer userId) {
        return userDAO.getUserById(userId);
    }

    @Override
    public Boolean updatePwd(Integer userId, String password) {
        return null;
    }

    @Override
    @PostMapping("updateUser")
    public Boolean updateUser(@RequestBody UserEntity userEntity) {
        return userDAO.updateUser(userEntity);
    }

    @Override
    @GetMapping("deleteByUserName")
    public Boolean deleteByUserName(@RequestParam("userName") String userName) {
        return userDAO.deleteByUserName(userName);
    }

    @Override
    @GetMapping("deleteByUserId")
    public Boolean deleteByUserId(@RequestParam("userId") Integer userId) {
        return userDAO.deleteByUserId(userId);
    }

    @Override
    @GetMapping("/send")
    public String send(String to, Integer type) {
        //建立邮件消息
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //发送者
        mainMessage.setFrom("790976320@qq.com");
        //接收者
        mainMessage.setTo(to);
        //发送的标题
        mainMessage.setSubject("嗨喽,傻吊");
        //发送的内容
        mainMessage.setText("hello world");
        jms.send(mainMessage);
        return "发送成功";
    }



}