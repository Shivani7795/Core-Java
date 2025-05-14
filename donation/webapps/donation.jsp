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
        <a class="navbar-brand text-dark" href="index.html">Donation</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link text-dark" href="index.html">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<h2 class="text-center text-primary mt-4">Donation Details</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">
        <form action="donation" method="post">
            <div class="mb-3">
                <label for="firstName" class="form-label">Donar Name:</label>
                <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter donar Name" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email:</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email" required>
            </div>

            <div class="mb-3">
                <label for="amount" class="form-label">Amount:</label>
                <input type="number" class="form-control" id="amount" name="amount" placeholder="Enter donation amount" required>
            </div>

            <div class="mb-3">
                <label for="cause" class="form-label">Cause:</label>
                <input type="text" class="form-control" id="cause" name="cause" placeholder="Enter the cause for donation" required>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Donate</button>
            </div>
        </form>
    </div>
</div>

<footer class="text-center text-dark mt-5">
    &copy; 2025 My Website | Designed by Shivani A.
</footer>
</body>
</html>