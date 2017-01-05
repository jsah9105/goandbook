/**
 * 
 */
package com.sagarmatha.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jitendra
 *
 */
@Entity
@Table(name = "favorite")
public class Favorite {
	@Id
	private Long customerId;
	private Long businessId;
	/**
	 * @return the customerId
	 */
	public Long getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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
	
	
	
}
