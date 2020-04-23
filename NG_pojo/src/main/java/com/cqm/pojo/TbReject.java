package com.cqm.pojo;

import java.io.Serializable;

public class TbReject implements Serializable {
    private Long id;

    private Long foodsid;

    private String name;

    private Long areaid;

    private Long tableid;

    private String price;

    private Long dinnerid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFoodsid() {
        return foodsid;
    }

    public void setFoodsid(Long foodsid) {
        this.foodsid = foodsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getAreaid() {
        return areaid;
    }

    public void setAreaid(Long areaid) {
        this.areaid = areaid;
    }

    public Long getTableid() {
        return tableid;
    }

    public void setTableid(Long tableid) {
        this.tableid = tableid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Long getDinnerid() {
        return dinnerid;
    }

    public void setDinnerid(Long dinnerid) {
        this.dinnerid = dinnerid;
    }
}