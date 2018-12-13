package com.cb.sp.petstore.biz;

import com.cb.sp.petstore.entity.CartEntity;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/12 16:32
 */
public interface CartBiz {

    CartEntity selectById(Integer id);

}

