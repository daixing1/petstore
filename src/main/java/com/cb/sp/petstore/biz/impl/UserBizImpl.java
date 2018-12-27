package com.cb.sp.petstore.biz.impl;

import com.cb.sp.petstore.biz.UserBiz;
import com.cb.sp.petstore.dao.UserDAO;
import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;
import com.cb.sp.petstore.entity.UserEntity;
import com.cb.sp.petstore.util.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/11 16:43
 */
@Component("userBiz")
public class UserBizImpl implements UserBiz {

    @Autowired
    UserDAO userDAO;
    @Autowired
    JavaMailSender jms;

    @Override
    public Map<String, Object> login(LoginDto loginDto) {
        Boolean flag = false;
        Map<String, Object> map = new HashMap<>();
        String userName = loginDto.getUserName();
        String password = loginDto.getPassword();
        LoginDto login = userDAO.login(userName);
        if (null == userName || "".equals(userName)){
            String msg = "账号不能为空";
            map.put("message",msg);
        }
        if (null == password || "".equals(password)){
            String msg = "密码不能为空";
            map.put("message",msg);
        }
        if (userName.equals(login.getUserName()) && password.equals(login.getPassword())){
            flag = true;
            map.put("message", "登录成功");
            map.put("userId",login.getUserId());
        }
        return map;
    }

    @Override
    public Map<Boolean, String> register(RegisterDto registerDto) {
        Boolean flag = false;
        Map<Boolean, String> map = new HashMap<>();
        UserEntity user = userDAO.getUserByEmail(registerDto.getEmail());
        Integer userId = 0;
        if (null == user){
            userDAO.insertUser(registerDto);
            userId = registerDto.getUserId();

            send(registerDto.getEmail(), 1, "");
            map.put(true,"注册成功");
        }else {
            map.put(false,"该邮箱已被注册");
        }
        return map;
    }

    @Override
    public Boolean updatePwd(String email) {
        Boolean flag = false;
        String pwd = userDAO.getPWD(email);
        if (null != pwd){
            flag = true;
            send(email, 2, pwd);
        }
        return flag;
    }

    public String send(String to, Integer type, String password) {
        //建立邮件消息
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //发送者
        mainMessage.setFrom("790976320@qq.com");
        //接收者
        mainMessage.setTo(to);
        if (1 == type){
            //发送的标题
            mainMessage.setSubject("注册成功");
            //发送的内容
            mainMessage.setText("您已在宠物商店中注册成功！");
        }
        if (2 == type){
            //发送的标题
            mainMessage.setSubject("密码");
            //发送的内容
            mainMessage.setText("您已在宠物商店中的密码是：" + password);
        }

        jms.send(mainMessage);
        return "发送成功";
    }
}