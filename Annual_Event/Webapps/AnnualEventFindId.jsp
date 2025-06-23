<!doctype html>
<html lang="en">
<head>
    <title>Annual Event</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Annual Event</a>
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

<h2 class="text-bold pe-3">Find Annual Event Details by ID</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">

        <form action="annualFind" method="get">
            <label for="eventId" class="form-label">Enter Event ID:</label>
            <input type="text" class="form-control" name="eventId" id="eventId" required><br>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>

        <p class="text-danger mt-3">${errorMessage}</p>
        <h5 class="text-success mt-3">${message}</h5>

        <table class="table table-bordered mt-4">
            <tbody>
            <tr>
                <th>Institute Name</th>
                <td>${annualEventDto.instituteName}</td>
            </tr>
            <tr>
                <th>Location</th>
                <td>${annualEventDto.location}</td>
            </tr>
            <tr>
                <th>Guest Name</th>
                <td>${annualEventDto.guestName}</td>
            </tr>
            <tr>
                <th>Event Date</th>
                <td>${annualEventDto.EDate}</td>
            </tr>
            <tr>
                <th>Chairs</th>
                <td>${annualEventDto.chairs}</td>
            </tr>
            <tr>
                <th>Booked Time</th>
                <td>${annualEventDto.bookedTime}</td>
            </tr>
            </tbody>
        </table>


    </div>
</div>

</body>
</html>
