<!doctype html>
<html lang="en">
<head>
    <title>Contact Us</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Furniture</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link text-dark" href="index.jsp">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<h2 class="text-center text-primary mt-4">furniture Details</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">
        <form action="donation" method="post">
<form>
    <div class="mb-3">
        <label for="brands" class="form-label">Brand</label>
        <input type="text" class="form-control" id="brands" placeholder="Enter the Brand">
    </div>
    <div class="mb-3">
        <label for="Example" class="form-label">Size</label>
        <input type="text" class="form-control" id="Example" placeholder="Enter the size">
    </div>
    <div class="mb-3">
        <label for="Example1" class="form-label">material</label>
        <input type="text" class="form-control" id="Example1" placeholder="Enter the material">
    </div>
    <div class="mb-3">
        <label for="Example2" class="form-label">Model name</label>
        <input type="text" class="form-control" id="Example2" placeholder="Enter the model name">
    </div>
    <div class="mb-3">
        <label for="Example3" class="form-label">Product benefits</label>
        <textarea class="form-control" id="Example3" rows="3"></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>