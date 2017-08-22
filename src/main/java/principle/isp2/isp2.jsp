<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>使用接口隔离原则</title>
	</head>
	<body>

		<%@ page pageEncoding="GB2312" language="java" import="principle.isp2.*"%>

		<%
		Portal b=new Portal();
		out.println("类Portal的方法："+b.GetCommodity(""));
		%>
		<br>
		<%
		Admin d=new Admin();
		out.println("类Admin的方法: " +d.GetCommodity(""));
		out.println(", " +d.Insert(""));
		out.println(", " +d.Update(""));	
		out.println(", " +d.Delete(""));	
		%><br />
	</body>
</html>

