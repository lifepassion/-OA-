package com.imooc.oa.biz;


import com.imooc.oa.entity.Employee;

/**
 * @author passionlife
 */
public interface GlobalBiz {

    /**
     * 用户登陆
     * @param sn
     * @param password
     * @return
     */
    Employee login(String sn,String password);

    /**
     * 修改密码
     * @param employee
     */
    void changePassword(Employee employee);

}
