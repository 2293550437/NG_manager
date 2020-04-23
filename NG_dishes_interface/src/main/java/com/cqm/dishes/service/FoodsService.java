package com.cqm.dishes.service;


import com.cqm.entity.PageResult;
import com.cqm.group.Foods;
import com.cqm.pojo.TbFoods;


public interface FoodsService {
    /**
     * 添加
     * @param foods
     */
    public void add(Foods foods);

    /**
     * 支持分页的指定商家信息信息
     * @param foods
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageResult findPage(TbFoods foods,int pageNum,int pageSize);

    /**
     * 删除选中的菜名对象
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 根据id查询菜名对象
     * @param foodId
     * @return
     */
    public Foods findOne(Long foodId);
}
