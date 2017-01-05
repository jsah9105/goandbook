/**
 * 
 */
package com.sagarmatha.dao;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.sagarmatha.bean.AppointFix;
import com.sagarmatha.bean.Appointment;
import com.sagarmatha.util.HibernateUtil;

/**
 * @author jitendra
 *
 */

public class AppointmentService {
	private static final Logger logger = Logger.getLogger(AppointmentService.class);
	
	public Long getdetailInfo(AppointFix appointFix){
		logger.debug("Entering to addBussiness method");
	//	Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Appointment businessAppointment = new Appointment();
		Long appointmentID = null;
		try {
			session.beginTransaction();
			businessAppointment.setAppointId(appointFix.getCustomerId());
			businessAppointment.setServiceId(appointFix.getServiceId());
			businessAppointment.setDate(appointFix.getDate());
			businessAppointment.setStartTime(appointFix.getStartTime());
			appointmentID = (Long) session.save(businessAppointment);
			session.getTransaction().commit();
			session.flush();
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			
			session.close();
		}

		logger.debug("Exit from addBussiness where addressID = "+appointmentID);
		
		
		return appointmentID;
		
	}
}
