package com.cqm.dishes.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
/*import com.cqm.dishes.service.MenuClassService;*/
import com.cqm.dishes.service.MenuClassService;
import com.cqm.entity.PageResult;
import com.cqm.mapper.TbMenuClassMapper;
import com.cqm.pojo.TbMenuClass;
import com.cqm.pojo.TbMenuClassExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class MenuClassServiceImpl  implements MenuClassService {

    @Autowired
    private TbMenuClassMapper menuClassMapper;

    @Override
    public PageResult findPage(TbMenuClass menuClass, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        TbMenuClassExample example = new TbMenuClassExample();
        TbMenuClassExample.Criteria criteria = example.createCriteria();
        if (menuClass!=null){
            if (menuClass.getName()!=null&&menuClass.getName().length()>0){
                criteria.andNameLike("%"+menuClass.getName()+"%");
            }
        }

        PageInfo<TbMenuClass> pageInfo = new PageInfo<>(menuClassMapper.selectByExample(example));
        return new PageResult(pageInfo.getTotal(),pageInfo.getList());
    }

    @Override
    public void add(TbMenuClass menuClass) {
        menuClassMapper.insert(menuClass);
    }

    @Override
    public TbMenuClass findOne(Long id) {
        return menuClassMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(TbMenuClass menuClass) {
        //根据id删除之前的模板
        menuClassMapper.deleteByPrimaryKey(menuClass.getMeclassId());
        //重新添加当前对象
        menuClassMapper.insert(menuClass);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            menuClassMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<TbMenuClass> findAll() {
        return menuClassMapper.selectByExample(null);
    }
}
