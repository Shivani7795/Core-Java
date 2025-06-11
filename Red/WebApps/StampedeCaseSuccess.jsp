<!doctype html>
<html lang="en">
<head>
    <title>Case </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Case </a>
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
<h2 class="text-bold pe-3">Case Details</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">
        <form action="Red" method="post">
            <div class="mb-3">
                <label for="firstName" class="form-label">Event:</label>
                <input type="text" class="form-control" id="firstName" name="name" placeholder="Enter the Event Name" required>
            </div>
            <div class="mb-3">
                <label for="deaths" class="form-label">Deaths:</label>
                <input type="number" class="form-control" id="deaths" name="deaths" placeholder="Enter no of deaths" required>
            </div>

            <div class="mb-3">
                <label for="injuries" class="form-label">injuries:</label>
                <input type="number" class="form-control" id="injuries" name="injuries" placeholder="Enter no of injuries" required>
            </div>

            <div class="mb-3">
                <label for="location" class="form-label">location:</label>
                <input type="text" class="form-control" id="location" name="location" placeholder="Enter the location" required>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">file Case</button>
            </div>
        </form>
    </div>
</div>

</body>
</html>
