<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>单一职责原则</title>
	</head>
	<body>
		<%@ page pageEncoding="GB2312" language="java" import="principle.srp2.*"%>

		<%
		 ProductEntity pe = new ProductEntity();
		 out.println("产品和查询功能:1.TCL手机 "+ pe.getName("TCL手机"));
		 ProductService  ps=new  ProductService();
		 out.println("2.查询 "+ ps.selectAll("查询"));
		%><br />
	</body>
</html>

