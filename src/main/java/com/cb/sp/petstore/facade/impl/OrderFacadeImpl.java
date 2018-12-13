package com.cb.sp.petstore.facade.impl;

import com.cb.sp.petstore.biz.OrderBiz;
import com.cb.sp.petstore.dao.OrderDAO;
import com.cb.sp.petstore.entity.OrderEntity;
import com.cb.sp.petstore.facade.OrderFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("getOrderByUserId")
    public List<OrderEntity> getOrderByUserId(@RequestParam("userId") Integer userId) {

        return orderDAO.getOrdersByUser(userId);
    }

    @Override
    @PostMapping("addOrder")
    public Boolean addOrder(@RequestBody OrderEntity orderEntity) {
        return orderDAO.addOrder(orderEntity);
    }

    @Override
    @PostMapping("updateOrder")
    public Boolean updateOrder(@RequestBody OrderEntity orderEntity) {
        return orderDAO.modifyOrder(orderEntity);
    }

    @Override
    @GetMapping("deleteOrder")
    public Boolean deleteOrder(@RequestParam("orderId") Integer orderId) {
        return orderDAO.deleteOrder(orderId);
    }

    @Override
    @GetMapping("getAllOrder")
    public List<OrderEntity> getAllOrder() {
        return orderDAO.getALLOrders();
    }

    @Override
    @GetMapping("getOrderById")
    public OrderEntity getOrderById(@RequestParam("orderId") Integer orderId) {
        return orderDAO.searchOrder(orderId);
    }
}