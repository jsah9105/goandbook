'use strict';
   angular.module('mainApp')
   .service('UserService')
   .controller('LoginController',['UserService', '$location', '$rootScope',function(UserService, $location, $rootScope){
	   var vm = this;
	   
       vm.signInUser = signInUser;
       vm.searchform = searchform;
       
       $rootScope.LoginResponse = [];
       
    
       
       function signInUser() {
           vm.dataLoading = true;
           UserService.LogInUser(vm.login)
               .then(function (response) {
            	  if(response.type = "seller"){
            	   	$rootScope.LoginResponse = response;
            	   	debugger;
                      // FlashService.Success('Registration successful', true);
            	   	
                       $location.path('/seller');
            	   }else{
            		   $rootScope.LoginResponse = response;
            		   $location.path('/vendor');
            	   }
               });
       }
       
       function searchform() {
           vm.dataLoading = true;
           UserService.SearchResult(vm.search)
               .then(function (response) {
            	  if(response.type = "searchResult"){
            	   	$rootScope.LoginResponse = response;
            	   	debugger;
                      // FlashService.Success('Registration successful', true);
            	   	
                       $location.path('/search');
            	   }else{
            		   $rootScope.LoginResponse = response;
            		   $location.path('/vendor');
            	   }
               });
       }
     
   }]);
    