<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	���ģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.composite.*" %>
 
<br />
<br />
<h4>
<% 
//ʵ�����ͽṹ
Node platoonOfficer = ClientCase.compositeNodeTree();
//һ���ڵ�-�ų���
%>
<% out.println("�ҹ����ټ�������νṹ:"+ platoonOfficer.getMessage());	%><br >

<%out.println(  ClientCase.getTreeMessage(platoonOfficer));%><br />		
</h4>
</BODY>
</HTML>




