<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	多享元模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.flyweight2.*" %>
 
<br />
<br />
<h4>
<% 
ShareFactory factory=new ShareFactory();   
Share share=(Share) factory.factory("东西南");   
//share.work("宋体");   
%>

<% out.println("内蕴东西南不同，外蕴均为字体:"+share.work("宋体"));	%><br >
</h4>
</BODY>
</HTML>




