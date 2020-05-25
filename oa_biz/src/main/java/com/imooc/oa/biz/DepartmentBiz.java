package com.imooc.oa.biz;

import com.imooc.oa.entity.Department;

import java.util.List;

/**
 * @author passionlife
 */
public interface DepartmentBiz {

    /**
     * 增加部门
     * @param department
     */
    void add (Department department);

    /**
     * 编辑一个部门
     * @param department
     */
    void edit(Department department);

    /**
     * 移除一个部门
     * @param sn
     */
    void remove(String sn);

    /**
     * 得到一个部门
     * @param sn
     * @return
     */
    Department get (String sn);

    /**
     * 得到所有部门
     * @return
     */
    List<Department> getAll();
}
