package com.cb.sp.petstore.facade.impl;

import com.cb.sp.petstore.biz.ProductBiz;
import com.cb.sp.petstore.dto.ProductDto;
import com.cb.sp.petstore.entity.ProductEntity;
import com.cb.sp.petstore.facade.ProductFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public List<ProductDto> getProductList(@RequestBody ProductDto productDto) {
        List<ProductDto> productDtos = new ArrayList<>();
        LOGGER.info("productDto----------"+productDto+"-------------");
        productDtos = productBiz.getProductList(productDto);
        return productDtos;
    }

    @Override
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insert(@RequestBody ProductEntity record) {
        return productBiz.insert(record);
    }

    @Override
    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
    public int insertSelective(@RequestBody ProductEntity record) {
        return productBiz.insertSelective(record);
    }

    @Override
    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public int deleteById(@RequestBody Integer productId) {
        return productBiz.deleteById(productId);
    }

    @Override
    @RequestMapping(value = "/updateByIdSelective", method = RequestMethod.POST)
    public int updateByIdSelective(@RequestBody ProductEntity record) {
        return productBiz.updateByIdSelective(record);
    }

    @Override
    @RequestMapping(value = "/countSelective", method = RequestMethod.POST)
    public int countSelective(@RequestBody ProductEntity record) {
        return productBiz.countSelective(record);
    }

    @Override
    @RequestMapping(value = "/selectById", method = RequestMethod.GET)
    public ProductEntity selectById(@RequestParam(required = true, value = "productId") Integer productId) {
        return productBiz.selectById(productId);
    }
}
