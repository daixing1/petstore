package com.cb.sp.petstore.facade;

import com.cb.sp.petstore.dto.ProductDto;

import java.util.List;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/11 17:50
 */
public interface ProductFacade {

    List<ProductDto> getProductList(ProductDto productDto);

}
