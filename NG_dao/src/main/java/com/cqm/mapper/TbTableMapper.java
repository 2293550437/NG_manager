package com.cqm.mapper;

import com.cqm.pojo.TbTable;
import com.cqm.pojo.TbTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTableMapper {
    long countByExample(TbTableExample example);

    int deleteByExample(TbTableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTable record);

    int insertSelective(TbTable record);

    List<TbTable> selectByExample(TbTableExample example);

    TbTable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbTable record, @Param("example") TbTableExample example);

    int updateByExample(@Param("record") TbTable record, @Param("example") TbTableExample example);

    int updateByPrimaryKeySelective(TbTable record);

    int updateByPrimaryKey(TbTable record);
}