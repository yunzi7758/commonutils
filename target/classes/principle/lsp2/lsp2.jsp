<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>�����滻ԭ��</title>
	</head>
	<body>
		<%@ page pageEncoding="GB2312" language="java" import="principle.lsp2.*"%>

		<%
	    SuperLiskov ob=new SuperLiskov(); //(1)  
	    ob=new SubLiskov();  //(2)   
	    ob.a1(); //(5)
	    ob.a2(); //(6)
	    out.println("���Ϊ:" +  (ob.a));
		%><br />
	</body>
</html>

