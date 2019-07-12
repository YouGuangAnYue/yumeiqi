package com.yumeiqi.api;

import com.yumeiqi.beans.common.Result;
import com.yumeiqi.beans.vo.YmqJobVo;

/**
 * create by lvyifan
 */
public interface YmqJobService {
    /**
     * 添加职位
     * @param jobVo
     * @return
     */
    Result addJob(YmqJobVo jobVo) ;

    /**
     * 删除职位
     * @param jid
     * @return
     */
    Result deleteJobById(Integer jid) ;

    /**
     * 修改职位
     * @param jobVo
     * @return
     */
    Result updateJob(YmqJobVo jobVo) ;

    /**
     * 查询所有职位
     * @return
     */
    Result findAllJob() ;

    /**
     * 通过名称查找职位
     * @param name
     * @return
     */
    Result findJobByName(String name) ;

    /**
     * 通过id查找职位
     * @param jid
     * @return
     */
    Result findJobById(Integer jid) ;
}
