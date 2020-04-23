package com.cqm.mapper;

import com.cqm.pojo.TbFoods;
import com.cqm.pojo.TbFoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbFoodsMapper {
    long countByExample(TbFoodsExample example);

    int deleteByExample(TbFoodsExample example);

    int deleteByPrimaryKey(Long foodId);

    int insert(TbFoods record);

    int insertSelective(TbFoods record);

    List<TbFoods> selectByExample(TbFoodsExample example);

    TbFoods selectByPrimaryKey(Long foodId);

    int updateByExampleSelective(@Param("record") TbFoods record, @Param("example") TbFoodsExample example);

    int updateByExample(@Param("record") TbFoods record, @Param("example") TbFoodsExample example);

    int updateByPrimaryKeySelective(TbFoods record);

    int updateByPrimaryKey(TbFoods record);
}