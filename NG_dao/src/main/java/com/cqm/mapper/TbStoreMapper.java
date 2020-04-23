package com.cqm.mapper;

import com.cqm.pojo.TbStore;
import com.cqm.pojo.TbStoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbStoreMapper {
    long countByExample(TbStoreExample example);

    int deleteByExample(TbStoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbStore record);

    int insertSelective(TbStore record);

    List<TbStore> selectByExample(TbStoreExample example);

    TbStore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbStore record, @Param("example") TbStoreExample example);

    int updateByExample(@Param("record") TbStore record, @Param("example") TbStoreExample example);

    int updateByPrimaryKeySelective(TbStore record);

    int updateByPrimaryKey(TbStore record);
}