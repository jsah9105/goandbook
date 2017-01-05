/**
 * 
 */
package com.sagarmatha.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sagarmatha.bean.Address;
import com.sagarmatha.bean.Business;
import com.sagarmatha.bean.SearchBusiness;
import com.sagarmatha.bean.ServiceOrder;
import com.sagarmatha.dao.SearchService;

/**
 * @author jitendra
 *
 */
@Path("/search")
public class SearchController {
	
	SearchService searchService = new SearchService();
	
	@POST
	@Path("/businessInformation")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Business> getBusinessRecord(SearchBusiness searchBusiness){
		List<Address> listOfAddress = new ArrayList<Address>();
		List<Business> businessList = new ArrayList<Business>();
		if(searchBusiness.getCity() !=null){
			
			listOfAddress =searchService.getBusineesByCity(searchBusiness.getCity());
		    businessList =	searchService.getBusineesName(listOfAddress);
		    
		    if(businessList.size() == 0){
		    Long serviceName =  searchService.getServiceListByServiceName(searchBusiness.getService());
		    List<ServiceOrder> businessIdList =searchService.getBusineesIdFromServiceOrder(serviceName);
		   
		    if(listOfAddress.size() >= businessIdList.size() ){
		    	for(Address user1 : listOfAddress) {
		    	    for(ServiceOrder user2 : businessIdList) {
		    	        if(user1.getBusinessId().equals(user2.getBusinessId())) {
		    	            if(!user1.getBusinessId().equals(user2.getBusinessId())) {
		    	            	//businessList.add(user2);
		    	            }
		    	        }
		    	    }
		    	}
		    }else{
		    	System.out.println("Location Not found");
		    }
		    
		    }
			
			
		}else if(searchBusiness.getZipCode() != 0){
			listOfAddress = searchService.getBusineesByZipCode(searchBusiness.getZipCode());
			businessList =	searchService.getBusineesName(listOfAddress);
			 if(businessList.size() == 0){
				    Long serviceName =  searchService.getServiceListByServiceName(searchBusiness.getService());
				    List<ServiceOrder> businessIdList =searchService.getBusineesIdFromServiceOrder(serviceName);
				   
				    if(listOfAddress.size() >= businessIdList.size() ){
				    	for(Address user1 : listOfAddress) {
				    	    for(ServiceOrder user2 : businessIdList) {
				    	        if(user1.getBusinessId().equals(user2.getBusinessId())) {
				    	            if(!user1.getBusinessId().equals(user2.getBusinessId())) {
				    	            	//businessList.add(user2);
				    	            }
				    	        }
				    	    }
				    	}
				    }else{
				    	System.out.println("Location Not found");
				    }
				    
				    }
			 
		}else{
			System.out.println("Location missing");
		}
		
		
		if((searchBusiness.getAddress() != null) 
				&& ((!searchBusiness.getService().isEmpty()) || (searchBusiness.getService() !=null))
				&& ((!searchBusiness.getDate().isEmpty()) || (searchBusiness.getDate() != null)) 
				&& ((!searchBusiness.getTime1()
						.isEmpty()) || (searchBusiness.getTime1() !=null))){
		
		}
//		else if (searchBook.getLocation() != null) {
//			String[] trim = searchBook.getLocation().split(",");
//			String city = trim[0].substring(0, trim[0].length()-1);
//			if ((!city.isEmpty()) ||(city != null) ) {
//				bookList = retriveServices.bookSearchByCity(city);
//				return bookList;
//			} else if ((!searchBook.getName().isEmpty()) || (searchBook.getName() !=null)) {
//				bookList = retriveServices.bookSearchByName(searchBook, city);
//				return bookList;
//			} else if ((!searchBook.getIsbn().isEmpty()) || (searchBook.getIsbn() != null)) {
//				bookList = retriveServices.bookSearchByISBN(searchBook, city);
//				return bookList;
//			} else if ((!searchBook.getGrade().isEmpty()) || (searchBook.getGrade() !=null)) {
//				bookList = retriveServices.bookSearchByGarde(searchBook, city);
//				return bookList;
//			}
//		} else {
//			if ((!searchBook.getName().isEmpty()) || (searchBook.getName() !=null)) {
//				bookList = retriveServices.getBookByName(searchBook);
//				return bookList;
//			} else if ((!searchBook.getIsbn().isEmpty()) || (searchBook.getIsbn() != null)) {
//				bookList = retriveServices.getBookByISBN(searchBook);
//				return bookList;
//			} else if ((!searchBook.getGrade().isEmpty()) || (searchBook.getGrade() !=null)) {
//				bookList = retriveServices.getBookByGrade(searchBook);
//				return bookList;
//			} else {
//				System.out.println("There is no books in list.");
//			}
//		}
//		
		return businessList;

		
	}
	
	

}
