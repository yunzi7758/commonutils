<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>ʹ�ýӿڸ���ԭ��</title>
	</head>
	<body>

		<%@ page pageEncoding="GB2312" language="java" import="principle.isp2.*"%>

		<%
		Portal b=new Portal();
		out.println("��Portal�ķ�����"+b.GetCommodity(""));
		%>
		<br>
		<%
		Admin d=new Admin();
		out.println("��Admin�ķ���: " +d.GetCommodity(""));
		out.println(", " +d.Insert(""));
		out.println(", " +d.Update(""));	
		out.println(", " +d.Delete(""));	
		%><br />
	</body>
</html>

