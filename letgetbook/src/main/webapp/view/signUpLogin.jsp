<section id="section1">
 <div class="container" >
<div style=" margin-left: 40%;">
    <h2 style=" color:black; margin: auto; margin-left: 5%; margin-top: 5%; margin-bottom: 5%;" >Log In</h2>
    <br>
    <form name="form" ng-submit="vm.signInUser()" role="form">
             
        <div class="form-group" ng-class="{ 'has-error': form.userName.$dirty && form.userName.$error.required }" style="margin-left: 0%;">
            <label for="userName" style="font-size: 140%; color:brown; margin: auto;">Username  </label><br>
            <input type="text" name="userName" id="userName" class="form-control" ng-model="vm.login.userName" style="width: 15em;" required />
            <span ng-show="form.userName.$dirty && form.userName.$error.required" class="help-block">Username is required</span>
        </div>
        
        <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }" style="margin-left: 0%;">
            <label for="password" style="font-size: 140%; color:brown;">Password </label><br>
            <input type="password" name="password" id="password" class="form-control" ng-model="vm.login.password" style="width: 15em;" required />
            <span ng-show="form.password.$dirty && form.password.$error.required" class="help-block">Password is required</span>
        </div>
        
        <div class="form-actions" style="margin:auto; margin-left: 3%; margin-bottom: 5%;">
            <button type="submit"  class="btn btn-primary" style="width: 25%; height: 40px;">LogIn</button>
            </div><br> 
         
    </form>

    <div class="form-actions" style="margin:auto; margin-left: 3%">
            <button  class="btn btn-primary"  style="width: 25%; height: 40px;"><a ng-href = "#signupPage" style="color:white;">SignUp</a></button>
         </div><br> 
    <div class="form-actions" style="margin:auto; margin-left: 3%">
            <button  class="btn btn-primary" style=" width: 25%; height: 40px;"><a ng-href = "#forgetPassword" style="color:white;">Forgotten Password</a></button><br> 
       </div>
</div>
</div>
</section1>