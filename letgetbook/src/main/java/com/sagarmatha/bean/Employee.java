/**
 * 
 */
package com.sagarmatha.bean;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jitendra
 *
 */
@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String empFirstName;
	private String empMiddleName;
	private String empLastName;
	//private Blob photo;
	private Long bussinessId;
	
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
	 * @return the empFirstName
	 */
	public String getEmpFirstName() {
		return empFirstName;
	}
	/**
	 * @param empFirstName the empFirstName to set
	 */
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	/**
	 * @return the empMiddleName
	 */
	public String getEmpMiddleName() {
		return empMiddleName;
	}
	/**
	 * @param empMiddleName the empMiddleName to set
	 */
	public void setEmpMiddleName(String empMiddleName) {
		this.empMiddleName = empMiddleName;
	}
	/**
	 * @return the empLastName
	 */
	public String getEmpLastName() {
		return empLastName;
	}
	/**
	 * @param empLastName the empLastName to set
	 */
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	/**
	 * @return the bussinessId
	 */
	public Long getBussinessId() {
		return bussinessId;
	}
	/**
	 * @param bussinessId the bussinessId to set
	 */
	public void setBussinessId(Long bussinessId) {
		this.bussinessId = bussinessId;
	}
//	/**
//	 * @return the photo
//	 */
//	public Blob getPhoto() {
//		return photo;
//	}
//	/**
//	 * @param photo the photo to set
//	 */
//	public void setPhoto(Blob photo) {
//		this.photo = photo;
//	}
	
	

}
