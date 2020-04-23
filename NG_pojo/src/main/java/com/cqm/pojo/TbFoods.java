package com.cqm.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbFoods implements Serializable {
    private Long foodId;

    private String name;

    private String status;

    private Long meclassid;

    private Long tasteid;

    private String price;

    private String subtitle;

    private Long brandid;

    private Date screattime;

    private String website;

    private String empid;

    private static final long serialVersionUID = 1L;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getMeclassid() {
        return meclassid;
    }

    public void setMeclassid(Long meclassid) {
        this.meclassid = meclassid;
    }

    public Long getTasteid() {
        return tasteid;
    }

    public void setTasteid(Long tasteid) {
        this.tasteid = tasteid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public Long getBrandid() {
        return brandid;
    }

    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    public Date getScreattime() {
        return screattime;
    }

    public void setScreattime(Date screattime) {
        this.screattime = screattime;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid == null ? null : empid.trim();
    }
}