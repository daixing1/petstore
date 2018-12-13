package com.cb.sp.petstore.facade.impl;

import com.cb.sp.petstore.biz.ProductBiz;
import com.cb.sp.petstore.dto.ProductDto;
import com.cb.sp.petstore.facade.ProductFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/11 17:51
 */
@RestController("productFacade")
@RequestMapping("product")
public class ProductFacadeImpl implements ProductFacade {
    private static Logger LOGGER = LoggerFactory.getLogger(ProductFacadeImpl.class);

    @Autowired
    private ProductBiz productBiz;

    @Override
    @RequestMapping(value = "/getProductList", method = RequestMethod.POST)
    public List<ProductDto> getProductList(ProductDto productDto) {
        List<ProductDto> productDtos = new ArrayList<>();
        LOGGER.info("productDto----------"+productDto+"-------------");
        productDtos = productBiz.getProductList(productDto);
        return productDtos;
    }
}
