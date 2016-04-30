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
        <li class="active"><a href="index.jsp">Booking <span class="sr-only">(current)</span></a> </li>
        <li><a href="${pageContext.request.contextPath}/OrderServlet">Orders</a> </li>
        <li><a href="changeUserInfo.jsp">ChangeUserInfo</a> </li>
        <li><a href="changePasswd.jsp">ChangePassword</a> </li>
      </ul>
    </div>
    <div>
    <form action="ChangePasswdServlet">
    <table>
    <tr>
            	<td style ="color:white"> Input Password:  </td>
				<td> <input name = "txtPassword1" type = "text" class = "textbox" value ="" ></td>               
            </tr>
            
            <tr>
            	<td style ="color:white"> Input Password again:  </td>
                <td> <input name = "txtPassWord" type = "text" class = "textbox" value =""></td>
                
            </tr>
            <tr></tr>
            <tr> 
            	<td></td>
                <td><input id = "resetBtn" type = "reset" class = "" value = "reset"></td>
                <td><input id = "confirmBtn" type = "submit" class = "" value = "confirm"></td>
                <%
    				if(request.getAttribute("fInfo") != null){
    			%>
    					<%=request.getAttribute("fInfo") %>
    			<%
    				}
    			%>
        </table>
        </form>
    </div>
</body>
</html>
