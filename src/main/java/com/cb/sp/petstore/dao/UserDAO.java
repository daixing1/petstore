package com.cb.sp.petstore.dao;


import com.cb.sp.petstore.dto.LoginDto;
import com.cb.sp.petstore.dto.RegisterDto;

public interface UserDAO {

	LoginDto login(Integer userId);

	Integer insertUser(RegisterDto registerDto);
}
