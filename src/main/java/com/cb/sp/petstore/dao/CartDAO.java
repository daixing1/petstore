package com.cb.sp.petstore.dao;

import com.cb.sp.petstore.entity.CartEntity;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/12 15:37
 */
public interface CartDAO {

    //添加一条完整记录
    int insert(CartEntity record);

    //添加指定列的数据
    int insertSelective(CartEntity record);

    //通过Id(主键)删除一条记录
    int deleteById(Integer cartId);

    //按Id(主键)修改指定列的值
    int updateByIdSelective(CartEntity record);

    //根据条件计算记录条数
    public int countSelective(CartEntity record);

    //通过Id(主键)查询一条记录
    CartEntity	selectById(Integer	cartId);

}
