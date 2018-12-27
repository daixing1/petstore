package com.cb.sp.petstore.facade.impl;


import com.cb.sp.petstore.biz.CartBiz;
import com.cb.sp.petstore.dto.CartDto;
import com.cb.sp.petstore.dto.InsertCartDto;
import com.cb.sp.petstore.entity.CartEntity;
import com.cb.sp.petstore.facade.CartFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/12 16:32
 */
@RestController
@RequestMapping("cart")
public class CartFacadeImpl implements CartFacade {
    private static Logger LOGGER = LoggerFactory.getLogger(CartFacadeImpl.class);

    @Autowired
    private CartBiz cartBiz;

    @Override
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insert(@RequestBody CartEntity record) {
        return cartBiz.insert(record);
    }

    @Override
    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
    public int insertSelective(@RequestBody CartEntity record) {
        return cartBiz.insertSelective(record);
    }

    @Override
    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public void deleteById(@RequestBody InsertCartDto insertCartDto) {
         cartBiz.deleteById(insertCartDto.getCartIds());
    }

    @Override
    @RequestMapping(value = "/updateByIdSelective", method = RequestMethod.POST)
    public int updateByIdSelective(@RequestBody CartEntity record) {
        return cartBiz.updateByIdSelective(record);
    }

    @Override
    @RequestMapping(value = "/countSelective", method = RequestMethod.POST)
    public int countSelective(@RequestBody CartEntity record) {
        return cartBiz.countSelective(record);
    }

    @Override
    @RequestMapping(value = "/selectById", method = RequestMethod.POST)
    public CartEntity selectById(@RequestParam(required = true, value = "productId") Integer cartId) {
        return cartBiz.selectById(cartId);
    }

    @Override
    @RequestMapping(value = "/getCartList", method = RequestMethod.POST)
    public List<CartDto> getCartList(@RequestBody CartEntity cartEntity) {
        return cartBiz.getCartList(cartEntity);
    }

    @Override
    @RequestMapping(value = "/sumPrice", method = RequestMethod.POST)
    public Long sumPrice(@RequestBody InsertCartDto insertCartDto) {
        return cartBiz.sumPrice(insertCartDto.getCartIds());
    }
}



