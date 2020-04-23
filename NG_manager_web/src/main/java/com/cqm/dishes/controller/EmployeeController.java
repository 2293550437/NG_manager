package com.cqm.dishes.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cqm.dishes.service.EmployeeService;
import com.cqm.entity.PageResult;
import com.cqm.entity.Result;
import com.cqm.pojo.TbEmployee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Reference(timeout = 2000)
    private EmployeeService employeeService;

    /**
     * 查询审核通过的职员对象
     * @param employee
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findStatusEmpList")
    public PageResult findStatusEmpList(@RequestBody TbEmployee employee, int page, int rows){
        return employeeService.findPage(employee,page, rows);
    }

    /**
     * 根据id查找对应的职员对象
     * @param empId
     * @return
     */
    @RequestMapping("/findOne")
    public TbEmployee findOne(Long empId){
        return employeeService.findOne(empId);
    }


    /**
     * 删除选中的对象
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Long[] ids){
        try {
            employeeService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    /**
     * 审核职员信息
     * @param employee
     * @param status
     * @return
     */
    @RequestMapping("/updateStatus")
    public Result updateStatus(@RequestBody TbEmployee employee,int status){
        //设置审核后的状态
        employee.setStatus(String.valueOf(status));
        try {
            employeeService.updateStatus(employee);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

}
