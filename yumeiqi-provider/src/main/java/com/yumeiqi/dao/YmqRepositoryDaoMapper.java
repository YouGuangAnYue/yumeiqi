package com.yumeiqi.dao;

import com.yumeiqi.domain.YmqRepositoryDao;
import com.yumeiqi.domain.YmqRepositoryDaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YmqRepositoryDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    long countByExample(YmqRepositoryDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByExample(YmqRepositoryDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByPrimaryKey(Integer rid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insert(YmqRepositoryDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insertSelective(YmqRepositoryDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqRepositoryDao> selectByExampleWithBLOBs(YmqRepositoryDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqRepositoryDao> selectByExample(YmqRepositoryDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    YmqRepositoryDao selectByPrimaryKey(Integer rid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") YmqRepositoryDao record, @Param("example") YmqRepositoryDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") YmqRepositoryDao record, @Param("example") YmqRepositoryDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExample(@Param("record") YmqRepositoryDao record, @Param("example") YmqRepositoryDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeySelective(YmqRepositoryDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(YmqRepositoryDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_repository
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKey(YmqRepositoryDao record);
}