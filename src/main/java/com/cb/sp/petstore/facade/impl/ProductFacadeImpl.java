package com.cb.sp.petstore.facade.impl;

import com.cb.sp.petstore.biz.ProductBiz;
import com.cb.sp.petstore.dto.ProductDto;
import com.cb.sp.petstore.facade.ProductFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/11 17:51
 */
public class ProductFacadeImpl implements ProductFacade {
    private static Logger LOGGER = LoggerFactory.getLogger(ProductFacadeImpl.class);

    @Autowired
    private ProductBiz productBiz;

    @Override
    public List<ProductDto> getProductList(ProductDto productDto) {
        List<ProductDto> productDtos = new ArrayList<>();
        LOGGER.info("productDto----------"+productDto+"-------------");
        //productDtos = productBiz.getProductList(productDto);
        return productDtos;
    }
}
