<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	责任链模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.responsibility.*" %>
 
<br />
<br />
<h4>
<%
	//先要组装责任链
Approval a1 = new BusinessManager();
Approval a2 = new Teamleader();
Approval a3 = new Cm();
a3.setPass(a2);
a2.setPass(a1);
%>
<% 
//测试
String one = a3.handleMenuRequest("程序员", 29);
out.println("one = " + one);	%><br >

<%
//测试
String two = a3.handleMenuRequest("业务员", 29);
out.println("two = " + two);%><br >

<% 
//测试
String three = a3.handleMenuRequest("程序员", 40);
out.println("three = " + three);	%><br >

<%
//测试
String four = a3.handleMenuRequest("业务员", 40);
out.println("four = " + four);		%><br >

<% 
//测试
String five = a3.handleMenuRequest("程序员", 55);
out.println("five = " + five);	%><br >

<% 
//测试
String six = a3.handleMenuRequest("业务员", 55);
out.println("six = " + six);	%><br >

</h4>
</BODY>
</HTML>




