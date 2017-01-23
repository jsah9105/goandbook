/**
 * 
 */
package com.sagarmatha.customerApplication.bean;

/**
 * @author jitendra
 *
 */

public  class Customer {

	private Long customerId;
	private String custFirstName;
	private String custMiddleName;
	private String custLastName;
	private String email;
	private String phone;
	private String userName;
	private String password;
	private String gender;
	public static final String MyPREFERENCES = "MyPrefs" ;

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
	 * @return the custFirstName
	 */
	public String getCustFirstName() {
		return custFirstName;
	}
	/**
	 * @param custFirstName the custFirstName to set
	 */
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}
	/**
	 * @return the custMiddleName
	 */
	public String getCustMiddleName() {
		return custMiddleName;
	}
	/**
	 * @param custMiddleName the custMiddleName to set
	 */
	public void setCustMiddleName(String custMiddleName) {
		this.custMiddleName = custMiddleName;
	}
	/**
	 * @return the custLastName
	 */
	public String getCustLastName() {
		return custLastName;
	}
	/**
	 * @param custLastName the custLastName to set
	 */
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

}
