<!doctype html>
<html lang="en">
<head>
    <title>Payment</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Payment</a>
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

<h2 class="text-bold pe-3">Payment Acceptance Details</h2>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Customer Name</th>
        <th scope="col">Payment Method</th>
        <th scope="col">Amount</th>
        <th scope="col">Transaction ID</th>
        <th scope="col">Payment Date</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${paymentDto.customerName}</td>
        <td>${paymentDto.paymentMethod}</td>
        <td>${paymentDto.amount}</td>
        <td>${paymentDto.transactionId}</td>
        <td>${paymentDto.paymentDate}</td>
    </tr>
    </tbody>
</table>

<p class="fs-5">Payment details have been saved successfully!</p>

</body>
</html>
