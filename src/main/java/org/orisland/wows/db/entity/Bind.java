package org.orisland.wows.db.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table bind
 */
public class Bind {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bind.bind_id
     *
     * @mbg.generated
     */
    private Long bindId;

    /**
     * Database Column Remarks:
     *   qq号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bind.qq_number
     *
     * @mbg.generated
     */
    private Long qqNumber;

    /**
     * Database Column Remarks:
     *   窝窝屎id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bind.account_id
     *
     * @mbg.generated
     */
    private Long accountId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bind.bind_id
     *
     * @return the value of bind.bind_id
     *
     * @mbg.generated
     */
    public Long getBindId() {
        return bindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bind.bind_id
     *
     * @param bindId the value for bind.bind_id
     *
     * @mbg.generated
     */
    public void setBindId(Long bindId) {
        this.bindId = bindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bind.qq_number
     *
     * @return the value of bind.qq_number
     *
     * @mbg.generated
     */
    public Long getQqNumber() {
        return qqNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bind.qq_number
     *
     * @param qqNumber the value for bind.qq_number
     *
     * @mbg.generated
     */
    public void setQqNumber(Long qqNumber) {
        this.qqNumber = qqNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bind.account_id
     *
     * @return the value of bind.account_id
     *
     * @mbg.generated
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bind.account_id
     *
     * @param accountId the value for bind.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}