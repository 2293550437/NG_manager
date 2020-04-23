package com.cqm.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cqm.dishes.service.EmployeeService;
import com.cqm.pojo.TbEmployee;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Reference(timeout = 20000)
    private EmployeeService employeeService;

    @RequestMapping("/name")
    public Map name(){
        //springsecurity获取当前登录用户名
        //SecurityContextHolder上下文获取器 getContext()上下文环境  getAuthentication()当前登录对象
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        //根据id查找用户对象
        TbEmployee employee = employeeService.findOne(username);
        Map map = new HashMap();
        map.put("loginName",employee.getName());
        return map;
    }

}
