/**
 * 
 */
package com.sagarmatha.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.sagarmatha.bean.Address;
import com.sagarmatha.bean.Business;
import com.sagarmatha.bean.Service;
import com.sagarmatha.bean.ServiceOrder;
import com.sagarmatha.util.HibernateUtil;

/**
 * @author jitendra
 *
 */
public class SearchService {
	private static final Logger logger = Logger.getLogger(SearchService.class);
	
//	 private static void doIndex() throws InterruptedException {
//	    //    Session session = HibernateUtil.getSession();
//		 Session session = HibernateUtil.getSessionFactory().openSession();
//	        FullTextSession fullTextSession = Search.getFullTextSession(session);
//	        fullTextSession.createIndexer().startAndWait();
//	         
//	        fullTextSession.close();
//	    }

	public List<Address> getBusineesByCity(String cityName) {
		logger.debug("Entering to getBusineesByCity");
	//	Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		// FullTextSession fullTextSession = Search.getFullTextSession(session);
		 
//		 QueryBuilder queryBuilder = fullTextSession.getSearchFactory().buildQueryBuilder().forEntity(Address.class).get();
//	        org.apache.lucene.search.Query luceneQuery = queryBuilder.keyword().onFields("city").matching(cityName).createQuery();
//	 
	        // wrap Lucene query in a javax.persistence.Query
//	        org.hibernate.Query fullTextQuery = fullTextSession.createFullTextQuery(luceneQuery, Address.class);
//	         
//	        List<Address> contactList = fullTextQuery.list();
//	         
//	        fullTextSession.close();
//	         
	     //   return contactList;
		return null;
//		List<Address> addressList = new ArrayList<Address>();
//
//		try {
//			session.beginTransaction();
//			List list = session.createQuery("from Address where city=:city").setString("city", cityName).list();
//
//			Iterator iterator = list.iterator();
//
//			while (iterator.hasNext()) {
//
//				addressList = (List<Address>) iterator.next();
//
//			}
//		} catch (HibernateException e) {
//			if (session.getTransaction() != null)
//				session.getTransaction().rollback();
//			logger.error("CityName Not found");
//			e.printStackTrace();
//		} finally {
//			session.flush();
//			session.close();
//		}
//		return addressList;

	}

	public List<Address> getBusineesByZipCode(int zipCode) {
		logger.debug("Entering to getBusineesByZipCode");
	//	Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Address> addressList = new ArrayList<Address>();

		try {
			session.beginTransaction();
			List list = session.createQuery("from Address where zipCode=:zipCode").setInteger("zipCode", zipCode)
					.list();

			Iterator iterator = list.iterator();

			while (iterator.hasNext()) {

				addressList = (List<Address>) iterator.next();

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
		return addressList;

	}

	public List<Business> getBusineesName(List<Address> addressList) {
		logger.debug("Entering to getBusineesName");
		//Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Business> businessList = new ArrayList<Business>();
		Business businessValue = new Business();

		try {
			for (int i = 0; i < addressList.size(); i++) {

				session.beginTransaction();
				List list = session.createQuery("from Business where businessId=:businessId")
						.setLong("businessId", addressList.get(i).getBusinessId()).list();

				Iterator iterator = list.iterator();

				while (iterator.hasNext()) {

					businessValue = (Business) iterator.next();
					businessList.add(businessValue);

				}
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

	public Long getServiceListByServiceName(String serviceName) {
		logger.debug("Entering to getServiceListByServiceName");
		//Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();

		Service service = new Service();

		try {
			session.beginTransaction();
			List list = session.createQuery("from Service where serviceName=:serviceName")
					.setString("serviceName", serviceName).list();

			Iterator iterator = list.iterator();

			while (iterator.hasNext()) {

				service = (Service) iterator.next();

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
		return service.getServiceId();

	}

	public List<ServiceOrder> getBusineesIdFromServiceOrder(Long serviceId) {
		logger.debug("Entering to getBusineesName");
		//Session session = HibernateUtil.getSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<ServiceOrder> businessList = new ArrayList<ServiceOrder>();

		try {
			session.beginTransaction();
			List list = session.createQuery("from ServiceOrder where serviceId=:serviceId")
					.setLong("serviceId", serviceId).list();

			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {

				businessList = (List<ServiceOrder>) iterator.next();

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
		return businessList;

	}

}
