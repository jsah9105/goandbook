/**
 * 
 */
package com.sagarmatha.dao;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.sagarmatha.bean.Business;
import com.sagarmatha.bean.Customer;
import com.sagarmatha.bean.LogInInfo;
import com.sagarmatha.util.HibernateUtil;

/**
 * @author jitendra
 *
 */
public class LoginService {
	
	private static final Logger logger = Logger.getLogger(LoginService.class);
	
	public Business getBusinessLogin(LogInInfo information){
		logger.debug("Entering into getBusinessLogin");
		//Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Business businessValue = new Business();
		try {
			session.beginTransaction();
			List list = session
					.createQuery("from Business where userName=:userName and password=:password")
					.setString("userName", information.getUserName()).setString("password", information.getPassword()).list();

			Iterator iterator = list.iterator();

			while (iterator.hasNext()) {
				businessValue = (Business) iterator.next();

			}
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		logger.debug("Exit from getBusinessLogin");
		return businessValue;
	}
	
	public Customer getCustomerLogin(LogInInfo information){
		logger.debug("Entering into getCustomerLogin");
		//Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Customer customerValue = new Customer();
		try {
			session.beginTransaction();
			List list = session
					.createQuery("from Customer where userName=:userName and password=:password")
					.setString("userName", information.getUserName()).setString("password", information.getPassword()).list();

			Iterator iterator = list.iterator();

			while (iterator.hasNext()) {
				customerValue = (Customer) iterator.next();

			}
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		logger.debug("Exit from getCustomerLogin");
		return customerValue;
	}
	
	

}
