package com.cqm.mapper;

import com.cqm.pojo.TbCoupon;
import com.cqm.pojo.TbCouponExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCouponMapper {
    long countByExample(TbCouponExample example);

    int deleteByExample(TbCouponExample example);

    int deleteByPrimaryKey(String couponId);

    int insert(TbCoupon record);

    int insertSelective(TbCoupon record);

    List<TbCoupon> selectByExample(TbCouponExample example);

    TbCoupon selectByPrimaryKey(String couponId);

    int updateByExampleSelective(@Param("record") TbCoupon record, @Param("example") TbCouponExample example);

    int updateByExample(@Param("record") TbCoupon record, @Param("example") TbCouponExample example);

    int updateByPrimaryKeySelective(TbCoupon record);

    int updateByPrimaryKey(TbCoupon record);
}