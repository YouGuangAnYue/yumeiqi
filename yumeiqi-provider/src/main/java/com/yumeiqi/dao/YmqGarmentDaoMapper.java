package com.yumeiqi.dao;

import com.yumeiqi.domain.YmqGarmentDao;
import com.yumeiqi.domain.YmqGarmentDaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YmqGarmentDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    long countByExample(YmqGarmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByExample(YmqGarmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByPrimaryKey(Integer gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insert(YmqGarmentDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insertSelective(YmqGarmentDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqGarmentDao> selectByExampleWithBLOBs(YmqGarmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqGarmentDao> selectByExample(YmqGarmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    YmqGarmentDao selectByPrimaryKey(Integer gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") YmqGarmentDao record, @Param("example") YmqGarmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") YmqGarmentDao record, @Param("example") YmqGarmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExample(@Param("record") YmqGarmentDao record, @Param("example") YmqGarmentDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeySelective(YmqGarmentDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(YmqGarmentDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKey(YmqGarmentDao record);
}