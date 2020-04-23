package com.cqm.dishes.service;

import com.cqm.entity.PageResult;
import com.cqm.pojo.TbEmployee;

import java.util.List;

public interface EmployeeService {


    /**
     * 支持分页的查询全部职工信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageResult findPage(TbEmployee employee,int pageNum,int pageSize);


    /**
     * 添加职工信息
     * @param employee
     */
    public void add(TbEmployee employee);

    /**
     * 根据id查找职工对象
     * @param empId
     * @return
     */
    public TbEmployee findOne(Long empId);

    /**
     * 根据id修改职员信息
     * @param employee
     */
    public void update(TbEmployee employee);

    /**
     * 删除选中的职工信息
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 审核职工信息
     * @param employee
     */
    public void updateStatus(TbEmployee employee);

    /**
     * 根据登录账号获取对象
     * @param username
     * @return
     */
    public TbEmployee findOne(String username);

}
