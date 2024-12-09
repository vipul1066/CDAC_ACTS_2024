let employee = [];

function addEmployee() {
    let id = document.getElementById("id").value;
    let name = document.getElementById("name").value;
    let city = document.getElementById("city").value;

    if(id === "" || name === "" || city === "") {
        document.getElementById("duplicateId").innerText = "Please Enter all fields";
        return;
    }
    else if (employee.some(emp => emp.id === id)) {
        document.getElementById("duplicateId").innerText = "Id Already Exists!!";
        return;
    } else {
        employee.push({ id: id, name: name, city: city });
        document.getElementById("duplicateId").innerText = "";
        document.getElementById("count").innerText = employee.length;

        document.getElementById("id").value = "";
        document.getElementById("name").value = "";
        document.getElementById("city").value = "";
    }
}

function displayEmployees() {
    let table = document.getElementById("employeeTable");
    table.innerHTML = "<tr><th>ID</th><th>Name</th><th>City</th><th>Action</th></tr>";
    employee.forEach(emp => {
        let row = table.insertRow();
        row.innerHTML = `
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.city}</td>
            <td><button onclick="removeEmployee('${emp.id}')">Remove</button></td>
        `;
    });
}

function removeEmployee(id) {
    employee = employee.filter(emp => emp.id !== id);
    displayEmployees();
    document.getElementById("count").innerText = employee.length;
}