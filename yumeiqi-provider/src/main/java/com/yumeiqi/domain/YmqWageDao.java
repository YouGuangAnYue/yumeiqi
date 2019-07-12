package com.yumeiqi.domain;

import java.math.BigDecimal;
import java.util.Date;

public class YmqWageDao {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.wid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private Integer wid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.eid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private Integer eid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.ename
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String ename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.salary
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private BigDecimal salary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.push_money
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private BigDecimal pushMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.leave
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private BigDecimal leave;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.all_the_work
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private BigDecimal allTheWork;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.bonus
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private BigDecimal bonus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.penalty
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private BigDecimal penalty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.absenteeism
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private BigDecimal absenteeism;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.leave_early
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private BigDecimal leaveEarly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.fsalary
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private BigDecimal fsalary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.wdate
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private Date wdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.verifier
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private Integer verifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ymq_wage.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    private String other;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.wid
     *
     * @return the value of ymq_wage.wid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public Integer getWid() {
        return wid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.wid
     *
     * @param wid the value for ymq_wage.wid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setWid(Integer wid) {
        this.wid = wid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.eid
     *
     * @return the value of ymq_wage.eid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.eid
     *
     * @param eid the value for ymq_wage.eid
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.ename
     *
     * @return the value of ymq_wage.ename
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.ename
     *
     * @param ename the value for ymq_wage.ename
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.salary
     *
     * @return the value of ymq_wage.salary
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.salary
     *
     * @param salary the value for ymq_wage.salary
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.push_money
     *
     * @return the value of ymq_wage.push_money
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public BigDecimal getPushMoney() {
        return pushMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.push_money
     *
     * @param pushMoney the value for ymq_wage.push_money
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setPushMoney(BigDecimal pushMoney) {
        this.pushMoney = pushMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.leave
     *
     * @return the value of ymq_wage.leave
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public BigDecimal getLeave() {
        return leave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.leave
     *
     * @param leave the value for ymq_wage.leave
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setLeave(BigDecimal leave) {
        this.leave = leave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.all_the_work
     *
     * @return the value of ymq_wage.all_the_work
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public BigDecimal getAllTheWork() {
        return allTheWork;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.all_the_work
     *
     * @param allTheWork the value for ymq_wage.all_the_work
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setAllTheWork(BigDecimal allTheWork) {
        this.allTheWork = allTheWork;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.bonus
     *
     * @return the value of ymq_wage.bonus
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public BigDecimal getBonus() {
        return bonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.bonus
     *
     * @param bonus the value for ymq_wage.bonus
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.penalty
     *
     * @return the value of ymq_wage.penalty
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public BigDecimal getPenalty() {
        return penalty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.penalty
     *
     * @param penalty the value for ymq_wage.penalty
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.absenteeism
     *
     * @return the value of ymq_wage.absenteeism
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public BigDecimal getAbsenteeism() {
        return absenteeism;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.absenteeism
     *
     * @param absenteeism the value for ymq_wage.absenteeism
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setAbsenteeism(BigDecimal absenteeism) {
        this.absenteeism = absenteeism;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.leave_early
     *
     * @return the value of ymq_wage.leave_early
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public BigDecimal getLeaveEarly() {
        return leaveEarly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.leave_early
     *
     * @param leaveEarly the value for ymq_wage.leave_early
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setLeaveEarly(BigDecimal leaveEarly) {
        this.leaveEarly = leaveEarly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.fsalary
     *
     * @return the value of ymq_wage.fsalary
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public BigDecimal getFsalary() {
        return fsalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.fsalary
     *
     * @param fsalary the value for ymq_wage.fsalary
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setFsalary(BigDecimal fsalary) {
        this.fsalary = fsalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.wdate
     *
     * @return the value of ymq_wage.wdate
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public Date getWdate() {
        return wdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.wdate
     *
     * @param wdate the value for ymq_wage.wdate
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setWdate(Date wdate) {
        this.wdate = wdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.verifier
     *
     * @return the value of ymq_wage.verifier
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public Integer getVerifier() {
        return verifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.verifier
     *
     * @param verifier the value for ymq_wage.verifier
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setVerifier(Integer verifier) {
        this.verifier = verifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ymq_wage.other
     *
     * @return the value of ymq_wage.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public String getOther() {
        return other;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ymq_wage.other
     *
     * @param other the value for ymq_wage.other
     *
     * @mbg.generated Fri Jul 12 16:19:15 CST 2019
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}