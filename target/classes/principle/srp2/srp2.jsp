<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>��һְ��ԭ��</title>
	</head>
	<body>
		<%@ page pageEncoding="GB2312" language="java" import="principle.srp2.*"%>

		<%
		 ProductEntity pe = new ProductEntity();
		 out.println("��Ʒ�Ͳ�ѯ����:1.TCL�ֻ� "+ pe.getName("TCL�ֻ�"));
		 ProductService  ps=new  ProductService();
		 out.println("2.��ѯ "+ ps.selectAll("��ѯ"));
		%><br />
	</body>
</html>

