package com.cqm.dishes.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cqm.dishes.service.MenuClassService;
import com.cqm.entity.PageResult;
import com.cqm.entity.Result;
import com.cqm.pojo.TbMenuClass;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/typetemplate")
public class MenuClassController {

    @Reference(timeout = 20000)
    private MenuClassService menuClassService;

    /**
     * 根据条件查询所有模板信息
     * @param menuClass
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody TbMenuClass menuClass, int page, int rows){
        return menuClassService.findPage(menuClass,page,rows);
    }

    /**
     * 保存添加的模板对象
     * @param menuClass
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody TbMenuClass menuClass){
        try {
            menuClassService.add(menuClass);
            return new Result(true,"添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }

    /**
     * 根据id查询模板对象
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public TbMenuClass findOne(Long id){
        return menuClassService.findOne(id);
    }

    /**
     * 保存修改后的模板
     * @param menuClass
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbMenuClass menuClass){
        try {
            menuClassService.update(menuClass);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }


    /**
     * 删除选中的模板
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Long[] ids){
        try {
            menuClassService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }



}
