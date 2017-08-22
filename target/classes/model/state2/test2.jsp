<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	状态模式
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
out.println("不正常:"+warning.Sound());
%><br>
<%
warning.setState(new HighSound());
out.println("重大异常:"+warning.Sound());
%><br>
<%
warning.setState(new LowSound());
out.println("正常:"+warning.Sound());
%>
</h4>
<br />
<br />
<h4>
</BODY>
</HTML>




