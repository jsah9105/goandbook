<div style="width: 50%; margin: auto;">
    <h2>Registration</h2>
    <form name="form" ng-submit="vm.sellerRegister()" role="form">

    	     
        <div class="form-group" ng-class="{ 'has-error': form.userName.$dirty && form.userName.$error.required }">
            <label for="userName">Username</label>
            <input type="text" name="userName" id="userName" class="form-control" ng-model="vm.seller.userName" required />
            <span ng-show="form.userName.$dirty && form.userName.$error.required" class="help-block">Username is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
            <label for="password">Password</label>
            <input type="password" name="password" id="password" class="form-control" ng-model="vm.seller.password" required />
            <span ng-show="form.password.$dirty && form.password.$error.required" class="help-block">Password is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
            <label for="password"> Confirm Password</label>
            <input type="password" name="password" id="password" class="form-control" ng-model="vm.seller.password" required />
            <span ng-show="form.password.$dirty && form.password.$error.required" class="help-block">Password is required</span>
        </div>
     
         <h2> Address</h2>
        <div class="form-group" ng-class="{ 'has-error': form.street1.$dirty && form.street1.$error.required }">
            <label for="street1">Street1</label>
            <input type="text" name="street1" id="street1" class="form-control" ng-model="vm.seller.street1" required />
            <span ng-show="form.street1.$dirty && form.street1.$error.required" class="help-block">Street name is required</span>
        </div>
        <div class="form-group" >
            <label for="street2">Street2</label>
            <input type="text" name="street2" id="street2" class="form-control" ng-model="vm.seller.street2"  />
        </div>
        <div class="form-group" >
            <label for="apartment">Apartment No./House No.</label>
            <input type="text" name="apartment" id="street2" class="form-control" ng-model="vm.seller.apartment" />
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.city.$dirty && form.city.$error.required }">
            <label for="city">City</label>
            <input type="text" name="city" id="city" class="form-control" ng-model="vm.seller.city" required />
            <span ng-show="form.city.$dirty && form.city.$error.required" class="help-block">City is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.state.$dirty && form.state.$error.required }">
            <label for="state">State</label>
            <input type="text" name="state" id="state" class="form-control" ng-model="vm.seller.state" required />
            <span ng-show="form.state.$dirty && form.state.$error.required" class="help-block">State is required</span>
        </div>
        <div class="form-group" >
            <label for="provision">Provision</label>
            <input type="text" name="provision" id="provision" class="form-control" ng-model="vm.seller.provision"  />
        </div>
        <div class="form-group" >
            <label for="zipcode">ZipCode </label>
            <input type="text" name="zipcode" id="zipcode" class="form-control" ng-model="vm.seller.zipCode"  />
        </div>
        <div class="form-group" >
            <label for="postalCode">Postal Code</label>
            <input type="text" name="postalCode" id="postalCode" class="form-control" ng-model="vm.seller.postalCode" />
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.country.$dirty && form.country.$error.required }">
            <label for="country">Country</label>
            <input type="text" name="country" id="country" class="form-control" ng-model="vm.seller.country" required />
             <span ng-show="form.country.$dirty && form.country.$error.required" class="help-block">Country is required</span> 
        </div>
      
         <h2> Personal Information</h2>
         <div class="form-group" ng-class="{ 'has-error': form.firstName.$dirty && form.firstName.$error.required }">
            <label for="username">First name</label>
            <input type="text" name="firstName" id="firstName" class="form-control" ng-model="vm.seller.firstName" required />
            <span ng-show="form.firstName.$dirty && form.firstName.$error.required" class="help-block">First name is required</span>
        </div>
         <div class="form-group" >
            <label for="middleName">Middle name</label>
            <input type="text" name="middleName" id="middleName" class="form-control" ng-model="vm.seller.middleName" />
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.lastName.$dirty && form.lastName.$error.required }">
            <label for="username">Last name</label>
            <input type="text" name="lastName" id="Text1" class="form-control" ng-model="vm.seller.lastName" required />
            <span ng-show="form.lastName.$dirty && form.lastName.$error.required" class="help-block">Last name is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.dateOfBirth.$dirty && form.dateOfBirth.$error.required }">
            <label for="dateOfBirth">Date Of Birth</label>
            <input type="text" name="dateOfBirth" id="dateOfBirth" class="form-control" ng-model="vm.seller.dateOfBirth" required />
            <span ng-show="form.dateOfBirth.$dirty && form.dateOfBirth.$error.required" class="help-block">Date of Birth is required</span>
        </div>
        
        <div class="form-group" ng-class="{ 'has-error': form.email.$dirty && form.email.$error.required }">
            <label for="email">Email</label>
            <input type="text" name="email" id="email" class="form-control" ng-model="vm.seller.email" required />
            <span ng-show="form.email.$dirty && form.email.$error.required" class="help-block">Email is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.phoneNumber.$dirty && form.phoneNumber.$error.required }">
            <label for="phoneNumber">Primary Phone Number</label>
            <input type="text" name="phoneNumber" id="phoneNumber" class="form-control" ng-model="vm.seller.phoneNumber" required />
            <span ng-show="form.phoneNumber.$dirty && form.phoneNumber.$error.required" class="help-block">PhoneNumber is required</span>
        </div>        
        <div class="form-group" >
            <label for="office_phoneNo">Office Phone Number</label>
            <input type="text" name="office_phoneNo" id="office_phoneNo" class="form-control" ng-model="vm.seller.office_phoneNo"  />
        </div>
        <div class="form-group" >
            <label for="modile_phoneNo">Mobile Number</label>
            <input type="text" name="modile_phoneNo" id="modile_phoneNo" class="form-control" ng-model="vm.seller.modile_phoneNo" />
        </div>
        
           <div class="form-actions">
            <button type="submit"  class="btn btn-primary">Register</button>
            <a href="#/" class="btn btn-link">Cancel</a>
        </div>
    </form>
</div>