package com.cqm.empmenu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cqm.dishes.service.BrandService;
import com.cqm.dishes.service.FoodsService;
import com.cqm.dishes.service.MenuClassService;
import com.cqm.dishes.service.TasteService;
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
     * @param menuId
     * @return
     */
    @RequestMapping("/findOne")
    public TbMenuClass findOne(Long menuId){
        return menuClassService.findOne(menuId);
    }

    /**
     * 增加
     * @param foods
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Foods foods){
        //获取商家id
        String empName = SecurityContextHolder.getContext().getAuthentication().getName();

        try {
            //设定商品的商家编号
            foods.getFoods().setEmpid(empName);
            foodsService.add(foods);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
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
        //获取商家的编号
        String empId = SecurityContextHolder.getContext().getAuthentication().getName();
        //设置查询条件 根据商家的编号查询
        foods.setEmpid(empId);

        return foodsService.findPage(foods,page,rows);
    }


    /**
     * 根据选中的对象删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Long[] ids){
        try {
            foodsService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

}
