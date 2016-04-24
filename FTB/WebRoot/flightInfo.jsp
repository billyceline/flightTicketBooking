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
        <li class="active"><a href="flightInfo.jsp">Booking <span class="sr-only">(current)</span></a> </li>
        <li><a href="orders.jsp">Orders</a> </li>
        <li><a href="changeUserInfo.jsp">ChangeUserInfo</a> </li>
        <li><a href="changePasswd.jsp">ChangePassword</a> </li>
      </ul>
    </div>
	
    <div style=" padding:10px;">
        <div style ="padding: 15px 5px 10px 0;">
            <table class="" border="0" cellspacing="0" cellpadding="0">
            	<tr>
                		
                    	<td>Origin: </td>
                        <td>
                    		<select name="selectAge" id="selectAge">   
        						<option value="1">Guangzhou</option>   
        						<option value="2">Macau</option>   
        						<option value="3">Hongkong</option>   
        						<option value="4">Beijing</option>   
        						<option value="5">Shanghai</option>   
           
      						</select>   
                   		</td>
                        
                        
                	</tr>
                    <tr>
                    	
                    	<td>Destination: </td>
                        <td>
                    		<select name="selectAge" id="selectAge">   
        						<option value="1">Beijing</option>   
        						<option value="2">Macau</option>   
        						<option value="3">Hongkong</option>   
        						<option value="4">Guangzhou</option>   
        						<option value="5">Shanghai</option>   
           
      						</select>   
                   		</td>
                    </tr>
                    <tr>
                    	
                    	<td>Departure time: </td>
                        <td>
                    		<select name="selectAge" id="selectAge">   
        						<option value="1">2016</option>   
        						<option value="2">2017</option>   
        						<option value="3">2018</option>   
        						<option value="4">2019</option>   
        						<option value="5">2020</option>   
           
      						</select>   
                   		</td>
                        <td>
                    		<select name="selectAge" id="selectAge">   
        						<option value="1">April</option>   
        						<option value="2">February</option>   
        						<option value="3">March</option>   
        						<option value="4">January</option>   
        						<option value="5">May</option>   
           
      						</select>   
                   		</td>
                        <td>
                    		<select name="selectAge" id="selectAge">   
        						<option value="1">20</option>   
        						<option value="2">02</option>   
        						<option value="3">03</option>   
        						<option value="4">04</option>   
        						<option value="5">05</option>   
           
      						</select>   
                   		</td>
                    </tr>
                    <tr>
                    	<td>
                        </td>
                        <td>
                        </td>
                    	<td>
                    		<input type="button" class ="" id ="search" value="search" onclick = ""/>
                   		</td>
                    </tr>
                </table>
            </div>
                <table style="width:80%">
                	<tr>
                    	<td>Flight_no</td>
                        <td>Origin</td>
                        <td>Destination</td>
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
    	<td><%=cb.getDeparture_time() %></td>
    	<td><%=cb.getArrival_time() %></td>
    	<td><%=cb.getDuration() %></td>
    	<td><%=cb.getPrice() %></td>
    	<td><%=cb.getRemain_ticket_no() %></td>
    </tr>
    <%		
    	}
    }
    %>
					</tr>
                   
                </table>
    </div>
</body>
</html>
