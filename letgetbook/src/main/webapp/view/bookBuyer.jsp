<section id="section1">

	<div class="container" >
	<div style="width: 50%; margin: auto;">
    <h2>Search</h2>
    <form name="form" ng-submit="vm.bookSearch()" role="form">

    	     
        <div class="form-group" >
            <label for="location">Location</label>
            <input type="text" name="location" id="userName" class="form-control" ng-model="vm.book.location"  />
          
        </div>
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" name="name" id="name" class="form-control" ng-model="vm.book.name" required />
            
        </div>
        <div class="form-group" >
            <label for="isbn">ISBN</label>
            <input type="text" name="isbn" id="password" class="form-control" ng-model="vm.book.isbn" required />
            
        </div>
     	
     	<div class="form-group" >
            <label for="isbn">Grade</label>
            <input type="text" name="grade" id="password" class="form-control" ng-model="vm.book.grade" required />
            
        </div>
        
        
        
           <div class="form-actions">
            <button type="submit"  class="btn btn-primary">Submit</button>
            
        </div>
    </form>
</div>
</div>
</section>


