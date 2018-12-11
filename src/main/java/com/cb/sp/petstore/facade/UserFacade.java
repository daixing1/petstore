package com.cb.sp.petstore.facade;

import com.cb.sp.petstore.dto.LoginDto;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/11 15:52
 */
public interface UserFacade {

    Boolean login(LoginDto loginDto);

}