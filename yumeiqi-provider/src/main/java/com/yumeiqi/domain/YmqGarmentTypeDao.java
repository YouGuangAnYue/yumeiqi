package com.yumeiqi.domain;

public class YmqGarmentTypeDao {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_garment_type.gid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private Integer gid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_garment_type.name
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_garment_type.season
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private Integer season;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_garment_type.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String other;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_garment_type.gid
     *
     * @return the value of ymq_garment_type.gid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_garment_type.gid
     *
     * @param gid the value for ymq_garment_type.gid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_garment_type.name
     *
     * @return the value of ymq_garment_type.name
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_garment_type.name
     *
     * @param name the value for ymq_garment_type.name
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_garment_type.season
     *
     * @return the value of ymq_garment_type.season
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public Integer getSeason() {
        return season;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_garment_type.season
     *
     * @param season the value for ymq_garment_type.season
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setSeason(Integer season) {
        this.season = season;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_garment_type.other
     *
     * @return the value of ymq_garment_type.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getOther() {
        return other;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_garment_type.other
     *
     * @param other the value for ymq_garment_type.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}