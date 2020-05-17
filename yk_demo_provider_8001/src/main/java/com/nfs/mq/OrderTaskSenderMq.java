package com.nfs.mq;

import com.nfs.bean.OrderTask;
import com.nfs.config.RabbitMQConfig;
import com.nfs.mapper.OrderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderTaskSenderMq {
    Logger logger = LoggerFactory.getLogger(OrderTaskSenderMq.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private OrderMapper orderMapper;

    @Scheduled(fixedDelay = 5000)
    private void orderTaskSender() {
        List<OrderTask> list = orderMapper.list();
        if (list.size() > 0 && list != null) {
            for (OrderTask orderTask : list) {
                rabbitTemplate.convertAndSend(RabbitMQConfig.EX_LEARNING_ADDCHOOSECOURSE,
                        RabbitMQConfig.XC_LEARNING_ADDCHOOSECOURSE_KEY,orderTask);
                logger.info("开始发送orderTask");
            }
        }
    }
    @RabbitListener(queues = {RabbitMQConfig.XC_LEARNING_FINISHADDCHOOSECOURSE})
    public void receiveFinishJifen(String task_id){
        System.out.println("添加结束后返回来的是："+task_id);
        OrderTask orderTask = orderMapper.selectById(task_id);
        orderMapper.addOrderTaskHis(orderTask);
        orderMapper.deleteById(task_id);

    }
}
