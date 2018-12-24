package com.cb.sp.petstore.facade;

import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;
import com.cb.sp.petstore.entity.UserEntity;

import java.util.Map;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/11 15:52
 */
public interface UserFacade {

    Map<Boolean, String> login(LoginDto loginDto);

    Map<Boolean, String> register(RegisterDto registerDto);

    UserEntity getUser(Integer userId);

    Boolean updatePwd(Integer userId, String password);

    Boolean updateUser(UserEntity userEntity);

    Boolean deleteByUserName(String userName);

    Boolean deleteByUserId(Integer userId);

    String send(String to, Integer type);

}