/**
 * 
 */
package com.sagarmatha.dao;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.sagarmatha.bean.Address;
import com.sagarmatha.bean.Business;
import com.sagarmatha.bean.Customer;
import com.sagarmatha.bean.SellerAccount;
import com.sagarmatha.bean.UserAccount;
import com.sagarmatha.util.HibernateUtil;

/**
 * @author jitendra
 *
 */
public class RegistrationService {
	private static final Logger logger = Logger.getLogger(RegistrationService.class);
	
	public Long addAddress(SellerAccount account){
		logger.debug("Entering to addAddress method");
	//	Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Address address = new Address(); 
		Long addressID = 0L;
		try {
			session.beginTransaction();
			address.setAddressId(address.getAddressId());
			address.setAddress1(account.getAddress1());
			address.setAddress2(account.getAddress2());
			address.setCity(account.getCity());
			address.setState(account.getState());
			address.setZipCode(account.getZipCode());
			address.setCountry(account.getCountry());
			address.setBusinessId(account.getBusinessId());
		    addressID = (Long) session.save(address);
			session.getTransaction().commit();
			session.flush();
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			
			session.close();
		}

		logger.debug("Exit from addAddress where addressID = "+addressID);
		
		
		return addressID;
	}
	
	public Long addBusiness(SellerAccount businessAccount){
		logger.debug("Entering to addBussiness method");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Business business = new Business();
		Long businessID = 0L;
		try {
			session.beginTransaction();
			business.setBusinessId(business.getBusinessId());
			business.setBusinessName(businessAccount.getBusinessName());
			business.setBusinessPhoto(businessAccount.getBusinessPhoto());
			business.setEmail(businessAccount.getEmail());
			business.setUserName(businessAccount.getUserName());
			business.setPassword(businessAccount.getPassword());
			business.setPhone1(businessAccount.getPhone1());
			business.setPhone2(businessAccount.getPhone2());
		    businessID = (Long) session.save(business);
			session.getTransaction().commit();
			session.flush();
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			
			session.close();
		}

		logger.debug("Exit from addBussiness where addressID = "+businessID);
		
		
		return businessID;
		
	}
	
	public Long addCustomer(UserAccount userAccount){
		logger.debug("Entering to addCustomer method");
	//	Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Customer customer = new Customer();
		Long customerID = 0L;
		try {
			session.beginTransaction();
			customer.setCustFirstName(userAccount.getCustFirstName());
			customer.setCustLastName(userAccount.getCustLastName());
			customer.setCustMiddleName(userAccount.getCustMiddleName());
			customer.setEmail(userAccount.getEmail());
			customer.setUserName(userAccount.getUserName());
			customer.setPassword(userAccount.getPassword());
			
		    customerID = (Long) session.save(customer);
		    
			session.getTransaction().commit();
			session.flush();
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			
			session.close();
		}

		logger.debug("Exit from addCustomer where addressID = "+customerID);
		
		
		return customerID;
		
	}
	
	

}
