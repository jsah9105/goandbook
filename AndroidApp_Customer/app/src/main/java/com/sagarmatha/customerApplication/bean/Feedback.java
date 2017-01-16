/**
 * 
 */
package com.sagarmatha.customerApplication.bean;

/**
 * @author jitendra
 *
 */

public class Feedback {

	private Long feedbackId;
	private Long businessId;
	private String comment;
	private int rating;
	
	/**
	 * @return the feedbackId
	 */
	public Long getFeedbackId() {
		return feedbackId;
	}
	/**
	 * @param feedbackId the feedbackId to set
	 */
	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}
	/**
	 * @return the businessId
	 */
	public Long getBusinessId() {
		return businessId;
	}
	/**
	 * @param businessId the businessId to set
	 */
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
