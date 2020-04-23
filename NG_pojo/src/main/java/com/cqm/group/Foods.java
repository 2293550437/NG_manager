package com.cqm.group;

import com.cqm.pojo.TbFoods;
import com.cqm.pojo.TbFoodsCat;

import java.io.Serializable;

public class Foods implements Serializable {

    private TbFoods foods;//菜名基本信息
    private TbFoodsCat foodsCat;//菜名扩展信息

    public TbFoods getFoods() {
        return foods;
    }

    public void setFoods(TbFoods foods) {
        this.foods = foods;
    }

    public TbFoodsCat getFoodsCat() {
        return foodsCat;
    }

    public void setFoodsCat(TbFoodsCat foodsCat) {
        this.foodsCat = foodsCat;
    }
}
