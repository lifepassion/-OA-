package com.imooc.oa.biz;


import com.imooc.oa.entity.Employee;

import java.util.List;

/**
 * @author passionlife
 */
public interface EmployeeBiz {
    /**
     * 增加一个员工
     * @param employee
     */
    void add(Employee employee);

    /**
     * 修改员工信息
     * @param employee
     */
    void edit(Employee employee);

    /**
     * 删除员工
     * @param sn
     */
    void delete(String sn);

    /**
     * 获得一个员工信息
     * @param sn
     * @return
     */
    Employee get(String sn);

    /**
     * 获得所有员工信息
     * @return
     */
    List<Employee> getAll();

}
