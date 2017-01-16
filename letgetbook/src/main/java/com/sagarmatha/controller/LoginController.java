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
import com.sagarmatha.bean.LoginReturnDetail;
import com.sagarmatha.dao.LoginService;



/**
 * @author jitendra
 *
 */
@Path("/login")
public class LoginController {
	LoginService loginservice = new LoginService();
	
	/* Customer Login*/
	@POST
	@Path("/loginUser")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer userLogIn(LogInInfo userLogin) {
		Customer customer = new Customer();
		 customer =	loginservice.getCustomerLogin(userLogin);

		 return customer;
	}
	
	/* Client Login*/
	@POST
	@Path("/loginBusiness")
	@Produces(MediaType.APPLICATION_JSON)
	public LoginReturnDetail businessLogIn(LogInInfo businessLogin) {
		LoginReturnDetail loginretun = new LoginReturnDetail();
		Business business = new Business();
		
		business = loginservice.getBusinessLogin(businessLogin);
//		loginretun.setId(business.getBusinessId());
//		loginretun.setName(business.getBusinessName());
		loginretun.setId(12L);
		loginretun.setName("ram");
		
		return loginretun;
		
	}
	

}
