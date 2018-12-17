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

    //添加一条完整记录
    int insert(ProductEntity record);

    //添加指定列的数据
    int insertSelective(ProductEntity record);

    //通过Id(主键)删除一条记录
    int deleteById(Integer productId);

    //按Id(主键)修改指定列的值
    int updateByIdSelective(ProductEntity record);

    //根据条件计算记录条数
    public int countSelective(ProductEntity record);


}
