package com.cqm.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbCoupon implements Serializable {
    private String couponId;

    private String name;

    private Long couponMoney;

    private String status;

    private Date starttime;

    private Date endtime;

    private String discription;

    private static final long serialVersionUID = 1L;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(Long couponMoney) {
        this.couponMoney = couponMoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }
}