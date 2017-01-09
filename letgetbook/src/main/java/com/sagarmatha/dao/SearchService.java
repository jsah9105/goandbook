/**
 * 
 */
package com.sagarmatha.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

import com.sagarmatha.bean.Address;
import com.sagarmatha.bean.Business;
import com.sagarmatha.bean.SellerAccount;
import com.sagarmatha.bean.Service;
import com.sagarmatha.bean.ServiceOrder;
import com.sagarmatha.util.HibernateUtil;

/**
 * @author jitendra
 *
 */
public class SearchService {
	private static final Logger logger = Logger.getLogger(SearchService.class);

	// private static void doIndex() throws InterruptedException {
	// // Session session = HibernateUtil.getSession();
	// Session session = HibernateUtil.getSessionFactory().openSession();
	// FullTextSession fullTextSession = Search.getFullTextSession(session);
	// fullTextSession.createIndexer().startAndWait();
	//
	// fullTextSession.close();
	// }

	public List<Long> getBusineesByCity(String cityName) {
		logger.debug("Entering to getBusineesByCity");
		logger.debug("Entering to getBusineesByZipCode");
		// Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Long> businessIdList = new ArrayList<Long>();
		Long value = 0L;

		try {
			session.beginTransaction();
			List list = session.createQuery("select a.businessId from Address a where a.city=:city")
					.setString("city", cityName).list();

			Iterator iterator = list.iterator();

			while (iterator.hasNext()) {

				value = (Long) iterator.next();
				 businessIdList.add(value);
			}
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			logger.error("ZipCode Not found");
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return businessIdList;

	}

	public List<Long> getBusineesByZipCode(int zipCode) {
		logger.debug("Entering to getBusineesByZipCode");
		// Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Long> businessIdList = new ArrayList<Long>();
		Long value = 0L;
		try {
			session.beginTransaction();
			List list = session.createQuery("select a.businessId from Address a where a.zipCode=:zipCode")
					.setInteger("zipCode", zipCode).list();

			Iterator iterator = list.iterator();

			while (iterator.hasNext()) {

				value = (Long) iterator.next();
				businessIdList.add(value);

			}
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			logger.error("ZipCode Not found");
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return businessIdList;

	}

	public List<SellerAccount> getBusineesName(List<Long> businessIdList) {
		logger.debug("Entering to getBusineesName");
		// Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<SellerAccount> businessList = new ArrayList<SellerAccount>();
		

		try {
			session.beginTransaction();
			for (int i = 0; i < businessIdList.size(); i++) {
				SellerAccount businessValue = new SellerAccount();
				List list = session
						.createQuery(
								"select b.businessId, b.businessName, b.email, b.phone1, b.phone2 from Business b where b.businessId=:businessId")
						.setLong("businessId", businessIdList.get(i)).list();

				Iterator iterator = list.iterator();

				while (iterator.hasNext()) {
					Object[] obj = (Object[]) iterator.next();
					businessValue.setBusinessId(String.valueOf(obj[0]));
					businessValue.setBusinessName(String.valueOf(obj[1]));
					businessValue.setEmail(String.valueOf(obj[2]));
					businessValue.setPhone1(String.valueOf(obj[3]));
					businessValue.setPhone2(String.valueOf(obj[4]));
					businessList.add(i,businessValue);

				}
				
				
//				List addressList = session
//						.createQuery(
//								" from Address b where b.businessId=:businessId")
//						.setLong("businessId", businessIdList.get(i)).list();
//				Iterator addressIterator = addressList.iterator();
//				while(addressIterator.hasNext()){
//					Address address = (Address)addressIterator.next();
//					businessValue.setAddress1(address.getAddress1());
//					businessValue.setAddress2(address.getAddress2());
//					businessValue.setCity(address.getCity());
//					businessValue.setCountry(address.getCountry());
//					businessValue.setState(address.getState());
//					
//					
//				}
				
			}
			
			
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			logger.error("Buiness Not found");
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return businessList;

	}

//	public List<Business> getBusineesNamebyBusinessId(List<Long> businessIdList) {
//		logger.debug("Entering to getBusineesName");
//		// Session session = HibernateUtil.getSession();
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		List<Business> businessList = new ArrayList<Business>();
//		Business businessValue = new Business();
//
//		try {
//			for (int i = 0; i < businessIdList.size(); i++) {
//
//				session.beginTransaction();
//				List list = session
//						.createQuery(
//								"select b.businessId, b.businessName, b.email, b.phone1, b.phone2 from Business b where b.businessId=:businessId")
//						.setLong("businessId", businessIdList.get(i)).list();
//
//				Iterator iterator = list.iterator();
//
//				while (iterator.hasNext()) {
//					Object[] obj = (Object[]) iterator.next();
//					businessValue.setBusinessId(Long.parseLong(String.valueOf(obj[0])));
//					businessValue.setBusinessName(String.valueOf(obj[1]));
//					businessValue.setEmail(String.valueOf(obj[2]));
//					businessValue.setPhone1(String.valueOf(obj[3]));
//					businessValue.setPhone2(String.valueOf(obj[4]));
//					businessList.add(businessValue);
//
//				}
//			}
//		} catch (HibernateException e) {
//			if (session.getTransaction() != null)
//				session.getTransaction().rollback();
//			logger.error("Buiness Not found");
//			e.printStackTrace();
//		} finally {
//			session.flush();
//			session.close();
//		}
//		return businessList;
//
//	}

	public Long getServiceListByServiceName(String serviceName) {
		logger.debug("Entering to getServiceListByServiceName");
		Session session = HibernateUtil.getSessionFactory().openSession();

		Long service = 0L;

		try {
			session.beginTransaction();
			List list = session.createQuery("select s.serviceId from Service s where s.serviceName=:serviceName")
					.setString("serviceName", serviceName).list();

			Iterator iterator = list.iterator();

			while (iterator.hasNext()) {

				service = (Long) iterator.next();

			}
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			logger.error("Service Id Not found");
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return service;

	}

	public List<Long> getBusineesIdFromServiceOrder(Long serviceId) {
		logger.debug("Entering to getBusineesName");
		// Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Long> businessIdList = new ArrayList<Long>();
		Long business =0L;
		try {
			session.beginTransaction();
			List list = session.createQuery("select o.businessId from ServiceOrder o where o.serviceId=:serviceId")
					.setLong("serviceId", serviceId).list();

			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {

			 business = (Long) iterator.next();
			businessIdList.add(business);

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
		return businessIdList;

	}

}
