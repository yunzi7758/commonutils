<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	ԭ��ģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.prototype.*" %>
 
<br />
<br />
<h4>
<% 
AbstractPig pig = new SonPig();
out.println(pig.getPigName());
// ͨ�������clone()����,���ɻ�ö����һ��copy.
AbstractPig pig2 = (AbstractPig) pig.clone();
%>
</h4>
<%out.println("������"+pig2.getPigName()); %><br />
</BODY>
</HTML>




