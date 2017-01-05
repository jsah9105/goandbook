/**
 * 
 */
package com.sagarmatha.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.sagarmatha.bean.SellerAccount;
import com.sagarmatha.bean.UserAccount;
import com.sagarmatha.dao.RegistrationService;

/**
 * @author jitendra
 *
 */

@Path("/registration")
public class RegistrationController {
	private static final Logger logger = Logger.getLogger(RegistrationController.class);
	RegistrationService registrationService = new RegistrationService();

	// Business registered
	@POST
	@Path("/businessRegistration")
	@Produces(MediaType.APPLICATION_JSON)
	public String businessRegisteration(SellerAccount registration) {
		logger.debug("Entering to businessRegisteration method");
		String message = null;

		
		Long businessId = registrationService.addBusiness(registration);// Calling addBusiness method to registered business
		registration.setBusinessId(businessId);
		logger.debug(businessId + " is successfully registered");
		Long addressId = registrationService.addAddress(registration);// Calling addAddress method to add address

		if (addressId != 0) {
			message = "Success";
			logger.debug(registration.getBusinessName() + " is successfully registered");
		} else {
			message = "Unsuccess";
			logger.debug(registration.getBusinessName() + " is not registered");
		}
		return message;

	}

	// Customer registered
	@POST
	@Path("/customerRegistration")
	@Produces(MediaType.APPLICATION_JSON)
	public Long customerRegisteration(UserAccount registration) {
		logger.debug("Entering to customerRegisteration method");

		// Calling addCustomer method to registered customer
		Long customerId = registrationService.addCustomer(registration);
		logger.debug(customerId + " is not registered");
		return customerId;

	}
}