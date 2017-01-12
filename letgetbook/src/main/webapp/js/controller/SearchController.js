'use strict';
   angular.module('mainApp')
   .service('UserService')
   .controller('SearchController',['UserService', '$location', '$rootScope',function(UserService, $location, $rootScope){
	   var vm = this;
	   
       vm.searchform = searchform;
      
       $rootScope.searchResponse = [];
       
    
       
       
       
       function searchform() {
           vm.dataLoading = true;
           UserService.SearchResult(vm.search)
               .then(function (response) {
            	//  if(response.type = "searchResult"){
            	   	$rootScope.searchResponse = response;
            	   	debugger;
                      // FlashService.Success('Registration successful', true);
            	   	
                       $location.path('/search');
//            	   }else{
//            		   $rootScope.LoginResponse = response;
//            		   $location.path('/vendor');
//            	   }
               });
       }
     
   }]);