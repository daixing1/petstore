package com.cb.sp.petstore.biz;

import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/11 16:43
 */
public interface UserBiz {

    Boolean login(LoginDto loginDto);

    Integer register(RegisterDto registerDto);

}