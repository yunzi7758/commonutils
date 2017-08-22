<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	组合模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.composite.*" %>
 
<br />
<br />
<h4>
<% 
//实现树型结构
Node platoonOfficer = ClientCase.compositeNodeTree();
//一级节点-排长：
%>
<% out.println("我国军官级别呈树形结构:"+ platoonOfficer.getMessage());	%><br >

<%out.println(  ClientCase.getTreeMessage(platoonOfficer));%><br />		
</h4>
</BODY>
</HTML>




