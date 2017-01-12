<section id="section1">

	<div class="container" >
<div style="width: 50%; margin: auto;">
 <div class="progress">
    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:100%">
      100% Complete (success)
    </div>
   </div>
    <h2>Information</h2>
    <form name="form" ng-submit="vm.sellerInformation()" role="form">

    	     
        <div class="form-group" ng-class="{ 'has-error': form.userName.$dirty && form.userName.$error.required }">
            <label for="userName">Username</label>
            <input type="text" name="userName" id="userName" class="form-control" ng-model="vm.seller.userName" required />
            <span ng-show="form.userName.$dirty && form.userName.$error.required" class="help-block">Username is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
            <label for="password"> New Password</label>
            <input type="password" name="password" id="password" class="form-control" ng-model="vm.seller.password" required />
            <span ng-show="form.password.$dirty && form.password.$error.required" class="help-block">Password is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
            <label for="password"> Confirm Password</label>
            <input type="password" name="password" id="password" class="form-control" ng-model="vm.seller.password" required />
            <span ng-show="form.password.$dirty && form.password.$error.required" class="help-block">Password is required</span>
        </div>
     
         <input type="hidden" ng-model="vm.seller.id" value="{{respond}}"/>
        
           <div class="form-actions">
            <button type="submit"  class="btn btn-primary">Submit</button>
            <a href="#/" class="btn btn-link">Cancel</a>
        </div>
    </form>
</div>
</div>
</section>


