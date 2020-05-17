package com.nfs.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderDetails implements Serializable {
    private String order_id;
    private Date created;
    private Integer course_id;
    private BigDecimal unit_price;
    private Integer count;

    @Override
    public String toString() {
        return "OrderDetails{" +
                "order_id='" + order_id + '\'' +
                ", created=" + created +
                ", course_id=" + course_id +
                ", unit_price=" + unit_price +
                ", count=" + count +
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

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public OrderDetails() {
    }

    public OrderDetails(String order_id, Date created, Integer course_id, BigDecimal unit_price, Integer count) {
        this.order_id = order_id;
        this.created = created;
        this.course_id = course_id;
        this.unit_price = unit_price;
        this.count = count;
    }
}
