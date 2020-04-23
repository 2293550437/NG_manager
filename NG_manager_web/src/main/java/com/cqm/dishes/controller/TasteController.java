package com.cqm.dishes.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cqm.dishes.service.TasteService;
import com.cqm.entity.Result;
import com.cqm.pojo.TbTaste;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/taste")
public class TasteController {

    @Reference(timeout = 20000)
    private TasteService tasteService;

    /**
     * 查找全部的口味
     * @return
     */
    @RequestMapping("/findAll")
    public List<TbTaste> findAll(){
        return tasteService.findAll();
    }

    /**
     * 新增口味对象
     * @param taste
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody TbTaste taste){
        try {
            tasteService.add(taste);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    /**
     * 根据id查找指定口味对象
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public TbTaste findOne(Long id){
        return tasteService.findOne(id);
    }

    /**
     * 根据id修改口味对象
     * @param taste
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbTaste taste){
        try {
            tasteService.update(taste);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    /**
     * 根据条件查询口味对象
     * @param taste
     * @return
     */
    @RequestMapping("/findTaste")
    public List<TbTaste> findTaste(@RequestBody TbTaste taste){
        return tasteService.findTaste(taste);
    }

    @RequestMapping("/delete")
    public Result delete(Long[] ids){
        try {
            tasteService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }


    /**
     * 获取所有口味数据供下拉列表使用
     * @return
     */
    @RequestMapping("/selectOptionList")
    public List<Map> selectOptionList(){
        return tasteService.selectOptionList();
    }

}
