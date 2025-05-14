<!doctype html>
<html lang="en">
<head>
    <title>Laboratory Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.html">Lab Portal</a>
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

<h2 class="text-center text-primary mt-4">Laboratory Request Form</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">
        <form action="laboratory" method="post">
            <div class="mb-3">
                <label for="studentName" class="form-label">Student Name:</label>
                <input type="text" class="form-control" id="studentName" name="studentName" placeholder="Enter your name" required>
            </div>

            <div class="mb-3">
                <label for="rollNumber" class="form-label">Roll Number:</label>
                <input type="text" class="form-control" id="rollNumber" name="rollNumber" placeholder="Enter your roll number" required>
            </div>

            <div class="mb-3">
                <label for="labName" class="form-label">Lab Name:</label>
                <input type="text" class="form-control" id="labName" name="labName" placeholder="Enter lab name (e.g., Physics Lab)" required>
            </div>

            <div class="mb-3">
                <label for="purpose" class="form-label">Purpose of Visit:</label>
                <textarea class="form-control" id="purpose" name="purpose" rows="2" placeholder="Enter the purpose" required></textarea>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit Request</button>
            </div>
        </form>
    </div>
</div>

<footer class="text-center text-dark mt-5">
    &copy; 2025 Lab Portal | Designed by Shivani A.
</footer>

</body>
</html>
