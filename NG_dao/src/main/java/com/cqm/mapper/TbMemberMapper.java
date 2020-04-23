package com.cqm.mapper;

import com.cqm.pojo.TbMember;
import com.cqm.pojo.TbMemberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMemberMapper {
    long countByExample(TbMemberExample example);

    int deleteByExample(TbMemberExample example);

    int deleteByPrimaryKey(Long memberId);

    int insert(TbMember record);

    int insertSelective(TbMember record);

    List<TbMember> selectByExample(TbMemberExample example);

    TbMember selectByPrimaryKey(Long memberId);

    int updateByExampleSelective(@Param("record") TbMember record, @Param("example") TbMemberExample example);

    int updateByExample(@Param("record") TbMember record, @Param("example") TbMemberExample example);

    int updateByPrimaryKeySelective(TbMember record);

    int updateByPrimaryKey(TbMember record);
}