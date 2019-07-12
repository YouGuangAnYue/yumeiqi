package com.yumeiqi.api;

import com.yumeiqi.beans.common.Result;
import com.yumeiqi.beans.vo.YmqDepartmentVo;

/**
 * create by lvyifan
 */
public interface YmqDepartmentService {

    /**
     * 添加部门
     * @param departmentVo
     * @return
     */
    Result addDepartment(YmqDepartmentVo departmentVo) ;

    /**
     * 删除部门
     * @param did
     * @return
     */
    Result deleteDepartmentById(Integer did) ;

    /**
     * 通过部门名称查找部门
     * @param name
     * @return
     */
    Result findDepartmentByName(String name) ;

    /**
     * 通过id查找部门
     * @param did
     * @return
     */
    Result findDepartmentById(Integer did) ;

    /**
     * 修改部门
     * @param departmentVo
     * @return
     */
    Result updateDepartment(YmqDepartmentVo departmentVo) ;

}
