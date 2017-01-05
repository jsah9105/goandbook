/**
 * 
 */
package com.sagarmatha.controller;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;

import com.sagarmatha.bean.AppointFix;
import com.sagarmatha.dao.AppointmentService;

/**
 * @author jitendra
 *
 */
@Path("/appointment")
public class AppoinmentController {
	
	AppointmentService apppointmentService = new AppointmentService();
	
	/* Getting input and making an appoinment */
	@POST
	@Path("/fix")
	@Produces(MediaType.APPLICATION_JSON)
	public Long getAppointmentFix(AppointFix appointFix){
		Long appointment = 0L;
			 
		       appointment = apppointmentService.getdetailInfo(appointFix);
		       
		       
		
		return appointment;
		
	}

}