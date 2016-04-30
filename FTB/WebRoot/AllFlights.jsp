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
        <li><a href="${pageContext.request.contextPath}/GetAllOrdersServlet">Orders</a> </li>
      </ul>
    </div>
	<div>
	<form action="">
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
				<td><input id = "updateBtn" type = "submit" class = "" value = "Update" onClick="form[this].action='UpdateFlightServlet';form[this].submit();"></td>
				<td><input id = "addBtn" type = "submit" class = "" value = "Add" onClick="form[this].action='AddFlightServlet';form[this].submit();"></td>
			</tr>
		</table>
	</form>
	</div>
    <div style=" padding:10px;">
        <form action="DeleteFlightServlet">
            
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
    	<td><input name="flightInfo" id="flightInfo" type="checkbox" value="<%=cb.getInfoId() %>" /></td>
    </tr>
    <%	
    	}
    }
    %>
					
                
                </table>
                <input id = "CreateBtn" type = "submit" class = "" value = "Delete">
                </form>
    </div>
</body>
</html>
