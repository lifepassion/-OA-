package com.imooc.oa.dao;

import com.imooc.oa.entity.ClaimVoucher;
import com.imooc.oa.entity.ClaimVoucherItem;

import java.util.List;

/**
 * @author passionlife
 */
public interface ClaimVoucherItemDao {
    /**
     * 插入一个报销单条目
     * @param claimVoucherItem
     */
    void insert(ClaimVoucherItem claimVoucherItem);

    /**
     * 修改一个报销条目
     * @param claimVoucherItem
     */
    void update(ClaimVoucherItem claimVoucherItem);

    /**
     * 删除一个报销单条目
     * @param id
     */
    void delete(int id);

    /**
     * 根据报销单条目查询报销单
     * @param cvid
     * @return
     */
    List<ClaimVoucherItem> selectByClaimVoucher(int cvid);
}
