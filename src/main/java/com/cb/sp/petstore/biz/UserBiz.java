package com.cb.sp.petstore.biz;

import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;

import java.util.Map;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/11 16:43
 */
public interface UserBiz {

    Map<String, Object> login(LoginDto loginDto);

    Map<Boolean, String> register(RegisterDto registerDto);

    Boolean updatePwd(String email);

}