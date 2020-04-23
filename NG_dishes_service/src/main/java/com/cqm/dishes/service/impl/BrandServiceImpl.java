package com.cqm.dishes.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.cqm.entity.PageResult;
import com.cqm.mapper.TbBrandMapper;
import com.cqm.pojo.TbBrand;
import com.cqm.pojo.TbBrandExample;
import com.cqm.pojo.TbBrandExample.Criteria;
import com.cqm.dishes.service.BrandService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private TbBrandMapper brandMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbBrand> findAll() {
		return brandMapper.selectByExample(null);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);//相当于limit命令
		//下面要执行的sql查询就会被拦截并外挂上limit
		PageInfo<TbBrand> pageInfo = new PageInfo<>(brandMapper.selectByExample(null));

		return new PageResult(pageInfo.getTotal(),pageInfo.getList());
	}


	@Override
	public void add(TbBrand brand) {
		brandMapper.insert(brand);
	}

	@Override
	public TbBrand findOne(Long id) {
		return brandMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(TbBrand brand) {
		brandMapper.updateByPrimaryKeySelective(brand);
	}

	@Override
	public void delete(Long[] ids) {
		for (Long id : ids) {
			brandMapper.deleteByPrimaryKey(id);
		}
	}


	@Override
	public PageResult findPage(TbBrand brand, int pageNum, int pageSize) {
		TbBrandExample example = new TbBrandExample();
		Criteria criteria = example.createCriteria();

		//判断brand传递的菜品名称是否存在
		if (brand!=null&&brand.getName()!=null&&!brand.getName().equals("")){
			criteria.andNameLike("%"+brand.getName()+"%");
		}
		//判断首字母是否存在
		if (brand!=null&&brand.getFirstChar()!=null&&!brand.getFirstChar().equals("")){
			criteria.andFirstCharEqualTo(brand.getFirstChar());
		}

		//启用分页控件
		PageHelper.startPage(pageNum,pageSize);
		PageInfo<TbBrand> pageInfo = new PageInfo<>(brandMapper.selectByExample(example));

		return new PageResult(pageInfo.getTotal(),pageInfo.getList());
	}

	@Override
	public List<Map> selectOptionList() {
		return brandMapper.selectOptionList();
	}
}
