$(document).ready(function () {
    const apiUrl = 'https://jsonplaceholder.typicode.com/todos?_limit=25';

    $('#button').click(function () {
        $('#table').find("tr:gt(0)").remove();

        fetchWithAjax();
        fetchWithJQuery();
        fetchWithAxios();
    });

    function fetchWithAjax() {
        const xhr = new XMLHttpRequest();
        xhr.open('GET', apiUrl, true);
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status == 200) {
                const data = JSON.parse(xhr.responseText);
                data.forEach(item => {
                    appendRow(item);
                });
            }
        };
        xhr.send();
    }

    function fetchWithJQuery() {
        $.ajax({
            url: apiUrl,
            method: 'GET',
            success: function (data) {
                data.forEach(item => {
                    appendRow(item);
                });
            }
        });
    }

    function fetchWithAxios() {
        axios.get(apiUrl)
            .then(response => {
                const data = response.data;
                data.forEach(item => {
                    appendRow(item);
                });
            })
            .catch(error => {
                console.log('Error fetching data with Axios: ', error);
            });
    }

    function appendRow(item) {
        const table = $('#table');
        const row = `<tr>
            <td>${item.userId}</td>
            <td>${item.id}</td>
            <td>${item.title}</td>
            <td>${item.completed}</td>
        </tr>`;
        table.append(row);
    }
});
