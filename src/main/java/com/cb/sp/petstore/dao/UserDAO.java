package com.cb.sp.petstore.dao;


import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;
import com.cb.sp.petstore.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserDAO {

	LoginDto login(String userName);

	Integer insertUser(RegisterDto registerDto);

	UserEntity getUserByEmail(String email);

	UserEntity getUserById(Integer userId);

	Boolean updateUser(UserEntity userEntity);

	List<UserEntity> getAllUser();

	List<UserEntity> getUserByName(String UserName);

	Boolean deleteByUserName(String UserName);

    Boolean deleteByUserId(Integer UserId);

	Boolean updatePwd(Map<String, Object> map);

    String getPWD(String email);


}
