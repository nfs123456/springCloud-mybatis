package com.nfs.servicec;

import com.nfs.bean.Order;
import com.nfs.bean.OrderDetails;
import com.nfs.bean.OrderTask;

import java.util.List;

public interface OrderService {
   Boolean addOrder(Order order);
   Boolean addOrderDetails(OrderDetails orderDetails);
   Boolean addOrderTask(OrderTask orderTask);
   List<OrderTask> list();
}
