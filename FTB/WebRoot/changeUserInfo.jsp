<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <div>
    <form action="UpdateServlet" >
    <table>
    <tr>
            	<td style ="color:white"> Name:  </td>
				<td> <input name = "Name" type = "text" class = "textbox" value ="" ></td>               
            </tr>
            
            
            <tr>
            	<td style ="color:white"> Gender:  </td>
				<td> <input name = "Gender" type = "text" class = "textbox" value ="" ></td>               
            </tr>
            
            <tr>
            	<td style ="color:white"> Birthday:  </td>
                <td> <input name = "Birthday" type = "text" class = "textbox" value =""></td>
                
            </tr>
            <tr>
            	<td style ="color:white"> ID number:  </td>
                <td> <input name = "ID_number" type = "text" class = "textbox" value =""></td>
                
            </tr>
            <tr>
            	<td style ="color:white"> Email:  </td>
                <td> <input name = "Email" type = "text" class = "textbox" value =""><%
    				if(request.getAttribute("fInfo") != null){
    			%>
    					<%=request.getAttribute("fInfo") %>
    			<%
    				}
    			%></td>
                
            </tr>
            <tr></tr>
            <tr> 
            	<td></td>
                <td><input id = "resetBtn" type = "reset" class = "" value = "reset" style="width: 78px; "></td>
                <td><input id = "confirmBtn" type = "submit" class = "" value = "confirm" style="width: 78px; "></td>
                
        </table>
        </form>
    </div>
</body>
</html>
