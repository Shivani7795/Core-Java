<!doctype html>
<html lang="en">
<head>
    <title>Annual Event </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Annual Event </a>
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
<h2 class="text-bold pe-3">Event Details</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">
        <form action="annual" method="post">
            <div class="mb-3">
                <label for="instituteName" class="form-label">Institute Name:</label>
                <input type="text" class="form-control" id="instituteName" name="instituteName" placeholder="Enter Institute Name" required>
            </div>

            <div class="mb-3">
                <label for="location" class="form-label">Location:</label>
                <input type="text" class="form-control" id="location" name="location" placeholder="Enter the Place" required>
            </div>

            <div class="mb-3">
                <label for="guestName" class="form-label">Guest Name:</label>
                <input type="text" class="form-control" id="guestName" name="guestName" placeholder="Enter the Guest name" required>
            </div>

            <div class="mb-3">
                <label for="date" class="form-label">Date:</label>
                <input type="date" class="form-control" id="date" name="eDate" required>
            </div>

            <div class="mb-3">
                <label for="chairsRequired" class="form-label">No. of Chairs Required:</label>
                <input type="number" class="form-control" id="chairsRequired" name="chairs" placeholder="Enter number of chairs" required>
            </div>

            <div class="mb-3 text-center">
                <input type="submit" value="Book Now" class="btn btn-primary me-2">
                <input type="reset" value="Clear" class="btn btn-warning">
            </div>
        </form>


        <h5 class="text-success mt-3">${message}</h5>
    </div>
</body>
</html>
