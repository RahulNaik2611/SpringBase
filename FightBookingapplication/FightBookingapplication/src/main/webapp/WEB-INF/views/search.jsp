<html>
<head>
    <title>Search the Flight</title>
</head>
<body>
    <form action="/searchFlights" method="post">
        <label for="source">SOURCE:</label>
        <input type="text" id="source" name="source" required>

        <label for="destination">DESTINATION:</label>
        <input type="text" id="destination" name="destination" required>

        <button type="submit">SUBMIT</button>
    </form>
</body>
</html>
