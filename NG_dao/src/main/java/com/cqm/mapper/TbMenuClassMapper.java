package com.cqm.mapper;

import com.cqm.pojo.TbMenuClass;
import com.cqm.pojo.TbMenuClassExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbMenuClassMapper {
    long countByExample(TbMenuClassExample example);

    int deleteByExample(TbMenuClassExample example);

    int deleteByPrimaryKey(Long meclassId);

    int insert(TbMenuClass record);

    int insertSelective(TbMenuClass record);

    List<TbMenuClass> selectByExample(TbMenuClassExample example);

    TbMenuClass selectByPrimaryKey(Long meclassId);

    int updateByExampleSelective(@Param("record") TbMenuClass record, @Param("example") TbMenuClassExample example);

    int updateByExample(@Param("record") TbMenuClass record, @Param("example") TbMenuClassExample example);

    int updateByPrimaryKeySelective(TbMenuClass record);

    int updateByPrimaryKey(TbMenuClass record);

}