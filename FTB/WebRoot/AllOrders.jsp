<%@ page language="java" import="java.util.*,com.FTB.bean.flightInfoBean,com.FTB.bean.OrderInfoBean,com.FTB.bean.UserInfoBean"  pageEncoding="utf-8"%>
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
        <div style=" padding:10px;">
        	<div style="font-size:20px">
            	Your orders are as follows:
            </div>
            <form action = "DeleteOrderServlet">
                <table style="width:80%">
                	<tr>                		
                		<td>Name</td>
                		<td>Gender</td>
                		<td>Identification_no</td>                 
                    	<td>Flight_no</td>
                        <td>Origin</td>
                        <td>Destination</td>
                        <td>Departure_date</td>
                        <td>Departure_time</td>
                        <td>Arrival_time</td>
                        <td>Duration</td>
                        <td>Price</td>
                        <td>Status</td>                      
                    </tr>
                     <%                     
    ArrayList oList = (ArrayList)request.getAttribute("OrderInfoList");
    ArrayList fList = (ArrayList)request.getAttribute("FlightInfoList");
    ArrayList uList = (ArrayList)request.getAttribute("UserInfoList");
    if(oList != null){
    	OrderInfoBean oib = null;
    	flightInfoBean fib = null; 
    	UserInfoBean uib = null;   	
    	for(int i=0;i<oList.size();i++){
    		oib = (OrderInfoBean)oList.get(i);
    		fib = (flightInfoBean)fList.get(i);
    		uib = (UserInfoBean)uList.get(i);    	
    %>
                    <tr>                    	
                    	<td><%=uib.getName() %></td>
                		<td><%=uib.getGender() %></td>
                		<td><%=uib.getIdentification_no() %></td>                                         
                    	<td><%=fib.getFlight_no() %></td>
                    	<td><%=fib.getOrigin() %></td>
    					<td><%=fib.getDestination() %></td>
    					<td><%=fib.getDate() %></td>
    					<td><%=fib.getDeparture_time() %></td>
    					<td><%=fib.getArrival_time() %></td>
    					<td><%=fib.getDuration() %></td>
    					<td><%=fib.getPrice() %></td>
    					<td><%=oib.getStatus() %></td>
    					
    				</tr>
    			<%		
    				}
    			}
    			%>
                   
                    
                </table>
                </form>
    </div>
</body>
</html>
