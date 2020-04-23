package com.cqm.dishes.service;

import com.cqm.entity.PageResult;
import com.cqm.pojo.TbMenuClass;

import java.util.List;
import java.util.Map;

public interface MenuClassService {
    /**
     * 根据条件查询所有模板信息
     * @param menuClass
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageResult findPage(TbMenuClass menuClass,int pageNum,int pageSize);


    /**
     * 保存新增的模板对象
     * @param menuClass
     */
    public void add(TbMenuClass menuClass);

    /**
     * 根据id查找对应的模板对象
     * @param id
     * @return
     */
    public TbMenuClass findOne(Long id);

    /**
     * 根据id修改模板
     * @param menuClass
     */
    public void update(TbMenuClass menuClass);

    /**
     * 根据选中的id删除模板
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 查询所有的模板列表，为添加菜名提供数据
     * @return
     */
    public List<TbMenuClass> findAll();

}
