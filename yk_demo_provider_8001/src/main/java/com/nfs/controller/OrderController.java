package com.nfs.controller;

import com.alibaba.fastjson.JSON;
import com.nfs.bean.*;
import com.nfs.feign_service.CourseStockService;
import com.nfs.mapper.OrderMapper;
import com.nfs.servicec.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/order")
@Api(tags = "对订单的操作")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private CourseStockService courseStockService;

    @ApiOperation(value = "添加订单")
    @PostMapping("/addOrder")
    public Boolean addOrder(BigDecimal sum_price,
                            @RequestBody List<Course> courses) {
        for (Course cours : courses) {
            if (cours.getCount() > cours.getStock_num()) {
                return false;
            } else {
//                添加订单
                Order order = new Order();
                order.setSum_price(sum_price);
                order.setCreated(new Date());
                order.setUser_id(2);
                order.setOrder_id(UUID.randomUUID().toString().replaceAll("_", ""));
                orderService.addOrder(order);
                String order_id = order.getOrder_id();
//                添加订单的中间表
                OrderDetails orderDetails = new OrderDetails();
                orderDetails.setCreated(new Date());
                orderDetails.setOrder_id(order_id);
                orderDetails.setCount(cours.getCount());
                orderDetails.setCourse_id(cours.getId());
                orderDetails.setUnit_price(new BigDecimal(cours.getCount()).multiply(cours.getUnit_price()));
                orderService.addOrderDetails(orderDetails);
//              根据添加的个数来修改库存
                Integer stock_num = cours.getStock_num();
                Integer count = cours.getCount();
                cours.setStock_num(stock_num - count);
                courseStockService.updateStock(cours);
            }
        }
        //                将积分添加到order_stack当中
        OrderTask orderTask = new OrderTask();
        orderTask.setTask_id(UUID.randomUUID().toString().replaceAll("_", ""));
        /*创建积分*/
        JiFen jiFen = new JiFen();
        jiFen.setUser_id(2);
        jiFen.setScore(sum_price);
        String jifenString = JSON.toJSONString(jiFen);
        orderTask.setBody(jifenString);
        orderService.addOrderTask(orderTask);
        return true;
    }
}
