package com.cb.sp.petstore.biz.impl;

import com.cb.sp.petstore.biz.CartBiz;
import com.cb.sp.petstore.dao.CartDAO;
import com.cb.sp.petstore.entity.CartEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/12 16:33
 */
@Component("cartBiz")
public class CartBizImpl implements CartBiz {

    private static Logger LOGGER = LoggerFactory.getLogger(CartBizImpl.class);

    @Autowired
    private CartDAO cartDAO;

    @Override
    public CartEntity selectById(Integer id) {
        CartEntity cartEntity = cartDAO.selectById(id);
        return cartEntity;
    }
}
