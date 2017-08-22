<HTML>
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	观察者模式
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.observer.*" %> 
<br />
<br />
<h4>
<%
//新书原价100元
Book book = new Book(100);
%>
<% 
out.println("通过EMAIL发送给所有邮箱注册用户:"+String.valueOf(new EmailObserver(book)));//电邮 observer
%>	
<br >
<% 
out.println("JAVA编程思想价格变为:"+String.valueOf(book.updatePrice(85)+"元")); //增加产品价格 
%>	
 <br >
</h4>
</BODY>
</HTML>




