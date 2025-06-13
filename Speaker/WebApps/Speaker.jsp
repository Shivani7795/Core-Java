<!doctype html>
<html lang="en">
<head>
    <title>Speakers </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Speakers </a>
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
<h2 class="text-bold pe-3">Speaker Details</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">
        <form action="sound" method="post">
            <div class="mb-3">
                <label for="brand" class="form-label">Brand:</label>
                <input type="text" class="form-control" id="brand" name="brand" placeholder="Enter brand name" required>
            </div>

            <div class="mb-3">
                <label for="speakerType" class="form-label">Speaker Type:</label>
                <select class="form-control" id="speakerType" name="speakerType" required>
                    <option value="" disabled selected>Select a speaker type</option>
                    <option value="Floorstanding Speaker">Floorstanding Speaker</option>
                    <option value="Bookshelf Speaker">Bookshelf Speaker</option>
                    <option value="In-Wall Speaker">In-Wall Speaker</option>
                    <option value="Subwoofers">Subwoofers</option>
                    <option value="Outdoor Speaker">Outdoor Speaker</option>
                </select>
            </div>

            <div class="mb-3">
                <label for="price" class="form-label">Price (INR):</label>
                <input type="number" class="form-control" id="price" name="price" placeholder="Enter price" required>
            </div>

            <div class="mb-3">
                <label for="wirelessRange" class="form-label">Wireless Range (meters):</label>
                <input type="number" class="form-control" id="wirelessRange" name="wirelessRange" placeholder="Enter wireless range" required>
            </div>

            <div class="mb-3">
                <label for="color" class="form-label">Color:</label>
                <select class="form-control" id="color" name="color" required>
                    <option value="" disabled selected>Select a color</option>
                    <option value="Black">Black</option>
                    <option value="White">White</option>
                    <option value="Pink">Pink</option>
                    <option value="Brown">Brown</option>
                    <option value="Silver">Silver</option>
                    <option value="Blue">Blue</option>
                </select>
            </div>


            <div class="mb-3">
                <label for="bluetooth" class="form-label">Bluetooth:</label>
                <select class="form-control" id="bluetooth" name="bluetooth" required>
                    <option value="" disabled selected>Select an option</option>
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
                </select>
            </div>


            <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit Speaker Details</button>
            </div>
        </form>

    </div>
</div>

</body>
</html>
