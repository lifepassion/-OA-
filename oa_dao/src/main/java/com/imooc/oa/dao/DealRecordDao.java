package com.imooc.oa.dao;

import com.imooc.oa.entity.DealRecord;

import java.util.List;

/**
 * @author passionlife
 */
public interface DealRecordDao {
    /**
     * 插入报销单记录
     * @param dealRecord
     */
    void insert(DealRecord dealRecord);

    /**
     * 根据报销单查询报销单记录
     * @param cvid
     * @return
     */
    List<DealRecord> selectByClaimVoucher(int cvid);
}
