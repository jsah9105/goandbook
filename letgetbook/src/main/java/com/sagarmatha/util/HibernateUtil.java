/**
 * 
 */
package com.sagarmatha.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * @author Owner
 *
 */
public class HibernateUtil {

	 
  
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
  
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
  
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
	
//	private static SessionFactory sessionFactory = null;  
//    private static ServiceRegistry serviceRegistry = null;  
//       
//    private static SessionFactory configureSessionFactory() throws HibernateException {  
//        Configuration configuration = new Configuration();  
//        configuration.configure();  
//         
//        Properties properties = configuration.getProperties();
//         
//        serviceRegistry = new ServiceRegistryBuilder().applySettings(properties).buildServiceRegistry();          
//        sessionFactory = configuration.buildSessionFactory(serviceRegistry);  
//         
//        return sessionFactory;  
//    }
//     
//    // We need to configure session factory once. 
//    // Rest of the time we will get session using the same.
//    static {
//        configureSessionFactory();
//    }
//     
//    private HibernateUtil() {}
//     
//    public static Session getSession() {
//        return sessionFactory.openSession();
//    }
}
