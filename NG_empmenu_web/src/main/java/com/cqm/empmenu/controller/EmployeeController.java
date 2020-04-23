package com.cqm.empmenu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cqm.dishes.service.EmployeeService;
import com.cqm.entity.PageResult;
import com.cqm.entity.Result;
import com.cqm.pojo.TbEmployee;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Reference(timeout = 20000)
    private EmployeeService employeeService;

    /**
     * 添加职工信息
     * @param employee
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody TbEmployee employee){

        try {
            //创建一个加密对象
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String encodePassword = encoder.encode(employee.getPassword());
            //加密后的密码关联到商家对象
            employee.setPassword(encodePassword);
            //设置职工状态，新申请 状态 0 待审核
            employee.setStatus("0");
            //设置职工申请时间
            employee.setCreatetime(new Date());
            employeeService.add(employee);
            return new Result(true,"添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }

    /**
     * 查询所有职工信息
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody TbEmployee employee,int page,int rows){
        return employeeService.findPage(employee,page,rows);
    }

    /**
     * 根据id查找对应的职工对象
     * @param empId
     * @return
     */
    @RequestMapping("/findOne")
    public TbEmployee findOne(Long empId){
        TbEmployee one = employeeService.findOne(empId);
        return one;
    }


    /**
     * 根据id修改职工对象
     * @param employee
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbEmployee employee){
        try {
            employeeService.update(employee);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }


    /**
     * 删除选中的职工对象
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

}
