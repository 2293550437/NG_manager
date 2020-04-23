package com.cqm.mapper;

import com.cqm.pojo.TbFoodsCat;
import com.cqm.pojo.TbFoodsCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbFoodsCatMapper {
    long countByExample(TbFoodsCatExample example);

    int deleteByExample(TbFoodsCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbFoodsCat record);

    int insertSelective(TbFoodsCat record);

    List<TbFoodsCat> selectByExample(TbFoodsCatExample example);

    TbFoodsCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbFoodsCat record, @Param("example") TbFoodsCatExample example);

    int updateByExample(@Param("record") TbFoodsCat record, @Param("example") TbFoodsCatExample example);

    int updateByPrimaryKeySelective(TbFoodsCat record);

    int updateByPrimaryKey(TbFoodsCat record);
}