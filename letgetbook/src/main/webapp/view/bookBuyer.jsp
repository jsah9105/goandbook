<section id="section1">

	<div class="container" >
	<div style="width: 50%; margin: auto;">
    <h2>Search</h2>
    
    <div>
 <table class="populateItems" >
  <tr>
  <td ng-repeat="items in searchResponse">
  <div style="height:300px; width:90%; background-color:#C8C8C8;">
  <div ><img src="images/04.jpg" style="height:150px; width:100%; "></div>
 <p><h3><a style="text-align: center; ">{{items.businessName}}</a></h3></p>
 <p><a style="text-align: center; ">{{items.email}} </a><br>{{items.phone1}}</p><br><br>
 <p style="margin-left:70%;"><a style="text-decoration: line-through;">15</a> 12</p>



 </div></td>
 
  
  </tr>
  </table>
  
  
  
  </div>
  
  
</div>
</div>
</section>


