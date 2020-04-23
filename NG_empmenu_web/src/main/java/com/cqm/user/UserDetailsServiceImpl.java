package com.cqm.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cqm.dishes.service.EmployeeService;
import com.cqm.pojo.TbEmployee;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    //重写第三方验证登录接口  UserDetails 认证对象

    @Reference(timeout = 20000)
    private EmployeeService employeeService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //创建角色集合
        List<GrantedAuthority> ruleList = new ArrayList<>();
        //向角色集合添加相关角色
        ruleList.add(new SimpleGrantedAuthority("ROLE_EMP"));
        //根据用户的账号获取商家的信息
        TbEmployee employee = employeeService.findOne(username);
        //判断商家是否存在
        if (employee!=null){
            //判断商家的状态是审核通过 1
            if (employee.getStatus().equals("1")&&employee.getPosition().equals("0")){
                return new User(username,employee.getPassword(),ruleList);
            }
        }
        return null;
    }
}
