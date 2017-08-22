<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>未使用接口隔离原则</title>
	</head>
	<body>

		<%@ page pageEncoding="GB2312" language="java" import="principle.isp1.*"%>
		<%
		Portal b=new Portal();
		out.println("类Portal的Insert方法："+b.Insert(""));	
		%>
		<br>
		<%
		Admin d=new Admin();
		out.println("类Admin的Insert方法: " +d.Insert(""));
		%><br />
	</body>
</html>

