package com.yumeiqi.dao;

import com.yumeiqi.domain.YmqJobDao;
import com.yumeiqi.domain.YmqJobDaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface YmqJobDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    long countByExample(YmqJobDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByExample(YmqJobDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByPrimaryKey(Integer jid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insert(YmqJobDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insertSelective(YmqJobDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqJobDao> selectByExampleWithBLOBs(YmqJobDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqJobDao> selectByExample(YmqJobDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    YmqJobDao selectByPrimaryKey(Integer jid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") YmqJobDao record, @Param("example") YmqJobDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") YmqJobDao record, @Param("example") YmqJobDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExample(@Param("record") YmqJobDao record, @Param("example") YmqJobDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeySelective(YmqJobDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(YmqJobDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_job
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKey(YmqJobDao record);
}