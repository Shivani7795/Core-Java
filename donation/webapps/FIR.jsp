<!doctype html>
<html lang="en">
<head>
    <title>FIR Report</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.html">FIR Portal</a>
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

<h2 class="text-center text-primary mt-4">File an FIR</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">
        <form action="fir" method="post">

            <div class="mb-3">
                 <label for="firstName" class="form-label">Name:</label>
                 <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter donar Name" required>
            </div>
            <div class="mb-3">
                <label for="complainantName" class="form-label">Complainant Name:</label>
                <input type="text" class="form-control" id="complainantName" name="complainantName" placeholder="Enter your full name" required>
            </div>


            <div class="mb-3">
                <label for="phone" class="form-label">Phone Number:</label>
                <input type="tel" class="form-control" id="phone" name="phone" placeholder="Enter your phone number" required>
            </div>

            <div class="mb-3">
                <label for="address" class="form-label">Address:</label>
                <textarea class="form-control" id="address" name="address" rows="2" placeholder="Enter your address" required></textarea>
            </div>

            <div class="mb-3">
                <label for="incidentDate" class="form-label">Date of Incident:</label>
                <input type="date" class="form-control" id="incidentDate" name="incidentDate" required>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit FIR</button>
            </div>
        </form>
    </div>
</div>

<footer class="text-center text-dark mt-5">
    &copy; 2025 FIR Portal | Designed by Shivani A.
</footer>

</body>
</html>
