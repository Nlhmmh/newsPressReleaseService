package com.jp.sense.pr.dao;

import com.jp.sense.pr.model.dto.MediaReproduceHistoryDTO;
import com.jp.sense.pr.model.entity.MediaReproduceHistory;
import com.jp.sense.pr.model.entity.PressRelease;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MediaReproduceHistoryDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_reproduce_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("releaseId") Integer releaseId, @Param("mediaUserId") Integer mediaUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_reproduce_history
     *
     * @mbg.generated
     */
    int insert(MediaReproduceHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_reproduce_history
     *
     * @mbg.generated
     */
    int insertSelective(MediaReproduceHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_reproduce_history
     *
     * @mbg.generated
     */
    MediaReproduceHistory selectByPrimaryKey(@Param("releaseId") Integer releaseId, @Param("mediaUserId") Integer mediaUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_reproduce_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MediaReproduceHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_reproduce_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MediaReproduceHistory record);
    
    /**
     * PressRelease
     　　　* 朱岩
     *
     * 
     */
    
    
    List<PressRelease> selectByComId(Integer comId , Integer count);
    /**
     * MediaReproduceHistoryDTO
     　　　* 朱岩
     *
     * 
     */
    
    
    List<MediaReproduceHistoryDTO> selectOnlineMediaDitailList(Integer prId);
    
    
}