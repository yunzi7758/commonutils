<%@ page contentType="text/html;charset=GB2312"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>��������ԭ��</title>
	</head>
	<body>
		<%@ page pageEncoding="GB2312" language="java" import="principle.dip2.*"%>

		<%
		IEmployee employee = new Code();
		ICode code = new SeniorProgrammer();
		ICode code1 = new CommonProgrammer();
		//�߼�����Ա������ʼ����
		out.println(""+employee.code(code));
		//��ͨ����Ա���Ŀ�ʼ����
		out.println("������Ա�����ɸ߼�����Ա����:"+employee.code(code1) );
		%><br />
	</body>
</html>

