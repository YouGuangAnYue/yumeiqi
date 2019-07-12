package com.yumeiqi.domain;

import java.math.BigDecimal;

public class YmqOrderDetailDao {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_order_detail.id
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_order_detail.order_number
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String orderNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_order_detail.gid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private Integer gid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_order_detail.article_number
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String articleNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_order_detail.color
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String color;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_order_detail.number
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_order_detail.total_money
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private BigDecimal totalMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_order_detail.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String other;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_order_detail.id
     *
     * @return the value of ymq_order_detail.id
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_order_detail.id
     *
     * @param id the value for ymq_order_detail.id
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_order_detail.order_number
     *
     * @return the value of ymq_order_detail.order_number
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_order_detail.order_number
     *
     * @param orderNumber the value for ymq_order_detail.order_number
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_order_detail.gid
     *
     * @return the value of ymq_order_detail.gid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_order_detail.gid
     *
     * @param gid the value for ymq_order_detail.gid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_order_detail.article_number
     *
     * @return the value of ymq_order_detail.article_number
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getArticleNumber() {
        return articleNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_order_detail.article_number
     *
     * @param articleNumber the value for ymq_order_detail.article_number
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber == null ? null : articleNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_order_detail.color
     *
     * @return the value of ymq_order_detail.color
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_order_detail.color
     *
     * @param color the value for ymq_order_detail.color
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_order_detail.number
     *
     * @return the value of ymq_order_detail.number
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_order_detail.number
     *
     * @param number the value for ymq_order_detail.number
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_order_detail.total_money
     *
     * @return the value of ymq_order_detail.total_money
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_order_detail.total_money
     *
     * @param totalMoney the value for ymq_order_detail.total_money
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_order_detail.other
     *
     * @return the value of ymq_order_detail.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getOther() {
        return other;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_order_detail.other
     *
     * @param other the value for ymq_order_detail.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}