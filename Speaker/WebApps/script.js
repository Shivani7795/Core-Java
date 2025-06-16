<script>
document.querySelector("#form").addEventListener("submit", function (e) {
    document.querySelectorAll(".error").forEach((element) => {
        element.textContent = "";
    });

    const isValid =
        validateBrand() &&
        validateModel() &&
        validatePrice() &&
        validateWirelessRange() &&
        validateColor() &&
        validateBluetooth() &&
        validateManufacturedDate();

    if (!isValid) {
        e.preventDefault();
    }
});

function validateBrand() {
    const brand = document.querySelector("#brand").value.trim();
    if (brand === "") {
        document.querySelector("#brandError").textContent = "Brand is required";
        return false;
    } else if (brand.length < 3 || brand.length > 25) {
        document.querySelector("#brandError").textContent = "Brand must be between 3 and 25 characters";
        return false;
    }
    return true;
}

function validateModel() {
    const model = document.querySelector("#model").value.trim();
    if (model === "") {
        document.querySelector("#modelError").textContent = "Model is required";
        return false;
    } else if (model.length < 3 || model.length > 25) {
        document.querySelector("#modelError").textContent = "Model must be between 3 and 25 characters";
        return false;
    }
    return true;
}

function validatePrice() {
    const price = document.querySelector("#price").value.trim();
    const numericPrice = parseFloat(price);
    if (price === "" || isNaN(numericPrice)) {
        document.querySelector("#priceError").textContent = "Price is required and must be a number";
        return false;
    } else if (numericPrice < 10000 || numericPrice > 1000000) {
        document.querySelector("#priceError").textContent = "Price must be between 10,000 and 1,000,000";
        return false;
    }
    return true;
}

function validateWirelessRange() {
    const range = document.querySelector("#wirelessRange").value.trim();
    const numericRange = parseFloat(range);
    if (range === "" || isNaN(numericRange)) {
        document.querySelector("#rangeError").textContent = "Wireless range is required";
        return false;
    } else if (numericRange < 1 || numericRange > 500) {
        document.querySelector("#rangeError").textContent = "Range must be between 1 and 500 meters";
        return false;
    }
    return true;
}

function validateColor() {
    const color = document.querySelector("#color").value;
    if (color === "") {
        document.querySelector("#colorError").textContent = "Please select a color";
        return false;
    }
    return true;
}

function validateBluetooth() {
    const bluetooth = document.querySelector("#bluetooth").value;
    if (bluetooth === "") {
        document.querySelector("#bluetoothError").textContent = "Please select Bluetooth option";
        return false;
    }
    return true;
}

function validateManufacturedDate() {
    const manufacturedDate = document.querySelector("#manufacturedDate").value.trim();
    if (manufacturedDate === "") {
        document.querySelector("#manufacturedDateError").textContent = "Please fill the manufactured date";
        return false;
    } else {
        const currdate = new Date();
        currdate.setHours(0, 0, 0, 0);
        const [year, month, day] = manufacturedDate.split("-").map(Number);
        const selectedDate = new Date(year, month - 1, day);

        if (selectedDate >= currdate) {
            document.querySelector("#manufacturedDateError").textContent = "Date must be in the past";
            return false;
        }
    }
    return true;
}
</script>

