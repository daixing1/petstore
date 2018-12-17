package com.cb.sp.petstore.biz.impl;

import com.cb.sp.petstore.biz.CartBiz;
import com.cb.sp.petstore.dao.CartDAO;
import com.cb.sp.petstore.entity.CartEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/12 16:33
import org.springframework.stereotype.Component;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/12 14:47
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

    @Override
    public int insert(CartEntity record) {
        return cartDAO.insert(record);
    }

    @Override
    public int insertSelective(CartEntity record) {
        return cartDAO.insertSelective(record);
    }

    @Override
    public int deleteById(Integer cartId) {
        return cartDAO.deleteById(cartId);
    }

    @Override
    public int updateByIdSelective(CartEntity record) {
        return cartDAO.updateByIdSelective(record);
    }

    @Override
    public int countSelective(CartEntity record) {
        return cartDAO.countSelective(record);
    }

    @Override
    public List<CartEntity> getCartList(CartEntity cartEntity) {
        return cartDAO.getCartList(cartEntity);
    }
}

