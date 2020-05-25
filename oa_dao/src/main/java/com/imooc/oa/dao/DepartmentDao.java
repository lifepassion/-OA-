package com.imooc.oa.dao;

import com.imooc.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author passionlife
 */

public interface DepartmentDao {
    /**
     *插入一个部门
     * @param department
     */
    void insert(Department department);

    /**
     * 更新部门
     * @param department
     */
    void update(Department department);

    /**
     * 删除一个部门
     * @param sn
     */
    void delete(String sn);

    /**
     * 查询一个部门
     * @param sn
     * @return 部门
     */
    Department select(String sn);

    /**
     * 查询所有部门
     * @return 部门集合
     */
    List<Department> selectAll();
}
