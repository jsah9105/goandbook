
 var mainApp = angular.module('mainApp', ['ngRoute']);
mainApp.config(
        function($routeProvider, $httpProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'view/home.jsp',
            controller: 'LoginController',
            controllerAs:'vm'
        })
        .when('/viewStudents', {
            templateUrl: 'view/viewStudents.jsp',
            controller: 'studentController'
        })
        .when('/help', {
            templateUrl: 'view/viewStudents.jsp',
            controller: 'studentController'
        })
        .when('/signin', {
            templateUrl: 'view/signUpLogin.jsp',
            controller: 'LoginController',
            controllerAs:'vm'
        })
        .when('/search', {
            templateUrl: 'view/bookBuyer.jsp',
            controller: 'LoginController',
            controllerAs:'vm'
        })
        .when('/vendor', {
            templateUrl: 'view/venderInfo.jsp',
            controller: 'RegisterController',
            controllerAs:'vm'
            
        })
        .when('/cart', {
            templateUrl: 'view/itemDetail.jsp',
            controller: 'RegisterController',
            controllerAs:'vm'
        })
        .when('/signupPage', {
            templateUrl: 'view/signupPage.jsp',
        })
         .when('/sellerpersonalInfo', {
            templateUrl: 'view/signup.jsp',
            controller: 'RegisterController',
            controllerAs:'vm'
        })
        .when('/selleraddress', {
            templateUrl: 'view/selleraddress.jsp',
            controller: 'RegisterController',
            controllerAs:'vm'
        })
        .when('/forgetPassword', {
            templateUrl: 'view/forgetPassword.jsp',
        })
         .when('/seller', {
            templateUrl: 'view/sellerInfo.jsp',
            controller: 'RegisterController',
            controllerAs:'vm'
        })
        .when('/successful', {
            templateUrl: 'view/image.jsp',
           
        })
        .when('/contact', {
            templateUrl: 'view/contact.jsp',
           
        })
        .otherwise({
            redirectTo: '/'
        });
   
    
});

