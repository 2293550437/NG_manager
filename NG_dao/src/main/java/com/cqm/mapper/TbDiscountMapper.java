package com.cqm.mapper;

import com.cqm.pojo.TbDiscount;
import com.cqm.pojo.TbDiscountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbDiscountMapper {
    long countByExample(TbDiscountExample example);

    int deleteByExample(TbDiscountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbDiscount record);

    int insertSelective(TbDiscount record);

    List<TbDiscount> selectByExample(TbDiscountExample example);

    TbDiscount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbDiscount record, @Param("example") TbDiscountExample example);

    int updateByExample(@Param("record") TbDiscount record, @Param("example") TbDiscountExample example);

    int updateByPrimaryKeySelective(TbDiscount record);

    int updateByPrimaryKey(TbDiscount record);
}