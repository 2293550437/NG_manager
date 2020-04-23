package com.cqm.mapper;

import com.cqm.pojo.TbDinnerMenu;
import com.cqm.pojo.TbDinnerMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbDinnerMenuMapper {
    long countByExample(TbDinnerMenuExample example);

    int deleteByExample(TbDinnerMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbDinnerMenu record);

    int insertSelective(TbDinnerMenu record);

    List<TbDinnerMenu> selectByExample(TbDinnerMenuExample example);

    TbDinnerMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbDinnerMenu record, @Param("example") TbDinnerMenuExample example);

    int updateByExample(@Param("record") TbDinnerMenu record, @Param("example") TbDinnerMenuExample example);

    int updateByPrimaryKeySelective(TbDinnerMenu record);

    int updateByPrimaryKey(TbDinnerMenu record);
}