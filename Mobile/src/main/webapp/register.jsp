<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Module</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="style.css">
	<!-- Script -->
	<script type="text/javascript">
        function validate() {
  
        	var ufname = document.getElementById("t1").value;
        	var ulname = document.getElementById("t5").value;
        	var uemail = document.getElementById("t2").value;
        	var pass = document.getElementById("t3").value;
        	var cpwd= document.getElementById("t4").value;
        	
        	var pwd_expression = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-])/;
    		var letters = /^[A-Za-z]+$/;
    		var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    		if(!letters.test(ufname))
    		{
    			alert('Name field required only alphabet characters');
    		}
    		if(!letters.test(ulname))
    		{
    			alert('Name field required only alphabet characters');
    		}
    		else if (!filter.test(uemail))
    		{
    			alert('Invalid email');
    		}
    		else if(!pwd_expression.test(pass))
    		{
    			alert ('Upper case, Lower case, Special character and Numeric letter are required in Password filed');
    		}
    		else if(document.getElementById("t5").value.length < 6)
    		{
    			alert ('Password minimum length is 6');
    		}
    		else if(document.getElementById("t5").value.length > 12)
    		{
    			alert ('Password max length is 12');
    		}
    		else{
    			alert("Register Successful")
    			}
    		}
    </script>
</head>
<body>
<section class="ftco-section" >
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 col-lg-5">
					<div class="login-wrap p-4 p-md-5">
		      	<div class="icon d-flex align-items-center justify-content-center">
		      		<span class="fa fa-user-o"></span>
		      	</div>
		      	<h3 class="text-center mb-4">Have an account?</h3>
						<form action="RegisterController" method="post" class="login-form">
		      		<div class="form-group">
		      			<input type="text" class="form-control rounded-left" name="fname" id="t1" placeholder="First Name" required>
		      		</div>
		      		<div class="form-group">
		      			<input type="text" class="form-control rounded-left" name="lname" id="t5" placeholder="Last Name" required>
		      		</div>
		      		<div class="form-group">
		      			<input type="email" class="form-control rounded-left" placeholder="E-Mail" id="t2" name="mail" required>
		      		</div>
		      		<div class="form-group">
		      			<input type="text" class="form-control rounded-left" placeholder="PhoneNo" name="Phone" required>
		      		</div>
		      		<div class="form-group">
		      			<input type="text" class="form-control rounded-left" placeholder="Address" name="add" required>
		      		</div>
	            <div class="form-group d-flex">
	              <input type="password" class="form-control rounded-left" name="password" id="t3" placeholder="Password" required>
	            </div>
	            <div class="form-group d-flex">
	              <input type="password" class="form-control rounded-left" name="cpassword" id="t4" placeholder="Confirm Password" required>
	            </div>
	            <div class="form-group">
	            	<button type="submit" onclick="validate()" class="btn btn-primary rounded submit p-3 px-5">Sign up</button>
	            </div>
	          </form>
	        </div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>