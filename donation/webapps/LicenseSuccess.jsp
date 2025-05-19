<!doctype html>
<html lang="en">
<head>
    <title>License Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">License Portal</a>
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

<h2 class="text-bold pe-3">License Details</h2>
<table class="table">
    <thead>
    <tr>
        <th scope="col">applicantName</th>
        <th scope="col">email</th>
        <th scope="col">licenseType</th>
        <th scope="col">address</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">${dto.applicantName}</th>
        <td>${dto.email}</td>
        <td>${dto.licenseType}</td>
        <td>${dto.address}</td>
    </tr>


    </tbody>
</table>
<p class="fs-5">License Details are saved Successfully!!!.</p>
</div>
</div>

</body>
</html>