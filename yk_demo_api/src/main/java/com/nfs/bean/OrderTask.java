package com.nfs.bean;

import java.io.Serializable;

public class OrderTask implements Serializable {
    private String task_id;
    private String body;

    @Override
    public String toString() {
        return "OrderTask{" +
                "task_id='" + task_id + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public OrderTask() {
    }

    public OrderTask(String task_id, String body) {
        this.task_id = task_id;
        this.body = body;
    }
}
