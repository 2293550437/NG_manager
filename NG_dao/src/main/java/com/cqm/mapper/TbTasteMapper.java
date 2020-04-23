package com.cqm.mapper;

import com.cqm.pojo.TbTaste;
import com.cqm.pojo.TbTasteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbTasteMapper {
    long countByExample(TbTasteExample example);

    int deleteByExample(TbTasteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTaste record);

    int insertSelective(TbTaste record);

    List<TbTaste> selectByExample(TbTasteExample example);

    TbTaste selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbTaste record, @Param("example") TbTasteExample example);

    int updateByExample(@Param("record") TbTaste record, @Param("example") TbTasteExample example);

    int updateByPrimaryKeySelective(TbTaste record);

    int updateByPrimaryKey(TbTaste record);

    List<Map> selectOptionList();
}