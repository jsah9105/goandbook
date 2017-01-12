'use strict';
   angular.module('mainApp')
   .service('UserService')
   .controller('GetAllDataController',['UserService', '$location', '$rootScope','displayFunction',function(UserService, $location, $rootScope,displayFunction){
	   var vm = this;
	  
	   $rootScope.displayFunction = displayFunction.data;
  
   }]);
    