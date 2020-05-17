package com.nfs.mq;

import com.alibaba.fastjson.JSONObject;
import com.nfs.bean.JiFen;
import com.nfs.bean.JiFenTaskHis;
import com.nfs.bean.OrderTask;
import com.nfs.config.RabbitMQConfig;
import com.nfs.mapper.JiFenTaskHisMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderTaskReceiveMq {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private JiFenTaskHisMapper jiFenTaskHisMapper;

    Logger logger = LoggerFactory.getLogger(OrderTaskReceiveMq.class);

    @RabbitListener(queues = {RabbitMQConfig.XC_LEARNING_ADDCHOOSECOURSE})
    public void receiveOrderTask(OrderTask orderTask) {
        if (orderTask != null) {
            String task_id = orderTask.getTask_id();
            JiFenTaskHis jiFenTaskHis = jiFenTaskHisMapper.selectById(task_id);
            if (jiFenTaskHis == null) {
                String body = orderTask.getBody();
                JiFen jiFen = JSONObject.parseObject(body, JiFen.class);
                jiFenTaskHisMapper.updateScore(jiFen);
                jiFenTaskHisMapper.addjiFenHisTask(orderTask);
            }else{
                rabbitTemplate.convertAndSend(RabbitMQConfig.EX_LEARNING_ADDCHOOSECOURSE,
                        RabbitMQConfig.XC_LEARNING_FINISHADDCHOOSECOURSE_KEY,task_id);
            }
        }else{
            System.out.println("还没有开始发送orderTask");
        }
    }
}
