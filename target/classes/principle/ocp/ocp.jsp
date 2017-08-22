<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>开闭原则</title>
	</head>
	<body>
		<%@ page pageEncoding="GB2312" language="java" import="principle.ocp.*"%>

		<%
			PriceCutGirlShoe a = new PriceCutGirlShoe("女鞋名", "女鞋类型", 160);
			out.println("鞋价为:" + a.getValue());
		%><br />
	</body>
</html>

