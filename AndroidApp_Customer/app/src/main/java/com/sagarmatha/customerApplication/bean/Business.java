package com.sagarmatha.customerApplication.bean;

import java.sql.Blob;


//@SecondaryTable(name = "address", pkJoinColumns=@javax.persistence.PrimaryKeyJoinColumn(name="businessId", referencedColumnName="businessId"))
public class Business {

	private Long businessId;
	private String businessName;
	private Blob businessPhoto;
	private String phone1;
	private String phone2;
	private String userName;
	private String password;
	private String email;
	private String hoursOfOperation;
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
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}
	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	/**
	 * @return the businessPhoto
	 */
	public Blob getBusinessPhoto() {
		return businessPhoto;
	}
	/**
	 * @param businessPhoto the businessPhoto to set
	 */
	public void setBusinessPhoto(Blob businessPhoto) {
		this.businessPhoto = businessPhoto;
	}
	/**
	 * @return the phone1
	 */
	public String getPhone1() {
		return phone1;
	}
	/**
	 * @param phone1 the phone1 to set
	 */
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	/**
	 * @return the phone2
	 */
	public String getPhone2() {
		return phone2;
	}
	/**
	 * @param phone2 the phone2 to set
	 */
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the hoursOfOperation
	 */
	public String getHoursOfOperation() {
		return hoursOfOperation;
	}
	/**
	 * @param hoursOfOperation the hoursOfOperation to set
	 */
	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}
	
	
	
	
	

}
