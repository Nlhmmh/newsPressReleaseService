package com.jp.sense.pr.model.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table browsing_history
 */
public class BrowsingHistoryKey {

	/**
	 * Database Column Remarks: メディアユーザーID This field was generated by MyBatis Generator. This field corresponds to the database column browsing_history.media_user_id
	 * @mbg.generated
	 */
	private Integer mediaUserId;
	/**
	 * Database Column Remarks: プレスリリースID This field was generated by MyBatis Generator. This field corresponds to the database column browsing_history.release_id
	 * @mbg.generated
	 */
	private Integer releaseId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column browsing_history.media_user_id
	 * @return  the value of browsing_history.media_user_id
	 * @mbg.generated
	 */
	public Integer getMediaUserId() {
		return mediaUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column browsing_history.media_user_id
	 * @param mediaUserId  the value for browsing_history.media_user_id
	 * @mbg.generated
	 */
	public void setMediaUserId(Integer mediaUserId) {
		this.mediaUserId = mediaUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column browsing_history.release_id
	 * @return  the value of browsing_history.release_id
	 * @mbg.generated
	 */
	public Integer getReleaseId() {
		return releaseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column browsing_history.release_id
	 * @param releaseId  the value for browsing_history.release_id
	 * @mbg.generated
	 */
	public void setReleaseId(Integer releaseId) {
		this.releaseId = releaseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table browsing_history
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", mediaUserId=").append(mediaUserId);
		sb.append(", releaseId=").append(releaseId);
		sb.append("]");
		return sb.toString();
	}
}