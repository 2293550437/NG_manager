package com.cqm.dishes.service;

import com.cqm.pojo.TbTaste;

import java.util.List;
import java.util.Map;

public interface TasteService {

    /**
     * 返回全部口味数据
     * @return
     */
    public List<TbTaste> findAll();


    /**
     * 增加口味数据
     * @param taste
     */
    public void add(TbTaste taste);

    /**
     * 根据id查询口味信息
     * @param id
     * @return
     */
    public TbTaste findOne(Long id);

    /**
     * 根据id修改口味信息
     * @param taste
     */
    public void update(TbTaste taste);

    /**
     * 根据条件查询口味
     * @param taste
     * @return
     */
    public List<TbTaste> findTaste(TbTaste taste);

    /**
     * 删除制定口味对象
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 获取所有口味数据供下拉列表使用
     * @return
     */
    public List<Map> selectOptionList();
}
