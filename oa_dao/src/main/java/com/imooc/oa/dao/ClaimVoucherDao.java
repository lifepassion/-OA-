package com.imooc.oa.dao;

import com.imooc.oa.entity.ClaimVoucher;

import java.util.List;

/**
 * @author passionlife
 */
public interface ClaimVoucherDao {
    /**
     * 插入报销单
     * @param claimVoucher
     */
    void insert(ClaimVoucher claimVoucher);

    /**
     * 更改报销单
     * @param claimVoucher
     */
    void update(ClaimVoucher claimVoucher);

    /**
     * 删除报销单
     * @param id
     */
    void delete(int id);

    /**
     * 查询一个报销单
     * @param id
     * @return
     */
    ClaimVoucher select(int id);

    /**
     * 根据创建人查询报销单
     * @param csn
     * @return
     */
    List<ClaimVoucher> selectByCreateSn(String csn);

    /**
     * 根据下一个处理人查询报销单
     * @param ndsn
     * @return
     */
    List<ClaimVoucher> selectByNextDealSn(String ndsn);

}
