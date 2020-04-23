package com.cqm.dishes.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cqm.dishes.service.BrandService;
import com.cqm.entity.PageResult;
import com.cqm.entity.Result;
import com.cqm.pojo.TbBrand;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference(timeout = 20000)
    private BrandService brandService;


    @RequestMapping("/findAll")
     public List<TbBrand> findAll(){
         return brandService.findAll();
     }

     @RequestMapping("/findPage")
     public PageResult findPage(int page,int rows){
         return brandService.findPage(page, rows);
     }


     @RequestMapping("/add")
     public Result add(@RequestBody TbBrand brand){
         try {
             brandService.add(brand);
             return new Result(true,"新增菜品成功");
         } catch (Exception e) {
             e.printStackTrace();
             return new Result(false,"新增菜品失败");
         }
     }

    //根据id查询菜品对象
    @RequestMapping("/findOne")
    public TbBrand findOne(Long id){
        return brandService.findOne(id);
    }

    //根据id修改菜品对象
    @RequestMapping("/update")
    public Result update(@RequestBody TbBrand brand){
        try {
            brandService.update(brand);
            return new Result(true,"修改菜品成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改菜品失败");
        }
    }

    //批量删除菜品信息
    @RequestMapping("/delete")
    public Result delete(Long[] ids){
        try {
            brandService.delete(ids);
            return new Result(true,"删除菜品成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除菜品失败");
        }
    }

    @RequestMapping("/search")
    public PageResult search(@RequestBody TbBrand brand,int page,int rows){
        return brandService.findPage(brand,page,rows);
    }


    /**
     * 获取全部菜品数据提供给下拉菜单使用
     * @return
     */
    @RequestMapping("/selectOptionList")
    public List<Map> selectOptionList(){
        return brandService.selectOptionList();
    }



}
