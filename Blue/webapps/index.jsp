<!doctype html>
<html lang="en">
<head>
    <title>Adoption</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Adopt</a>
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
<h3 align=center style="color:red;">${message}</h3>
<h2 class="text-center text-primary mt-4">pet Details</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">
        <form action="pet" method="post">
            <div class="mb-3">
                <label for="firstName" class="form-label">Name:</label>
                <input type="text" class="form-control" id="firstName" name="name" placeholder="Enter Adopter Name" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email:</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email" required>
            </div>

            <div class="mb-3">
                <label for="amount" class="form-label">Amount:</label>
                <input type="number" class="form-control" id="amount" name="amount" placeholder="Enter Adoption amount" required>
            </div>

            <div class="mb-3">
                <label for="cause" class="form-label">Animal:</label>
                <input type="text" class="form-control" id="cause" name="cause" placeholder="Enter animal name" required>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">submit Details</button>
            </div>
        </form>
    </div>
</div>

<footer class="text-center text-dark mt-5">
    &copy; 2025 My Website | Designed by Shivani A.
</footer>
</body>
</html>
