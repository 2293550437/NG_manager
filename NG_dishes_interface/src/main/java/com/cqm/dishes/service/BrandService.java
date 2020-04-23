package com.cqm.dishes.service;

import com.cqm.entity.PageResult;
import com.cqm.pojo.TbBrand;

import java.util.List;
import java.util.Map;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface BrandService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbBrand> findAll();

	/**
	 * 支持分页的获取菜品列表数据
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);

	/**
	 * 新增菜品数据
	 * @param brand
	 */
	public void add(TbBrand brand);

	/**
	 * 根据id查询菜品信息
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);

	/**
	 * 修改菜品品数据
	 * @param brand
	 */
	public void update(TbBrand brand);

	/**
	 * 批量删除菜品信息
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 根据条件查询
	 * @param brand
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(TbBrand brand,int pageNum,int pageSize);

	/**
	 * 获取全部菜品数据提供给下拉菜单使用
	 * @return
	 */
	public List<Map> selectOptionList();

}
