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
@Table(name = "employeeService")
public class EmployeeService {
	@Id
	private Long employeeId;
	private Long serviceId;
	/**
	 * @return the employeeId
	 */
	public Long getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
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
	
	

}
