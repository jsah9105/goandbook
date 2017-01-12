/*
    'use strict';
 
    angular
        .module('mainApp')
        .factory('UserService', UserService);
 
    UserService.$inject = ['$http'];
    function UserService($http) {
        var service = {};
 
        service.GetAll = GetAll;
        service.GetById = GetById;
        service.GetByUsername = GetByUsername;
        service.Create = Create;
        service.Update = Update;
        service.Delete = Delete;
 
        return service;
 
        function GetAll() {
            return $http.get('http://localhost:8080/hamrocoupons/rest/countries/users').then(handleSuccess, handleError('Error getting all users'));
        }
 
        function GetById(id) {
            return $http.get('http://localhost:8080/hamrocoupons/rest/countries/users/' + id).then(handleSuccess, handleError('Error getting user by id'));
        }
 
        function GetByUsername(username) {
            return $http.get('http://localhost:8080/hamrocoupons/rest/countries/users/' + username).then(handleSuccess, handleError('Error getting user by username'));
        }
 
        function Create(user) {
        	var method ="";
        	var url ="";
        	method ="POST";
        	url:'rest/countries/users';
            return $http({
            	method:method,
            	url:url,
            	data: angular.toJson(user),
            	headers : {  
                    'Content-Type' : 'application/json'  
                } 
            }).then(handleSuccess, handleError('Error creating user'));
        }
 
        function Update(user) {
            return $http.put('http://localhost:8080/hamrocoupons/rest/countries/users/' + user.id, user).then(handleSuccess, handleError('Error updating user'));
        }
 
        function Delete(id) {
            return $http.delete('http://localhost:8080/hamrocoupons/rest/countries/users/' + id).then(handleSuccess, handleError('Error deleting user'));
        }
 
        // private functions
 
        function handleSuccess(res) {
            return res.data;
        }
 
        function handleError(error) {
            return function () {
                return { success: false, message: error };
            };
        }
    }
 
*/