<%@ page import="com.example.FightBookingapplication.Entity.Flight" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>Flight Result</title>
</head>

<body>

<%
    // Corrected - added semicolon
    List<Flight> flights = (List<Flight>) request.getAttribute("flights");
%>

<% 
    if (flights != null && !flights.isEmpty()) { 
        for (Flight flight : flights) { 
%>
            <h1>Flight Number: <%= flight.getFlightNo() %></h1>
            <h1>Source: <%= flight.getSource() %></h1>
            <h1>Destination: <%= flight.getDestination() %></h1>
            <hr>
<%
        }
    } else {
%>
        <h2>No Flights Found!</h2>
<%
    }
%>

</body>
</html>
