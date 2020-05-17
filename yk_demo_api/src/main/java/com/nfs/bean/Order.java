package com.nfs.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    private String order_id;
    private Date created;
    private BigDecimal sum_price;
    private Integer user_id;

    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                ", created=" + created +
                ", sum_price=" + sum_price +
                ", user_id=" + user_id +
                '}';
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BigDecimal getSum_price() {
        return sum_price;
    }

    public void setSum_price(BigDecimal sum_price) {
        this.sum_price = sum_price;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Order() {
    }

    public Order(String order_id, Date created, BigDecimal sum_price, Integer user_id) {
        this.order_id = order_id;
        this.created = created;
        this.sum_price = sum_price;
        this.user_id = user_id;
    }
}
