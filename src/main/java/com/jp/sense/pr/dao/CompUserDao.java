package com.jp.sense.pr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jp.sense.pr.model.entity.CompUser;

public interface CompUserDao {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comp_user
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comp_user
	 * @mbg.generated
	 */
	int insert(CompUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comp_user
	 * @mbg.generated
	 */
	int insertSelective(CompUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comp_user
	 * @mbg.generated
	 */
	CompUser selectByPrimaryKey(Integer userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comp_user
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(CompUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comp_user
	 * @mbg.generated
	 */
	int updateByPrimaryKey(CompUser record);

	/**
     *	認証用ユーザ取得関数
     *	author: Li
     */
    List<CompUser> selectByEmail(String email);
    
    /**
     *	認証用ユーザ取得関数（会社情報付き）
     *	author: Li
     */
    List<CompUser> selectByEmailWithCompany(String email);
    
    /**
     *	By企業ID
     *	author: shu
     * @return 
     */
    List<CompUser> selectByCompanyId(Integer compId);
    
    /**
	 * 更新削除FLAG
	 * @shu
	 */
	int updateDeleteFlag(Integer userId);
	
	/**
	 * --企業のユーザー情報のパスワード更新処理
	 * 
	 * @author ネィ
	 * @param password
	 * @param user_id
	 * @return
	 */
	int updatePassword(@Param("password") String password, @Param("user_id") int user_id);

	/**
     *	パスワード再設定
     *	@author 山口
     */    
    int updateCompUserPassword(@Param("id") Integer id, @Param("resetPassword") String resetPassword);
}