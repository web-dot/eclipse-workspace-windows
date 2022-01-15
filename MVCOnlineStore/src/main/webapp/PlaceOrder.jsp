<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="orderstyle.css">
<title>MVC Online Store</title>
 
</head>
<body>
	<h1>PlaceOrder</h1>
    <div  class="formcontainer">
        <form action="PlaceOrderInt.jsp" method="POST">
            <div class="form-group">
                <label>Name</label>
                <input type="text" class="form-control" name="uname">
              </div>
            <div class="form-group">
              <label>Email address</label>
              <input type="text" class="form-control" name="email">
            </div>
            <div class="form-group">
              <label>Mobile Number</label>
              <input type="text" class="form-control" name="mobile">
            </div>
            <div class="form-group">
                <label>Billing Address</label><br>
               <br/>
                <label>Street Address Line1</label>
                <input type="text" class="form-control" name="addressline1">
    
                
                <label>Street Address Line2</label>
                <input type="text" class="form-control" name="addressline2">
    
    
                
                <label>Landmark</label>
                <input type="text" class="form-control" name="Landmark">
            </div>
    
            <div class="form-group">
                <label>Payment Method</label>
                <input type="text" class="form-control" name="paymentmethod" placeholder="card/paypal">
              </div>
              <button type="submit" class="btn btn-primary">Submit</button>
    
          </form>
          
          <div class="alert alert-danger" role="alert">
  				<h5>${errorMessage}</h5>
		</div>
      

    </div>
    
</body>
</html>