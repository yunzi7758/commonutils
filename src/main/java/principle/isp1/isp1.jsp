<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>δʹ�ýӿڸ���ԭ��</title>
	</head>
	<body>

		<%@ page pageEncoding="GB2312" language="java" import="principle.isp1.*"%>
		<%
		Portal b=new Portal();
		out.println("��Portal��Insert������"+b.Insert(""));	
		%>
		<br>
		<%
		Admin d=new Admin();
		out.println("��Admin��Insert����: " +d.Insert(""));
		%><br />
	</body>
</html>

