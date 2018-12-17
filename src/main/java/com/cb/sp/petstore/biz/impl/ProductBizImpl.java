package com.cb.sp.petstore.biz.impl;

import com.cb.sp.petstore.biz.ProductBiz;
import com.cb.sp.petstore.dao.ProductDAO;
import com.cb.sp.petstore.dto.ProductDto;
import com.cb.sp.petstore.entity.ProductEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/11 17:50
 */
@Component("productBiz")
public class ProductBizImpl implements ProductBiz {

    private static Logger LOGGER = LoggerFactory.getLogger(ProductBizImpl.class);

    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<ProductDto> getProductList(ProductDto productDto) {
        List<ProductDto> productDtos = productDAO.getProductList(productDto);
        return productDtos;
    }

    @Override
    public ProductEntity selectById(Integer id) {
        ProductEntity productEntity = productDAO.selectById(id);
        return productEntity;
    }

    @Override
    public int insert(ProductEntity record) {
        return productDAO.insert(record);
    }

    @Override
    public int insertSelective(ProductEntity record) {
        return productDAO.insertSelective(record);
    }

    @Override
    public int deleteById(Integer productId) {
        return productDAO.deleteById(productId);
    }

    @Override
    public int updateByIdSelective(ProductEntity record) {
        return productDAO.updateByIdSelective(record);
    }

    @Override
    public int countSelective(ProductEntity record) {
        return productDAO.countSelective(record);
    }
}
