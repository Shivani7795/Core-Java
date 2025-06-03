<!doctype html>
<html lang="en">
<head>
    <title>Product </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Product </a>
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
<h2 class="text-bold pe-3">Product Details</h2>
<table class="table">
    <thead>
    <tr>
        <th scope="col">name</th>
        <th scope="col">type</th>
        <th scope="col">incomingPrice</th>
        <th scope="col">sellingPrice</th>
        <th scope="col">mrp</th>
        <th scope="col">description</th>
        <th scope="col">brand</th>
        <th scope="col">quantity</th>
        <th scope="col">color</th>
        <th scope="col">weight</th>
        <th scope="col">manufDate</th>
        <th scope="col">warranty</th>
        <th scope="col">returnPolicy</th>

    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">${productDto.name}</th>
        <td>${productDto.type}</td>
        <td>${productDto.incomingPrice}</td>
        <td>${productDto.sellingPrice}</td>
        <td>${productDto.mrp}</td>
        <td>${productDto.description}</td>
        <td>${productDto.brand}</td>
        <td>${productDto.quantity}</td>
        <td>${productDto.color}</td>
        <td>${productDto.weight}</td>
        <td>${productDto.manufDate}</td>
        <td>${productDto.warranty}</td>
        <td>${productDto.returnPolicy}</td>

    </tr>


    </tbody>
</table>
<p class="fs-5">Product Details are saved Successfully!!!.</p>
</div>
</div>

</body>
</html>
