<html>
<head>
    <meta charset="UTF-8">
    <title>cinema</title>
</head>
<body>

<br/>
<h1>Cinema list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Address</th>
    </tr>
<#list listCinema as cinema>
        <tr>
            <td>${cinema.id}</td>
            <td><a href="/cinema/${cinema.id}">${cinema.name}</a></td>
            <td>${cinema.address}</td>

            <td><a href="/deleteCinema/${cinema.id}">delete</a></td>
            <td><a href="/updateCinema/${cinema.id}">update</a></td>


        </tr>
</#list>
</table>
<a href="createCinema.jsp">Create cinema</a>
</body>
</html>
