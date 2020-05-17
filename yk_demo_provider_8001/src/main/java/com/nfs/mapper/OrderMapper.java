package com.nfs.mapper;

import com.nfs.bean.Order;
import com.nfs.bean.OrderDetails;
import com.nfs.bean.OrderTask;

import java.util.List;

public interface OrderMapper {
    Boolean addOrder(Order order);

    Boolean addOrderDetails(OrderDetails orderDetails);

    Boolean addOrderTask(OrderTask orderTask);

    List<OrderTask> list();

    OrderTask selectById(String task_id);

    Boolean deleteById(String task_id);

    Boolean addOrderTaskHis(OrderTask orderTask);
}
