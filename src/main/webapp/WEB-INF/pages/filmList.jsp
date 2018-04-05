<html>
<head>
    <meta charset="UTF-8">
    <title>Film list</title>
</head>
<body>
<br/>
<h1>Film list</h1>
<br/>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Genre</th>
        <th>Country</th>
        <th>Duration</th>
        <th>Year of issue</th>
    </tr>
    <#list listFilm as film>
        <tr>
            <td>${film.id}</td>
            <td><a href="/cinema">${film.name}</a></td>
            <td>${film.genre}</td>
            <td>${film.country}</td>
            <td>${film.duration}</td>
            <td>${film.year}</td>

            <td><a href="/deleteFilm/${film.id}">delete</a></td>
            <td><a href="/updateFilm/${film.id}">update</a></td>

        </tr>
    </#list>
</table>
<a href="/createFilm">Create film</a>
</body>
</html>
