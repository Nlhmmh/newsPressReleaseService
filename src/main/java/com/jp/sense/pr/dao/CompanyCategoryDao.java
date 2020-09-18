package com.jp.sense.pr.dao;

import com.jp.sense.pr.model.entity.CompanyCategory;
import com.jp.sense.pr.model.entity.CompanyCategoryKey;

public interface CompanyCategoryDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(CompanyCategoryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbg.generated
     */
    int insert(CompanyCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbg.generated
     */
    int insertSelective(CompanyCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbg.generated
     */
    CompanyCategory selectByPrimaryKey(CompanyCategoryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CompanyCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CompanyCategory record);
}