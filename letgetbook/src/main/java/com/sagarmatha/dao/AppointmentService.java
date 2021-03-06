/**
 * 
 */
package com.sagarmatha.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.sagarmatha.bean.AppointFix;
import com.sagarmatha.bean.Appointment;
import com.sagarmatha.bean.Employee;
import com.sagarmatha.bean.Schedule;
import com.sagarmatha.bean.SellerAccount;
import com.sagarmatha.bean.Service;
import com.sagarmatha.bean.ServiceOrder;
import com.sagarmatha.util.HibernateUtil;

/**
 * @author jitendra
 *
 */

public class AppointmentService {
	private static final Logger logger = Logger.getLogger(AppointmentService.class);
	private Date todayDate;
	
	public Long getdetailInfo(AppointFix appointFix){
		logger.debug("Entering to addBussiness method");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Appointment businessAppointment = new Appointment();
		Long appointmentID = null;
		try {
			session.beginTransaction();
			businessAppointment.setAppointId(appointFix.getCustomerId());
			businessAppointment.setServiceId(appointFix.getServiceId());
			businessAppointment.setDate(appointFix.getDate());
			businessAppointment.setStartTime(appointFix.getStartTime());
			businessAppointment.setEmployeeId(appointFix.getEmployeeId());
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
	
	public SellerAccount getBusinessDetail(Long businessId){
		logger.debug("Entering to getBusineesName");
		// Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		SellerAccount businessIdList = new SellerAccount();
		Service service = new Service();
		List<ServiceOrder> serviceIdList = new ArrayList<ServiceOrder>();
		List<Service> serviceDetailList = new ArrayList<Service>();

		try {
			session.beginTransaction();
			List list = session.createQuery("select b.businessName, b.phone1, b.phone2, b.email, o.address1, o.address2, o.city, o.state, o.zipCode, o.country from Address INNER JOIN Business b where o.businessId=:businessId")
					.setLong("businessId", businessId).list();

			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {

				businessIdList =  (SellerAccount) iterator.next();

			}
			
			List listserviceId = session.createQuery("select e.serviceId from ServiceOrder e  where e.businessId=:businessId")
					.setLong("businessId", businessId).list();

			Iterator iteratorServiceId = listserviceId.iterator();
			while (iteratorServiceId.hasNext()) {

				serviceIdList =  (List<ServiceOrder>) iteratorServiceId.next();

			}
			
			for (int i = 0; i < serviceIdList.size(); i++) {
				List listservicedetail = session.createQuery("from Service e  where e.serviceId=:serviceId")
						.setLong("serviceId", serviceIdList.get(i).getServiceId()).list();

				Iterator iteratorServiceDetail = listservicedetail.iterator();
				while (iteratorServiceDetail.hasNext()) {

					service =  (Service) iteratorServiceDetail.next();

				}
				serviceDetailList.add(service);
				
			}
			businessIdList.setServiceList(serviceDetailList);
			
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			logger.error("Business ID Not found");
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return  businessIdList;
		
	}
	
	public List<Employee> getEmployeeDetail(SellerAccount account){
		
		logger.debug("Entering to getBusineesName");
		Employee employee = new Employee();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		List<Schedule> unbookedEmployee = new ArrayList<Schedule>();
		List<Employee> employeeNameList= new ArrayList<Employee>();

		try {
			session.beginTransaction();
			List list = session.createQuery(" from Schedule s where o.date=:date and o.businessId=:businessId ")
					.setDate("date",todayDate).setLong("businessId", Long.parseLong(account.getBusinessId())).list();

			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {

				scheduleList =  (List<Schedule>) iterator.next();

			}
			
			for (int i = 0; i < scheduleList.size(); i++) {
				if(timeconvetor(account.getStartTime()) >= timeconvetor(scheduleList.get(i).getStartTime()) 
						&& timeconvetor(account.getStartTime()) <= timeconvetor(scheduleList.get(i).getStartTime()+45)){
					unbookedEmployee.add(scheduleList.get(i));
					
				}
			}
			
			for (int i = 0; i < unbookedEmployee.size(); i++) {
				List employeeName = session.createQuery(" from Employee s where s.employeeId=:employeeId ")
						.setLong("employeeId", unbookedEmployee.get(i).getBusinessId()).list();
				Iterator iteratorEmployee = employeeName.iterator();
				while (iterator.hasNext()) {

					employee =  (Employee) iteratorEmployee.next();
					employeeNameList.add(employee);

				}
			}
			
			
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			logger.error("Business ID Not found");
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return  employeeNameList;
		
	}
	
	public static int timeconvetor(String time  ){
		String [] token = time.split(":");
		int totalMin = (Integer.parseInt(token[0]) * 60) + Integer.parseInt(token[1]);
		return totalMin;
		
	}
}
