<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>����ԭ��</title>
	</head>
	<body>
		<%@ page pageEncoding="GB2312" language="java" import="principle.ocp.*"%>

		<%
			PriceCutGirlShoe a = new PriceCutGirlShoe("ŮЬ��", "ŮЬ����", 160);
			out.println("Ь��Ϊ:" + a.getValue());
		%><br />
	</body>
</html>

