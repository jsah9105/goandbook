<section id="section1">

<div class="container" >
<div style="width: 50%; margin: auto;">
 <div class="progress">
    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:50%">
      50% Complete (success)
    </div>
  </div>  
    <h2> Address</h2>
    <form name="form" ng-submit="vm.sellerAddress()" role="form">

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
      
         <input type="hidden" ng-model="vm.seller.id" value="{{sellerResponse}}"/>
        
           <div class="form-actions">
            <button type="submit"  class="btn btn-primary">Continue</button>
            <a href="#/" class="btn btn-link">Cancel</a>
        </div>
    </form>
</div>
</div>
</div>
</section>


