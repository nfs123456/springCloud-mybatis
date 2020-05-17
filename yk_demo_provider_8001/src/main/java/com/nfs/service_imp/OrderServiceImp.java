package com.nfs.service_imp;

import com.nfs.bean.Order;
import com.nfs.bean.OrderDetails;
import com.nfs.bean.OrderTask;
import com.nfs.mapper.OrderMapper;
import com.nfs.servicec.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Boolean addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    @Override
    public Boolean addOrderDetails(OrderDetails orderDetails) {
        return orderMapper.addOrderDetails(orderDetails);
    }

    @Override
    public Boolean addOrderTask(OrderTask orderTask) {
        return orderMapper.addOrderTask(orderTask);
    }

    @Override
    public List<OrderTask> list() {
        return orderMapper.list();
    }
}
