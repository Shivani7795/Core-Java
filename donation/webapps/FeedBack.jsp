<!doctype html>
<html lang="en">
<head>
    <title>Feedback</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.html">Feedback Portal</a>
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
<h3 align="center" style="color:red;">${message}</h3>

<h2 class="text-center text-primary mt-4">Feedback Form</h2>

<div class="container my-5">
    <div class="card card-custom p-4 mx-auto" style="max-width: 600px;">
        <form action="feedback" method="post">
            <div class="mb-3">
                <label for="name" class="form-label">Name:</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Enter your name" required>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">Email:</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email address" required>
            </div>

            <div class="mb-3">
                <label for="subject" class="form-label">Subject:</label>
                <input type="text" class="form-control" id="subject" name="subject" placeholder="Subject of your feedback" required>
            </div>

            <div class="mb-3">
                <label for="message" class="form-label">Message:</label>
                <textarea class="form-control" id="message" name="message" placeholder="Enter the message" required></textarea>

                <div class="text-center">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>

                 </div>
        </form>
    </div>
</div>

<footer class="text-center text-dark mt-5">
                &copy; 2025 Lab Portal | Designed by Shivani A.
                </footer>

</body>
</html>

