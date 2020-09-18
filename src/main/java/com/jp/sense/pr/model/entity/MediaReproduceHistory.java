package com.jp.sense.pr.model.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table media_reproduce_history
 */
public class MediaReproduceHistory {
    /**
     * Database Column Remarks:
     *   プレスリリースID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_reproduce_history.RELEASE_ID
     *
     * @mbg.generated
     */
    private Integer releaseId;

    /**
     * Database Column Remarks:
     *   メディアユーザーID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_reproduce_history.MEDIA_USER_ID
     *
     * @mbg.generated
     */
    private Integer mediaUserId;

    /**
     * Database Column Remarks:
     *   URL
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_reproduce_history.URL
     *
     * @mbg.generated
     */
    private String url;

    /**
     * Database Column Remarks:
     *   削除フラグ
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_reproduce_history.DELETE_FLAG
     *
     * @mbg.generated
     */
    private String deleteFlag;

    /**
     * Database Column Remarks:
     *   作成者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_reproduce_history.CREATE_USER
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   作成日時:YYYY/MM/DD HH:MM:SS
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_reproduce_history.CREATE_DATETIME
     *
     * @mbg.generated
     */
    private Date createDatetime;

    /**
     * Database Column Remarks:
     *   最終更新者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_reproduce_history.UPDATE_USER
     *
     * @mbg.generated
     */
    private String updateUser;

    /**
     * Database Column Remarks:
     *   最終更新日時:YYYY/MM/DD HH:MM:SS
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_reproduce_history.UPDATE_DATETIME
     *
     * @mbg.generated
     */
    private Date updateDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_reproduce_history.RELEASE_ID
     *
     * @return the value of media_reproduce_history.RELEASE_ID
     *
     * @mbg.generated
     */
    public Integer getReleaseId() {
        return releaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_reproduce_history.RELEASE_ID
     *
     * @param releaseId the value for media_reproduce_history.RELEASE_ID
     *
     * @mbg.generated
     */
    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_reproduce_history.MEDIA_USER_ID
     *
     * @return the value of media_reproduce_history.MEDIA_USER_ID
     *
     * @mbg.generated
     */
    public Integer getMediaUserId() {
        return mediaUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_reproduce_history.MEDIA_USER_ID
     *
     * @param mediaUserId the value for media_reproduce_history.MEDIA_USER_ID
     *
     * @mbg.generated
     */
    public void setMediaUserId(Integer mediaUserId) {
        this.mediaUserId = mediaUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_reproduce_history.URL
     *
     * @return the value of media_reproduce_history.URL
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_reproduce_history.URL
     *
     * @param url the value for media_reproduce_history.URL
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_reproduce_history.DELETE_FLAG
     *
     * @return the value of media_reproduce_history.DELETE_FLAG
     *
     * @mbg.generated
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_reproduce_history.DELETE_FLAG
     *
     * @param deleteFlag the value for media_reproduce_history.DELETE_FLAG
     *
     * @mbg.generated
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_reproduce_history.CREATE_USER
     *
     * @return the value of media_reproduce_history.CREATE_USER
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_reproduce_history.CREATE_USER
     *
     * @param createUser the value for media_reproduce_history.CREATE_USER
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_reproduce_history.CREATE_DATETIME
     *
     * @return the value of media_reproduce_history.CREATE_DATETIME
     *
     * @mbg.generated
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_reproduce_history.CREATE_DATETIME
     *
     * @param createDatetime the value for media_reproduce_history.CREATE_DATETIME
     *
     * @mbg.generated
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_reproduce_history.UPDATE_USER
     *
     * @return the value of media_reproduce_history.UPDATE_USER
     *
     * @mbg.generated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_reproduce_history.UPDATE_USER
     *
     * @param updateUser the value for media_reproduce_history.UPDATE_USER
     *
     * @mbg.generated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_reproduce_history.UPDATE_DATETIME
     *
     * @return the value of media_reproduce_history.UPDATE_DATETIME
     *
     * @mbg.generated
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_reproduce_history.UPDATE_DATETIME
     *
     * @param updateDatetime the value for media_reproduce_history.UPDATE_DATETIME
     *
     * @mbg.generated
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_reproduce_history
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", releaseId=").append(releaseId);
        sb.append(", mediaUserId=").append(mediaUserId);
        sb.append(", url=").append(url);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDatetime=").append(createDatetime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDatetime=").append(updateDatetime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_reproduce_history
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MediaReproduceHistory other = (MediaReproduceHistory) that;
        return (this.getReleaseId() == null ? other.getReleaseId() == null : this.getReleaseId().equals(other.getReleaseId()))
            && (this.getMediaUserId() == null ? other.getMediaUserId() == null : this.getMediaUserId().equals(other.getMediaUserId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDatetime() == null ? other.getCreateDatetime() == null : this.getCreateDatetime().equals(other.getCreateDatetime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateDatetime() == null ? other.getUpdateDatetime() == null : this.getUpdateDatetime().equals(other.getUpdateDatetime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_reproduce_history
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReleaseId() == null) ? 0 : getReleaseId().hashCode());
        result = prime * result + ((getMediaUserId() == null) ? 0 : getMediaUserId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDatetime() == null) ? 0 : getCreateDatetime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateDatetime() == null) ? 0 : getUpdateDatetime().hashCode());
        return result;
    }
}