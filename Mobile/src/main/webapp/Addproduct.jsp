<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Product</title>
<script type="text/javascript">
function validate(){
	
	var number=/^[0-9]+$/;
	
	
}
</script>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="style.css">
</head>
<body>
<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 col-lg-5">
					<div class="login-wrap p-4 p-md-5">
						<form action="AddProduct" method="post" enctype="multipart/form-data" class="login-form">
		      		<div class="form-group">
		      			<input type="text" class="form-control rounded-left" name="product" placeholder="Enter Product Name" required>
		      		</div>
	            <div class="form-group d-flex">
	              <input type="text" class="form-control rounded-left" name="price" id="price" placeholder="Enter Product Price in Rupees" required>
	            </div>
	            <div class="form-group d-flex">
	              <input type="text" class="form-control rounded-left" name="quant" placeholder="Enter Product Quantity" required>
	            </div>
	            <div class="form-group d-flex">
	              <select class="form-select form-control rounded-left" name="ram" aria-label="Default select example">
	              <option class="bg-light" selected>Select Mobile Ram in GB</option>
	              <option name="ra4" class="bg-light" value="1">4</option>
	              <option name="ra6" class="bg-light" value="2">6</option>
	              <option name="ra8" class="bg-light" value="3">8</option>
	              </select>
	              </div>
	              <div class="form-group d-flex">
	              <select class="form-select form-control rounded-left bg-light" name="rom" aria-label="Default select example">
	              <option class="bg-light" selected>Select Mobile Rom in GB</option>
	              <option name="ro32" class="bg-light" value="1">32</option>
	              <option name="ro64" class="bg-light" value="2">64</option>
	              <option name="ro128" class="bg-light" value="3">128</option>
	              </select>
	              </div>
	              <div class="form-group d-flex">
	              <label for="pic">Add product Image</label>
	              <br>
	              <input type="file" id="pic" name="pfile" required/>
	              </div>
	              <div class="form-group">
	              <button type="submit" onclick="validate()" class="btn btn-primary rounded submit p-3 px-5">Add Product</button>
	              </div>
	          </form>
	        </div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>