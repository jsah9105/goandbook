/**
 * 
 */
package com.sagarmatha.customerApplication.bean;

/**
 * @author jitendra
 *
 */

public class LogInInfo {
	//@JsonProperty("userName")
	private String userName;
	//@JsonProperty("password")
	private String password;
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
	
	

}