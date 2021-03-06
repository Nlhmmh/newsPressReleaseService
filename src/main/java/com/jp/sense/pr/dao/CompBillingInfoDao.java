package com.jp.sense.pr.dao;

import com.jp.sense.pr.model.entity.CompBillingInfo;

public interface CompBillingInfoDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comp_billing_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comp_billing_info
     *
     * @mbg.generated
     */
    int insert(CompBillingInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comp_billing_info
     *
     * @mbg.generated
     */
    int insertSelective(CompBillingInfo record);
    
    /**
     * ID含めてインサートする。
     *
     * @author Li
     */
    int insertSelectiveWithId (CompBillingInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comp_billing_info
     *
     * @mbg.generated
     */
    CompBillingInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comp_billing_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CompBillingInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comp_billing_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CompBillingInfo record);
}