<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>updateCinema</title>
</head>
<body>

<form name="cinema" action="/updateCin" method="post">
    <p>Id</p>
    <input title="Name" type="text" name="id" value="${cinema.id}">
    <p>Name</p>
    <input title="Name" type="text" name="name" value="${cinema.name}">
    <p>Address</p>
    <input title="Address" type="text" name="address" value="${cinema.address}">

    <input type="submit" value="update">
</form>

</body>
</html>