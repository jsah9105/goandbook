<div style="width: 50%; margin: auto;">
    <h2> Vendor Registration</h2>
    <form name="form" ng-submit="vm.itemRegister()" role="form" enctype="multipart/form-data">
		
    	 <div class="form-group" ng-class="{ 'has-error': form.companyName.$dirty && form.companyName.$error.required }">
            <label for="companyName">Company Name</label>
            <input type="text" name="companyName" id="companyName" class="form-control" ng-model="vm.item.companyName" required />
            <span ng-show="form.companyName.$dirty && form.companyName.$error.required" class="help-block">Company name is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.itemName.$dirty && form.itemName.$error.required }">
            <label for="itemName">Item name</label>
            <input type="text" name="itemName" id="itemName" class="form-control" ng-model="vm.item.itemName" required />
            <span ng-show="form.itemName.$dirty && form.itemName.$error.required" class="help-block">Item name is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.dollarPrice.$dirty && form.dollarPrice.$error.required }">
            <label for="dollarPrice">Dollar Price</label>
            <input type="text" name="dollarPrice" id="dollarPrice" class="form-control" ng-model="vm.item.dollarPrice" required />
            <span ng-show="form.dollarPrice.$dirty && form.dollarPrice.$error.required" class="help-block">Dollar Price is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.differentPrice.$dirty && form.differentPrice.$error.required }">
            <label for="differentPrice">Rupess Price</label>
            <input type="text" name="differentPrice" id="differentPrice" class="form-control" ng-model="vm.item.differentPrice" required />
            <span ng-show="form.differentPrice.$dirty && form.differentPrice.$error.required" class="help-block">Rupees Price is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.description.$dirty && form.description.$error.required }">
            <label for="description">Item Description</label>
            <input type="text" name="description" id="description" class="form-control" ng-model="vm.item.description" required />
            <span ng-show="form.description.$dirty && form.description.$error.required" class="help-block">Item Description is required</span>
        </div>
     	 <div class="form-group" ng-class="{ 'has-error': form.disPercentage.$dirty && form.disPercentage.$error.required }">
            <label for="disPercentage">Discount Percentage</label>
            <input type="text" name="disPercentage" id="disPercentage" class="form-control" ng-model="vm.item.disPercentage" required />
            <span ng-show="form.disPercentage.$dirty && form.disPercentage.$error.required" class="help-block">Discount Percentage is required</span>
        </div>
         <div class="form-group" ng-class="{ 'has-error': form.startDate.$dirty && form.startDate.$error.required }">
            <label for="startDate">Deal Start Date</label>
            <input type="date" name="startDate" id="startDate" class="form-control" ng-model="vm.item.startDate" required />
            <span ng-show="form.startDate.$dirty && form.startDate.$error.required" class="help-block">Deal Start Date is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.endDate.$dirty && form.endDate.$error.required }">
            <label for="endDate">Deal End Date</label>
            <input type="date" name="endDate" id="endDate" class="form-control" ng-model="vm.item.endDate" required />
            <span ng-show="form.endDate.$dirty && form.endDate.$error.required" class="help-block">Deal End Date is required</span>
        </div>
         <div class="form-group" >
            <label for="image1">Item Image 1</label>
            <input type="file" name="file" id="file" class="form-control"  file-model="vm.item.myFile"  />
        </div> 
         <!-- <div class="form-group"  ngf-select ng-model="vm.item.file" ngf-pattern="'image/*'" ngf-accept="'image/*'" ngf-max-size="20MB" ngf-resize="{width:100,height:100}">
           Select
        </div> -->
         <div >
            <label for="image2">Item Image 2</label>
            <input type="file" name="image2" id="image2" class="form-control" fileread="vm.item.image2"  />
        </div>
       	<div >
            <label for="image3">Item Image 3</label>
            <input type="file" name="image3" id="image3" class="form-control" fileread="vm.item.image3" />
        </div>
        <div class="form-group" >
            <label for="image4">Item Image 4</label>
            <input type="file" name="image4" id="image4" class="form-control" fileread="vm.item.image4"  />
        </div>
         <h2> Address</h2>
        <div class="form-group" ng-class="{ 'has-error': form.street1.$dirty && form.street1.$error.required }">
            <label for="street1">Street1</label>
            <input type="text" name="street1" id="street1" class="form-control" ng-model="vm.item.street1" required />
            <span ng-show="form.street1.$dirty && form.street1.$error.required" class="help-block">Street name is required</span>
        </div>
        <div class="form-group" >
            <label for="street2">Street2</label>
            <input type="text" name="street2" id="street2" class="form-control" ng-model="vm.item.street2"  />
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.apartment.$dirty && form.apartment.$error.required }">
            <label for="apartment">Apartment No./House No.</label>
            <input type="text" name="apartment" id="street2" class="form-control" ng-model="vm.item.apartment" required />
            <span ng-show="form.apartment.$dirty && form.apartment.$error.required" class="help-block">Apartment or House number is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.city.$dirty && form.city.$error.required }">
            <label for="city">City</label>
            <input type="text" name="city" id="city" class="form-control" ng-model="vm.item.city" required />
            <span ng-show="form.city.$dirty && form.city.$error.required" class="help-block">City is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.state.$dirty && form.state.$error.required }">
            <label for="state">State</label>
            <input type="text" name="state" id="state" class="form-control" ng-model="vm.item.state" required />
            <span ng-show="form.state.$dirty && form.state.$error.required" class="help-block">State is required</span>
        </div>
        <div class="form-group" >
            <label for="provision">Provision</label>
            <input type="text" name="provision" id="provision" class="form-control" ng-model="vm.item.provision"  />
        </div>
        <div class="form-group" >
            <label for="zipcode">ZipCode </label>
            <input type="text" name="zipcode" id="zipcode" class="form-control" ng-model="vm.item.zipCode"  />
        </div>
        <div class="form-group" >
            <label for="postalCode">Postal Code</label>
            <input type="text" name="postalCode" id="postalCode" class="form-control" ng-model="vm.item.postalCode" />
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.zpostalCode.$dirty && form.postalCode.$error.required }">
            <label for="country">Country</label>
            <input type="text" name="country" id="country" class="form-control" ng-model="vm.item.country" required />
             <span ng-show="form.country.$dirty && form.country.$error.required" class="help-block">Country is required</span> 
        </div>
        
           <div class="form-actions">
            <button type="submit"  class="btn btn-primary">Submit</button>
            <a href="#/" class="btn btn-link">Cancel</a>
        </div>
    </form>
</div>