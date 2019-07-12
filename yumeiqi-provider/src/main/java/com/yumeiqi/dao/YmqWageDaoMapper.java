package com.yumeiqi.dao;

import com.yumeiqi.domain.YmqWageDao;
import com.yumeiqi.domain.YmqWageDaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YmqWageDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    long countByExample(YmqWageDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByExample(YmqWageDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByPrimaryKey(Integer wid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insert(YmqWageDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insertSelective(YmqWageDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqWageDao> selectByExampleWithBLOBs(YmqWageDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqWageDao> selectByExample(YmqWageDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    YmqWageDao selectByPrimaryKey(Integer wid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") YmqWageDao record, @Param("example") YmqWageDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") YmqWageDao record, @Param("example") YmqWageDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExample(@Param("record") YmqWageDao record, @Param("example") YmqWageDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeySelective(YmqWageDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(YmqWageDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_wage
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKey(YmqWageDao record);
}