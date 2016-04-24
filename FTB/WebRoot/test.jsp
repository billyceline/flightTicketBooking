<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<p>triangle</p>  
   <%  
    for(int i=0;i<5;i++){      
    %>   
    <%for(int m=0;m<(6-i);m++){ %>  
        
     <%} %>  
    <%   for(int j=0;j<i*2+1;j++) {%>  
    *  
     <%} %>   
     <br>  
    <%} %>

</body>
</html>