package com.cqm.pojo;

import java.io.Serializable;

public class TbFoodsCat implements Serializable {
    private Long id;

    private Long foodsid;

    private String introduction;

    private String foodsImg;

    private String packagestyle;

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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getFoodsImg() {
        return foodsImg;
    }

    public void setFoodsImg(String foodsImg) {
        this.foodsImg = foodsImg == null ? null : foodsImg.trim();
    }

    public String getPackagestyle() {
        return packagestyle;
    }

    public void setPackagestyle(String packagestyle) {
        this.packagestyle = packagestyle == null ? null : packagestyle.trim();
    }
}