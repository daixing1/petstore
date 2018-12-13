package com.cb.sp.petstore.dao;


import com.cb.sp.petstore.entity.OrderEntity;

import java.util.List;

public interface OrderDAO {

    Boolean addOrder(OrderEntity orderEntity);

	OrderEntity searchOrder(Integer orderID);


	List<OrderEntity> getALLOrders();
	

	List<OrderEntity> getOrdersByUser(Integer userID);


	Boolean modifyOrder(OrderEntity orderEntity);


	Boolean deleteOrder(Integer orderID);

}
