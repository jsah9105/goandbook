/**
 * 
 */
package com.sagarmatha.customerApplication.bean;

/**
 * @author jitendra
 *
 */

public class Service {

	private Long serviceId;
	private String serviceName;
	//private Time duration;
	private String description;
	
	/**
	 * @return the serviceId
	 */
	public Long getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}
	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	/**
	 * @return the duration
	 */
//	public Time getDuration() {
//		return duration;
//	}
//	/**
//	 * @param duration the duration to set
//	 */
//	public void setDuration(Time duration) {
//		this.duration = duration;
//	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
