package com.cb.sp.petstore.facade;

import com.cb.sp.petstore.dto.CartDto;
import com.cb.sp.petstore.dto.InsertCartDto;
import com.cb.sp.petstore.entity.CartEntity;

import java.util.List;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/12 16:32
 */
public interface CartFacade {

    //添加一条完整记录
    int insert(CartEntity record);

    //添加指定列的数据
    int insertSelective(CartEntity record);

    //通过Id(主键)删除一条记录
    void deleteById(InsertCartDto insertCartDto);

    //按Id(主键)修改指定列的值
    int updateByIdSelective(CartEntity record);

    //根据条件计算记录条数
    public int countSelective(CartEntity record);

    //通过Id(主键)查询一条记录
    CartEntity	selectById(Integer	cartId);

    //根据条件获取记录
    List<CartDto> getCartList(CartEntity cartEntity);

    Long sumPrice(InsertCartDto insertCartDto);

}

