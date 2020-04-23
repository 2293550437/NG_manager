package com.cqm.dishes.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cqm.dishes.service.EmployeeService;
import com.cqm.entity.PageResult;
import com.cqm.mapper.TbEmployeeMapper;
import com.cqm.pojo.TbEmployee;
import com.cqm.pojo.TbEmployeeExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private TbEmployeeMapper employeeMapper;

    @Override
    public void add(TbEmployee employee) {
        employeeMapper.insertSelective(employee);
    }

    @Override
    public TbEmployee findOne(Long empId) {
        return employeeMapper.selectByPrimaryKey(empId);
    }

    @Override
    public void update(TbEmployee employee) {
        employeeMapper.updateByPrimaryKey(employee);
    }

    @Override
    public PageResult findPage(TbEmployee employee,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        TbEmployeeExample example = new TbEmployeeExample();
        TbEmployeeExample.Criteria criteria = example.createCriteria();
        if (employee!=null){
            if (employee.getName()!=null&&employee.getName().length()>0){
                criteria.andNameLike("%"+employee.getName()+"%");
            }
            if (employee.getStatus()!=null&&employee.getStatus().length()>0){
                criteria.andStatusEqualTo(employee.getStatus());
            }
            if (employee.getAddress()!=null&&employee.getAddress().length()>0){
                criteria.andAddressLike("%"+employee.getAddress()+"%");
            }
        }

        PageInfo<TbEmployee> pageInfo = new PageInfo<>(employeeMapper.selectByExample(example));
        return new PageResult(pageInfo.getTotal(),pageInfo.getList());
    }


    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            employeeMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void updateStatus(TbEmployee employee) {
        //根据id获取删除对应的对象
        employeeMapper.deleteByPrimaryKey(employee.getEmpId());
        //再保存该对象
        employeeMapper.insert(employee);
    }

    @Override
    public TbEmployee findOne(String username) {
        TbEmployeeExample example = new TbEmployeeExample();
        TbEmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<TbEmployee> employeeList = employeeMapper.selectByExample(example);
        if (employeeList!=null&&employeeList.size()>0){
            return employeeList.get(0);
        }
        return null;
    }
}
