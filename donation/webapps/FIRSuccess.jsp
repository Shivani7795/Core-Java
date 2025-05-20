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
        <a class="navbar-brand text-dark" href="index.jsp">FIR Portal</a>
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
<h2 class="text-bold pe-3">FIR Details</h2>
<table class="table">
    <thead>
    <tr>
        <th scope="col">name</th>
        <th scope="col">complaintName</th>
        <th scope="col">phone</th>
        <th scope="col">address</th>
        <th scope="col">incidentDate</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">${fIRDto.name}</th>
        <td>${fIRDto.complaintName}</td>
        <td>${fIRDto.phone}</td>
        <td>${fIRDto.address}</td>
        <td>${fIRDto.incidentDate}</td>
    </tr>


    </tbody>
</table>
<p class="fs-5">FIR Details are saved Successfully!!!.</p>
</div>
</div>

</body>
</html>