package com.cb.sp.petstore.facade.impl;

import com.cb.sp.petstore.biz.OrderBiz;
import com.cb.sp.petstore.dao.OrderDAO;
import com.cb.sp.petstore.entity.OrderEntity;
import com.cb.sp.petstore.facade.OrderFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/12 14:44
 */
@RestController
@RequestMapping("order")
public class OrderFacadeImpl implements OrderFacade {

    @Autowired
    OrderBiz orderBiz;
    @Autowired
    OrderDAO orderDAO;

    @Override
    public List<OrderEntity> getOrderByUserId(Integer userId) {

        return orderDAO.getOrdersByUser(userId);
    }

    @Override
    public Boolean addOrder(OrderEntity orderEntity) {
        return orderDAO.addOrder(orderEntity);
    }

    @Override
    public Boolean updateOrder(OrderEntity orderEntity) {
        return updateOrder(orderEntity);
    }

    @Override
    public Boolean deleteOrder(Integer orderId) {
        return orderDAO.deleteOrder(orderId);
    }

    @Override
    public List<OrderEntity> getAllOrder() {
        return orderDAO.getALLOrders();
    }

    @Override
    public OrderEntity getOrderById(Integer orderId) {
        return orderDAO.searchOrder(orderId);
    }
}