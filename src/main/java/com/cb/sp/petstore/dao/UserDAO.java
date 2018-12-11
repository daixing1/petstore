package com.cb.sp.petstore.dao;


import com.cb.sp.petstore.dto.LoginDto;

public interface UserDAO {

	Boolean login(LoginDto loginDto);
}
