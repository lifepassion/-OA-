package com.imooc.oa.biz;

import com.imooc.oa.entity.ClaimVoucher;
import com.imooc.oa.entity.ClaimVoucherItem;
import com.imooc.oa.entity.DealRecord;

import java.util.List;

/**
 * @author passionlife
 */
public interface ClaimVoucherBiz {


    /**
     * 保存报销单
     * @param claimVoucher
     * @param claimVoucherItems
     */
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> claimVoucherItems);

    /**
     * 得到报销单
     * @param id
     * @return
     */
    ClaimVoucher get(int id);

    /**
     * 根据报销单获得报销单条目
     * @param cvid
     * @return
     */
    List<ClaimVoucherItem> getItem(int cvid);

    /**
     * 根据报销单获得处理记录
     * @param cvid
     * @return
     */
    List<DealRecord> getRecords(int cvid);

    /**
     * 获取个人报销单
     * @param sn
     * @return
     */
    List<ClaimVoucher> getForSelf(String sn);

    /**
     * 获取待处理报销单
     * @param sn
     * @return
     */
    List<ClaimVoucher> getForDeal(String sn);

    /**
     * 修改报销单的方法
     * @param claimVoucher
     * @param items
     */
    void update(ClaimVoucher claimVoucher,List<ClaimVoucherItem> items);

    /**
     * 提交报销单
     * @param id
     */
    void submit(int id);

    /**
     * 处理报销单
     * @param dealRecord
     */
    void deal(DealRecord dealRecord);

}
