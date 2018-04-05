<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>update film</title>
</head>
<body>

<form name="film" action="/updateFil" method="post">
    <p>Id</p>
    <input title="Name" type="text" name="id" value="${film.id}">
    <p>Name</p>
    <input title="Name" type="text" name="name" value="${film.name}">
    <p>Genre</p>
    <input title="Genre" type="text" name="genre" value="${film.genre}">
    <p>Country</p>
    <input title="Country" type="text" name="country" value="${film.country}">
    <p>Duration</p>
    <input title="Duration" type="text" name="duration" value="${film.duration}">
    <p>Year of issue</p>
    <input title="Year" type="text" name="year" value="${film.year}">


    <input type="submit" value="update">
</form>

</body>
</html>
