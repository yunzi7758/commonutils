<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	����ģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.command.*" %>
 
<br />
<br />
<h4>
<% 
//A.�������������ʵ�����������Ҳ������װ�����������������ܼ��ϵ����������·�����ӡ�
Icircuit circuit = new Circuit();
StartupCommand startupCommand = new StartupCommand(circuit);
//B.Ϊ�������Ĺ��ܼ����ö�Ӧ�����ʹ���ܼ���������ƥ�䡣
SoyMilkGrinder soyMilkGrinder = new SoyMilkGrinder();
soyMilkGrinder.setStartupCommand(startupCommand);
		%>
</h4>
<% //C.���¶������ϵĹ��ܼ�
out.println(soyMilkGrinder.startupFunctionKey());	 %><br />
</BODY>
</HTML>




