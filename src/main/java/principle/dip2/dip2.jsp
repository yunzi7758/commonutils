<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>依赖倒置原则</title>
	</head>
	<body>
		<%@ page pageEncoding="GB2312" language="java" import="principle.dip2.*"%>

		<%
		IEmployee employee = new Code();
		ICode code = new SeniorProgrammer();
		ICode code1 = new CommonProgrammer();
		//高级程序员张三开始编码
		out.println(""+employee.code(code));
		//普通程序员李四开始编码
		out.println("管理人员张三派高级程序员李四:"+employee.code(code1) );
		%><br />
	</body>
</html>

