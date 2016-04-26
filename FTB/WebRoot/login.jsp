<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
</head>
<link rel="stylesheet" href="bootstrap.css">
<body style = "background: url(001.jpg) ;">
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" ">
    	<form action="LoginServlet" onSubmit="return checkUser();">
        <table >
    		<tr>
    			<td colspan="2" style="color: red;font-size:24px">
    			<%
    				if(request.getAttribute("rInfo") != null){
    			%>
    					<%=request.getAttribute("rInfo") %>
    			<%
    				}
    			%>
    			</td>
    		</tr>			
        	<tr>
            	<td><a href="#" >Customers   </a></td>
        		<td align="right"><a href="#">Administrator</a> </td>
            </tr>
            <tr> 
            </tr>
        	<tr>
            	<td style ="color:white"> UserName:  </td>
				<td> <input id = "user_id" type = "text" name = "user_id" ></td>               
            </tr>
            
            <tr>
            	<td style ="color:white"> Password:  </td>
                <td> <input id = "password" type = "password" name = "password"></td>
                
            </tr>
            <tr></tr>
            <tr> 
            	<td></td>
                <td><input id = "ResetBtn" type = "reset" class = "" value = "Reset"></td>
                <td><input id = "loginBtn" type = "submit" class = "" value = "Login"></td>
                
        </table>
        </form>
    </div>
</body>
</html>