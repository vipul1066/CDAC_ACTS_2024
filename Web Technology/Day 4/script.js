function updateTime() {
    document.getElementById('time').innerText = new Date().toLocaleTimeString([], { hour: '2-digit', minute: '2-digit', second: '2-digit', hour12: false });
}
setInterval(updateTime, 1000);
updateTime();

function calculateTotal(qtyId, rateId, totalId) {
    let qty = parseInt(document.getElementById(qtyId).value) || 0;
    let rate = parseInt(document.getElementById(rateId).innerText) || 0;
    let total = qty * rate;

    document.getElementById(totalId).innerText = total;

    updateCartTotal();
}

function updateCartTotal() {
    const checkboxes = document.querySelectorAll("input[type='checkbox']");
    let count = 0;

    checkboxes.forEach((checkbox) => {
        if (checkbox.checked) {
            count++;
        }
    });
    document.getElementById("count").innerText = count;
    countTotalAmount();
}

function countTotalAmount() {
    const checkboxes = document.querySelectorAll("input[type='checkbox']");
    let totalAmount = 0;
    let itemsSelected = false;

    checkboxes.forEach((checkbox, index) => {
        if (checkbox.checked) {
            itemsSelected = true;
            const totalField = document.getElementById(`total${index}`);
            if (totalField) {
                const itemTotal = parseInt(totalField.innerText) || 0;
                totalAmount += itemTotal;
            }
        }
    });

    const totalAmountElement = document.getElementById("totalamount");
    if (itemsSelected) {
        totalAmountElement.innerText = totalAmount;
    } else {
        totalAmountElement.innerText = '0';
    }
}
