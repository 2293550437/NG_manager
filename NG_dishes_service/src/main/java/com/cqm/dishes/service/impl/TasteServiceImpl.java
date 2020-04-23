package com.cqm.dishes.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cqm.dishes.service.TasteService;
import com.cqm.mapper.TbTasteMapper;
import com.cqm.pojo.TbTaste;
import com.cqm.pojo.TbTasteExample;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Map;

@Service
public class TasteServiceImpl implements TasteService {

    @Autowired
    private TbTasteMapper tasteMapper;

    @Override
    public List<TbTaste> findAll() {
        return tasteMapper.selectByExample(null);
    }

    @Override
    public void add(TbTaste taste) {
        tasteMapper.insert(taste);
    }

    @Override
    public TbTaste findOne(Long id) {
        return tasteMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(TbTaste taste) {
        tasteMapper.updateByPrimaryKeySelective(taste);
    }

    @Override
    public List<TbTaste> findTaste(TbTaste taste) {
        TbTasteExample example = new TbTasteExample();
        TbTasteExample.Criteria criteria = example.createCriteria();
        if (taste!=null&&taste.getName()!=null&&!taste.getName().equals("")){
            criteria.andNameLike("%"+taste.getName()+"%");
        }
        return tasteMapper.selectByExample(example);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            tasteMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<Map> selectOptionList() {
        return tasteMapper.selectOptionList();
    }
}
