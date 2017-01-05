<section2>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
   <div class="container" style="width:100%;  margin-top:-2.8em;  padding-left:0px; padding-right:0px">
<br>     
    	<!-- Indicators -->
    	<ol class="carousel-indicators">
      		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      		<li data-target="#myCarousel" data-slide-to="1"></li>
     		 <li data-target="#myCarousel" data-slide-to="2"></li>
      		<li data-target="#myCarousel" data-slide-to="3"></li>
    	</ol>

      <div class="col-md-12 ">


    <form class="form-signin" style="margin-left: 23em" ng-submit="vm.searchform()" role="form" >
    <input type="text" class="form-control" ng-model="vm.search.search" placeholder="What kind of service do you want?" name="search">
      <input type="text" class="form-control" ng-model="vm.search.location" placeholder="Location" name="location" required autofocus>
        
      <input type="text" class="form-control" ng-model="vm.search.service" placeholder="Service"name="service"> 
      <input type="text" class="form-control" ng-model="vm.search.date" placeholder="Date" name="date">
      <input type="text" class="form-control" ng-model="vm.search.time1" placeholder="Start Time" name="time1">
      <input type="text" class="form-control" ng-model="vm.search.time2" placeholder="End Time" name="time2">
      <button class="btn  btn-success " style="width: 7em; display: inline-block" type="submit">
        <span class="glyphicon glyphicon-search"></span> Search </button>
    </form>
    <br>
  </div>


    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="img/01.jpg" alt="Chania" width="1358px" height="620px">
       
      </div>

      <div class="item">
        <img src="img/02.jpg" alt="Chania" width="1358px" height="620px">
        
      </div>
    
      <div class="item">
        <img src="img/03.jpg" alt="Flower" width="1358px" height="620px">
       
      </div>

      <div class="item">
        <img src="img/04.jpg" alt="Flower" width="1358px" height="620px">
        
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>




<section id="section1">
	<!-- Page Content -->
	<div class="container">

		<div class="row ">
			<div class="col-md-12 text-center">
				<h1
					style="margin-top: 5em; font-size: 42px; font-family: Century Gothic; color: #FDFDFD">Welcome
					to the ..... Book Store!</h1>
				<p
					style="color: #FDFDFD; font-size: 18px; font-family: Century Gothic; margin-bottom: 3em">We
					help you to buy and Sell any Books at reasonable Price!</p>
			</div>
			<div class="col-md-4"></div>
			<div class="col-md-6">
				<div class="table-responsive" style="border: none">
					<table class="table" cellpadding="-5em" style="border: none">
						<tr style="border: none">
							<td style="border: none">
								<button id="buyBook" onClick="location.href='BuyBook.html';"
									type="button" class="btn btn-success btn-lg ">
									<span class="glyphicon glyphicon-"></span>Buy Book
								</button>
							</td>
							<td style="border: none"><button id="sellBook" type="button"
									class="btn btn-success btn-lg ">Sell Book</button></td>
						</tr>
					</table>
				</div>

			</div>
		</div>
		<!-- /.row -->

	</div>
</section>
<!-- /.container -->
