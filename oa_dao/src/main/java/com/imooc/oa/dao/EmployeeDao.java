package com.imooc.oa.dao;

import com.imooc.oa.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author passionlife
 */
public interface EmployeeDao {
    /**
     * 增加一个员工
     * @param employee
     */
    void insert(Employee employee);

    /**
     * 删除一个员工
     * @param sn
     */
    void delete(String sn);

    /**
     * 修改员工信息
     * @param employee
     */
    void update(Employee employee);

    /**
     * 查询一个员工
     * @param sn
     * @return
     */
    Employee select(String sn);

    /**
     * 查询所有员工
     * @return
     */
    List<Employee> selectAll();

    /**
     * 通过部门编号和职位获取员工
     * @param dsn
     * @param post
     * @return
     */
    List<Employee> selectByDepartmentAndPost(@Param("dsn") String dsn,@Param("post") String post);
}
