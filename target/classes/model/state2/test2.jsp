<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	״̬ģʽ
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.state2.*" %>
<br />
<br />
<h4>
<%
	WarningSound warning = new WarningSound();
%><br>
<%
out.println("������:"+warning.Sound());
%><br>
<%
warning.setState(new HighSound());
out.println("�ش��쳣:"+warning.Sound());
%><br>
<%
warning.setState(new LowSound());
out.println("����:"+warning.Sound());
%>
</h4>
<br />
<br />
<h4>
</BODY>
</HTML>




