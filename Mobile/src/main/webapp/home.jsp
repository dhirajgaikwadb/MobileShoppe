<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home.jsp</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-top navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
         <li class="nav-item">
          <a class="nav-link" href="Logout">Logout</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<div class="container">
<form action="cart" method="post">
<div class="row" style="margin-bottom:20px;margin-top:40px;">
<div class="col">
<div class="card" style="width: 18rem;">
  <img src="https://m.media-amazon.com/images/I/81I3w4J6yjL._SL1500_.jpg" style="width: 14rem;" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Samsung Galaxy M33 5G</h5>
    <h6 class="card-text">Price: 18999 &#8377;</h6>
    <span class="card-text" style="font-weight:bold;">Ram: 6GB</span><span class="card-text" style="font-weight:bold;padding-left:30px;">Rom:128Gb</span>
    <input type ="checkbox" name="Samsung_Galaxy_M33_5G"style="margin-left:20%">Add to cart
  </div>
</div>
</div>
<div class="col">
<div class="card" style="width: 18rem;">
  <img src="https://m.media-amazon.com/images/I/71geVdy6-OS._SL1500_.jpg" style="width: 14rem;height:16rem" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Oppo A74 Fantastic Purple</h5>
    <h6 class="card-text">Price: 14999 &#8377;</h6>
    <span class="card-text" style="font-weight:bold;">Ram: 4GB</span><span class="card-text" style="font-weight:bold;padding-left:30px;">Rom: 64Gb</span>
    <input type ="checkbox" name="OppoA74FantasticPurple"style="margin-left:20%">Add to cart
  </div>
</div>
</div>
<div class="col">
<div class="card" style="width: 18rem;">
  <img src="https://m.media-amazon.com/images/I/71Ta0Hcl+PL._SL1500_.jpg" style="width: 14rem;height:16rem" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Redmi 10A Sport</h5>
    <h6 class="card-text">Price: 10499 &#8377;</h6>
    <span class="card-text" style="font-weight:bold;">Ram: 6GB</span><span class="card-text" style="font-weight:bold;padding-left:30px;">Rom: 128Gb</span>
   <input type ="checkbox" name="Redmi10ASport"style="margin-left:20%">Add to cart
  </div>
</div>
</div>
</div>
<div class="row" style="margin-bottom:20px;">
<div class="col">
<div class="card" style="width: 18rem;">
  <img src="https://m.media-amazon.com/images/I/81OC0ojxH6L._SL1500_.jpg" style="width: 14rem;height:16rem" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Samsung Galaxy M32 Prime</h5>
    <h6 class="card-text">Price: 13499 &#8377;</h6>
    <span class="card-text" style="font-weight:bold;">Ram: 4GB</span><span class="card-text" style="font-weight:bold;padding-left:30px;">Rom: 64Gb</span>
    <input type ="checkbox" name="SamsungGalaxyM32Prime"style="margin-left:20%">Add to cart
  </div>
</div>
</div>
<div class="col">
<div class="card" style="width: 18rem;">
  <img src="https://m.media-amazon.com/images/I/51OYalGc88L._SL1200_.jpg" style="width: 14rem;height:16rem" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">IQOO 9 SE 5G</h5>
    <h6 class="card-text">Price: 30990 &#8377;</h6>
    <span class="card-text" style="font-weight:bold;">Ram: 8GB</span><span class="card-text" style="font-weight:bold;padding-left:30px;">Rom: 128GB</span>
    <input type ="checkbox" name="IQOO9SE5G"style="margin-left:20%">Add to cart
  </div>
</div>
</div>
<div class="col">
<div class="card" style="width: 18rem;">
  <img src="https://m.media-amazon.com/images/I/61ahn9N38zL._SL1500_.jpg" style="width: 14rem;height:16rem" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">OnePlus Nord 2T 5G</h5>
    <h6 class="card-text">Price: 28999 &#8377;</h6>
    <span class="card-text" style="font-weight:bold;">Ram: 8GB</span><span class="card-text" style="font-weight:bold;padding-left:30px;">Rom: 128Gb</span>
    <input type ="checkbox" name="OnePlusNord2T5G"style="margin-left:20%">Add to cart
  </div>
</div>
</div>
</div>
<div class="row" style="margin-bottom:20px;">
<div class="col">
<div class="card" style="width: 18rem;">
  <img src="https://m.media-amazon.com/images/I/61VbKHdE0rL._SL1200_.jpg" style="width: 14rem;height:16rem" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">IQOO Z6</h5>
    <h6 class="card-text">Price: 14999 &#8377;</h6>
    <span class="card-text" style="font-weight:bold;">Ram: 8GB</span><span class="card-text" style="font-weight:bold;padding-left:30px;">Rom: 128Gb</span>
   <input type ="checkbox" name="IQOOZ6"style="margin-left:20%">Add to cart
  </div>
</div>
</div>
<div class="col">
<div class="card" style="width: 18rem;">
  <img src="https://m.media-amazon.com/images/I/61AFUMyh5QL._SL1200_.jpg" style="width: 14rem;height:16rem" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">IQOO Z644w</h5>
    <h6 class="card-text">Price: 16999 &#8377;</h6>
    <span class="card-text" style="font-weight:bold;">Ram: 4GB</span><span class="card-text" style="font-weight:bold;padding-left:30px;">Rom: 64Gb</span>
    <input type ="checkbox" name="IQOOZ644w"style="margin-left:20%">Add to cart
  </div>
</div>
</div>
<div class="col">
<div class="card" style="width: 18rem;">
  <img src="https://m.media-amazon.com/images/I/81g0X076+WL._SL1500_.jpg" style="width: 14rem;height:16rem" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Realme narzo 50A</h5>
    <h6 class="card-text">Price: 11999 &#8377;</h6>
    <span class="card-text" style="font-weight:bold;">Ram: 4GB</span><span class="card-text" style="font-weight:bold;padding-left:30px;">Rom: 32Gb</span>
    <input class="card-text" type ="checkbox" name="Realmenarzo50A"style="margin-left:20%">  Add cart
  </div>
</div>
</div>
</div>
<button type="submit" class="btn btn-primary favorite styled mb-5" type="submit" style="margin-left:41%">Submit Cart</button>
</form>
</div>
</body>
</html>