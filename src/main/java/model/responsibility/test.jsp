<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	������ģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.responsibility.*" %>
 
<br />
<br />
<h4>
<%
	//��Ҫ��װ������
Approval a1 = new BusinessManager();
Approval a2 = new Teamleader();
Approval a3 = new Cm();
a3.setPass(a2);
a2.setPass(a1);
%>
<% 
//����
String one = a3.handleMenuRequest("����Ա", 29);
out.println("one = " + one);	%><br >

<%
//����
String two = a3.handleMenuRequest("ҵ��Ա", 29);
out.println("two = " + two);%><br >

<% 
//����
String three = a3.handleMenuRequest("����Ա", 40);
out.println("three = " + three);	%><br >

<%
//����
String four = a3.handleMenuRequest("ҵ��Ա", 40);
out.println("four = " + four);		%><br >

<% 
//����
String five = a3.handleMenuRequest("����Ա", 55);
out.println("five = " + five);	%><br >

<% 
//����
String six = a3.handleMenuRequest("ҵ��Ա", 55);
out.println("six = " + six);	%><br >

</h4>
</BODY>
</HTML>




