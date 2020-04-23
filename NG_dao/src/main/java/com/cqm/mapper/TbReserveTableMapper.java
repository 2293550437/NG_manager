package com.cqm.mapper;

import com.cqm.pojo.TbReserveTable;
import com.cqm.pojo.TbReserveTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbReserveTableMapper {
    long countByExample(TbReserveTableExample example);

    int deleteByExample(TbReserveTableExample example);

    int deleteByPrimaryKey(Long reserveId);

    int insert(TbReserveTable record);

    int insertSelective(TbReserveTable record);

    List<TbReserveTable> selectByExample(TbReserveTableExample example);

    TbReserveTable selectByPrimaryKey(Long reserveId);

    int updateByExampleSelective(@Param("record") TbReserveTable record, @Param("example") TbReserveTableExample example);

    int updateByExample(@Param("record") TbReserveTable record, @Param("example") TbReserveTableExample example);

    int updateByPrimaryKeySelective(TbReserveTable record);

    int updateByPrimaryKey(TbReserveTable record);
}