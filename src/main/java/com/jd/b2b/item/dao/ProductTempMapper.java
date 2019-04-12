package com.jd.b2b.item.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTempMapper {
    long countByExample(ProductTempExample example);

    int deleteByExample(ProductTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductTempWithBLOBs record);

    int insertSelective(ProductTempWithBLOBs record);

    List<ProductTempWithBLOBs> selectByExampleWithBLOBs(ProductTempExample example);

    List<ProductTemp> selectByExample(ProductTempExample example);

    ProductTempWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductTempWithBLOBs record, @Param("example") ProductTempExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductTempWithBLOBs record, @Param("example") ProductTempExample example);

    int updateByExample(@Param("record") ProductTemp record, @Param("example") ProductTempExample example);

    int updateByPrimaryKeySelective(ProductTempWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductTempWithBLOBs record);

    int updateByPrimaryKey(ProductTemp record);
}