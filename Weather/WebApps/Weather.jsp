<!doctype html>
<html lang="en">
<head>
    <title>Weather </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Weather </a>
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
<h2 class="text-bold pe-3">Weather Details</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">
        <form action="climate" method="post">
            <div class="mb-3">
                <label for="placeName" class="form-label">Place Name:</label>
                <input type="text" class="form-control" id="placeName" name="placeName" placeholder="Enter the place name" required>
            </div>

            <div class="mb-3">
                <label for="weather" class="form-label">Weather:</label>
                <input type="text" class="form-control" id="weather" name="weather" placeholder="Enter weather condition" required>
            </div>

            <div class="mb-3">
                <label for="minTemp" class="form-label">Min Temperature (°C):</label>
                <input type="number" class="form-control" id="minTemp" name="minTemp" placeholder="Enter min temperature" required>
            </div>

            <div class="mb-3">
                <label for="maxTemp" class="form-label">Max Temperature (°C):</label>
                <input type="number" class="form-control" id="maxTemp" name="maxTemp" placeholder="Enter max temperature" required>
            </div>

            <div class="mb-3">
                <label for="cloudy" class="form-label">Cloudy:</label>
                <select class="form-control" id="cloudy" name="cloudy" required>
                    <option value="" disabled selected>Select an option</option>
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
                </select>
            </div>


            <div class="mb-3">
                <label for="raining" class="form-label">Raining:</label>
                <select class="form-control" id="raining" name="raining" required>
                    <option value="" disabled selected>Select an option</option>
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
                </select>
            </div>


            <div class="mb-3">
                <label for="rainMm" class="form-label">Rain in mm:</label>
                <input type="number" class="form-control" id="rainMm" name="rainMm" placeholder="Enter rainfall in mm" required>
            </div>

            <div class="mb-3">
                <label for="humidity" class="form-label">Humidity (%):</label>
                <input type="number" class="form-control" id="humidity" name="humidity" placeholder="Enter humidity percentage" required>
            </div>

            <div class="mb-3">
                <label for="windSpeed" class="form-label">Wind Speed (km/h):</label>
                <input type="number" class="form-control" id="windSpeed" name="windSpeed" placeholder="Enter wind speed" required>
            </div>

            <div class="mb-3">
                <label for="sunrise" class="form-label">Sunrise Time:</label>
                <input type="time" class="form-control" id="sunrise" name="sunrise" required>
            </div>

            <div class="mb-3">
                <label for="sunset" class="form-label">Sunset Time:</label>
                <input type="time" class="form-control" id="sunset" name="sunset" required>
            </div>

            <div class="mb-3">
                <label for="moonrise" class="form-label">Moonrise Time:</label>
                <input type="time" class="form-control" id="moonrise" name="moonrise" required>
            </div>

            <div class="mb-3">
                <label for="moonset" class="form-label">Moonset Time:</label>
                <input type="time" class="form-control" id="moonset" name="moonset" required>
            </div>

            <div class="mb-3">
                <label for="rainStart" class="form-label">Rain Start Time:</label>
                <input type="time" class="form-control" id="rainStart" name="rainStart" required>
            </div>

            <div class="mb-3">
                <label for="rainEnd" class="form-label">Rain End Time:</label>
                <input type="time" class="form-control" id="rainEnd" name="rainEnd" required>
            </div>

            <div class="mb-3">
                <label for="precipitation" class="form-label">Precipitation (%):</label>
                <input type="number" class="form-control" id="precipitation" name="precipitation" placeholder="Enter precipitation percentage" required>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit climate Report</button>
            </div>
        </form>

    </div>
</div>

</body>
</html>
