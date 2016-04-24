<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Demo</title>
	<link rel="stylesheet" href="citySelector.css">
	<script type="text/javascript" src="js/citySelector.js"></script>
	<script type="text/javascript" src="js/laydate/laydate.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <div style = " margin: 70 auto; position: relative;">
  <table>
  <tr>
  <td>Origin：</td>
  <td><input type="text" class="cityinput" id="citySelect" value="CityName"></td>
  <td>Destination：</td>
  <td><input type="text" class="cityinput" id="citySelect1" value="CityName"></td>
  </tr>
  <tr>
  <td>Date：</td>
  <td><input value="Please Input Date" class="laydate-icon" onclick="laydate()"></td>
  </tr>
  <tr>
  <td></td>
  <td></td>
  <td></td>
  <td><input id = "SearchBtn" type = "submit" class = "" value = "Search"></td>
  </tr>
  </table>    
  </div>    
<br><br>





<div style="width:970px; margin:10px auto;">
    
</div>


<!--<script src="citySelector.js" type="text/javascript"></script>-->
<script type="text/javascript">

    var test=new Vcity.CitySelector({input:'citySelect'});
    var test2=new Vcity.CitySelector({input:'citySelect1'});
</script>
<script>
;!function(){

//laydate.skin('molv');

laydate({
   elem: '#demo'
})

}();
</script>
  </body>
</html>
