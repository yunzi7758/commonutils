<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	命令模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.command.*" %>
 
<br />
<br />
<h4>
<% 
//A.将命令和真正的实现组合起来，也就是组装机器，将豆浆机功能键上的连接线与电路相连接。
Icircuit circuit = new Circuit();
StartupCommand startupCommand = new StartupCommand(circuit);
//B.为豆浆机的功能键设置对应的命令，使功能键与命令相匹配。
SoyMilkGrinder soyMilkGrinder = new SoyMilkGrinder();
soyMilkGrinder.setStartupCommand(startupCommand);
		%>
</h4>
<% //C.按下豆浆机上的功能键
out.println(soyMilkGrinder.startupFunctionKey());	 %><br />
</BODY>
</HTML>




