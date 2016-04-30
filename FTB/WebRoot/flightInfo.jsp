<%@ page language="java" import="java.util.*,com.FTB.bean.flightInfoBean"  pageEncoding="utf-8"%>
<%@ page import="com.FTB.bean.flightInfoBean" %>
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
        <li class="active"><a href="index.jsp">Booking <span class="sr-only">(current)</span></a> </li>
        <li><a href="${pageContext.request.contextPath}/OrderServlet">Orders</a> </li>
        <li><a href="changeUserInfo.jsp">ChangeUserInfo</a> </li>
        <li><a href="changePasswd.jsp">ChangePassword</a> </li>
      </ul>
    </div>
	
    <div style=" padding:10px;">
        <form action="CreateOrderServlet">
            
                <table style="width:80%">
                	<tr>
                    	<td>Flight_no</td>
                        <td>Origin</td>
                        <td>Destination</td>
                        <td>Date</td>
                        <td>Departure_time</td>
                        <td>Arrival_time</td>
                        <td>Duration</td>
                        <td>Price</td>
                        <td>Remain_ticket_amount</td>
                    </tr>
                    
                     <%
                     
    ArrayList aList = (ArrayList)request.getAttribute("FlightInfoList");
    if(aList != null){
    	flightInfoBean cb = null;    	
    	for(int i=0;i<aList.size();i++){
    		cb = (flightInfoBean)aList.get(i);
    	
    %>

    <tr>
        <td><%=cb.getFlight_no() %></td>
    	<td><%=cb.getOrigin() %></td>
    	<td><%=cb.getDestination() %></td>
    	<td><%=cb.getDate() %></td>
    	<td><%=cb.getDeparture_time() %></td>
    	<td><%=cb.getArrival_time() %></td>
    	<td><%=cb.getDuration() %></td>
    	<td><%=cb.getPrice() %></td>
    	<td><%=cb.getRemain_ticket_no() %></td>
    	<td><%=cb.getInfoId() %></td>
    	<td><input name="flightInfo" id="flightInfo" type="radio" value="<%=cb.getInfoId() %>" /></td>
    </tr>
    <%	
    	}
    }
    %>
					
                <tr><input id = "CreateBtn" type = "submit" class = "" value = "Create"></tr>
                </table>
                </form>
    </div>
</body>
</html>
