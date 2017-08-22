<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>单一职责原则</title>
	</head>
	<body>
		<%@ page pageEncoding="GB2312" language="java" import="principle.srp1.*"%>

		<%
		ProductEntity  productEntity=new ProductEntity();
		out.println("产品名称: 1.TCL"+productEntity.getName("TCL"));
		out.println("2.厦新"+productEntity.getName("厦新"));
		out.println("3.华为"+productEntity.getName("华为"));
		%><br />
	</body>
</html>

