<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	����ģʽ��չ
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
	out.print("four��BP ��BP�������㷨��");
 %><br>
  <%  context = new Context(new BP()); //ȡ��BP�������㷨
	out.print(context.work());//����  
	%><br>
<br>
</h4>
<br />
<br />
<br />
<h4>
</BODY>
</HTML>




