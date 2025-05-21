<!doctype html>
<html lang="en">
<head>
    <title>Product Entry</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Product Entry</a>
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

<h3 align="center" style="color:red;">${message}</h3>
<h2 class="text-center text-primary mt-4">Product Details</h2>

<div class="container my-5">
    <div class="card p-4 mx-auto" style="max-width: 700px;">
        <form action="product" method="post">

            <div class="mb-3">
                <label class="form-label">Name:</label>
                <input type="text" class="form-control" name="name" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Type:</label>
                <select class="form-select" name="type" required>
                    <option value="">Select Type</option>
                    <option value="Top Freezer">Top Freezer</option>
                    <option value="Side by Side">Side by Side</option>
                    <option value="Bottom Freezer">Bottom Freezer</option>
                    <option value="French Door">French Doorr</option>
                    <option value="Counter Depth">Counter Depth</option>
                    <option value="Built-in">Built-in</option>
                </select>
            </div>

            <div class="mb-3">
                <label class="form-label">Incoming Price:</label>
                <input type="number" class="form-control" name="incomingPrice" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Selling Price:</label>
                <input type="number" class="form-control" name="sellingPrice" required>
            </div>

            <div class="mb-3">
                <label class="form-label">MRP:</label>
                <input type="number" class="form-control" name="mrp" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Description:</label>
                <textarea class="form-control" name="description" rows="3" required></textarea>
            </div>

            <div class="mb-3">
                <label class="form-label">Brand:</label>
                <input type="text" class="form-control" name="brand" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Quantity:</label>
                <input type="number" class="form-control" name="quantity" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Color:</label>
                <select class="form-select" name="color" required>
                    <option value="">Select Color</option>
                    <option value="Black">pink</option>
                    <option value="White">White</option>
                    <option value="Silver">Silver</option>
                    <option value="Red">Red</option>
                </select>
            </div>

            <div class="mb-3">
                <label class="form-label">Weight (kg):</label>
                <input type="text" class="form-control" name="weight" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Manufacture Date:</label>
                <input type="date" class="form-control" name="manufDate" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Warranty:</label>
                <select class="form-select" name="warranty" required>
                    <option value="">Select Warranty</option>
                    <option value="6 Months">6 Months</option>
                    <option value="1 Year">1 Year</option>
                    <option value="2 Years">2 Years</option>
                    <option value="No Warranty">No Warranty</option>
                </select>
            </div>

            <div class="form-check mb-3">
                <input class="form-check-input" type="checkbox" name="returnPolicy" id="returnPolicy">
                <label class="form-check-label" for="returnPolicy">
                    Return Policy Available
                </label>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit Product</button>
            </div>

        </form>
    </div>
</div>

<footer class="text-center text-dark mt-5">
    &copy; 2025 My Website | Designed by Shivani A.
</footer>
</body>
</html>
