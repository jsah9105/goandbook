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

import com.sagarmatha.bean.SearchBusiness;
import com.sagarmatha.bean.SellerAccount;
import com.sagarmatha.dao.SearchService;

/**
 * @author jitendra
 *
 */
@Path("/search")
public class SearchController {

	SearchService searchService = new SearchService();

	@POST
	@Path("/businessSearch")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SellerAccount> getBusinessRecord(SearchBusiness searchBusiness){
		
		List<Long> listOfBusinessIdbyAddress = new ArrayList<Long>();
		List<SellerAccount> businessList = new ArrayList<SellerAccount>();
		List<Long> listofbusinessId= new  ArrayList<Long>();
		List<SellerAccount> returnbusinessList = new ArrayList<SellerAccount>();
		List<Long> getBusinessId = new ArrayList<Long>();
		
		if(searchBusiness.getCity() !=null){
			listOfBusinessIdbyAddress =searchService.getBusineesByCity(searchBusiness.getCity());
		    businessList =	searchService.getBusineesName(listOfBusinessIdbyAddress);
		    
		    if(businessList.size() == 0){
		    Long serviceNameId =  searchService.getServiceListByServiceName(searchBusiness.getService());
			   if(serviceNameId != 0){
			    listofbusinessId =searchService.getBusineesIdFromServiceOrder(serviceNameId);
			    
			    for (int i = 0; i < businessList.size(); i++) {
		    		getBusinessId.add(Long.parseLong(businessList.get(i).getBusinessId()));
				}
			    
		    	listofbusinessId.retainAll(getBusinessId);
		    	returnbusinessList = searchService.getBusineesName(listofbusinessId);
		    	return returnbusinessList;
			    
			   }
			   else{
				   return returnbusinessList;
			   }
		    }
		}else if(searchBusiness.getZipCode() != 0){
			listOfBusinessIdbyAddress = searchService.getBusineesByZipCode(searchBusiness.getZipCode());
			businessList =	searchService.getBusineesName(listOfBusinessIdbyAddress);
			 if(businessList.size() == 0){
				    Long serviceId =  searchService.getServiceListByServiceName(searchBusiness.getService());
				    if(serviceId != 0){
				    	listofbusinessId =searchService.getBusineesIdFromServiceOrder(serviceId);
				    	
				    	for (int i = 0; i < businessList.size(); i++) {
				    		getBusinessId.add(Long.parseLong(businessList.get(i).getBusinessId()));
						}
				    	
				    	listofbusinessId.retainAll(getBusinessId);
				    	returnbusinessList = searchService.getBusineesName(listofbusinessId);
				    	return returnbusinessList;
				    }
				    else{
				    	return returnbusinessList;
				    }
				    
				    }
		}
		return businessList;
	}
	
}
