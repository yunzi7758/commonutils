<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	原型模式
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
// 通过对象的clone()方法,即可获得对象的一个copy.
AbstractPig pig2 = (AbstractPig) pig.clone();
%>
</h4>
<%out.println("拷贝："+pig2.getPigName()); %><br />
</BODY>
</HTML>




