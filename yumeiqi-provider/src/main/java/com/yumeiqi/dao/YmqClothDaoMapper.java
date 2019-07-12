package com.yumeiqi.dao;

import com.yumeiqi.domain.YmqClothDao;
import com.yumeiqi.domain.YmqClothDaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface YmqClothDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    long countByExample(YmqClothDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByExample(YmqClothDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int deleteByPrimaryKey(Integer clid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insert(YmqClothDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int insertSelective(YmqClothDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqClothDao> selectByExampleWithBLOBs(YmqClothDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    List<YmqClothDao> selectByExample(YmqClothDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    YmqClothDao selectByPrimaryKey(Integer clid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") YmqClothDao record, @Param("example") YmqClothDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") YmqClothDao record, @Param("example") YmqClothDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByExample(@Param("record") YmqClothDao record, @Param("example") YmqClothDaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeySelective(YmqClothDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(YmqClothDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ymq_cloth
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    int updateByPrimaryKey(YmqClothDao record);
}