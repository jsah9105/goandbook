<section id="section1">

	<div class="container">
		<div style="width: 50%; margin: auto;">
			<h2 style="color: black;  margin-left: 5%;">Sign Up As</h2>
			
			<div class="form-actions" style="margin-left: 3%">
			<form name="form" ng-submit="vm.customerRegister()" role="form">
        
        <div class="form-group" ng-class="{ 'has-error': form.custFirstName.$dirty && form.custFirstName.$error.required }">
            <label for="custFirstName"> First Name</label>
            <input type="text" style="margin-left: 9.5%;" name="custFirstName" id="custFirstName" class="form-control" ng-model="vm.customer.custFirstName" required />
            <span ng-show="form.custFirstName.$dirty && form.custFirstName.$error.required" class="help-block">First name is required</span>
        </div>
        <div class="form-group" >
            <label for="custMiddleName">Middle Name</label>
            <input type="text" style="margin-left: 7%;" name="custMiddleName" id="custMiddleName" class="form-control" ng-model="vm.customer.custMiddleName"  />
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.custLastName.$dirty && form.custLastName.$error.required }">
            <label for="custLastName"> Last Name</label>
            <input type="text"  style="margin-left: 9.5%;" name="custFirstName" id="custLastName" class="form-control" ng-model="vm.customer.custLastName" required />
            <span ng-show="form.custLastName.$dirty && form.custLastName.$error.required" class="help-block">Last name is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.username.$dirty && form.userName.$error.required }">
            <label for="userName">Username</label>
            <input type="text"  style="margin-left: 10%;" name="username" id="userName" class="form-control" ng-model="vm.customer.userName" required />
            <span ng-show="form.username.$dirty && form.userName.$error.required" class="help-block">Username is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
            <label for="password">Password</label>
            <input type="password" style="margin-left: 11%;" name="password" id="password" class="form-control" ng-model="vm.customer.password" required />
            <span ng-show="form.password.$dirty && form.password.$error.required" class="help-block">Password is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.phone.$dirty && form.phone.$error.required }">
            <label for="phone">Phone Number</label>
            <input type="text" style="margin-left: 5%;" name="phone" id="phone" class="form-control" ng-model="vm.customer.phone" required />
            <span ng-show="form.phone.$dirty && form.phone.$error.required" class="help-block">Phone Number is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.email.$dirty && form.email.$error.required }">
            <label for="email">Email</label>
            <input type="email" style="margin-left: 15%;" name="email" id="email" class="form-control" ng-model="vm.customer.email" required />
            <span ng-show="form.email.$dirty && form.email.$error.required" class="help-block">Email is required</span>
        </div>
         
        <div class="form-actions" >
            <button type="submit"  class="btn btn-primary" style="width: 25%; height: 40px; margin-left: 20%">Customer Register</button>
           
          
            <br>
            
            
        </div>
        <div>
            <button class="btn btn-primary" style="width: 25%; height: 40px; margin-left: 20%; margin-top: 2%; "><a href="#/" class="btn btn-link" style="color: white; ">Cancel</a></button>
        </div>
        
        </form>
			
				
			</div>
			<div class="form-actions" style="margin: auto; margin-left: 3% ;margin-top: 2%;">
				<button class="btn btn-primary" style="width: 25%; height: 40px;  margin-left: 20% ">
					<a href="#sellerpersonalInfo" class="btn btn-link" style="color: white;">Business</a>
				</button>
			</div>
			
			</div>

		</div>
	</div>
</section>