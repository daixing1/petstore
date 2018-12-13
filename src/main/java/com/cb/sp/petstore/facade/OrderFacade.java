package com.cb.sp.petstore.facade;

import com.cb.sp.petstore.entity.OrderEntity;

import java.util.List;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/12 14:42
 */
public interface OrderFacade {

    List<OrderEntity> getOrderByUserId(Integer userId);

    Boolean addOrder(OrderEntity orderEntity);

    Boolean updateOrder(OrderEntity orderEntity);

    Boolean deleteOrder(Integer orderId);

    List<OrderEntity> getAllOrder();

    OrderEntity getOrderById(Integer orderId);


}