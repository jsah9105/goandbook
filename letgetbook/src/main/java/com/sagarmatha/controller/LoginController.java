/**
 * 
 */
package com.sagarmatha.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sagarmatha.bean.Business;
import com.sagarmatha.bean.Customer;
import com.sagarmatha.bean.LogInInfo;
import com.sagarmatha.dao.LoginService;



/**
 * @author jitendra
 *
 */
@Path("/login")
public class LoginController {
	LoginService loginservice = new LoginService();

	@POST
	@Path("/loginUser")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer userLogIn(LogInInfo userLogin) {
		Customer customer = new Customer();
		
		 customer =	loginservice.getCustomerLogin(userLogin);
		
		return customer;
		
	}
	
	@POST
	@Path("/loginBusiness")
	@Produces(MediaType.APPLICATION_JSON)
	public Business businessLogIn(LogInInfo businessLogin) {
		Business business = new Business();
		
		business = loginservice.getBusinessLogin(businessLogin);
		
		return business;
		
	}
	

}
