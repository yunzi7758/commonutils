<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>��һְ��ԭ��</title>
	</head>
	<body>
		<%@ page pageEncoding="GB2312" language="java" import="principle.srp1.*"%>

		<%
		ProductEntity  productEntity=new ProductEntity();
		out.println("��Ʒ����: 1.TCL"+productEntity.getName("TCL"));
		out.println("2.����"+productEntity.getName("����"));
		out.println("3.��Ϊ"+productEntity.getName("��Ϊ"));
		%><br />
	</body>
</html>

