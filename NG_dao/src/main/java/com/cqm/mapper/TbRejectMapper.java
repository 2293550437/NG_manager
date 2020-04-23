package com.cqm.mapper;

import com.cqm.pojo.TbReject;
import com.cqm.pojo.TbRejectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRejectMapper {
    long countByExample(TbRejectExample example);

    int deleteByExample(TbRejectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbReject record);

    int insertSelective(TbReject record);

    List<TbReject> selectByExample(TbRejectExample example);

    TbReject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbReject record, @Param("example") TbRejectExample example);

    int updateByExample(@Param("record") TbReject record, @Param("example") TbRejectExample example);

    int updateByPrimaryKeySelective(TbReject record);

    int updateByPrimaryKey(TbReject record);
}