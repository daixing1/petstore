package com.cb.sp.petstore.biz.impl;

import com.cb.sp.petstore.biz.CartBiz;
import com.cb.sp.petstore.biz.ProductBiz;
import com.cb.sp.petstore.dao.CartDAO;
import com.cb.sp.petstore.dao.ProductDAO;
import com.cb.sp.petstore.dto.CartDto;
import com.cb.sp.petstore.entity.CartEntity;
import com.cb.sp.petstore.entity.ProductEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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
    @Autowired
    private ProductDAO productDAO;

    @Override
    public CartEntity selectById(Integer id) {
        CartEntity cartEntity = cartDAO.selectById(id);
        return cartEntity;
    }

    @Override
    public int insert(CartEntity record) {
        ProductEntity productEntity = productDAO.selectById(record.getProductId());
        LOGGER.info("ProductName-----------------"+productEntity.getProductName()+"-------------");
        record.setProductName("草拟奶"+productEntity.getProductName()+"1");
        record.setPrice(productEntity.getPrice() * record.getProductNum());
        return cartDAO.insertSelective(record);
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
    public List<CartDto> getCartList(CartEntity cartEntity) {
        List<CartEntity> cartEntities = cartDAO.getCartList(cartEntity);
        List<CartDto> cartDtos = new ArrayList<>();
        for (CartEntity cartEntity1:cartEntities){
            CartDto cartDto = new CartDto();
            BeanUtils.copyProperties(cartEntity1,cartDto);
            ProductEntity productEntity = productDAO.selectById(cartEntity1.getProductId());
            if (null != productEntity.getPic1()) {
                cartDto.setPic1(productEntity.getPic1());
            }
            if (null != productEntity.getPic2()) {
                cartDto.setPic2(productEntity.getPic2());
            }
            if (null != productEntity.getPic3()) {
                cartDto.setPic3(productEntity.getPic3());
            }
            cartDtos.add(cartDto);
        }
        return cartDtos;
    }

    @Override
    public Long sumPrice(List<String> cartIds) {
        Long sum = 0L;
        for(String cartIdstr:cartIds){
            Integer cartId = Integer.parseInt(cartIdstr);
            CartEntity cartEntity = cartDAO.selectById(cartId);
            if(null != cartEntity.getPrice()) {
                sum += cartEntity.getPrice();
                cartDAO.deleteById(cartId);
            }
        }
        return sum;
    }
}

