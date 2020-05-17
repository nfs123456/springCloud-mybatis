package com.nfs.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class JiFen implements Serializable {
    private Integer id;
    private Integer user_id;
    private BigDecimal score;

    @Override
    public String toString() {
        return "JiFen{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", score=" + score +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public JiFen() {
    }

    public JiFen(Integer id, Integer user_id, BigDecimal score) {
        this.id = id;
        this.user_id = user_id;
        this.score = score;
    }
}
