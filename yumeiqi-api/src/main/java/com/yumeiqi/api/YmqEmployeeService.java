package com.yumeiqi.api;

import com.yumeiqi.beans.common.Result;
import com.yumeiqi.beans.vo.YmqEmployeeVo;

/**
 * create by lvyifan
 */
public interface YmqEmployeeService {
    /**
     * 添加员工
     * @param employeeVo
     * @return
     */
    Result addEmployee(YmqEmployeeVo employeeVo);

    /**
     * 查找员工
     * @param employeeVo
     * @return
     */
    Result findEmployee(YmqEmployeeVo employeeVo);

    /**
     * 删除员工
     * @param eid
     * @return
     */
    Result deleteEmployeeById(Integer eid) ;

    /**
     * 修改员工信息
     * @param employeeVo
     * @return
     */
    Result updateEmployee(YmqEmployeeVo employeeVo) ;

}
