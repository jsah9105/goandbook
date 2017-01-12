<div style="width: 50%; margin: auto;">
    <h2> Vendor Registration</h2>
    <form name="form" ng-submit="vm.vendorRegister()" role="form">

    	 <div class="form-group" ng-class="{ 'has-error': form.companyName.$dirty && form.companyName.$error.required }">
            <label for="companyName">Company Name</label>
            <input type="text" name="businessName" id="companyName" class="form-control" ng-model="vm.vendor.companyName" required />
            <span ng-show="form.companyName.$dirty && form.companyName.$error.required" class="help-block">Company name is required</span>
        </div>
        
        <div class="form-group" ng-class="{ 'has-error': form.userName.$dirty && form.userName.$error.required }">
            <label for="userName">Username</label>
            <input type="text" name="userName" id="userName" class="form-control" ng-model="vm.vendor.userName" required />
            <span ng-show="form.userName.$dirty && form.userName.$error.required" class="help-block">Username is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
            <label for="password"> New Password</label>
            <input type="password" name="password" id="password" class="form-control" ng-model="vm.vendor.password" required />
            <span ng-show="form.password.$dirty && form.password.$error.required" class="help-block">Password is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
            <label for="password"> Confirm Password</label>
            <input type="password" name="password" id="password" class="form-control" ng-model="vm.vendor.password" required />
            <span ng-show="form.password.$dirty && form.password.$error.required" class="help-block">Password is required</span>
        </div>
     
         <h2> Address</h2>
        <div class="form-group" ng-class="{ 'has-error': form.street1.$dirty && form.street1.$error.required }">
            <label for="street1">Street1</label>
            <input type="text" name="address1" id="street1" class="form-control" ng-model="vm.vendor.street1" required />
            <span ng-show="form.street1.$dirty && form.street1.$error.required" class="help-block">Street name is required</span>
        </div>
        <div class="form-group" >
            <label for="street2">Street2</label>
            <input type="text" name="address2" id="street2" class="form-control" ng-model="vm.vendor.street2"  />
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.apartment.$dirty && form.apartment.$error.required }">
            <label for="apartment">Apartment No./House No.</label>
            <input type="text" name="apartment" id="street2" class="form-control" ng-model="vm.vendor.apartment" required />
            <span ng-show="form.apartment.$dirty && form.apartment.$error.required" class="help-block">Apartment or House number is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.city.$dirty && form.city.$error.required }">
            <label for="city">City</label>
            <input type="text" name="city" id="city" class="form-control" ng-model="vm.vendor.city" required />
            <span ng-show="form.city.$dirty && form.city.$error.required" class="help-block">City is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.state.$dirty && form.state.$error.required }">
            <label for="state">State</label>
            <input type="text" name="state" id="state" class="form-control" ng-model="vm.vendor.state" required />
            <span ng-show="form.state.$dirty && form.state.$error.required" class="help-block">State is required</span>
        </div>
        <div class="form-group" >
            <label for="provision">Provision</label>
            <input type="text" name="provision" id="provision" class="form-control" ng-model="vm.vendor.provision"  />
        </div>
        <div class="form-group" >
            <label for="zipcode">ZipCode </label>
            <input type="text" name="zipCode" id="zipcode" class="form-control" ng-model="vm.vendor.zipCode"  />
        </div>
        <div class="form-group" >
            <label for="postalCode">Postal Code</label>
            <input type="text" name="postalCode" id="postalCode" class="form-control" ng-model="vm.vendor.postalCode" />
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.zpostalCode.$dirty && form.postalCode.$error.required }">
            <label for="country">Country</label>
            <input type="text" name="country" id="country" class="form-control" ng-model="vm.vendor.country" required />
             <span ng-show="form.country.$dirty && form.country.$error.required" class="help-block">Country is required</span> 
        </div>
      
         <h2> Owner Information</h2>
         <div class="form-group" ng-class="{ 'has-error': form.firstName.$dirty && form.firstName.$error.required }">
            <label for="username">First name</label>
            <input type="text" name="firstName" id="firstName" class="form-control" ng-model="vm.vendor.firstName" required />
            <span ng-show="form.firstName.$dirty && form.firstName.$error.required" class="help-block">First name is required</span>
        </div>
         <div class="form-group" >
            <label for="middleName">Middle name</label>
            <input type="text" name="middleName" id="middleName" class="form-control" ng-model="vm.vendor.middleName" />
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.lastName.$dirty && form.lastName.$error.required }">
            <label for="username">Last name</label>
            <input type="text" name="lastName" id="Text1" class="form-control" ng-model="vm.vendor.lastName" required />
            <span ng-show="form.lastName.$dirty && form.lastName.$error.required" class="help-block">Last name is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.dateOfBirth.$dirty && form.dateOfBirth.$error.required }">
            <label for="dateOfBirth">Date Of Birth</label>
            <input type="text" name="dateOfBirth" id="dateOfBirth" class="form-control" ng-model="vm.vendor.dateOfBirth" required />
            <span ng-show="form.dateOfBirth.$dirty && form.dateOfBirth.$error.required" class="help-block">Date of Birth is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.panNumber.$dirty && form.panNumber.$error.required }">
            <label for="panNumber">Pan Number/ Registration Number</label>
            <input type="text" name="panNumber" id="panNumber" class="form-control" ng-model="vm.vendor.panNumber" required />
            <span ng-show="form.panNumber.$dirty && form.panNumber.$error.required" class="help-block">Street name is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.email.$dirty && form.email.$error.required }">
            <label for="email">Email</label>
            <input type="text" name="email" id="email" class="form-control" ng-model="vm.vendor.email" required />
            <span ng-show="form.email.$dirty && form.email.$error.required" class="help-block">Email is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.phoneNumber.$dirty && form.phoneNumber.$error.required }">
            <label for="phoneNumber">Primary Phone Number</label>
            <input type="text" name="phoneNumber" id="phoneNumber" class="form-control" ng-model="vm.vendor.phoneNumber" required />
            <span ng-show="form.phoneNumber.$dirty && form.phoneNumber.$error.required" class="help-block">PhoneNumber is required</span>
        </div>        
        <div class="form-group" >
            <label for="office_phoneNo">Office Phone Number</label>
            <input type="text" name="phone1" id="office_phoneNo" class="form-control" ng-model="vm.vendor.office_phoneNo"  />
        </div>
        <div class="form-group" >
            <label for="modile_phoneNo">Mobile Number</label>
            <input type="text" name="phone2" id="modile_phoneNo" class="form-control" ng-model="vm.vendor.modile_phoneNo" />
        </div>
        
           <div class="form-actions">
            <button type="submit"  class="btn btn-primary">Register</button>
            <a href="#/" class="btn btn-link">Cancel</a>
        </div>
    </form>
</div>