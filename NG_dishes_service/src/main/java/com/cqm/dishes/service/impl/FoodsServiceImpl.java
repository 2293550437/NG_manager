package com.cqm.dishes.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cqm.dishes.service.FoodsService;
import com.cqm.entity.PageResult;
import com.cqm.group.Foods;
import com.cqm.mapper.TbFoodsCatMapper;
import com.cqm.mapper.TbFoodsMapper;
import com.cqm.pojo.TbFoods;
import com.cqm.pojo.TbFoodsCat;
import com.cqm.pojo.TbFoodsCatExample;
import com.cqm.pojo.TbFoodsExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Service
public class FoodsServiceImpl implements FoodsService {

    @Autowired
    private TbFoodsMapper foodsMapper;

    @Autowired
    private TbFoodsCatMapper foodsCatMapper;

    @Override
    public void add(Foods foods) {
        //设置菜名基本信息对象的状态
        foods.getFoods().setStatus("0");
        //设置添加时间
        foods.getFoods().setScreattime(new Date());
        foodsMapper.insert(foods.getFoods());
        //插入菜名的扩展信息
        //设置菜名的扩展信息关联菜名基本信息
        foods.getFoodsCat().setFoodsid(foods.getFoods().getFoodId());
        //插入菜名扩展信息
        foodsCatMapper.insert(foods.getFoodsCat());

    }

    @Override
    public PageResult findPage(TbFoods foods, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        TbFoodsExample example = new TbFoodsExample();
        TbFoodsExample.Criteria criteria = example.createCriteria();

        if (foods!=null){
            if (foods.getEmpid()!=null&&foods.getEmpid().length()>0){
                criteria.andEmpidEqualTo(foods.getEmpid());
            }
            if (foods.getName()!=null&&foods.getName().length()>0){
                criteria.andNameLike("%"+foods.getName()+"%");
            }
            if (foods.getStatus()!=null&&foods.getStatus().length()>0){
                criteria.andStatusEqualTo(foods.getStatus());
            }

        }

        PageInfo<TbFoods> pageInfo = new PageInfo<>(foodsMapper.selectByExample(example));

        return new PageResult(pageInfo.getTotal(),pageInfo.getList());
    }

    @Override
    public void delete(Long[] ids) {

        for (Long id : ids) {
            TbFoodsCatExample example = new TbFoodsCatExample();
            TbFoodsCatExample.Criteria criteria = example.createCriteria();
            criteria.andFoodsidEqualTo(id);
            foodsCatMapper.deleteByExample(example);
            foodsMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public Foods findOne(Long foodId) {
        Foods foods = new Foods();
        TbFoods food = foodsMapper.selectByPrimaryKey(foodId);
        foods.setFoods(food);
        TbFoodsCatExample example = new TbFoodsCatExample();
        TbFoodsCatExample.Criteria criteria = example.createCriteria();
        criteria.andFoodsidEqualTo(foodId);
        List<TbFoodsCat> foodsCatsList = foodsCatMapper.selectByExample(example);
        if (foodsCatsList!=null&&foodsCatsList.size()>0){
            foods.setFoodsCat(foodsCatsList.get(0));
        }
        return foods;
    }
}
