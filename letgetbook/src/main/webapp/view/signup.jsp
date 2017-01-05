<section id="section1">

	<div class="container" >

<div id="myCarousel" class="carousel slide" data-ride="carousel">
   <div class="container" style="width:100%;  margin-top:-2.8em;  padding-left:0px; padding-right:0px">
<div style="width: 50%; margin: auto;">
    <h2>Register</h2>
    <form name="form" ng-submit="vm.register()" role="form">
        <div class="form-group" ng-class="{ 'has-error': form.businessName.$dirty && form.businessName.$error.required }">
            <label for="businessName">Business name</label>
            <input type="text" name="businessName" id="businessName" class="form-control" ng-model="vm.user.businessName" required />
            <span ng-show="form.businessName.$dirty && form.businessName.$error.required" class="help-block">Business name is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.email.$dirty && form.email.$error.required }">
            <label for="email">Email</label>
            <input type="text" name="email" id="email" class="form-control" ng-model="vm.user.email" required />
            <span ng-show="form.email.$dirty && form.email.$error.required" class="help-block">Email is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.username.$dirty && form.userName.$error.required }">
            <label for="userName">Username</label>
            <input type="text" name="username" id="userName" class="form-control" ng-model="vm.user.userName" required />
            <span ng-show="form.username.$dirty && form.userName.$error.required" class="help-block">Username is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
            <label for="password">Password</label>
            <input type="password" name="password" id="password" class="form-control" ng-model="vm.user.password" required />
            <span ng-show="form.password.$dirty && form.password.$error.required" class="help-block">Password is required</span>
        </div>
        <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
            <label for="phone">Home phone</label>
            <input type="text" name="phone1" id="phone1" class="form-control" ng-model="vm.user.phone1" required />
            <span ng-show="form.phone1.$dirty && form.phone1.$error.required" class="help-block">Home Phone is required</span>
        </div>
         <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
            <label for="phone">Cell phone</label>
            <input type="text" name="phone1" id="phone1" class="form-control" ng-model="vm.user.phone1" />
        </div>
        <div class="form-actions">
            <button type="submit" ng-disabled="form.$invalid || vm.dataLoading" class="btn btn-primary">Register</button>
            <img ng-if="vm.dataLoading" src="data:image/gif;base64,R0lGODlhEAAQAPIAAP///wAAAMLCwkJCQgAAAGJiYoKCgpKSkiH/C05FVFNDQVBFMi4wAwEAAAAh/hpDcmVhdGVkIHdpdGggYWpheGxvYWQuaW5mbwAh+QQJCgAAACwAAAAAEAAQAAADMwi63P4wyklrE2MIOggZnAdOmGYJRbExwroUmcG2LmDEwnHQLVsYOd2mBzkYDAdKa+dIAAAh+QQJCgAAACwAAAAAEAAQAAADNAi63P5OjCEgG4QMu7DmikRxQlFUYDEZIGBMRVsaqHwctXXf7WEYB4Ag1xjihkMZsiUkKhIAIfkECQoAAAAsAAAAABAAEAAAAzYIujIjK8pByJDMlFYvBoVjHA70GU7xSUJhmKtwHPAKzLO9HMaoKwJZ7Rf8AYPDDzKpZBqfvwQAIfkECQoAAAAsAAAAABAAEAAAAzMIumIlK8oyhpHsnFZfhYumCYUhDAQxRIdhHBGqRoKw0R8DYlJd8z0fMDgsGo/IpHI5TAAAIfkECQoAAAAsAAAAABAAEAAAAzIIunInK0rnZBTwGPNMgQwmdsNgXGJUlIWEuR5oWUIpz8pAEAMe6TwfwyYsGo/IpFKSAAAh+QQJCgAAACwAAAAAEAAQAAADMwi6IMKQORfjdOe82p4wGccc4CEuQradylesojEMBgsUc2G7sDX3lQGBMLAJibufbSlKAAAh+QQJCgAAACwAAAAAEAAQAAADMgi63P7wCRHZnFVdmgHu2nFwlWCI3WGc3TSWhUFGxTAUkGCbtgENBMJAEJsxgMLWzpEAACH5BAkKAAAALAAAAAAQABAAAAMyCLrc/jDKSatlQtScKdceCAjDII7HcQ4EMTCpyrCuUBjCYRgHVtqlAiB1YhiCnlsRkAAAOwAAAAAAAAAAAA==" />
            <a href="#/" class="btn btn-link">Cancel</a>
        </div>
    </form>
</div>
</div>
</div>
</div>
</section>