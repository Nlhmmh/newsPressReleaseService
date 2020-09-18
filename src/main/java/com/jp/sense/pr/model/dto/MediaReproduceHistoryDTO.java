package com.jp.sense.pr.model.dto;

public class MediaReproduceHistoryDTO extends BaseDTO{
	
/*	    pr.release_title                                                                                     
        media.medium_name 
        media.medium_company_name 
        rephist.url       
	
	*/											

	private String releaseTitle;
    
	private String mediumName;
	
	private String mediumCompanyName;
	
	private String url;
	
	private String prId;
	
	private String mediaId;
	
	public String getMediaId() {
		return mediaId;
	}


	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}


	public String getPrId() {
		return prId;
	}


	public void setPrId(String prId) {
		this.prId = prId;
	}

	
	public String getReleaseTitle() {
		return releaseTitle;
	}


	public void setReleaseTitle(String releaseTitle) {
		this.releaseTitle = releaseTitle;
	}


	public String getMediumName() {
		return mediumName;
	}


	public void setMediumName(String mediumName) {
		this.mediumName = mediumName;
	}


	public String getMediumCompanyName() {
		return mediumCompanyName;
	}


	public void setMediumCompanyName(String mediumCompanyName) {
		this.mediumCompanyName = mediumCompanyName;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "MediaReproduceHistoryDTO [releaseTitle=" + releaseTitle + ", mediumName=" + mediumName + ", mediumCompanyName="
				+ mediumCompanyName + ", url=" + url + ", prId=" + prId + ", mediaId=" + mediaId + "]";
	}

}
