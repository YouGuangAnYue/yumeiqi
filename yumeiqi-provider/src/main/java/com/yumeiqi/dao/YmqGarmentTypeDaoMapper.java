package com.yumeiqi.dao;

import com.yumeiqi.domain.YmqGarmentTypeDao;
import com.yumeiqi.domain.YmqGarmentTypeDaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface YmqGarmentTypeDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    long countByExample(YmqGarmentTypeDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByExample(YmqGarmentTypeDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByPrimaryKey(Integer gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insert(YmqGarmentTypeDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insertSelective(YmqGarmentTypeDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqGarmentTypeDao> selectByExampleWithBLOBs(YmqGarmentTypeDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqGarmentTypeDao> selectByExample(YmqGarmentTypeDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    YmqGarmentTypeDao selectByPrimaryKey(Integer gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") YmqGarmentTypeDao record, @Param("example") YmqGarmentTypeDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") YmqGarmentTypeDao record, @Param("example") YmqGarmentTypeDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExample(@Param("record") YmqGarmentTypeDao record, @Param("example") YmqGarmentTypeDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeySelective(YmqGarmentTypeDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(YmqGarmentTypeDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_garment_type
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKey(YmqGarmentTypeDao record);
}