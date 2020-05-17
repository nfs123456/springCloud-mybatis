package com.nfs.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Course implements Serializable {
    private Integer id;
    private String course_name;
    private Date created;
    private BigDecimal unit_price;
    private Integer stock_num;
    private Integer count;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course_name='" + course_name + '\'' +
                ", created=" + created +
                ", unit_price=" + unit_price +
                ", stock_num=" + stock_num +
                ", count=" + count +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }

    public Integer getStock_num() {
        return stock_num;
    }

    public void setStock_num(Integer stock_num) {
        this.stock_num = stock_num;
    }

//    当没有count传进来的时候 返回一个0 有conut从前台传递的时候 传递的是从前台传送过来的
    public Integer getCount() {
        return count==null?0:count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Course() {
    }

    public Course(Integer id, String course_name, Date created, BigDecimal unit_price, Integer stock_num, Integer count) {
        this.id = id;
        this.course_name = course_name;
        this.created = created;
        this.unit_price = unit_price;
        this.stock_num = stock_num;
        this.count = count;
    }
}
