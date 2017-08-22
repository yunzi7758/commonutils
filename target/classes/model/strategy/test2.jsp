<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	策略模式扩展
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.strategy.*" %>
<br />
<br />
<h4>
<% 
Context context;
 %><br>
 <% 
//four
	out.print("four，BP 即BP神经网络算法。");
 %><br>
  <%  context = new Context(new BP()); //取得BP神经网络算法
	out.print(context.work());//运行  
	%><br>
<br>
</h4>
<br />
<br />
<br />
<h4>
</BODY>
</HTML>




