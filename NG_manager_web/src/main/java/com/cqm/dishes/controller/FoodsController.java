package com.cqm.dishes.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cqm.dishes.service.FoodsService;
import com.cqm.dishes.service.MenuClassService;
import com.cqm.entity.PageResult;
import com.cqm.entity.Result;
import com.cqm.group.Foods;
import com.cqm.pojo.TbFoods;
import com.cqm.pojo.TbMenuClass;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/foods")
public class FoodsController {
    @Reference(timeout = 20000)
    private FoodsService foodsService;

    @Reference
    private MenuClassService menuClassService;




    /**
     * 获取全部的模板数据提供给菜名下拉列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<TbMenuClass> findAll(){
        return menuClassService.findAll();
    }

    /**
     * 通过模板id查询模板对象
     * @param foodId
     * @return
     */
    @RequestMapping("/findOne")
    public Foods findOne(Long foodId){
        return foodsService.findOne(foodId);
    }


    /**
     * 根据条件查询菜名信息
     * @param foods
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody TbFoods foods,int page,int rows){
        //查询全部都是待审核状态的菜名
        foods.setStatus("0");

        return foodsService.findPage(foods,page,rows);
    }


}
