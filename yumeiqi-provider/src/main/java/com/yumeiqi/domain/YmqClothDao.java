package com.yumeiqi.domain;

public class YmqClothDao {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_cloth.clid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private Integer clid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_cloth.name
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_cloth.purity
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String purity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_cloth.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String other;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_cloth.clid
     *
     * @return the value of ymq_cloth.clid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public Integer getClid() {
        return clid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_cloth.clid
     *
     * @param clid the value for ymq_cloth.clid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setClid(Integer clid) {
        this.clid = clid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_cloth.name
     *
     * @return the value of ymq_cloth.name
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_cloth.name
     *
     * @param name the value for ymq_cloth.name
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_cloth.purity
     *
     * @return the value of ymq_cloth.purity
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getPurity() {
        return purity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_cloth.purity
     *
     * @param purity the value for ymq_cloth.purity
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setPurity(String purity) {
        this.purity = purity == null ? null : purity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_cloth.other
     *
     * @return the value of ymq_cloth.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getOther() {
        return other;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_cloth.other
     *
     * @param other the value for ymq_cloth.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}