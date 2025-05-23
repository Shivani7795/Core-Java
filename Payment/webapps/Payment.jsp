<!doctype html>
<html lang="en">
<head>
    <title>Payment Acceptance</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg" style="background-color: #90caf9;">
    <div class="container-fluid">
        <a class="navbar-brand text-dark" href="index.jsp">Bank</a>
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

<h3 align="center" style="color:red;">${message}</h3>
<h2 class="text-center text-primary mt-4">Enter Payment Details</h2>

<div class="container my-5">
    <div class="card p-4 mx-auto" style="max-width: 700px;">
        <form action="payment" method="post">

            <div class="mb-3">
                <label class="form-label">Payment type:</label>
                <select class="form-select" name="paymentMethod" required>
                    <option value="Credit Card">Credit Card</option>
                    <option value="Debit Card">Debit Card</option>
                    <option value="UPI">UPI</option>
                    <option value="Cash on Delivery">Cash on Delivery</option>
                </select>
            </div>

            <div class="mb-3">
                <label class="form-label">Transaction ID:</label>
                <input type="text" class="form-control" name="transactionId" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Amount:</label>
                <input type="number" class="form-control" name="amount" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Payment Date:</label>
                <input type="date" class="form-control" name="paymentDate" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Customer Name:</label>
                <input type="text" class="form-control" name="customerName" required>
            </div>


            <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit Payment</button>
            </div>

        </form>
    </div>
</div>

<footer class="text-center text-dark mt-5">
    &copy; 2025 My Website | Designed by Shivani A.
</footer>
</body>
</html>
