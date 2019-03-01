package com.kobe.mybatis.mapper;

import com.kobe.mybatis.model.RechargeWithdrawalRecord;
import com.kobe.mybatis.model.RechargeWithdrawalRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * mapper接口
 * ht
 */
public interface RechargeWithdrawalRecordMapper {
    long countByExample(RechargeWithdrawalRecordExample example);

    int deleteByExample(RechargeWithdrawalRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RechargeWithdrawalRecord record);

    int insertSelective(RechargeWithdrawalRecord record);

    List<RechargeWithdrawalRecord> selectByExample(RechargeWithdrawalRecordExample example);

    RechargeWithdrawalRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RechargeWithdrawalRecord record, @Param("example") RechargeWithdrawalRecordExample example);

    int updateByExample(@Param("record") RechargeWithdrawalRecord record, @Param("example") RechargeWithdrawalRecordExample example);

    int updateByPrimaryKeySelective(RechargeWithdrawalRecord record);

    int updateByPrimaryKey(RechargeWithdrawalRecord record);
}