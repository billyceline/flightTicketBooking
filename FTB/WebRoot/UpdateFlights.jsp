<%@ page language="java" import="java.util.*,com.FTB.bean.flightInfoBean"  pageEncoding="utf-8"%>
<%@ page import="com.FTB.bean.flightInfoBean" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index</title>
<link rel="stylesheet" href="bootstrap.css">
</head>

<body style = "background: url(001.jpg) ; background-repeat: repeat">
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="${pageContext.request.contextPath}/FlightInfoServlet">FlightsInfo <span class="sr-only">(current)</span></a> </li>
        <li><a href="UpdateFlights.jsp">UpdateFlight</a> </li>
        <li><a href="${pageContext.request.contextPath}/GetAllOrdersServlet">Orders</a> </li>
        
      </ul>
    </div>
	<div>
	<form name="form" action="UpdateFlightServlet">
		<table>
			<tr>
				<td style ="color:white"> Flight_no:  </td>
				<td> <input name = "flight_no" type = "text" class = "textbox" value ="" ></td>
				
				<td style ="color:white"> Origin:  </td>
				<td> <input name = "origin" type = "text" class = "textbox" value ="" ></td>
			</tr>	
			<tr>
				<td style ="color:white"> Destination:  </td>
				<td> <input name = "destination" type = "text" class = "textbox" value ="" ></td>
				
				<td style ="color:white"> Date:  </td>
				<td> <input name = "date" type = "text" class = "textbox" value ="" ></td>
			</tr>
			<tr>
				<td style ="color:white"> Departure_time:  </td>
				<td> <input name = "departure_time" type = "text" class = "textbox" value ="" ></td>
				
				<td style ="color:white"> Arrival_time:  </td>
				<td> <input name = "arrival_time" type = "text" class = "textbox" value ="" ></td>
			</tr>
			<tr>
				<td style ="color:white"> Duration:  </td>
				<td> <input name = "duration" type = "text" class = "textbox" value ="" ></td>
				
				<td style ="color:white"> Price:  </td>
				<td> <input name = "price" type = "text" class = "textbox" value ="" ></td>
			</tr>
			<tr>
				<td style ="color:white"> Ticket_amount:  </td>
				<td> <input name = "remain_ticket" type = "text" class = "textbox" value ="" ></td>
				<td style ="color:white"> InfoID:  </td>
				<td> <input name = "infoId" type = "text" class = "textbox" value ="" ></td>
				<td><input id = "addBtn" type = "submit" class = "" value = "Update" ></td>
			</tr>
		</table>
		</form>
		</div>
	
</body>
</html>
