package com.cb.sp.petstore.biz;

import com.cb.sp.petstore.dto.ProductDto;
import com.cb.sp.petstore.entity.ProductEntity;

import java.util.List;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/11 17:49
 */
public interface ProductBiz {

    List<ProductDto> getProductList(ProductDto productDto);

    ProductEntity selectById(Integer id);



}
