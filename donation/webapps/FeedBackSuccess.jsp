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

<h2 class="text-bold pe-3">Feedback Details</h2>
<table class="table table-borderless w-20 mx-auto text-start">
    <tbody>
    <tr>
        <td class="text-bold pe-3">name:</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td class="text-bold pe-3">email:</td>
        <td>${email}</td>
    </tr>
    <tr>
        <td class="text-bold pe-3">subject:</td>
        <td>${subject}</td>
    </tr>

    <tr>
        <td class="text-bold pe-3">message:</td>
        <td>${message}</td>
    </tr>
            </tbody>
        </table>
        <p class="fs-5">FeedBack Details are saved Successfully!!!.</p>
    </div>
</div>

</body>
</html>
