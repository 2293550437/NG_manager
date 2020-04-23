package com.cqm.mapper;

import com.cqm.pojo.TbPaytype;
import com.cqm.pojo.TbPaytypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPaytypeMapper {
    long countByExample(TbPaytypeExample example);

    int deleteByExample(TbPaytypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbPaytype record);

    int insertSelective(TbPaytype record);

    List<TbPaytype> selectByExample(TbPaytypeExample example);

    TbPaytype selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbPaytype record, @Param("example") TbPaytypeExample example);

    int updateByExample(@Param("record") TbPaytype record, @Param("example") TbPaytypeExample example);

    int updateByPrimaryKeySelective(TbPaytype record);

    int updateByPrimaryKey(TbPaytype record);
}