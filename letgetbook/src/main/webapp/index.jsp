    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html ng-app="mainApp">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Index</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
 	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- Custom CSS -->
    <style>
body {
	padding-top: 70px;
	/* Required padding for .navbar-fixed-top. Remove if using .navbar-static-top. Change if height of navigation changes. */
}

#section2 {
	background: #000000;
	background: -webkit-linear-gradient(#fdcc52, #fdc539);
	background: linear-gradient(#000000, #2A2425);
	height: auto;
}

.form-signin {
	max-width: 100em;
	margin-top: 2em
}

.form-control {
	display: inline-block;
	width: 12em;
}

#section1 {
	background-image: url(img/book.jpg);
	background-size: cover;
	background-repeat: no-repeat;
	background-position: center center;
	background-attachment: fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	height: 44em;
}

.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 200%;
}
</style>
<link rel="stylesheet" media="mediatype and|not|only (media feature)" href="mystylesheet.css">
<script type="text/javascript">
	$('.carousel').carousel({
		interval : 3000, //changes the speed
		pause : 'false'
	})
</script>

</head>

<body id="mainBody" style="font-family:Century Gothic;" >
<header id="header">
    <!-- Navigation -->
    <nav  class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div  class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                 <a  class="navbar-brand " href="#">WebSite Name </a>
            </div>
           
         
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div  class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav ">
                <li class="active">
                        <a href="#">HOME</a>
                    </li>
                    <li>
                        <a href="#">ABOUT</a>
                    </li>
                    <li>
                        <a href="#contact">CONTACT</a>
                    </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                    <li><a href="#signupPage"><span class="glyphicon glyphicon-user"></span> SIGN UP</a></li>
                    <li>
                        <a href="#signin"><span class="glyphicon glyphicon-log-in"></span> LOGIN </a>
                    </li>
                     <li>
                        <a href="#cart"><span class="glyphicon glyphicon-shopping-cart"></span> CART</a>
                    </li>
                    <li>
                        <a href="#section2"><span class="glyphicon glyphicon-search"></span> SEARCH</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
         
    </nav>
 </header>
	
	<div>
      
        <ng-view> </ng-view>
      </div>
  
     
     
     
     

    	<div class="container">
    		<div class="row">
        		<!-- Container (Services Section) -->
<div class="container-fluid text-center">
  <h2>SERVICES</h2>
  <h4>What we offer</h4>
  <br>
  <div class="row">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-off"></span>
      <h4>POWER</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-heart"></span>
      <h4>LOVE</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-lock"></span>
      <h4>JOB DONE</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
  </div>
  <br><br>
  <div class="row">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-leaf"></span>
      <h4>GREEN</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-certificate"></span>
      <h4>CERTIFIED</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-wrench"></span>
      <h4 style="color:#303030;">HARD WORK</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
  </div>
</div>
       		</div>
    	</div>



	<div>
		<h3 style="text-align: center;margin-top: 2%">© Copyright Nepits 2016</h3>
	</div>    
	
	
	
	
 
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.7/angular.js"> </script>    
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.7/angular-route.js"></script> 
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.7/angular-resource.js"></script> 
      <script type="text/javascript" src="js/app.js"></script>
   	  <script type="text/javascript" src="js/controller/MainController.js"></script>
      <script type="text/javascript" src="js/controller/RegisterController.js"></script>
      <script type="text/javascript" src="js/controller/SearchController.js"></script>
      <script type="text/javascript" src="js/controller/LoginController.js"></script>
      <script type="text/javascript" src="js/controller/GetAllDataController.js"></script>
      <script type="text/javascript" src="js/services/mainservices.js"></script>
      <script type="text/javascript" src="js/services/services-storage.js"></script>
       
       <script type="text/javascript" src="js/jquery.js"></script>
   	   <script type="text/javascript" src="js/bootstrap.min.js"></script>
       <!-- <script src="https://maps.googleapis.com/maps/api/js"></script>
<script>
var myCenter = new google.maps.LatLng(41.878114, -87.629798);

function initialize() {
var mapProp = {
  center:myCenter,
  zoom:12,
  scrollwheel:false,
  draggable:false,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };

var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);

var marker = new google.maps.Marker({
  position:myCenter,
  });

marker.setMap(map);
}

google.maps.event.addDomListener(window, 'load', initialize);
</script> -->
       
       




       
       
    </body>
</html>


