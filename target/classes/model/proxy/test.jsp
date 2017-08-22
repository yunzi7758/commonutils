<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	代理模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.proxy.*" %>
 
<br />
<br />
<h4>
<% 
//定义参会者lidong
ITraining training = new LidongTraining("李东");
//然后再定义一个代练者
ITraining proxy = new ManProxy(training);
//开始培训，记下时间戳
%>
<% out.println("开始时间：2011-8-2 13:00");	%><br >
<%out.println(proxy.meeting("lidong", "team"));//参加培训会的人
out.println(proxy.joinTraining());//参加培训
out.println(proxy.joinExam());//考试
 %><br >
<% out.println("结束时间：2011-8-2 15:30");	%><br >
</h4>
</BODY>
</HTML>




