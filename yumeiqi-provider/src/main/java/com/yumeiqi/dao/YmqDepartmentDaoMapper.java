package com.yumeiqi.dao;

import com.yumeiqi.domain.YmqDepartmentDao;
import com.yumeiqi.domain.YmqDepartmentDaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface YmqDepartmentDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    long countByExample(YmqDepartmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByExample(YmqDepartmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insert(YmqDepartmentDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insertSelective(YmqDepartmentDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqDepartmentDao> selectByExampleWithBLOBs(YmqDepartmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqDepartmentDao> selectByExample(YmqDepartmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    YmqDepartmentDao selectByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") YmqDepartmentDao record, @Param("example") YmqDepartmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") YmqDepartmentDao record, @Param("example") YmqDepartmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExample(@Param("record") YmqDepartmentDao record, @Param("example") YmqDepartmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeySelective(YmqDepartmentDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(YmqDepartmentDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_department
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKey(YmqDepartmentDao record);
}